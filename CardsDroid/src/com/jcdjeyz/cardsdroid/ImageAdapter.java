package com.jcdjeyz.cardsdroid;

import java.util.Collection;
import java.util.Vector;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.jcdjeyz.cardsdroid.Data;
import com.jcdjeyz.cardsdroid.core.Card;
import com.jcdjeyz.cardsdroid.core.CardsCollection;




   
    
    // Aide au chargement des images 
    public class ImageAdapter extends BaseAdapter {
        int mGalleryItemBackground;
        private Context mContext;
        private Vector<Card> cards;


        public ImageAdapter(Context c) {
            mContext = c;
            TypedArray a = c.obtainStyledAttributes(R.styleable.HelloGallery);
            mGalleryItemBackground = a.getResourceId(
                    R.styleable.HelloGallery_android_galleryItemBackground, 0);
            a.recycle();
            
       
            
        }

        public int getCount() {
            return com.jcdjeyz.cardsdroid.Data.CardsData.values().length;// mImageIds.length;
        }

        public Object getItem(int position) {

            return cards.elementAt(position);
        }

        public long getItemId(int position) {
            return position;
        }

        public void loadCards(Vector<Card> c) {
            cards = c;
        }
        
        public View getView(int position, View convertView, ViewGroup parent) {
        	
        	
            ImageView i = new ImageView(mContext);

            i.setImageResource(com.jcdjeyz.cardsdroid.Data.CardsData.values()[position].pathId);//mImageIds[position]);
            i.setLayoutParams(new LayoutParams(150, 100));
            i.setScaleType(ImageView.ScaleType.FIT_XY);
       //     i.setBackgroundResource(mGalleryItemBackground);

            return i;
        }
    
}
