package com.prueba.cursomvpint.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.prueba.cursomvpint.R;

public class MainActivityView extends AppCompatActivity {

    TextInputEditText textInputEditText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputEditText = findViewById(R.id.etData);
        textView = findViewById(R.id.tvData);



    }
}
