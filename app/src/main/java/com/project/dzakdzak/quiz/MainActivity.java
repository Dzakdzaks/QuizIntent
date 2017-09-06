
package com.project.dzakdzak.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //Deklarasi
    RadioButton radioButton1, radioButton2,radioButton3;
    Button buttonLanjut;
    int nilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi
        radioButton1 = (RadioButton)findViewById(R.id.rbDuaribu);
        radioButton2 = (RadioButton)findViewById(R.id.rbDuaribusatu);
        radioButton3 = (RadioButton)findViewById(R.id.rbSembilanbelasempatlima);
        buttonLanjut = (Button) findViewById(R.id.btnNext);

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai = 0;
            }
        });
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai = 0;
            }
        });
        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai = 10;
            }
        });

        //button next dengan membawa nilai
        buttonLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah1 = new Intent(getApplicationContext(),Main2Activity.class);
                pindah1.putExtra("nilai1", nilai);
                startActivity(pindah1);

                Toast.makeText(MainActivity.this, "nilai kamu = " + nilai, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
