package com.example.projectview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityRadioButton extends AppCompatActivity {
    RadioButton radio01, radio02, radio03, radio04;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radio01 = findViewById(R.id.radio01);
        radio02 = findViewById(R.id.radio02);
        radio03 = findViewById(R.id.radio03);
        radio04 = findViewById(R.id.radio04);

        radioGroup = findViewById(R.id.radio_group);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radio01 : {
                        Toast.makeText(getApplicationContext(), "Kamu memilih : " + radio01.getText().toString(), Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.radio02 : {
                        Toast.makeText(getApplicationContext(), "Kamu memilih : " + radio02.getText().toString(), Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.radio03 : {
                        Toast.makeText(getApplicationContext(), "Kamu memilih : " + radio03.getText().toString(), Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.radio04 : {
                        Toast.makeText(getApplicationContext(), "Kamu memilih : " + radio04.getText().toString(), Toast.LENGTH_SHORT).show();
                        break;
                    }
                    default: break;
                }
            }
        });
    }
}
