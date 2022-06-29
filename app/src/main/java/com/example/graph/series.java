package com.example.graph;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.OnDataPointTapListener;
import com.jjoe64.graphview.series.PointsGraphSeries;
import com.jjoe64.graphview.series.Series;

import java.util.ArrayList;
import java.util.List;

public class series {

    LineGraphSeries series ;
    PointsGraphSeries<DataPoint> onClickSeries;
    ArrayList<DataPoint> dp;

    public LineGraphSeries getSeries() {
        return series;
    }

    public void setSeries(LineGraphSeries series) {
        this.series = series;
    }

    public series(ArrayList<DataPoint> dp, Context context, GraphView graph) {
        series=new LineGraphSeries();
        this.dp = dp;
        for (int i=0;i<dp.size();i++)
            series.appendData(dp.get(i),true,dp.size());

        Toast.makeText(context,dp.get(0)+"   "+dp.size(),Toast.LENGTH_LONG)
                .show();

        series.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {

                //declare new series

               // onClickSeries = new PointsGraphSeries<>();
              //  onClickSeries.appendData(new DataPoint(dataPoint.getX(),dataPoint.getY()),true, 100);

              //  onClickSeries.setShape(PointsGraphSeries.Shape.RECTANGLE);

              //  onClickSeries.setColor(Color.RED);

              //  onClickSeries.setSize(20f);
              //  Series s=graph.getSeries().get(0);
               // graph.removeAllSeries();
              //  graph.addSeries(onClickSeries);
              //  graph.addSeries(s);

                Toast.makeText(context,"x = " + dataPoint.getX() + "\n" +
                        "y = " + dataPoint.getY() ,Toast.LENGTH_SHORT).show();
            }
        });
    }

    public ArrayList<DataPoint> getDp() {
        return dp;
    }

    public void setDp(ArrayList<DataPoint> dp) {
        this.dp = dp;
        for (int i=0;i<dp.size();i++)
            series.appendData(dp.get(i),true,dp.size());

    }
}
