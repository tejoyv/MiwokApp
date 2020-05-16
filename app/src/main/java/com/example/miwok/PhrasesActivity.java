package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word_Class> words = new ArrayList<Word_Class>();
        words.add(new Word_Class("Where are you going?","minto wuksus",R.raw.phrase_where_are_you_going));
        words.add(new Word_Class("What is your name?","tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        words.add(new Word_Class("My name is...","oyaaset...",R.raw.phrase_my_name_is));
        words.add(new Word_Class("How are you feeling?","michәksәs?",R.raw.phrase_how_are_you_feeling));
        words.add(new Word_Class("I’m feeling good.","kuchi achit",R.raw.phrase_im_feeling_good));
        words.add(new Word_Class("Are you coming?","әәnәs'aa?",R.raw.phrase_are_you_coming));
        words.add(new Word_Class("Yes, I’m coming.","hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        words.add(new Word_Class("I’m coming.","әәnәm",R.raw.phrase_im_coming));
        words.add(new Word_Class("Let’s go.","yoowutis",R.raw.phrase_lets_go));
        words.add(new Word_Class("Come here.","әnni'nem",R.raw.phrase_come_here));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word_Class word_class=words.get(position);

                // Release the media player if it currently exists b/z we are about to play a different sound file
                releaseMediaPlayer();

                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, word_class.getAudioResourceId());
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
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
