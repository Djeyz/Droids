package com.jcdjeyz.cardsdroid;

import java.util.Collection;
import java.util.Vector;

import com.jcdjeyz.cardsdroid.Data.CardsData;
import com.jcdjeyz.cardsdroid.core.Card;
import com.jcdjeyz.cardsdroid.core.CardsCollection;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Gallery;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class CardsDroidActivity extends Activity {


    
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        
    	// liaison entre le programme java et l'interface ("res/Layout") utilisée
        setContentView(R.layout.activity_cards_droid);
        
        // chargement des cartes :
        int taille = CardsData.values().length;
		//Card[] cards = new Card[taille];
		Vector<Card> cardsColl = new Vector<Card>();
		for(int i = 0; i < taille; i++)
		{
			Integer imgPath = CardsData.values()[i].pathId;
			String imgId = CardsData.values()[i].id;
			String imgName = CardsData.values()[i].name;
			//cards[i] = new Card(imgPath, imgId, imgName);
			
			cardsColl.add(new Card(imgPath, imgId, imgName));
		}
		
		ImageAdapter ImageLoader = new ImageAdapter(this);
        ImageLoader.loadCards(cardsColl); 
        
//       version depreciee
//        Gallery g = (Gallery) findViewById(R.id.gallery1);
//        g.setAdapter(ImageLoader);

        // Gallerie non dépréciée
        HorizontalScrollView g2 = (HorizontalScrollView) findViewById(R.id.horizontalScrollView1);
         LinearLayout layout = (LinearLayout) findViewById(R.id.horizontalScrollViewLayout1);
        
        // chargement des images dans g2
        for(int i = 0; i < ImageLoader.getCount(); i++)
        {
        	ImageView child = (ImageView) ImageLoader.getView(i, null, null);
        	Card c = (Card)ImageLoader.getItem(i);
        	
        	CardButton button = new CardButton(this, c);
        	//button.setImageDrawable(child.getDrawable());
        	button.setBackground(child.getDrawable());
        	button.setPadding(0,  0,  0,  0);
        	
        	addListenerOnButton(button);
        	
        	layout.addView(button);
        }
        
        

    }

    
    public void performBtnHandler(View vue) {
        // action déclenchée par le click sur btn
    	switch (vue.getId()) {
//        	case R.id.imageButton1:
//        		TextView text = (TextView)findViewById(R.id.textView1);
//        		Gallery g = (Gallery)findViewById(R.id.gallery1);
//        		String tag = g.getSelectedView().toString();
//        		text.append("\t\n" + "image : " + tag );
//        		break;
//        		
        	case R.id.imageButton1:
        		TextView text = (TextView)findViewById(R.id.textView1);
        		
        		String tag = ((ImageButton)vue).getResources().toString();
        		        		
    		
        		text.setText("image : " + tag );
        		break;
    	}
    	
    }
    
    
    public void addListenerOnButton(ImageButton imageButton) {
    	 
		imageButton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// récup des objets
				TextView text = (TextView)findViewById(R.id.textView1);
				ImageButton imgButton1 = (ImageButton)findViewById(R.id.imageButton1);
				CardButton cb = (CardButton)v;
				
				// Modif bouton fixe
	       		imgButton1.setBackground((cb).getDrawable());
	       		
	       		// modif texte
	       		StringBuffer sb = new StringBuffer();
	       		sb.append("image : ");
	       		sb.append((cb).getCardData().getS_nom());
	       		sb.append("\n Flip : ");
	       		text.setText(sb.toString());
	       		
	       		// flip image carte
	       		cb.Flip();	       		
				
			}
		});
 
	}
 
    

}


