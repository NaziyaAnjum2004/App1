package com.naziya.app1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int clickCount = 0;
    private TextView outputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickButton = findViewById(R.id.clickButton);
        outputTextView = findViewById(R.id.outputTextView);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                if (clickCount % 2 == 0) {
                    // If clickCount is even
                    outputTextView.setText("Hello world!");
                } else {
                    // If clickCount is odd
                    outputTextView.setText("Goodbye world!");
                }
            }
        });
    }
}
