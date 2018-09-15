package com.example.dell.radiobuttontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private RadioGroup radioGroup;
    private TextView textView;
    private Button button;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        radioGroup = findViewById(R.id.radioGroupId);
        textView = findViewById(R.id.resultId);
        button = findViewById(R.id.selectButton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SelectYourFavouriteOne();


            }
        });
}





            private void SelectYourFavouriteOne() {
                int id = radioGroup.getCheckedRadioButtonId();

                if (id == -1) {

                    textView.setText("pLZ select your OS");


                } else {

                    RadioButton radioButton = findViewById(id);

                    String value = radioButton.getText().toString();

                    textView.setText(value);


                }
            }
            }

