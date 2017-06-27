package com.example.administrator.firstproject;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startBtn;
    private Button endBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBtnListening();

    }

    private void setBtnListening(){
        startBtn = (Button) findViewById(R.id.start_btn);
        endBtn = (Button) findViewById(R.id.end_btn);
        startBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,StudyingActivity.class);
                startActivity(i);
            }
        });
        endBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,TtsDemo.class);

                if (null != i){
                    Log.d("one","starting001");
                    startActivity(i);
                }else{
                    Log.d("one","starting002");
                }
            }
        });
    }
}
