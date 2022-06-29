package com.example.graph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.mariuszgromada.math.mxparser.*;
import android.widget.EditText;
import android.widget.TextView;

import com.jjoe64.graphview.series.DataPoint;

public class calculator_activity extends AppCompatActivity {
    EditText textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_activity);
        textView =findViewById(R.id.textView_calculator);
    }

    private void update(String chr){
        String oldertext =textView.getText().toString();
        int curpos =textView.getSelectionStart();
        String leftstr =oldertext.substring(0,curpos);
        String rightstr =oldertext.substring(curpos);
        textView.setText(String.format("%s%s%s",leftstr,chr,rightstr));
        textView.setSelection(curpos+1);
    }


    public void CLEAR_all(View view) {
        textView.setText("");
    }

    public void seven_update(View view) {
        update("7");
    }

    public void one_update(View view) {
        update("1");
    }

    public void zero_update(View view) {
        update("0");
    }

    public void two_update(View view) {
        update("2");
    }

    public void three_update(View view) {
        update("3");
    }

    public void add_update(View view) {
        update("+");
    }

    public void point_update(View view) {
        update(".");
    }

    public void multi_update(View view) {
        update("*");
    }

    public void nine_update(View view) {
        update("9");
    }

    public void five_update(View view) {
        update("5");
    }

    public void sex_update(View view) {
        update("6");
    }

    public void sub_update(View view) {
        update("-");
    }

    public void four_update(View view) {
        update("4");
    }

    public void eight_update(View view) {
        update("8");
    }

    public void equal_func(View view) {
        String equation2 =textView.getText().toString();
        Expression expression = new Expression(equation2);
        int result = (int) expression.calculate();
        textView.setText(""+result);
        textView.setSelection((result+"").length());
    }

    public void divi_update(View view) {
        update("/");
    }

    public void backspace_logic(View view) {
        int cuppos =textView.getSelectionStart();
        int textlen = textView.getText().length();
        if ((cuppos!=0 )&& textlen != 0){
            SpannableStringBuilder selection= (SpannableStringBuilder) textView.getText();
            selection.replace(cuppos-1,cuppos,"");
            textView.setText(selection);
            textView.setSelection(cuppos-1);
        }
    }

    public void pow_update(View view) {
        update("^");
    }

    public void pow_updates(View view) {
        int curpos =textView.getSelectionStart();
        int openpar=0;
        int closepar=0;
        int textlen=textView.getText().length();
        if (textlen>0) {
            for (int i = 0; i < curpos; i++) {
                if (textView.getText().toString().substring(i, i + 1).equals("(")) {
                    openpar += 1;
                }
                if (textView.getText().toString().substring(i, i + 1).equals(")")) {
                    closepar += 1;
                }

            }

            if (openpar == closepar || textView.getText().toString().substring(textlen - 1, textlen).equals("(")) {
                update("(");
            } else if (openpar > closepar && !textView.getText().toString().substring(textlen - 1, textlen).equals("(")) {
                update(")");
            }
        }else{
            update("(");
        }
        textView.setSelection(curpos + 1);
    }

    public void minus_update(View view) {
        update("-");
    }
}