package com.example.jaxadev6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout=findViewById(R.id.container_root);
        for (int i = 0; i < 50; i++) {
            TextView textView=new TextView(getApplicationContext());
            textView.setText("number: "+i);
            linearLayout.addView(textView);
            textView.setTextSize(25F);
        }
    }
}