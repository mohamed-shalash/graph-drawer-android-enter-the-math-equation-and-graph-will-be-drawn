package com.example.graph;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Test extends AppCompatActivity {

    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

fab =findViewById(R.id.test_button);
        LinearLayout lin;
        lin = (LinearLayout) findViewById(R.id.anything);
        lin.removeAllViews();

        ArrayList<EditText> txtName = new ArrayList<EditText>();//new EditText(Test.this);
        fab.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {

                txtName.add(new EditText(Test.this));
                txtName.get(txtName.size()-1).setId(txtName.size()-1);

                lin.addView(txtName.get(txtName.size()-1));


                for (int ii=0;ii<txtName.size();ii++){
                    txtName.get(ii).setText("new text "+ii);
                }
            }
        });

}

}