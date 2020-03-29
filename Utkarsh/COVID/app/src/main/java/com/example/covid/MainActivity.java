package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void confirmedCovid(View view) {
        Intent intent = new Intent(this, ConfirmedCovid.class);
        startActivity(intent);
    }

    public void nonCovid(View view) {
        Intent intent = new Intent(this, NonCovid.class);
        startActivity(intent);
    }

    public void suspectedCovid(View view) {
        Intent intent = new Intent(this, SuspectedCovid.class);
        startActivity(intent);
    }

    public void searchHospitals(View view) {
        Intent intent = new Intent(this, SearchHospitals.class);
        startActivity(intent);
    }
}
