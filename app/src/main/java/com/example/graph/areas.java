package com.example.graph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class areas extends AppCompatActivity {
    EditText rectangle_width,rectangle_height,radius,traingle_base,traingle_height,parallelogram_base,
            parallelogram_height,trapezoid_base_small,trapezoid_base_long,trapezoid_height,squre_rip,ellipse_radius,
            ellipse_radius_two,Appointed_radius_one,Appointed_radius_two;
    Button find;
    TextView tv;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);

        rectangle_width =findViewById(R.id.area_rectangle_width);
        rectangle_height =findViewById(R.id.area_rectangle_height);

        radius =findViewById(R.id.area_circle_radies);

        traingle_base =findViewById(R.id.area_triengle_base);
        traingle_height =findViewById(R.id.area_triengle_height);

        parallelogram_base =findViewById(R.id.area_parallelogram_base);
        parallelogram_height =findViewById(R.id.area_parallelogram_height);

        trapezoid_base_small =findViewById(R.id.area_trapezoid_base_small);
        trapezoid_base_long =findViewById(R.id.area_trapezoid_base_big);
        trapezoid_height =findViewById(R.id.area_trapezoid_height_);

        squre_rip =findViewById(R.id.area_Square_base);

        ellipse_radius =findViewById(R.id.area_Ellipse_radius_one);
        ellipse_radius_two =findViewById(R.id.area_Ellipse_radius_two);

        Appointed_radius_one =findViewById(R.id.area_Appointed_radius_one);
        Appointed_radius_two =findViewById(R.id.area_Appointed_radius_two);


        find =findViewById(R.id.Find_area);
        tv =findViewById(R.id.tv_area);
        spinner =findViewById(R.id.spinner_shapes_area);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        rectangle_width.setVisibility(View.VISIBLE);
                        rectangle_height.setVisibility(View.VISIBLE);
                        radius.setVisibility(View.GONE);
                        traingle_base.setVisibility(View.GONE);
                        traingle_height.setVisibility(View.GONE);

                        trapezoid_height.setVisibility(View.GONE);
                        parallelogram_base.setVisibility(View.GONE);
                        parallelogram_height.setVisibility(View.GONE);
                        trapezoid_base_small.setVisibility(View.GONE);
                        trapezoid_base_long.setVisibility(View.GONE);

                        squre_rip.setVisibility(View.GONE);
                        ellipse_radius.setVisibility(View.GONE);
                        ellipse_radius_two.setVisibility(View.GONE);

                        Appointed_radius_one.setVisibility(View.GONE);
                        Appointed_radius_two.setVisibility(View.GONE);
                        break;
                    case 1:
                        rectangle_width.setVisibility(View.GONE);
                        rectangle_height.setVisibility(View.GONE);
                        radius.setVisibility(View.VISIBLE);
                        traingle_base.setVisibility(View.GONE);
                        traingle_height.setVisibility(View.GONE);

                        parallelogram_base.setVisibility(View.GONE);
                        parallelogram_height.setVisibility(View.GONE);
                        trapezoid_base_small.setVisibility(View.GONE);
                        trapezoid_base_long.setVisibility(View.GONE);
                        trapezoid_height.setVisibility(View.GONE);
                        squre_rip.setVisibility(View.GONE);
                        ellipse_radius.setVisibility(View.GONE);
                        ellipse_radius_two.setVisibility(View.GONE);

                        Appointed_radius_one.setVisibility(View.GONE);
                        Appointed_radius_two.setVisibility(View.GONE);
                        break;
                    case 2:
                        rectangle_width.setVisibility(View.GONE);
                        rectangle_height.setVisibility(View.GONE);
                        radius.setVisibility(View.GONE);
                        traingle_base.setVisibility(View.VISIBLE);
                        traingle_height.setVisibility(View.VISIBLE);

                        parallelogram_base.setVisibility(View.GONE);
                        parallelogram_height.setVisibility(View.GONE);
                        trapezoid_base_small.setVisibility(View.GONE);
                        trapezoid_base_long.setVisibility(View.GONE);
                        trapezoid_height.setVisibility(View.GONE);
                        squre_rip.setVisibility(View.GONE);
                        ellipse_radius.setVisibility(View.GONE);
                        ellipse_radius_two.setVisibility(View.GONE);

                        Appointed_radius_one.setVisibility(View.GONE);
                        Appointed_radius_two.setVisibility(View.GONE);
                        break;
                    case 3:
                        rectangle_width.setVisibility(View.GONE);
                        rectangle_height.setVisibility(View.GONE);
                        radius.setVisibility(View.GONE);
                        traingle_base.setVisibility(View.GONE);
                        traingle_height.setVisibility(View.GONE);

                        parallelogram_base.setVisibility(View.VISIBLE);
                        parallelogram_height.setVisibility(View.VISIBLE);
                        trapezoid_base_small.setVisibility(View.GONE);
                        trapezoid_base_long.setVisibility(View.GONE);
                        trapezoid_height.setVisibility(View.GONE);
                        squre_rip.setVisibility(View.GONE);
                        ellipse_radius.setVisibility(View.GONE);
                        ellipse_radius_two.setVisibility(View.GONE);

                        Appointed_radius_one.setVisibility(View.GONE);
                        Appointed_radius_two.setVisibility(View.GONE);
                        break;

                    case 4:
                        rectangle_width.setVisibility(View.GONE);
                        rectangle_height.setVisibility(View.GONE);
                        radius.setVisibility(View.GONE);
                        traingle_base.setVisibility(View.GONE);
                        traingle_height.setVisibility(View.GONE);

                        parallelogram_base.setVisibility(View.GONE);
                        parallelogram_height.setVisibility(View.GONE);
                        trapezoid_base_small.setVisibility(View.VISIBLE);
                        trapezoid_base_long.setVisibility(View.VISIBLE);
                        trapezoid_height.setVisibility(View.VISIBLE);
                        squre_rip.setVisibility(View.GONE);
                        ellipse_radius.setVisibility(View.GONE);
                        ellipse_radius_two.setVisibility(View.GONE);

                        Appointed_radius_one.setVisibility(View.GONE);
                        Appointed_radius_two.setVisibility(View.GONE);
                        break;

                    case 5:
                        rectangle_width.setVisibility(View.GONE);
                        rectangle_height.setVisibility(View.GONE);
                        radius.setVisibility(View.GONE);
                        traingle_base.setVisibility(View.GONE);
                        traingle_height.setVisibility(View.GONE);

                        parallelogram_base.setVisibility(View.GONE);
                        parallelogram_height.setVisibility(View.GONE);
                        trapezoid_base_small.setVisibility(View.GONE);
                        trapezoid_base_long.setVisibility(View.GONE);
                        trapezoid_height.setVisibility(View.GONE);
                        squre_rip.setVisibility(View.VISIBLE);
                        ellipse_radius.setVisibility(View.GONE);
                        ellipse_radius_two.setVisibility(View.GONE);

                        Appointed_radius_one.setVisibility(View.GONE);
                        Appointed_radius_two.setVisibility(View.GONE);
                        break;

                    case 6:
                        rectangle_width.setVisibility(View.GONE);
                        rectangle_height.setVisibility(View.GONE);
                        radius.setVisibility(View.GONE);
                        traingle_base.setVisibility(View.GONE);
                        traingle_height.setVisibility(View.GONE);

                        parallelogram_base.setVisibility(View.GONE);
                        parallelogram_height.setVisibility(View.GONE);
                        trapezoid_base_small.setVisibility(View.GONE);
                        trapezoid_base_long.setVisibility(View.GONE);
                        trapezoid_height.setVisibility(View.GONE);
                        squre_rip.setVisibility(View.GONE);
                        ellipse_radius.setVisibility(View.VISIBLE);
                        ellipse_radius_two.setVisibility(View.VISIBLE);

                        Appointed_radius_one.setVisibility(View.GONE);
                        Appointed_radius_two.setVisibility(View.GONE);
                        break;

                    case 7:
                        rectangle_width.setVisibility(View.GONE);
                        rectangle_height.setVisibility(View.GONE);
                        radius.setVisibility(View.GONE);
                        traingle_base.setVisibility(View.GONE);
                        traingle_height.setVisibility(View.GONE);

                        parallelogram_base.setVisibility(View.GONE);
                        parallelogram_height.setVisibility(View.GONE);
                        trapezoid_base_small.setVisibility(View.GONE);
                        trapezoid_base_long.setVisibility(View.GONE);
                        trapezoid_height.setVisibility(View.GONE);
                        squre_rip.setVisibility(View.GONE);
                        ellipse_radius.setVisibility(View.GONE);
                        ellipse_radius_two.setVisibility(View.GONE);

                        Appointed_radius_one.setVisibility(View.VISIBLE);
                        Appointed_radius_two.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double area=0,w,h,x;
                int index =spinner.getSelectedItemPosition();
                switch (index){
                    case 0:
                        if (rectangle_width.getText().toString().equals("")||rectangle_height.getText().toString().equals("")) {
                            Toast.makeText(getBaseContext(), "please inter values", Toast.LENGTH_SHORT).show();
                            break;
                        }
                         w = Double.parseDouble(rectangle_width.getText().toString());
                         h = Double.parseDouble( rectangle_height.getText().toString());
                        area = w*h;
                        break;
                    case 1:
                        if (radius.getText().toString().equals("")) {
                            Toast.makeText(getBaseContext(), "please inter values", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        h = Double.parseDouble( radius.getText().toString());
                        area = Math.PI * Math.pow(h,2);
                        break;
                    case 2:
                        if (traingle_base.getText().toString().equals("")||traingle_height.getText().toString().equals("")) {
                            Toast.makeText(getBaseContext(), "please inter values", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        w = Double.parseDouble(traingle_base.getText().toString());
                        h = Double.parseDouble( traingle_height.getText().toString());
                        area = w*h*.5;
                        break;

                    case 3:
                        if (parallelogram_base.getText().toString().equals("")||parallelogram_height.getText().toString().equals("")) {
                            Toast.makeText(getBaseContext(), "please inter values", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        w = Double.parseDouble(parallelogram_base.getText().toString());
                        h = Double.parseDouble( parallelogram_height.getText().toString());
                        area = w*h;
                        break;
                    case 4:
                        if (trapezoid_base_small.getText().toString().equals("")||
                                trapezoid_base_long.getText().toString().equals("")||
                                trapezoid_height.getText().toString().equals("")) {

                            Toast.makeText(getBaseContext(), "please inter values", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        w = Double.parseDouble(trapezoid_base_small.getText().toString());
                        h = Double.parseDouble( trapezoid_base_long.getText().toString());
                        x = Double.parseDouble( trapezoid_height.getText().toString());
                        area = .5*(w+h)*x;
                        break;
                    case 5:
                        if (squre_rip.getText().toString().equals("")) {
                            Toast.makeText(getBaseContext(), "please inter values", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        w = Double.parseDouble(squre_rip.getText().toString());

                        area = w*w;
                        break;
                    case 6:
                        if (ellipse_radius.getText().toString().equals("")||ellipse_radius_two.getText().toString().equals("")) {
                            Toast.makeText(getBaseContext(), "please inter values", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        w = Double.parseDouble(ellipse_radius.getText().toString());
                        h = Double.parseDouble( ellipse_radius_two.getText().toString());
                        area = w*h*Math.PI;
                        break;
                    case 7:
                        if (Appointed_radius_one.getText().toString().equals("")||Appointed_radius_two.getText().toString().equals("")) {
                            Toast.makeText(getBaseContext(), "please inter values", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        w = Double.parseDouble(Appointed_radius_one.getText().toString());
                        h = Double.parseDouble( Appointed_radius_two.getText().toString());
                        area = w*h*.5;
                        break;
                }
                tv.setText(area+"");
            }
        });
    }
}