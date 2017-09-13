package com.dreaminreality.ranad_000.worldtour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

//import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CardAdapter cardAdapter;

    RecyclerView.LayoutManager layoutManager;

    String[] title = {"Lake 1", "Lake 2", "Lake 3", "Lake 4", "Lake 4", "Lake 5", "Lake 6",};


//    ArrayList<Card> images_for_cards = new ArrayList<>();
//        images_for_cards.add(new Card("@drawable/nantalan_lake", "Lake1"));
//        images_for_cards.add(new Card("@drawable/nantalan_lake1", "Lake 2"));
//        images_for_cards.add(new Card("@drawable/nantalan_lake2", "Lake 3"));
//        images_for_cards.add(new Card("@drawable/nantalan_lake3", "Lake 4"));
//        images_for_cards.add(new Card("@drawable/nantalan_lake4", "Lake 5"));
//        images_for_cards.add(new Card("@drawable/nantalan_lake5", "Lake 6"));
//        images_for_cards.add(new Card("@drawable/nantalan_lake6", "Lake 7"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try {
            recyclerView.findViewById(R.id.recyclerview);
            layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);
            cardAdapter = new CardAdapter(this, title);
            recyclerView.setAdapter(cardAdapter);
        }catch(Exception e){
            System.out.println(e);
        }

        }
}



