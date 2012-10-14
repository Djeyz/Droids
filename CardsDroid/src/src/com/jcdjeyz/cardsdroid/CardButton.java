package com.jcdjeyz.cardsdroid;

import com.jcdjeyz.cardsdroid.core.Card;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CardButton extends ImageButton {

	private Card cardData;
	private boolean flip;
	
	public Card getCardData() {
		return cardData;
	}


	public void setCardData(Card cardData) {
		this.cardData = cardData;
	}


	public CardButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}


	public CardButton(Context context, Card c, boolean isFlipped) {
		this(context);
		
		cardData = c;
		flip = isFlipped;
	
	}


    public ImageView getCardView() {
    	
    	
        ImageView i = new ImageView(this.getContext());

        i.setImageResource(this.cardData.getS_imgSrcPath());
        i.setLayoutParams(new LayoutParams(150, 100));
        i.setScaleType(ImageView.ScaleType.FIT_XY);
      // inutile   i.setBackgroundResource(mGalleryItemBackground);

        return i;
    }
	

	public void Flip() {
		if (flip)
		{
			// déjà retournée
			this.setBackground((((ImageView)this.getCardView()).getDrawable()));
			//this.setBackgroundResource(R.drawable.d9) ;
			flip = false;
		} else {
			// A retouner
			this.setBackgroundResource(R.drawable.as_de_pic) ;
			flip = true;
		}
		
		
	}


	
}
