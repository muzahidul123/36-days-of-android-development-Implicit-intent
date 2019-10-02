package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText phonenoET;
    private Button callBtn;
    private String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phonenoET = findViewById(R.id.phonenoET);
        callBtn = findViewById(R.id.callBtn);

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               number = phonenoET.getText().toString().trim();
               Intent intent = new Intent();
               intent.setAction(Intent.ACTION_DIAL);
               intent.setData(Uri.parse("tel:"+number));
               startActivity(intent);
            }
        });
    }
}
