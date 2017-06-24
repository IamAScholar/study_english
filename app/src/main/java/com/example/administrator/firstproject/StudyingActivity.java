package com.example.administrator.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StudyingActivity extends AppCompatActivity {

    private TextView textView;
    private Button repeatBtn,nextBtn;
    private String repeatString="Hello";
    private String nextString="next";
    private final boolean IS_NEXT=true;
    private final boolean IS_REPEAT=false;
    private String[] words ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studying);
        this.setView();
        this.words=this.getString(R.string.test_word_list).split(" ");
        this.speak(IS_REPEAT);
    }

    private void setView(){
        this.textView = (TextView) findViewById(R.id.textView);
        this.repeatBtn = (Button) findViewById(R.id.repeat_btn);
        this.nextBtn = (Button) findViewById(R.id.next_btn);
        this.repeatBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                speak(IS_REPEAT);
            }
        });

        this.nextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                speak(IS_NEXT);
            }
        });

    }
    private void speak(boolean nextFlag){
        if( nextFlag)
            this.textView.setText(this.nextString);
        else
            this.textView.setText(this.repeatString);
    }
}
