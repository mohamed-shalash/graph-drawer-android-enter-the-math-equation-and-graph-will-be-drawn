package com.example.graph;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class keyboard {
    LinearLayout linearLayout;
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_point,btn_delete,btn_sin,
            btn_cos,btn_tan,btn_sinh,btn_cosh,btn_tanh,btn_pow2,btn_pown,btn_sqr2,btn_sqrn,btn_plus,
            btn_minus,btn_multiply,btn_divisor,btn_right_bow,btn_left_bow,btn_mod,btn_abs,btn_var,btn_pi,btn_radian,
            btn_log10,btn_log2,btn_ln;
    TextView textView;

    public void setTextView(TextView textView) {
        this.textView = textView;
    }
    public void setvisible(boolean visibility) {
        if (visibility)
        linearLayout.setVisibility(View.VISIBLE);
        else linearLayout.setVisibility(View.GONE);
    }

    public LinearLayout keyboard() {
        return linearLayout;
    }

    public keyboard(Context context) {
        linearLayout =new LinearLayout(context);

        btn_1 = new Button(context);
        btn_2 = new Button(context);
        btn_3 = new Button(context);
        btn_4 = new Button(context);
        btn_5 = new Button(context);
        btn_6 = new Button(context);
        btn_7 = new Button(context);
        btn_8 = new Button(context);
        btn_9 = new Button(context);
        btn_0 = new Button(context);
        btn_point = new Button(context);
        btn_plus = new Button(context);
        btn_minus = new Button(context);
        btn_sin = new Button(context);
        btn_cos = new Button(context);
        btn_tan = new Button(context);
        btn_sqr2 = new Button(context);
        btn_sqrn = new Button(context);
        btn_abs = new Button(context);
        btn_multiply = new Button(context);
        btn_divisor = new Button(context);
        btn_sinh = new Button(context);
        btn_cosh = new Button(context);
        btn_tanh = new Button(context);
        btn_left_bow = new Button(context);
        btn_right_bow = new Button(context);
        btn_delete = new Button(context);
        btn_pow2 = new Button(context);
        btn_pown = new Button(context);
        btn_mod = new Button(context);
        btn_var = new Button(context);
        btn_pi = new Button(context);
        btn_radian=new Button(context);

        btn_log10 = new Button(context);
        btn_log2 = new Button(context);
        btn_ln=new Button(context);



        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT, 3f));

        linearLayout.addView(col1_func(context));
        linearLayout.addView(col2_func(context));
        linearLayout.addView(col3_func(context));
        linearLayout.addView(col4_func(context));
    }

    LinearLayout col1_func(Context context){
        LinearLayout col1 =new LinearLayout(context);
        col1.setOrientation(LinearLayout.HORIZONTAL);
        col1.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT, 3f));


        col1.addView(btn_1);
        col1.addView(btn_2);
        col1.addView(btn_3);
        col1.addView(btn_4);
        col1.addView(btn_5);
        col1.addView(btn_6);
        col1.addView(btn_7);
        col1.addView(btn_8);
        col1.addView(btn_9);


        btn_1.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_1.setText("1");
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"1");
            }
        });
        btn_2.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_2.setText("2");
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"2");
            }
        });

        btn_3.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_3.setText("3");
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"3");
            }
        });

        btn_4.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_4.setText("4");
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"4");
            }
        });
        btn_5.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_5.setText("5");
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"5");
            }
        });

        btn_6.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_6.setText("6");
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"6");
            }
        });

        btn_7.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_7.setText("7");
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"7");
            }
        });
        btn_8.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_8.setText("8");
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"8");
            }
        });

        btn_9.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_9.setText("9");
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"9");
            }
        });
        return  col1;
    }

    LinearLayout col2_func(Context context){
        LinearLayout col2 =new LinearLayout(context);
        col2.setOrientation(LinearLayout.HORIZONTAL);
        col2.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT, 3f));

        col2.addView(btn_plus);
        col2.addView(btn_minus);
        col2.addView(btn_sin);
        col2.addView(btn_cos);
        col2.addView(btn_tan);
        col2.addView(btn_sqr2);
        col2.addView(btn_sqrn);
        col2.addView(btn_0);
        col2.addView(btn_point);


        btn_plus.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_plus.setText("+");
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"+");
            }
        });
        btn_minus.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_minus.setText("-");
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"-");
            }
        });

        btn_sin.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_sin.setText("sin");
        btn_sin.setTextSize(5);
        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"sin((pi/180)*");
            }
        });

        btn_cos.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_cos.setText("cos");
        btn_cos.setTextSize(5);
        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"cos((pi/180)*");
            }
        });

        btn_tan.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_tan.setText("tan");
        btn_tan.setTextSize(5);
        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"tan((pi/180)*");
            }
        });

        btn_sqr2.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_sqr2.setText("sqr");
        btn_sqr2.setTextSize(5);
        btn_sqr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"sqrt(");
            }
        });

        btn_sqrn.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_sqrn.setText("e");
        btn_sqrn.setTextSize(5);
        btn_sqrn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"e");
            }
        });

        btn_0.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_0.setText("0");
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"0");
            }
        });

        btn_point.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_point.setText(".");
        //btn_0.setTextSize(5);
        btn_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+".");
            }
        });


        return col2;
    }

    LinearLayout col3_func(Context context){
        LinearLayout col2 =new LinearLayout(context);
        col2.setOrientation(LinearLayout.HORIZONTAL);
        col2.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT, 3f));

        col2.addView(btn_multiply);
        col2.addView(btn_divisor);
        col2.addView(btn_sinh);
        col2.addView(btn_cosh);
        col2.addView(btn_tanh);
        col2.addView(btn_pow2);
        col2.addView(btn_pown);
        col2.addView(btn_left_bow);
        col2.addView(btn_right_bow);



        btn_multiply.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_multiply.setText("x");
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"*");
            }
        });
        btn_divisor.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_divisor.setText("/");
        btn_divisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"/");
            }
        });

        btn_sinh.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_sinh.setText("sinh");
        btn_sinh.setTextSize(5);
        btn_sinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"sinh((pi/180)*");
            }
        });

        btn_cosh.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_cosh.setText("cosh");
        btn_cosh.setTextSize(5);
        btn_cosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"cosh((pi/180)*");
            }
        });

        btn_tanh.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_tanh.setText("tanh");
        btn_tanh.setTextSize(5);
        btn_tanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"tanh((pi/180)*");
            }
        });

        btn_pow2.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_pow2.setText("^2");
        btn_pow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"^2");
            }
        });

        btn_pown.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_pown.setText("^n");
        btn_pown.setTextSize(5);
        btn_pown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"^");
            }
        });

        btn_left_bow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_left_bow.setText("(");
        btn_left_bow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"(");
            }
        });

        btn_right_bow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_right_bow.setText(")");
        //btn_0.setTextSize(5);
        btn_right_bow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+")");
            }
        });


        return col2;
    }

    LinearLayout col4_func(Context context){
        LinearLayout col2 =new LinearLayout(context);
        col2.setOrientation(LinearLayout.HORIZONTAL);
        col2.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT, 3f));

        col2.addView(btn_delete);
        col2.addView(btn_abs);
        col2.addView(btn_mod);
        col2.addView(btn_var);
        col2.addView(btn_pi);
        col2.addView(btn_radian);
        col2.addView(btn_log10);
        col2.addView(btn_log2);
        col2.addView(btn_ln);


        btn_delete.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_delete.setText("del");
        btn_delete.setTextSize(7);
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf( textView.getText()).length()>0){
                    String temp=String.valueOf( textView.getText());
                    temp =temp.substring(0,temp.length()-1);
                    textView.setText(String.valueOf( temp));
                }

            }
        });

        btn_abs.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_abs.setText("|x|");
        btn_abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"abs(");
            }
        });
        btn_var.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_var.setText("X");
        btn_var.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"x");

            }
        });


        btn_mod.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_mod.setText("%");
        //btn_mod.setTextSize(5);
        btn_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"%");
            }
        });

        btn_pi.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_pi.setText("pi");
        //btn_pi.setTextSize(5);
        btn_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"pi");
            }
        });

        btn_radian.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_radian.setText("rad");
        btn_radian.setTextSize(6);
        btn_radian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"(pi/180)");
            }
        });

        btn_log10.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_log10.setText("log10");
        btn_log10.setTextSize(5);
        btn_log10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"log10(");
            }
        });

        btn_log2.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_log2.setText("log2");
        btn_log2.setTextSize(5);
        btn_log2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"log2(");
            }
        });

        btn_ln.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        btn_ln.setText("ln");
        btn_ln.setTextSize(5);
        btn_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf( textView.getText())+"ln(");
            }
        });


        return col2;
    }
}
