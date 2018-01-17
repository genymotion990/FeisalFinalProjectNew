package com.example.hp1.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView list1;
    ArrayAdapter<String> adapter;
    ArrayList<Item> arr=new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list1=(ListView)findViewById(R.id.list1);
        arr.add(new Item("downhill",R.drawable.allm));
        arr.add(new Item("street bike",R.drawable.streetb));
        arr.add(new Item("All mountain",R.drawable.dhb));
        arr.add(new Item("cross country",R.drawable.crossb));


        CustomAdapter adp=new CustomAdapter(this,R.layout.custom_row,arr);
        list1.setAdapter(adp);
        list1.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent[] i={new Intent(this,downhill.class),new Intent(this,streertbike.class),new Intent(this,allmountain.class),new Intent(this,crosscountry.class)};
        //Toast.makeText(this,arr.get(position),Toast.LENGTH_SHORT).show();
        startActivity(i[position]);
        //startActivity(info[position]);

    }
}