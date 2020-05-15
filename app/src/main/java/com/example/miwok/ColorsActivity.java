package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word_Class> words = new ArrayList<Word_Class>();
        words.add(new Word_Class("red","weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        words.add(new Word_Class("green","chokokki",R.drawable.color_green,R.raw.color_green));
        words.add(new Word_Class("brown","ṭakaakki",R.drawable.color_brown,R.raw.color_brown));
        words.add(new Word_Class("gray","ṭopoppi",R.drawable.color_gray,R.raw.color_gray));
        words.add(new Word_Class("black","kululli",R.drawable.color_black,R.raw.color_black));
        words.add(new Word_Class("white","kelelli",R.drawable.color_white,R.raw.color_white));
        words.add(new Word_Class("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new Word_Class("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_colors);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the {@link Word} object at the given position the user clicked on
                Word_Class word_class = words.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mediaPlayer = MediaPlayer.create(ColorsActivity.this, word_class.getAudioResourceId());

                // start the audio file
                mediaPlayer.start();
            }
        });

    }
}
