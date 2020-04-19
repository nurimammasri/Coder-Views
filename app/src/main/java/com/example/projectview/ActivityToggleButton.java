package com.example.projectview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ActivityToggleButton extends AppCompatActivity {
    ToggleButton tglButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toogle_button);

        tglButton = findViewById(R.id.toggle_button);

        tglButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tglButton.isChecked()){
                    Toast.makeText(getApplicationContext(), "ToggleButton : "+ tglButton.getText().toString(), Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "ToogleButton : "+ tglButton.getText().toString(), Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
