package com.example.graph;


import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.zip.Inflater;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.OnDataPointTapListener;
import com.jjoe64.graphview.series.PointsGraphSeries;
import com.jjoe64.graphview.series.Series;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.mariuszgromada.math.mxparser.Expression;
import org.xmlpull.v1.XmlPullParser;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener  {
    BottomNavigationView bottomNavigationView;
    GraphView graph;
    private static final String TAG = "MainActivity";
    BottomSheetDialog  bottomSheetDialog_cheat1,bottomSheetDialog_cheat2;
    PointsGraphSeries<DataPoint> onClickSeries;
    ArrayList<series> serieses;
    ArrayList<String> equation,equation_2;
    ArrayList<TextView> textViews,textViews_x,textViews_y;
    keyboard keyboard;
    FloatingActionButton fab_buttom_sheet_1;
    LinearLayout lin_buttom_sheet_keyboard;
ListView lin_buttom_sheet_list;
    PointsGraphSeries<DataPoint> xySeries;
TextView grid_val,point_x_value,point_y_value;
    private ArrayList<XYValue> xyValueArray;
    Button btnAddPt;
int coordinate =150;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup_layout();



        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        //bottomNavigationView.setSelectedItemId(R.id.person);
    }



    void setup_layout(){
        btnAddPt=findViewById(R.id.add_point);
        equation =new ArrayList<>();
        equation_2 =new ArrayList<>();
        textViews=new ArrayList<>();
        textViews_x =new ArrayList<>();
        textViews_y =new ArrayList<>();
        xyValueArray = new ArrayList<>();
        bottomSheetDialog_cheat1=new BottomSheetDialog(MainActivity.this);
        bottomSheetDialog_cheat1.setContentView(R.layout.button_sheet_dialog_1);
        bottomSheetDialog_cheat1.setCanceledOnTouchOutside(false);
        point_x_value = findViewById(R.id.text_view_x_val);
        point_y_value = findViewById(R.id.text_view_y_val);

        bottomSheetDialog_cheat2=new BottomSheetDialog(MainActivity.this);
        bottomSheetDialog_cheat2.setContentView(R.layout.button_sheet_dialog_1);
        bottomSheetDialog_cheat2.setCanceledOnTouchOutside(false);

        //lin.removeAllViews();
        graph =findViewById(R.id.graph_firist_fragment);
        //mll = new ArrayList<multi_liear_layout>();
        serieses= new ArrayList<series>();

        grid_val =findViewById(R.id.grid_coordinate_val);
        grid_val.setText(""+coordinate);

        graph.getViewport().setScalable(true);
        //graph.getViewport().setScalableY(true);
        graph.getViewport().setScrollable(true);
       // graph.getViewport().setScrollableY(true);
        ///////////////////////////////////


        /////////////////////////////////////

        graph.onDataChanged(false, false);


        //set manual x bounds
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMaxY(coordinate);
        graph.getViewport().setMinY(-coordinate);

        //set manual y bounds
        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMaxX(coordinate);
        graph.getViewport().setMinX(-coordinate);

        xyValueArray = new ArrayList<>();
        btnAddPt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //graph.removeAllSeries();
                xySeries = new PointsGraphSeries<>();
               /* double start = -100;
                double end = 100;
                for(int i = 0; i<40; i++){
                    double randomX = new Random().nextDouble();
                    double randomY = new Random().nextDouble();
                    double x = start + (randomX * (end - start));
                    double y = start + (randomY * (end - start));
                    xyValueArray.add(new XYValue(x,y));
                }*/
                double xx = Double.parseDouble(point_x_value.getText().toString());
                double yy =  Double.parseDouble(point_y_value.getText().toString());
                double randomX = new Random().nextDouble();
                double randomY = new Random().nextDouble();
                xx =xx+(randomX * (1 - .9));
                yy =yy+(randomY * (1 - .9));
                xyValueArray.add(new XYValue(xx,yy));

                //sort it in ASC order
                xyValueArray = sortArray(xyValueArray);
                //add the data to the series
                for(int i = 0;i <xyValueArray.size(); i++){
                    double x = xyValueArray.get(i).getX();
                    double y = xyValueArray.get(i).getY();
                    xySeries.appendData(new DataPoint(x,y),true, 1000);
                }

                createScatterPlot();
            }
        });


    }
