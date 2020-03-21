package com.essam.modern_ui2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private EditText pass;
    private EditText phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        pass = findViewById(R.id.password);
        phone = findViewById(R.id.phone);


        phone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                pass.setHintTextColor(Color.WHITE);
                phone.setHintTextColor(Color.WHITE);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (phone.getText().toString().isEmpty()){
                    pass.setHintTextColor(Color.RED);
                    phone.setHintTextColor(Color.RED);

                    YoYo.with(Techniques.RubberBand)
                            .duration(700)
                            .repeat(1)
                            .playOn(pass);

                    YoYo.with(Techniques.RubberBand)
                            .duration(700)
                            .repeat(1)
                            .playOn(phone);

                }
                else {
                    Intent intent = new Intent(MainActivity.this, Dash_Board.class);
                    startActivity(intent);
                }


            }
        });

    }
}
