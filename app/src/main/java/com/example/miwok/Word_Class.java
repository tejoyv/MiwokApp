package com.example.miwok;

public class Word_Class {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    //constructor
    public Word_Class(String defaultTranslation,String miwokTranslation,int audioResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceId=audioResourceId;
    }

    public Word_Class(String defaultTranslation,String miwokTranslation,int imageResourceId,int audioResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId=audioResourceId;
    }

    //getter methods
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public int getImageResourceId(){return mImageResourceId;}

    public int getAudioResourceId(){
        return mAudioResourceId;
    }


    //returns whether or not there is an image for this word.
    public boolean hasImage(){
        return mImageResourceId !=NO_IMAGE_PROVIDED;
    }
}
