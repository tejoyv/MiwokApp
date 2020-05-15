package com.example.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word_Class> {

    //Resource ID for the background color of the list of words
    private int mColorResourceID;

    //constructor
    public WordAdapter(Activity context, ArrayList<Word_Class>words,int colorResourceID) {
        super(context,0,words);
        mColorResourceID=colorResourceID;
    }

    //overriding the getView method
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word_Class currentWordClass = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWordClass.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWordClass.getDefaultTranslation());

        ImageView defaultImageView = (ImageView)listItemView.findViewById(R.id.image);

        if(currentWordClass.hasImage()) {
            defaultImageView.setImageResource(currentWordClass.getImageResourceId());
            defaultImageView.setVisibility(View.VISIBLE);
        }
        else{
            defaultImageView.setVisibility(View.GONE);
        }

        // set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(),mColorResourceID);
        // set the background color of the text container view
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