boolean firest=false,second=false;
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.person:
                bottomSheetDialog_cheat1.show();
                if (!firest) {
                    fab_buttom_sheet_1 = bottomSheetDialog_cheat1.findViewById(R.id.fab_button_sheet_dialog_1);
                    lin_buttom_sheet_list = (ListView) bottomSheetDialog_cheat1.findViewById(R.id.Container_button_sheet_dialog_1);

                    lin_buttom_sheet_keyboard = (LinearLayout) bottomSheetDialog_cheat1.findViewById(R.id.Container_button_sheet_dialog_keyboard);

                    keyboard = new keyboard(getBaseContext());
                    lin_buttom_sheet_keyboard.addView(keyboard.keyboard());
                    keyboard.setvisible(false);
                    firest=true;
                }

                fab_buttom_sheet_1.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("ResourceType")
                    @Override
                    public void onClick(View v) {
                        graph.removeAllSeries();
                        setthings_1();
                    }
                });
                return true;
        }
        return false;
    }
    boolean add=false;
    void setthings_1(){

        keyboard.setvisible(true);

        equation.add("");

        ArrayAdapter<String> items = new ArrayAdapter<String>(this, R.layout.tv, equation){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 =  view.findViewById(android.R.id.text1);


                textViews.add(position,text1);

                return view;
            }
        };
        lin_buttom_sheet_list.setAdapter(items);

        lin_buttom_sheet_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(),position+"\n"+textViews.get(position).getText().toString(),Toast.LENGTH_SHORT).show();


                keyboard.setTextView(textViews.get(position));
                textViews.get(position).addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                       // Toast.makeText(getBaseContext(),"hi beforeTextChanged",Toast.LENGTH_LONG).show();
                         //if (textViews.get(position).getText().toString().length()>0)graph.removeAllSeries();
                        if (textViews.get(position).getText().toString().length()==0)
                            add=true;

                        else
                            add=false;
                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        try {
                            ArrayList<DataPoint> dp =new ArrayList<DataPoint>();
                            if (add){
                                //Toast.makeText(getBaseContext(), "add", Toast.LENGTH_SHORT).show();
                                for (int i=-coordinate;i<coordinate;i+=10){
                                    String equation2=textViews.get(position).getText().toString().replace("x","("+i+")");
                                    Expression expression = new Expression(equation2);
                                    int result = (int) expression.calculate();
                                    dp.add(new DataPoint(i,result));
                                }

                                serieses.add(position,new series(dp, getBaseContext(),graph));
                                serieses.get(position).getSeries().setColor(Color.RED);
                                graph.addSeries(serieses.get(position).getSeries());
                               // equation.add(position,textViews.get(position).getText().toString());
                            }
                            else {
                                //Toast.makeText(getBaseContext(), "update", Toast.LENGTH_SHORT).show();
                                graph.removeSeries( serieses.get(position).getSeries());
                                //serieses = new ArrayList<series>();

                               // for (int i = 0; i < textViews.size(); i++) {
                                    dp = new ArrayList<DataPoint>();
                                    //if (textViews.get(i).getText().toString().length()>0) {
                                    for (int y = -coordinate; y < coordinate; y += 10) {
                                        String equation2 = textViews.get(position).getText().toString().replace("x", "(" + y + ")");
                                        Expression expression = new Expression(equation2);
                                        int result = (int) expression.calculate();
                                        dp.add(new DataPoint(y, result));
                                    }
                                    serieses.add(position,new series(dp, getBaseContext(), graph));
                                    serieses.get(position).getSeries().setColor(Color.RED);
                                    graph.addSeries(serieses.get(position).getSeries());
                               // }
                            }

                        }catch(Exception e){

                        }
                    }
                });

            }
        });


    }

    public void grid_minus(View view) {
        if (coordinate>50)
            coordinate-=50;
        graph.onDataChanged(false, false);


        //set manual x bounds
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMaxY(coordinate);
        graph.getViewport().setMinY(-coordinate);

        //set manual y bounds
        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMaxX(coordinate);
        graph.getViewport().setMinX(-coordinate);

        grid_val.setText(""+coordinate);
    }

    public void grid_plus(View view) {
        coordinate+=50;
        graph.onDataChanged(false, false);

        //set manual x bounds
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMaxY(coordinate);
        graph.getViewport().setMinY(-coordinate);

        //set manual y bounds
        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMaxX(coordinate);
        graph.getViewport().setMinX(-coordinate);

        grid_val.setText(""+coordinate);


    }



    private void createScatterPlot() {
        Log.d(TAG, "createScatterPlot: Creating scatter plot.");



        xySeries.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Log.d(TAG, "onTap: You clicked on: (" + dataPoint.getX() +
                        "," + dataPoint.getY() + ")");
                //declare new series
                onClickSeries = new PointsGraphSeries<>();

                onClickSeries.appendData(new DataPoint(dataPoint.getX(),dataPoint.getY()),true, 100);

                onClickSeries.setShape(PointsGraphSeries.Shape.RECTANGLE);

                onClickSeries.setColor(Color.RED);

                onClickSeries.setSize(25f);

                graph.removeAllSeries();

                graph.addSeries(onClickSeries);

                toastMessage("x = " + dataPoint.getX() + "\n" +
                        "y = " + dataPoint.getY() );

                createScatterPlot();

            }
        });

