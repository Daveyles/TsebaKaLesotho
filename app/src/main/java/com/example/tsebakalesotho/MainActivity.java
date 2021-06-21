package com.example.tsebakalesotho;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<Integer> images;
    ArrayList<String> titles;
    ArrayList<String> descriptions;
    ArrayList<String> fact1;
    ArrayList<String> fact2;
    ArrayList<String> fact3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images = new ArrayList<>();

        images.add(R.drawable.a);
        images.add(R.drawable.b);
        images.add(R.drawable.c);
        images.add(R.drawable.d);
        images.add(R.drawable.e);
        images.add(R.drawable.f);
        images.add(R.drawable.g);

        titles = new ArrayList<>();

        titles.add("AfriSki Resort");
        titles.add("Maletsunyane Falls");
        titles.add("Thabana Ntlenyana");
        titles.add("Kome Caves");
        titles.add("Katse Dam");
        titles.add("Liphofung");
        titles.add("Tsehlanyane National Park");

        descriptions = new ArrayList<>();

        descriptions.add("AfriSki is the only skiing resort in Lesotho operation in Southern Africa near the northern border of Lesotho and South Africa...");
        descriptions.add("Maletsunyane Falls is a waterfall in located near the town of Semonkong which is named after the fall...");
        descriptions.add("Thabana Ntlenyana is the highest point in Lesotho and the highest mountain is Southern Africa...");
        descriptions.add("Kome Caves are a group of cave dwellings made out of mud in the district of Berea, Lesotho...");
        descriptions.add("Katse Dam is a concrete arch dam on the Malibamatso River in Lesotho...");
        descriptions.add("Liphofung is a historical site that includes a cave which occupies an important place in Basotho history...");
        descriptions.add("Tsehlanyane National Park is a national park in Lesotho that is located in the Maloti Mountains in Leribe...");

        fact1 = new ArrayList<>();

        fact1.add("AfriSki is the only skiing resort in Lesotho.");
        fact1.add("Maletsunyane Falls is a waterfall in located near the town of Semonkong.");
        fact1.add("Thabana Ntlenyana is the highest point in Lesotho and the highest mountain is Southern Africa...");
        fact1.add("Kome Caves are a group of cave dwellings made out of mud in the district of Berea, Lesotho...");
        fact1.add("Katse Dam is a concrete arch dam.");
        fact1.add("Liphofung is occupies an important place in Basotho history...");
        fact1.add("Tsehlanyane National Park is a national park in Lesotho that is located in the Maloti Mountains in Leribe...");

        fact2 = new ArrayList<>();

        fact2.add("AfriSki is in operation in Southern Africa near the northern border of Lesotho and South Africa.");
        fact2.add(" Semonkong is named after the waterfall");
        fact2.add("Thabana Ntlenyana is the highest mountain is Southern Africa...");
        fact2.add("Kome Caves are a group of cave dwellings made out of mud in the district of Berea, Lesotho.");
        fact2.add("Katse Dam flows on the Malibamatso River in Lesotho.");
        fact2.add("Liphofung is a historical site.");
        fact2.add("Tsehlanyane National Park is a national park in Lesotho");

        fact3 = new ArrayList<>();

        fact3.add("Snow at AfriSki is available all year round.");
        fact3.add("It is 192m high");
        fact3.add("Thabana Ntlenyana is the highest point in Lesotho.");
        fact3.add("Kome Caves are a group of cave dwellings made out of mud in the district of Berea, Lesotho.");
        fact3.add("Katse Dam is a concrete arch dam on the Malibamatso River in Lesotho.");
        fact3.add("Liphofung is a historical site that includes a cave which occupies an important place in Basotho history...");
        fact3.add("Tsehlanyane National Park is a national park in Lesotho that is located in the Maloti Mountains in Leribe...");


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this,titles,descriptions,fact1,fact2,fact3,images);
        recyclerView.setAdapter(adapter);
    }
}