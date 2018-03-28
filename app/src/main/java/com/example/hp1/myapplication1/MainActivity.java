package com.example.hp1.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener ,View.OnClickListener {
    ListView list1;
    ArrayAdapter<String> adapter;
    ArrayList<Item> arr=new ArrayList<Item>();

    Button btt3,btt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btt3=(Button)findViewById(R.id.btt3);
        btt2=(Button)findViewById(R.id.btt2);
        list1=(ListView)findViewById(R.id.list1);
        arr.add(new Item("Downhill",R.drawable.dhb));
        arr.add(new Item("street bike",R.drawable.streetb));
        arr.add(new Item("All mountain",R.drawable.allm));
        arr.add(new Item("cross country",R.drawable.crossb));



        btt3.setOnClickListener(this);
        btt2.setOnClickListener(this);
        CustomAdapter adp=new CustomAdapter(this,R.layout.custom_row,arr);
        list1.setAdapter(adp);
        list1.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent[] i={new Intent(this,Downhill.class),new Intent(this,Streertbike.class),new Intent(this,Allmountain.class),new Intent(this,Crosscountry.class)};
        //Toast.makeText(this,arr.get(position),Toast.LENGTH_SHORT).show();
        startActivity(i[position]);
        //startActivity(info[position]);

    }

    @Override
    public void onClick(View view) {

         if(view==btt3)
            startActivity(new Intent(this,MapsActivity.class));
        else if(view==btt2)
             startActivity(new Intent(this,Camera.class));
    }
}