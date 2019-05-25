package com.example.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.activityforresult.R;

public class Main2Activity extends AppCompatActivity {


    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
    }

    public void btn1_Click(View v){
        setResult(RESULT_OK);
        finish();
    }
    public void btn2_Click(View v){
        setResult(RESULT_CANCELED);
        finish();
    }
}
