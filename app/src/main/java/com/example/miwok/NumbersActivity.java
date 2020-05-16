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


        // Create an array of words
        final ArrayList<Word_Class> words = new ArrayList<Word_Class>();
        words.add(new Word_Class("one","lutti",R.drawable.number_one,R.raw.number_one));
        words.add(new Word_Class("two","ottiko",R.drawable.number_two,R.raw.number_two));
        words.add(new Word_Class("three","tolookosu",R.drawable.number_three,R.raw.number_three));
        words.add(new Word_Class("four","oyyisa",R.drawable.number_four,R.raw.number_four));
        words.add(new Word_Class("five","massokka",R.drawable.number_five,R.raw.number_five));
        words.add(new Word_Class("six","temmokka",R.drawable.number_six,R.raw.number_six));
        words.add(new Word_Class("seven","kenekaku",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Word_Class("eight","kawinta",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word_Class("nine","wo'e",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Word_Class("ten","na'aacha",R.drawable.number_ten,R.raw.number_ten));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        // audio played when user touches any list item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the {@link Word} object at the given position the user clicked on
                Word_Class word_class = words.get(position);

                // Release the media player if it currently exists b/z we are about to play a different sound file
                releaseMediaPlayer();

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mediaPlayer = MediaPlayer.create(NumbersActivity.this, word_class.getAudioResourceId());

                // start the audio file
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        releaseMediaPlayer();
                    }
                });
            }
        });
    }
    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }
    }
}
