package com.example.squareareacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;




public class MainActivity extends AppCompatActivity {

    EditText mEditLength;
    TextView mTextResult;
    Button mButtonCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditLength = (EditText) findViewById(R.id.editTextTextPersonName);
        mTextResult = (TextView) findViewById(R.id.textView3);
        mButtonCount = (Button) findViewById(R.id.button);

        mButtonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });

    }
    public void calculate(){
        Double value1 = Double.parseDouble(mEditLength.getText().toString());
        Double calculateValue = value1*value1;
        mTextResult.setText(calculateValue.toString());
    }
}