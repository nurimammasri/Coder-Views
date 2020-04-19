package com.example.projectview;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityEditText extends AppCompatActivity {
    EditText editText;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        editText = findViewById(R.id.edt_text);
        txtView = findViewById(R.id.txt_view);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Toast.makeText(getApplicationContext(), "Before Text Change", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String txt = editText.getText().toString();
                txtView.setText(txt);
            }

            @Override
            public void afterTextChanged(Editable s) {
                txtView.setTextColor(getResources().getColor(R.color.colorPrimary));

            }
        });



    }
}
