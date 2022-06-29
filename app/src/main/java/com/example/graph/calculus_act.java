package com.example.graph;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;

import java.util.ArrayList;
import org.mariuszgromada.math.mxparser.*;

public class calculus_act extends AppCompatActivity {
        private Button btnAddPt;

    private EditText mX,mY;
    private static final String TAG = "calculus_act";
    GraphView graph;

    ArrayList<series> seriesarrays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculus_act);

        graph = (GraphView) findViewById(R.id.graph_calculas_activity);
        //series = new LineGraphSeries<>();

        btnAddPt = (Button) findViewById(R.id.btnAddPt_calculas_activity);
        mX = (EditText) findViewById(R.id.numX_calculas_activity);
        mY = (EditText) findViewById(R.id.numY_calculas_activity);


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

        seriesarrays=new ArrayList<>();

        btnAddPt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /*ArrayList<DataPoint> dp =new ArrayList<>();

                for (int i=-20;i<20;i++){
                    double y;
                    y=i*i;
                    dp.add(new DataPoint(i,y));
                }

                seriesarrays.add(new series(dp));
                seriesarrays.get(0).getSeries().setColor(Color.RED);
                graph.addSeries(seriesarrays.get(0).getSeries());

                String equation ="2*x+sin(y)";
                equation=equation.replace("x","3");
                equation=equation.replace("y","54");
                Expression expression = new Expression(equation);
                double result = expression.calculate();
                Toast.makeText(getBaseContext(),result+"  "+equation,Toast.LENGTH_SHORT)
                        .show();*/
               String equation = "5+x";//mX.getText().toString();

                ArrayList<DataPoint> dp =new ArrayList<>();

                for (int i=-100;i<100;i++){
                    String equation2=equation.replace("x","("+i+")");
                    Expression expression = new Expression(equation2);
                    int result = (int) expression.calculate();
                    dp.add(new DataPoint(i,result));
                }

                seriesarrays.add(new series(dp,getBaseContext(),graph));
                seriesarrays.get(0).getSeries().setColor(Color.RED);
                graph.addSeries(seriesarrays.get(0).getSeries());
                Toast.makeText(getBaseContext(),equation,Toast.LENGTH_SHORT)
                        .show();
            }
        });


    }
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

}











