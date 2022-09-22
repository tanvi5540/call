package com.example.call;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText number;
    Button call,dial;
    private static final String TAG = "mainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.number);
        call = findViewById(R.id.call);
        dial = findViewById(R.id.dial);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = number.getText().toString();
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+n));
                startActivity(intent);

            }
        });
        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = number.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + n));
                startActivity(intent);
            }
        });
    }
}