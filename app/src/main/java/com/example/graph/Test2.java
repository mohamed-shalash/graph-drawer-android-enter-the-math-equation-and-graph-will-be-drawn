package com.example.graph;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;

import java.util.ArrayList;

public class Test2 extends AppCompatActivity {
    PointsGraphSeries<DataPoint> xySeries;

    private Button btnAddPt;

    private EditText mX,mY;
    private static final String TAG = "Test2";
    GraphView graph;
    LineGraphSeries<DataPoint> series,series2;
    //make xyValueArray global
    private ArrayList<XYValue> xyValueArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);


        graph = (GraphView) findViewById(R.id.graph_test2);
        series = new LineGraphSeries<>();
        series2 = new LineGraphSeries<>();

        btnAddPt = (Button) findViewById(R.id.btnAddPt_test2);
        mX = (EditText) findViewById(R.id.numX_test2);
        mY = (EditText) findViewById(R.id.numY_test2);
        xyValueArray = new ArrayList<>();

        init();
        graph.getViewport().setScalable(true);
        graph.getViewport().setScalableY(true);
        graph.getViewport().setScrollable(true);
        graph.getViewport().setScrollableY(true);

        //set manual x bounds
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMaxY(150);
        graph.getViewport().setMinY(-150);

        //set manual y bounds
        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMaxX(150);
        graph.getViewport().setMinX(-150);

        for (int i=-20;i<20;i++){
            double y,y2;
            y=i*i;
            y2=i*i*i;
            series.appendData(new DataPoint(i,y),true,40);
            series2.appendData(new DataPoint(i,y2),true,40);
        }

        series.setColor(Color.RED);
        series2.setColor(Color.BLUE);

        graph.addSeries(series);
        graph.addSeries(series2);

    }

    private void init(){
        //declare the xySeries Object
        xySeries = new PointsGraphSeries<>();

        btnAddPt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mX.getText().toString().equals("") && !mY.getText().toString().equals("") ){
                    double x = Double.parseDouble(mX.getText().toString());
                    double y = Double.parseDouble(mY.getText().toString());
                    Log.d(TAG, "onClick: Adding a new point. (x,y): (" + x + "," + y + ")" );
                    xyValueArray.add(new XYValue(x,y));
                    init();
                }else {
                    toastMessage("You must fill out both fields!");
                }
            }
        });

        //little bit of exception handling for if there is no data.
        if(xyValueArray.size() != 0){
            createScatterPlot();
        }else{
            Log.d(TAG, "onCreate: No data to plot.");
        }
    }

    private void createScatterPlot() {
        Log.d(TAG, "createScatterPlot: Creating scatter plot.");

        //sort the array of xy values
        xyValueArray = sortArray(xyValueArray);

        //add the data to the series
        for(int i = 0;i <xyValueArray.size(); i++){
            try{
                double x = xyValueArray.get(i).getX();
                double y = xyValueArray.get(i).getY();
                xySeries.appendData(new DataPoint(x,y),true, 1000);
            }catch (IllegalArgumentException e){
                Log.e(TAG, "createScatterPlot: IllegalArgumentException: " + e.getMessage() );
            }
        }

        //set some properties
        xySeries.setShape(PointsGraphSeries.Shape.RECTANGLE);
        xySeries.setColor(Color.BLUE);
        xySeries.setSize(20f);

        //set Scrollable and Scaleable
        /*graph.getViewport().setScalable(true);
        graph.getViewport().setScalableY(true);
        graph.getViewport().setScrollable(true);
        graph.getViewport().setScrollableY(true);

        //set manual x bounds
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMaxY(150);
        graph.getViewport().setMinY(-150);

        //set manual y bounds
        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMaxX(150);
        graph.getViewport().setMinX(-150);*/

        graph.addSeries(xySeries);

        series = new LineGraphSeries<>();
        graph.removeAllSeries();
        // graph.removeSeries(series);

        //  graph. onDataChanged(false, false);
        for (int i=-20;i<20;i++){
            double y;
            y=i+1;
            series.appendData(new DataPoint(i,y),true,40);
        }

        series.setColor(Color.RED);

        graph.addSeries(series);
    }

    /**
     * Sorts an ArrayList<XYValue> with respect to the x values.
     * @param array
     * @return
     */
    private ArrayList<XYValue> sortArray(ArrayList<XYValue> array){
        /*
        //Sorts the xyValues in Ascending order to prepare them for the PointsGraphSeries<DataSet>
         */
        int factor = Integer.parseInt(String.valueOf(Math.round(Math.pow(array.size(),2))));
        int m = array.size() - 1;
        int count = 0;
        Log.d(TAG, "sortArray: Sorting the XYArray.");


        while (true) {
            m--;
            if (m <= 0) {
                m = array.size() - 1;
            }
            Log.d(TAG, "sortArray: m = " + m);
            try {
                //print out the y entrys so we know what the order looks like
                //Log.d(TAG, "sortArray: Order:");
                //for(int n = 0;n < array.size();n++){
                //Log.d(TAG, "sortArray: " + array.get(n).getY());
                //}
                double tempY = array.get(m - 1).getY();
                double tempX = array.get(m - 1).getX();
                if (tempX > array.get(m).getX()) {
                    array.get(m - 1).setY(array.get(m).getY());
                    array.get(m).setY(tempY);
                    array.get(m - 1).setX(array.get(m).getX());
                    array.get(m).setX(tempX);
                } else if (tempX == array.get(m).getX()) {
                    count++;
                    Log.d(TAG, "sortArray: count = " + count);
                } else if (array.get(m).getX() > array.get(m - 1).getX()) {
                    count++;
                    Log.d(TAG, "sortArray: count = " + count);
                }
                //break when factorial is done
                if (count == factor) {
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                Log.e(TAG, "sortArray: ArrayIndexOutOfBoundsException. Need more than 1 data point to create Plot." +
                        e.getMessage());
                break;
            }
        }
        return array;
    }

    /**
     * customizable toast
     * @param message
     */
    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
}