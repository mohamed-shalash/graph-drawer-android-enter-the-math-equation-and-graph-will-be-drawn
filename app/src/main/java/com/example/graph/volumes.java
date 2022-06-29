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

public class volumes extends AppCompatActivity {
    EditText spherical,cone_radius,cone_height,cylinder_diameter,cylinder_height,prism_length,prism_width,
            prism_height,Cuboid_length,Cuboid_width,Cuboid_height,cube,pyramid_side1,pyramid_side2,pyramid_height;
    Button find;
    TextView tv;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumes);

        spherical =findViewById(R.id.volumes_spherical_radies);

        cone_radius =findViewById(R.id.volumes_cone_radies);
        cone_height =findViewById(R.id.volumes_cone_height);

        cylinder_diameter =findViewById(R.id.volumes_cylinder_diameter);
        cylinder_height =findViewById(R.id.volumes_cylinder_height);

        prism_length =findViewById(R.id.volumes_prism_length);
        prism_width =findViewById(R.id.volumes_prism_width);
        prism_height =findViewById(R.id.volumes_prism_height);

        Cuboid_length =findViewById(R.id.volumes_Cuboid_length);
        Cuboid_width =findViewById(R.id.volumes_Cuboid_width);
        Cuboid_height =findViewById(R.id.volumes_Cuboid_height);

        cube =findViewById(R.id.volumes_cube_length);

        pyramid_side1 =findViewById(R.id.volumes_pyramid_base_side_1);
        pyramid_side2 =findViewById(R.id.volumes_pyramid_base_side_2);
        pyramid_height =findViewById(R.id.volumes_pyramid_height);



        find =findViewById(R.id.Find_volume);
        tv =findViewById(R.id.tv_volume);
        spinner =findViewById(R.id.spinner_shapes_volume);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        spherical.setVisibility(View.VISIBLE);
                        cone_radius.setVisibility(View.GONE);
                        cone_height.setVisibility(View.GONE);
                        cylinder_diameter.setVisibility(View.GONE);
                        cylinder_height.setVisibility(View.GONE);
                        prism_length.setVisibility(View.GONE);
                        prism_width.setVisibility(View.GONE);
                        prism_height.setVisibility(View.GONE);
                        Cuboid_length.setVisibility(View.GONE);
                        Cuboid_width.setVisibility(View.GONE);
                        Cuboid_height.setVisibility(View.GONE);
                        cube.setVisibility(View.GONE);
                        pyramid_side1.setVisibility(View.GONE);
                        pyramid_side2.setVisibility(View.GONE);
                        pyramid_height.setVisibility(View.GONE);
                        break;

                    case 1:
                        spherical.setVisibility(View.GONE);
                        cone_radius.setVisibility(View.VISIBLE);
                        cone_height.setVisibility(View.VISIBLE);
                        cylinder_diameter.setVisibility(View.GONE);
                        cylinder_height.setVisibility(View.GONE);
                        prism_length.setVisibility(View.GONE);
                        prism_width.setVisibility(View.GONE);
                        prism_height.setVisibility(View.GONE);
                        Cuboid_length.setVisibility(View.GONE);
                        Cuboid_width.setVisibility(View.GONE);
                        Cuboid_height.setVisibility(View.GONE);
                        cube.setVisibility(View.GONE);
                        pyramid_side1.setVisibility(View.GONE);
                        pyramid_side2.setVisibility(View.GONE);
                        pyramid_height.setVisibility(View.GONE);
                        break;

                    case 2:
                        spherical.setVisibility(View.GONE);
                        cone_radius.setVisibility(View.GONE);
                        cone_height.setVisibility(View.GONE);
                        cylinder_diameter.setVisibility(View.VISIBLE);
                        cylinder_height.setVisibility(View.VISIBLE);
                        prism_length.setVisibility(View.GONE);
                        prism_width.setVisibility(View.GONE);
                        prism_height.setVisibility(View.GONE);
                        Cuboid_length.setVisibility(View.GONE);
                        Cuboid_width.setVisibility(View.GONE);
                        Cuboid_height.setVisibility(View.GONE);
                        cube.setVisibility(View.GONE);
                        pyramid_side1.setVisibility(View.GONE);
                        pyramid_side2.setVisibility(View.GONE);
                        pyramid_height.setVisibility(View.GONE);
                        break;

                    case 3:
                        spherical.setVisibility(View.GONE);
                        cone_radius.setVisibility(View.GONE);
                        cone_height.setVisibility(View.GONE);
                        cylinder_diameter.setVisibility(View.GONE);
                        cylinder_height.setVisibility(View.GONE);
                        prism_length.setVisibility(View.VISIBLE);
                        prism_width.setVisibility(View.VISIBLE);
                        prism_height.setVisibility(View.VISIBLE);
                        Cuboid_length.setVisibility(View.GONE);
                        Cuboid_width.setVisibility(View.GONE);
                        Cuboid_height.setVisibility(View.GONE);
                        cube.setVisibility(View.GONE);
                        pyramid_side1.setVisibility(View.GONE);
                        pyramid_side2.setVisibility(View.GONE);
                        pyramid_height.setVisibility(View.GONE);
                        break;

                    case 4:
                        spherical.setVisibility(View.GONE);
                        cone_radius.setVisibility(View.GONE);
                        cone_height.setVisibility(View.GONE);
                        cylinder_diameter.setVisibility(View.GONE);
                        cylinder_height.setVisibility(View.GONE);
                        prism_length.setVisibility(View.GONE);
                        prism_width.setVisibility(View.GONE);
                        prism_height.setVisibility(View.GONE);
                        Cuboid_length.setVisibility(View.VISIBLE);
                        Cuboid_width.setVisibility(View.VISIBLE);
                        Cuboid_height.setVisibility(View.VISIBLE);
                        cube.setVisibility(View.GONE);
                        pyramid_side1.setVisibility(View.GONE);
                        pyramid_side2.setVisibility(View.GONE);
                        pyramid_height.setVisibility(View.GONE);
                        break;

                    case 5:
                        spherical.setVisibility(View.GONE);
                        cone_radius.setVisibility(View.GONE);
                        cone_height.setVisibility(View.GONE);
                        cylinder_diameter.setVisibility(View.GONE);
                        cylinder_height.setVisibility(View.GONE);
                        prism_length.setVisibility(View.GONE);
                        prism_width.setVisibility(View.GONE);
                        prism_height.setVisibility(View.GONE);
                        Cuboid_length.setVisibility(View.GONE);
                        Cuboid_width.setVisibility(View.GONE);
                        Cuboid_height.setVisibility(View.GONE);
                        cube.setVisibility(View.VISIBLE);
                        pyramid_side1.setVisibility(View.GONE);
                        pyramid_side2.setVisibility(View.GONE);
                        pyramid_height.setVisibility(View.GONE);
                        break;

                    case 6:
                        spherical.setVisibility(View.GONE);
                        cone_radius.setVisibility(View.GONE);
                        cone_height.setVisibility(View.GONE);
                        cylinder_diameter.setVisibility(View.GONE);
                        cylinder_height.setVisibility(View.GONE);
                        prism_length.setVisibility(View.GONE);
                        prism_width.setVisibility(View.GONE);
                        prism_height.setVisibility(View.GONE);
                        Cuboid_length.setVisibility(View.GONE);
                        Cuboid_width.setVisibility(View.GONE);
                        Cuboid_height.setVisibility(View.GONE);
                        cube.setVisibility(View.GONE);
                        pyramid_side1.setVisibility(View.VISIBLE);
                        pyramid_side2.setVisibility(View.VISIBLE);
                        pyramid_height.setVisibility(View.VISIBLE);
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
                switch (index) {
                    case 0:
                        if (spherical.getText().toString().equals("") ) {
                            Toast.makeText(getBaseContext(), "please inter values", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        w = Double.parseDouble(spherical.getText().toString());
                        area = 4*Math.PI*w * w;
                        break;
                    case 1:
                        if (cone_radius.getText().toString().equals("") || cone_height.getText().toString().equals("")) {
                            Toast.makeText(getBaseContext(), "please inter values", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        w = Double.parseDouble(cone_radius.getText().toString());
                        h = Double.parseDouble(cone_height.getText().toString());
                        area = Math.PI * w*w*h*.333;
                        break;
                    case 2:
                        if (cylinder_diameter.getText().toString().equals("") || cylinder_height.getText().toString().equals("")) {
                            Toast.makeText(getBaseContext(), "please inter values", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        w = Double.parseDouble(cylinder_diameter.getText().toString());
                        h = Double.parseDouble(cylinder_height.getText().toString());
                        area = Math.PI * w*w * h ;
                        break;

                    case 3:
                        if (prism_length.getText().toString().equals("") ||
                                prism_width.getText().toString().equals("")||
                                prism_height.getText().toString().equals("")) {
                            Toast.makeText(getBaseContext(), "please inter values", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        w = Double.parseDouble(prism_length.getText().toString());
                        h = Double.parseDouble(prism_height.getText().toString());
                        x= Double.parseDouble(prism_width.getText().toString());
                        area = .5*w * h*x;
                        break;
                    case 4:
                        if (Cuboid_length.getText().toString().equals("") ||
                                Cuboid_width.getText().toString().equals("") ||
                                Cuboid_height.getText().toString().equals("")) {

                            Toast.makeText(getBaseContext(), "please inter values", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        w = Double.parseDouble(Cuboid_length.getText().toString());
                        h = Double.parseDouble(Cuboid_width.getText().toString());
                        x = Double.parseDouble(Cuboid_height.getText().toString());
                        area = w*h*x;
                        break;
                    case 5:
                        if (cube.getText().toString().equals("")) {
                            Toast.makeText(getBaseContext(), "please inter values", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        w = Double.parseDouble(cube.getText().toString());

                        area = w * w*w;
                        break;
                    case 6:
                        if (pyramid_side1.getText().toString().equals("") ||
                                pyramid_side2.getText().toString().equals("") ||
                                pyramid_height.getText().toString().equals("")) {

                            Toast.makeText(getBaseContext(), "please inter values", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        w = Double.parseDouble(pyramid_side1.getText().toString());
                        h = Double.parseDouble(pyramid_side2.getText().toString());
                        x = Double.parseDouble(pyramid_height.getText().toString());

                        area= .33 *w*h*x;
                        break;

                }
                tv.setText(area+"");

            }
        });
    }
}