package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ListView listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView1 = findViewById(R.id.listView1);
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Vishal");
        arr.add("Pandey");
        arr.add("Ankit");
        arr.add("Suraj");
        arr.add("Upashak");
        arr.add("Dhanush");
        arr.add("Mohit");
        arr.add("Chandu");
        arr.add("Adarsh");
        arr.add("Jaipur");
        arr.add("Lucknow");
        arr.add("Chandigarh");
        arr.add("Delhi");
        arr.add("Mumbai");
        arr.add("Notes");
        arr.add("Chap");
        arr.add("Vhunar");
        arr.add("Prayagraj");
        arr.add("Mirzapur");
        arr.add("Chunar");
        arr.add("Bhdohi");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,arr);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i==0){

                    Toast.makeText(MainActivity.this, "First item Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}