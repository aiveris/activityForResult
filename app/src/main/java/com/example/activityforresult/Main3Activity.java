package com.example.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.activityforresult.R;

public class Main3Activity extends AppCompatActivity {


    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
    }

    public void btn1_Click(View v){
        Intent i = new Intent();
        i.putExtra("KeyValue","Main3-YES");
        setResult(RESULT_OK,i);
        finish();
    }
    public void btn2_Click(View v){
        Intent i = new Intent();
        i.putExtra("KeyValue","Main3-NO");
        setResult(RESULT_CANCELED,i);
        finish();
    }


}
