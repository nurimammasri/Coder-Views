package com.example.projectview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnTextView, btnEditText, btnImageView, btnImageButton, btnCheckbox, btnToggle, btnSwitch, btnRadio, btnProgress, btnSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTextView = findViewById(R.id.btn_textview);
        btnEditText = findViewById(R.id.btn_editText);
        btnImageView = findViewById(R.id.btn_image);
        btnImageButton = findViewById(R.id.btn_imgbtn);
        btnCheckbox = findViewById(R.id.btn_checkbox);
        btnToggle = findViewById(R.id.btn_toggle);
        btnSwitch = findViewById(R.id.btn_switch);
        btnRadio = findViewById(R.id.btn_radio);
        btnProgress = findViewById(R.id.btn_progressbar);
        btnSpinner = findViewById(R.id.btn_spinner);


        btnTextView.setOnClickListener(this);
        btnEditText.setOnClickListener(this);
        btnImageView.setOnClickListener(this);
        btnImageButton.setOnClickListener(this);
        btnCheckbox.setOnClickListener(this);
        btnToggle.setOnClickListener(this);
        btnSwitch.setOnClickListener(this);
        btnRadio.setOnClickListener(this);
        btnProgress.setOnClickListener(this);
        btnSpinner.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_textview : {
                Intent intent = new Intent(this, ActivityTextView.class);
                startActivity(intent);
                break;
            }

            case R.id.btn_editText : {
                Intent intent = new Intent(this, ActivityEditText.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_image : {
                Intent intent = new Intent(this, ActivityImageView.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_imgbtn : {
                Intent intent = new Intent(this, ActivityImageButton.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_checkbox : {
                Intent intent = new Intent(this, ActivityCheckBox.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_toggle : {
                Intent intent = new Intent(this, ActivityToggleButton.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_switch : {
                Intent intent = new Intent(this, ActivitySwitch.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_radio : {
                Intent intent = new Intent(this, ActivityRadioButton.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_progressbar : {
                Intent intent = new Intent(this, ActivityProgressBar.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_spinner : {
                Intent intent = new Intent(this, ActivitySpinner.class);
                startActivity(intent);
                break;
            }
        }
    }
}
