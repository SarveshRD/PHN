package com.example.phn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class ThirdActivity extends AppCompatActivity {

    SearchView sv;
    ListView list;

    String []str={"Apple","Mango","Cheery","Grapers","Pineapple","Bannan","Chickoo"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        sv=findViewById(R.id.sv);
        list=findViewById(R.id.list);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,str);
        list.setAdapter(adapter);


        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                adapter.getFilter().filter(query);

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {


                adapter.getFilter().filter(newText);

                return false;
            }
        });


    }
}