package com.example.botlabtest;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    private TextView statusTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        statusTextView = findViewById(R.id.textView);

        boolean isOpenCVLoaded = OpenCVLoader.initDebug();

        if (isOpenCVLoaded) {
            System.out.println("OpenCV loaded successfully");
            statusTextView.setText("OpenCV Configured Successfully!");
        } else {
            System.out.println("OpenCV not loaded");
            statusTextView.setText("Failed to Configure OpenCV!");
        }
    }
}
