package com.example.projectview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

public class ActivitySwitch extends AppCompatActivity {
    Switch switchDemo;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        switchDemo = findViewById(R.id.switchDemo);
        linearLayout = findViewById(R.id.container);

        switchDemo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(switchDemo.isChecked()){
                    linearLayout.setBackgroundColor(Color.GREEN);
                    Toast.makeText(ActivitySwitch.this, "SwitchState : " + switchDemo.getTextOff().toString(), Toast.LENGTH_SHORT).show();
                }else{
                    linearLayout.setBackgroundColor(Color.RED);
                    Toast.makeText(ActivitySwitch.this, "SwitchState : " + switchDemo.getTextOn().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
