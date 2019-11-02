package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailKopiActivity extends AppCompatActivity {
    ImageView imgView;
    TextView tvNama;
    TextView tvRating;
    TextView jadwal;
    TextView desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kopi);
        setData();
    }

    public void setData() {
        imgView = findViewById(R.id.img_movie);
        tvNama = findViewById(R.id.txt_name);
        tvRating = findViewById(R.id.txt_rating);
        desc = findViewById(R.id.txt_deskripsil);
        tvNama.setText(getIntent().getStringExtra("nama"));
        tvRating.setText(getIntent().getStringExtra("rating"));
        desc.setText(getIntent().getStringExtra("deskripsi"));
    }
}
