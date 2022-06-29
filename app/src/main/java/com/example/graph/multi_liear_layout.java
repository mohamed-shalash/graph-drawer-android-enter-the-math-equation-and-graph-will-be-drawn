package com.example.graph;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.Toast;

public class multi_liear_layout {
    LinearLayout linearLayout;
    Button button;
    EditText editText;
    Context context;

    int id;

    public multi_liear_layout(Context context,int id) {
        linearLayout =new LinearLayout(context);
        editText =new EditText(context);
        this.context =context;
        button = new Button(context);

        this.id =id;
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.addView(editText);
        linearLayout.addView(button);
        editText.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 1f));
        button.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 3f));
        button.setText("...");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,id+" : "+editText.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    public LinearLayout getLinearLayout() {
        return linearLayout;
    }

    public Button getButton() {
        return button;
    }

    public EditText getEditText() {
        return editText;
    }

    public int getId() {
        return id;
    }
}
