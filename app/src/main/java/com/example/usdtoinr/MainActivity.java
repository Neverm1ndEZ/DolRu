package com.example.usdtoinr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    private TextView textView;

    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button2);
        textView = findViewById(R.id.textView4);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Thanks for using the app", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int usd = Integer.parseInt(s);
                long inr = 79 * usd;
                textView.setText("The corresponding value in INR is: "+ inr);
            }
        });
    }
}