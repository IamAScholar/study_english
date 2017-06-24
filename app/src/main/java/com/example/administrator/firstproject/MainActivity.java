package com.example.administrator.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.iflytek.cloud.SpeechUtility;
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

            }
        });
    }
}
