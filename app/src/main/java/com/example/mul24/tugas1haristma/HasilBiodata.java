package com.example.mul24.tugas1haristma;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HasilBiodata extends AppCompatActivity {

    public TextView tekshasil;
    public TextView tekshasil2;
    public String result;
    public String result2;

@Override
protected void onCreate (Bundle savedInstanceState) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_hasil_biodata);

    tekshasil = (TextView) findViewById(R.id.hasil);
    tekshasil2 = (TextView) findViewById(R.id.hasil2);
    Intent intentget = getIntent();
    Bundle bundle = intentget.getExtras();
    String txtnama = bundle.getString("txtnama");
    String txtnim = bundle.getString("txtnim");
    String txtemail = bundle.getString("txtemail");
    String txtangkatan = bundle.getString("txtangkatan");
    String nama = bundle.getString("nama");
    String nim = bundle.getString("nim");
    String email = bundle.getString("email");
    String angkatan = bundle.getString("angkatan");
    result = txtnama + "\n" + txtnim + "\n" + txtemail + "\n" + txtangkatan;
    result2 = ": " + nama + "\n": " + nim + " \n " +" : " + email + " \n " +": " + angkatan;


    tekshasil.setText(result);
    tekshasil2.setText(result2);
}
    )