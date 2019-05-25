package com.example.activityforresult;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    final static int REQUEST_TO_MAIN2=123;
    final static int REQUEST_TO_MAIN3=789;
    //internally RESULT_OK = -1... and....RESULT_CANCELED= 0

    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
    }

    public void btn1_Click(View v){
        Intent i = new Intent(this,Main2Activity.class);
        startActivityForResult(i, REQUEST_TO_MAIN2);
    }
    public void btn2_Click(View v){
        Intent i = new Intent(this,Main3Activity.class);
        startActivityForResult(i, REQUEST_TO_MAIN3);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.e("ACTIVITY_RESULT", "RequestCode: " + requestCode +" | "+"ResultCode: " + resultCode );

        if(requestCode==REQUEST_TO_MAIN2){
            if(resultCode==RESULT_OK){
                Log.e("==============", "Back from 2 with OK");}
            else if(resultCode==RESULT_CANCELED){Log.e("==============", "Back from 2 with CANCEL");}
        }
        else if(requestCode==REQUEST_TO_MAIN3){
            if(resultCode==RESULT_OK){Log.e("==============", "Back from 3 with YES");}
            else if(resultCode==RESULT_CANCELED){Log.e("==============", "Back from 3 with NO");}

            String keyValue = data.getStringExtra("KeyValue");
            Log.e("==============","StringExtra is: " + keyValue);

        }
    }
}