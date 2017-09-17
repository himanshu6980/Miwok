package com.example.android.miwok;



public class Word {
    //defautlt translation of word
private  String mdefaultransition;
    //miwok translation of word
    private  String mMiwoktransition;

    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private  static final  int NO_IMAGE_PROVIDED=-1;

    private int maudioResourceId;

    public  Word(String defaultransition,String Miwoktransition,int audioresourceId){
        mdefaultransition=defaultransition;
        mMiwoktransition=Miwoktransition;
        maudioResourceId=audioresourceId;
    }

    public  Word(String defaultransition,String Miwoktransition,int imageresourceid,int audiorespusceID){
        mdefaultransition=defaultransition;
        mMiwoktransition=Miwoktransition;
        mImageResourceId = imageresourceid;
        maudioResourceId=audiorespusceID;

    }
    //get default translation of word
    public String getDefaultTransition(){
        return mdefaultransition;
    }
    //get miwok translation of word
    public String getMiwokTransition(){
        return mMiwoktransition;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
    public  boolean hasimage()
    {
return  mImageResourceId!=NO_IMAGE_PROVIDED;
    }
public  int getaudioResourceId(){
    return maudioResourceId;
}
}
