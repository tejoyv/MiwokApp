package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word_Class> words = new ArrayList<Word_Class>();
        words.add(new Word_Class("red","weṭeṭṭi",R.drawable.color_red));
        words.add(new Word_Class("green","chokokki",R.drawable.color_green));
        words.add(new Word_Class("brown","ṭakaakki",R.drawable.color_brown));
        words.add(new Word_Class("gray","ṭopoppi",R.drawable.color_gray));
        words.add(new Word_Class("black","kululli",R.drawable.color_black));
        words.add(new Word_Class("white","kelelli",R.drawable.color_white));
        words.add(new Word_Class("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        words.add(new Word_Class("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
