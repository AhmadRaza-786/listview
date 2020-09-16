package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ListView listPlaces;
    private String[] items = {
            "BAHAWALPUR", "CHITRAL",
            "DEOSAI NATIONAL PARK", "FAIRY MEADOWS",
            "GILGIT", "HUNZA",
            "ISLAMABAD", "KARACHI",
            "KHAPLU", "KHUNJERAB PASS",
            "LAHORE", "LARKANA",
            "MULTAN", "PESHAWAR",
            "SKARDU"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listPlaces = findViewById(R.id.listPlaces);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                items
        );

        listPlaces.setAdapter(adapter);

        listPlaces.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valuePosition = listPlaces.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), valuePosition, Toast.LENGTH_SHORT).show();
            }
        });

    }
}