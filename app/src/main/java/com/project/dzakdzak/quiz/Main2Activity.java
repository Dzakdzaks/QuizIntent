package com.project.dzakdzak.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
        CheckBox checkBoxIkan, checkBoxAyam, checkBoxTitan;
    Button buttonLanjut2;
    int nilai, tangkap_nilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //menangkap nilai dari activity pertama ke activity ini
        tangkap_nilai = getIntent().getIntExtra("nilai1",0);
        nilai = tangkap_nilai;

        checkBoxIkan = (CheckBox)findViewById(R.id.cbIkan);
        checkBoxAyam = (CheckBox)findViewById(R.id.cbAyam);
        checkBoxTitan = (CheckBox)findViewById(R.id.cbTitan);
        buttonLanjut2 = (Button)findViewById(R.id.btnNext2);
    }
    private int hitung(boolean cbIkan,boolean cbAyam){
        //conditional
        if (cbIkan){
            nilai = nilai + 5;
        }
        if (cbAyam){
            nilai = nilai + 5;
        }
        return nilai;
    }

    public void Check(View view){
        //nilai boolean true or false
      boolean ikan =  checkBoxIkan.isChecked();
      boolean ayam =  checkBoxAyam.isChecked();

        //manggil func hitung
        int tambahNilai2 = hitung(ikan, ayam);

        //Intent
        Intent pindah2 = new Intent(getApplicationContext(),Main3Activity.class);
        pindah2.putExtra("nilai2", nilai);
        startActivity(pindah2);

        Toast.makeText(this, "Nilai = " + nilai , Toast.LENGTH_SHORT).show();
    }
}
