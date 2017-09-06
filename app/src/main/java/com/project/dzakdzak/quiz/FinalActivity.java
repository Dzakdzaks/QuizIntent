package com.project.dzakdzak.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    TextView tvNilaiAkhir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        int tangkapNilaiAkhir = getIntent().getIntExtra("nilai3",0);

        tvNilaiAkhir = (TextView)findViewById(R.id.tvHasilAkhir);

        tvNilaiAkhir.setText("Nilai Kamu : " + tangkapNilaiAkhir);
    }
}
