package com.project.dzakdzak.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    EditText editTextJawab;
    String stringJawaban;
    Button buttonLanjut3;
    int nilai, tangkap_nilai2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tangkap_nilai2 = getIntent().getIntExtra("nilai2", 0);
        nilai = tangkap_nilai2;

        editTextJawab = (EditText)findViewById(R.id.edtJawab);
        buttonLanjut3 = (Button)findViewById(R.id.btnNext3);
    }

    public void check2(View v){
        //jadikan string
        stringJawaban = editTextJawab.getText().toString();

        if (stringJawaban.equalsIgnoreCase("Dzaky")){
            nilai = nilai + 80;
            Toast.makeText(Main3Activity.this, "nilai kamu = " + nilai, Toast.LENGTH_SHORT).show();

        } else {

        }
        Intent pindah3 = new Intent(getApplicationContext(), FinalActivity.class);
        pindah3.putExtra("nilai3", nilai);
        startActivity(pindah3);
    }
}
