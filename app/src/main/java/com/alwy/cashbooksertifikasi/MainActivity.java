package com.alwy.cashbooksertifikasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alwy.cashbooksertifikasi.DB.DBHelper;

import java.text.NumberFormat;
import java.util.Locale;

//chart


public class MainActivity extends AppCompatActivity {
    DBHelper db;
    TextView txt_pemasukan,txt_pengeluaran;
    ConstraintLayout pemasukan,pengeluaran,detail,pengaturan;


    private String Rupiah(Double number){
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        return formatRupiah.format(number);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DBHelper(this);
        String jumlahPemasukan = "" + Rupiah(Double.parseDouble(String.valueOf(db.totalPemasukan())));
        String jumlahPengeluaran = "" + Rupiah(Double.parseDouble(String.valueOf(db.totalPengeluaran())));

        txt_pemasukan=(TextView)findViewById(R.id.txt_pemasukan);
        txt_pengeluaran= (TextView)findViewById(R.id.txt_pengeluaran);
        txt_pemasukan.setText("" + jumlahPemasukan);
        txt_pengeluaran.setText("" + jumlahPengeluaran);

        pemasukan = (ConstraintLayout) findViewById(R.id.tambah_pemasukan);
        pengeluaran = (ConstraintLayout) findViewById(R.id.tambah_pengeluaran);
        detail = (ConstraintLayout) findViewById(R.id.detail);
        pengaturan = (ConstraintLayout) findViewById(R.id.pengaturan);


        pemasukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pemasukanIntent = new Intent(MainActivity.this, PemasukanActivity.class);
                startActivity(pemasukanIntent);
                finish();
            }
        });

        pengeluaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pemasukanIntent = new Intent(MainActivity.this, PengeluaranActivity.class);
                startActivity(pemasukanIntent);
                finish();
            }
        });

        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pemasukanIntent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(pemasukanIntent);
                finish();
            }
        });

        pengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pemasukanIntent = new Intent(MainActivity.this, PengaturanActivity.class);
                startActivity(pemasukanIntent);
                finish();
            }
        });

    }
}