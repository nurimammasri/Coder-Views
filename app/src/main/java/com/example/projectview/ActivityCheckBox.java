package com.example.projectview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ActivityCheckBox extends AppCompatActivity {
    CheckBox cbxMobile, cbxWebsite, cbxGame, cbxIoT;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        cbxMobile = findViewById(R.id.ckbx_mobile);
        cbxWebsite = findViewById(R.id.ckbx_website);
        cbxGame = findViewById(R.id.ckbx_game);
        cbxIoT = findViewById(R.id.ckbx_iot);
        btnSubmit = findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                result.append("Selected Items:");

                if (cbxMobile.isChecked()) {
                    result.append("\n" + cbxMobile.getText().toString());
                }

                if (cbxWebsite.isChecked()) {
                    result.append("\n" + cbxWebsite.getText().toString());
                }
                if (cbxGame.isChecked()) {
                    result.append("\n" + cbxGame.getText().toString());
                }
                if (cbxIoT.isChecked()) {
                    result.append("\n" + cbxIoT.getText().toString());
                }
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
