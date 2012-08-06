package com.jcdjeyz.cardsdroid;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CardsDroidActivity extends Activity {

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        
    	// liaison entre le programme java et l'interface ("res/Layout") utilisée
        setContentView(R.layout.activity_cards_droid);
        
        
        Gallery g = (Gallery) findViewById(R.id.gallery1);
        g.setAdapter(new ImageAdapter(this));


    }



    
    public void performBtnHandler(View vue) {
        // action déclenchée par le click sur btn
    	switch (vue.getId()) {
        	case R.id.imageButton1:
        		TextView text = (TextView)findViewById(R.id.textView1);
        		Gallery g = (Gallery)findViewById(R.id.gallery1);
        		String tag = g.getSelectedView().toString();
        		text.append("\t\n" + "image : " + tag );
        		break;
    	}
    	
    }
 
    public class ImageAdapter extends BaseAdapter {
        int mGalleryItemBackground;
        private Context mContext;
        
        private Integer[] mImageIds = {
        	    R.drawable.c1,
        	    R.drawable.c2,
        	    R.drawable.c3,
        	    R.drawable.c4,
        	    R.drawable.c5,
        	    R.drawable.c6,
        	    R.drawable.c7,
        	    R.drawable.c8,
        	    R.drawable.c9,
        	    R.drawable.c10,
        	    R.drawable.cj,
        	    R.drawable.cq,
        	    R.drawable.ck
                
          };

        public ImageAdapter(Context c) {
            mContext = c;
            TypedArray a = obtainStyledAttributes(R.styleable.HelloGallery);
            mGalleryItemBackground = a.getResourceId(
                    R.styleable.HelloGallery_android_galleryItemBackground, 0);
            a.recycle();
            
       
            
        }

        public int getCount() {
            return mImageIds.length;
        }

        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView i = new ImageView(mContext);

            i.setImageResource(mImageIds[position]);
            i.setLayoutParams(new Gallery.LayoutParams(150, 100));
            i.setScaleType(ImageView.ScaleType.FIT_XY);
            i.setBackgroundResource(mGalleryItemBackground);

            return i;
        }
    }
}


