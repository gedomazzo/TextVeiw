package com.example.textveiw;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tv;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @SuppressLint("SetTextI18n")
    public void OnPush(View view) {
        btn = findViewById(R.id.btn);
        tv = findViewById(R.id.tv);

        if (counter < 6) {
            counter++;
            tv.setText("This is a click number: " + counter);
        } else {
            tv.setText("Enough to click. Go to new start!");
            counter = 0;
        }


    }
}