redrow();
        //set some properties
        xySeries.setShape(PointsGraphSeries.Shape.RECTANGLE);
        xySeries.setColor(Color.BLUE);
        xySeries.setSize(20f);

        //set Scrollable and Scaleable


        graph.addSeries(xySeries);
    }


    void redrow(){
        for (short x=0;x<serieses.size();x++){

            graph.addSeries(serieses.get(x).getSeries());
        }
    }
    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
    private ArrayList<XYValue> sortArray(ArrayList<XYValue> array){
        /*
        //Sorts the xyValues in Ascending order to prepare them for the PointsGraphSeries<DataSet>
         */
        int factor = Integer.parseInt(String.valueOf(Math.round(Math.pow(array.size(),2))));
        int m = array.size()-1;
        int count = 0;
        Log.d(TAG, "sortArray: Sorting the XYArray.");

        while(true){
            m--;
            if(m <= 0){
                m = array.size() - 1;
            }
            Log.d(TAG, "sortArray: m = " + m);
            try{
                //print out the y entrys so we know what the order looks like
                //Log.d(TAG, "sortArray: Order:");
                //for(int n = 0;n < array.size();n++){
                //Log.d(TAG, "sortArray: " + array.get(n).getY());
                //}
                double tempY = array.get(m-1).getY();
                double tempX = array.get(m-1).getX();
                if(tempX > array.get(m).getX() ){
                    array.get(m-1).setY(array.get(m).getY());
                    array.get(m).setY(tempY);
                    array.get(m-1).setX(array.get(m).getX());
                    array.get(m).setX(tempX);
                }
                else if(tempY == array.get(m).getY()){
                    count++;
                    Log.d(TAG, "sortArray: count = " + count);
                }

                else if(array.get(m).getX() > array.get(m-1).getX()){
                    count++;
                    Log.d(TAG, "sortArray: count = " + count);
                }
                //break when factorial is done
                if(count == factor ){
                    break;
                }
            }catch(ArrayIndexOutOfBoundsException e){
                Log.e(TAG, "sortArray: ArrayIndexOutOfBoundsException. Need more than 1 data point to create Plot." +
                        e.getMessage());
                break;
            }
        }
        return array;
    }
}