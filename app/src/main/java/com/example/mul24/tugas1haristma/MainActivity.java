package com.example.mul24.tugas1haristma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public EditText Nama, Email, NIM, Angkatan;
    public TextView txnama, txnim, txemail, txangkatan, txtitik;
    public Button Tampil, Reset;
    public ImageView imgaku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.MainActivity);

        txnama = (TextView) findViewById(R.id.txNama);
        txnim = (TextView) findViewById(R.id.txNim);
        txemail = (TextView) findViewById(R.id.txEmail);
        txangkatan = (TextView) findViewById(R.id.txAngkatan);

        Nama = (EditText) findViewById(R.id.edNama);
        NIM = (EditText) findViewById(R.id.edNim);
        Email = (EditText) findViewById(R.id.edEmail);
        Angkatan = (EditText) findViewById(R.id.edAngkatan);

        Tampil = (Button) findViewById(R.id.btnTampil);
        Reset = (Button) findViewById(R.id.btnReset);
        imgaku = (Button) findViewById(R.id.imgHarist);

        Intent intentform;
        Tampil.setOnClickListener((onCreatePanelView(){
                Intent intentform = new Intent(getApplicationContext(), HasilBiodata.class);
        intentform.putExtra("txnama", txnama.getText().toString());
        intentform.putExtra("txnim", txnim.getText().toString());
        intentform.putExtra("txemail", txemail.getText().toString());
        intentform.putExtra("txangkatan", txangkatan.getText().toString());
        intentform.putExtra("nama", Nama.getText().toString());
        intentform.putExtra("nim", NIM.getText().toString());
        intentform.putExtra("email", Email.getText().toString());
        intentform.putExtra("angkatan", Angkatan.getText().toString());
        startActivity(intentform);
        });

    Reset.setOnClickListener(setContentView());
        Nama.setText("");
        Email.setText("");
        NIM.setText("");
        Angkatan.setText("");
    });

    }

}
