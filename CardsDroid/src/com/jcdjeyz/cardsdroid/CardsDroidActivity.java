package com.jcdjeyz.cardsdroid;

import java.util.Vector;

import com.jcdjeyz.cardsdroid.Data.CardsData;
import com.jcdjeyz.cardsdroid.core.Card;
import com.jcdjeyz.cardsdroid.core.CardsCollection;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
//import android.widget.Gallery;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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
        
         
         CardButton[] cards = new CardButton[ImageLoader.getCount()];
         
        // chargement des images dans g2
        for(int i = 0; i < ImageLoader.getCount(); i++)
        {
        	ImageView child = (ImageView) ImageLoader.getView(i, null, null);
        	Card c = (Card)ImageLoader.getItem(i);
        	
        	CardButton button = new CardButton(this, c, false);
        	//button.setBackground(child.getDrawable());
        	button.setBackgroundResource(R.drawable.as_de_pic) ;
        	button.setPadding(0,  0,  0,  0);
        	button.setId(i+1);
        	addListenerOnButton(button);
        	
        	cards[i] = button;
        	//layout.addView(button);
        	
        }
        
        // Deck
        CardsCollection<CardButton> deck = new CardsCollection<CardButton>(this, cards); //(CardsCollection<CardButton>) findViewById(R.id.imageButton1);
        
        deck.setElements(cards);
        // NE MARCHE PAS ENCORE
        // deck.shuffle();
        // NE MARCHE PAS ENCORE
        deck.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// récup des objets
				CardsCollection<CardButton> coll = (CardsCollection<CardButton>)v;
				CardButton cb = coll.nextElement();
				
				LinearLayout layout = (LinearLayout) findViewById(R.id.horizontalScrollViewLayout1);
	       		layout.addView(cb);

			}
		});
        
        RelativeLayout relLay = (RelativeLayout) findViewById(R.id.deckContainer);
        relLay.addView(deck);
    }

    

    
    public void addListenerOnButton(ImageButton imageButton) {
    	 
		imageButton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// récup des objets
				TextView text = (TextView)findViewById(R.id.textView1);
				CardButton cb = (CardButton)v;
				
				
	       		// modif texte
	       		StringBuffer sb = new StringBuffer();
	       		sb.append("image : ");
	       		sb.append((cb).getCardData().getS_nom());
	       		sb.append("\n Flip : ");
	       		text.setText(sb.toString());
	       		
	       		// flip image carte
	       		cb.Flip();	       		
	       		
	       		
	       		GridLayout gridView = (GridLayout) findViewById(R.id.GridLayout1);
	       		LinearLayout layout = (LinearLayout) findViewById(R.id.horizontalScrollViewLayout1);
	       	 
	       		if (gridView.findViewById(cb.getId()) != null)
	       		{
	       			// le bouton appartient au grid view
	       			gridView.removeView(cb);
	       			layout.addView(cb);
	       			
	       		} else
	       		{
	       			// le bouton appartient au linear layout
	       			layout.removeView(cb);
	       			gridView.addView(cb);
	       		}
	       		
			}
		});
 
	}
 
    

}


