package com.prueba.cursomvpint.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.prueba.cursomvpint.R;
import com.prueba.cursomvpint.interfaces.IMainActivityPresenter;
import com.prueba.cursomvpint.interfaces.IMainActivityView;
import com.prueba.cursomvpint.presenters.MainActivityPresenterImpl;

public class MainActivityView extends AppCompatActivity implements IMainActivityView {

    TextInputEditText textInputEditText;
    TextView textView;
    IMainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputEditText = findViewById(R.id.etData);
        textView = findViewById(R.id.tvData);

        presenter = new MainActivityPresenterImpl(this);

    }

    public void sendData(View view){

        presenter.addName(textInputEditText.getText().toString());

    }

    @Override
    public void showResult(String s) {

        textView.setText(s);

    }
}
