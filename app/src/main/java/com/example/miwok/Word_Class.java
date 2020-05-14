package com.example.miwok;

public class Word_Class {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    //constructor
    public Word_Class(String defaultTranslation,String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }

    public Word_Class(String defaultTranslation,String miwokTranslation,int imageResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=imageResourceId;
    }

    //getter methods
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public int getImageResourceId(){return mImageResourceId;}


    //returns whether or not there is an image for this word.
    public boolean hasImage(){
        return mImageResourceId !=NO_IMAGE_PROVIDED;
    }
}
