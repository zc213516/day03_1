package com.example.day03_1.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.day03_1.R;

public class MainActivity extends AppCompatActivity implements IMainView{

    private EditText editTextTextPersonName;
    private EditText editTextTextPassword;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        editTextTextPassword = (EditText) findViewById(R.id.editTextTextPassword);
        button = (Button) findViewById(R.id.button);

    }

    @Override
    public String getUserName() {
        return editTextTextPersonName.getText().toString();
    }

    @Override
    public String getPassword() {
        return editTextTextPassword.getText().toString();
    }

    @Override
    public void getLoginData(String string) {

    }
}