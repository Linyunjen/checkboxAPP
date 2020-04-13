package com.Shely.checkboxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnOK(View view) {
        CheckBox chk;
        TextView txvResult;
        String msg = "";
        // Array
        int[] id = {R.id.checkBox,R.id.checkBox2 ,R.id.checkBox3 ,R.id .checkBox4 };
        for (int i:id ) {
            chk = findViewById(i);

            if (chk.isChecked())
                msg += "\n" + chk.getText();
            //else
            //msg = "請選擇"
        }
        txvResult =findViewById(R.id.txvshow);
        txvResult .setText(msg);

        }
    }
