package com.example.qjm3662.android_rm4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity2 extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        Intent intent = getIntent();
        String data = intent.getStringExtra("DATA");

        Intent i = new Intent();
        i.putExtra("q", "q");
        this.setResult(1, i);
        tv = (TextView) findViewById(R.id.tv);
        tv.setText(data);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
