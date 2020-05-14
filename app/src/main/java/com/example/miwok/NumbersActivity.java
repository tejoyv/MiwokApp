package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        mediaPlayer = MediaPlayer.create(this, R.raw.number_one);

        // Create an array of words
        ArrayList<Word_Class> words = new ArrayList<Word_Class>();
        words.add(new Word_Class("one","lutti",R.drawable.number_one));
        words.add(new Word_Class("two","ottiko",R.drawable.number_two));
        words.add(new Word_Class("three","tolookosu",R.drawable.number_three));
        words.add(new Word_Class("four","oyyisa",R.drawable.number_four));
        words.add(new Word_Class("five","massokka",R.drawable.number_five));
        words.add(new Word_Class("six","temmokka",R.drawable.number_six));
        words.add(new Word_Class("seven","kenekaku",R.drawable.number_seven));
        words.add(new Word_Class("eight","kawinta",R.drawable.number_eight));
        words.add(new Word_Class("nine","wo'e",R.drawable.number_nine));
        words.add(new Word_Class("ten","na'aacha",R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        // audio played when user touches any list item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer.start();
            }
        });
    }
}
