package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SuspectedCovid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suspected_covid);
    }
    public void searchHospitals(View view) {
        Intent intent = new Intent(this, SearchHospitals.class);
        startActivity(intent);
    }
}
