package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText edit;
private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button_push(View V)
    {
        Button button = (Button) V;
        edit = (EditText) findViewById(R.id.editText);
        text = (TextView) findViewById(R.id.textView);
        text.setText(edit.getText());
        edit.getText().clear();
    }
}
