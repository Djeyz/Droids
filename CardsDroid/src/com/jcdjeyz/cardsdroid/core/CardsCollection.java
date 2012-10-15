/**
 * 
 */
package com.jcdjeyz.cardsdroid.core;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import android.content.Context;
import android.widget.ImageButton;

import com.jcdjeyz.cardsdroid.CardButton;
import com.jcdjeyz.cardsdroid.CardsDroidActivity;
import com.jcdjeyz.cardsdroid.R;
import com.jcdjeyz.cardsdroid.Data;

/**
 * @author DJEYZ
 *
 */
public class CardsCollection<Card> extends ImageButton implements Enumeration<CardButton>  {

	private Vector<CardButton> collection;
	private Iterator<CardButton> iter;
	

	
	public CardsCollection(Context context, CardButton[] cards) {
		super(context);
		// charge toutes les cartes en mémoire
		int taille = cards.length;
		collection = new Vector<CardButton>(taille);
		for(int i = 0; i < taille; i++)
		{
			collection.add(cards[i]);
		}
		
		iter = collection.iterator();
		
	}

	public void shuffle() {
		// mélange les cartes
		int taille = collection.size();
		Vector<CardButton> newColl = new Vector<CardButton>(taille);
		while (collection.size() > 0)
		{
			int location = (int) Math.round(taille * Math.random());
			CardButton c = collection.get(location);
			newColl.add(c);
			collection.remove(c);
			taille--;
		}
		
		collection = newColl;
		iter = collection.iterator();
		
	}

	public void setElements(CardButton[] cards) {
		
		// charge toutes les cartes en mémoire
		int taille = cards.length;
		collection = new Vector<CardButton>(taille);
		for(int i = 0; i < taille; i++)
		{
			collection.add(cards[i]);
		}
		
		iter = collection.iterator();
	}
	
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return iter.hasNext();
	}

	public CardButton nextElement() {
		// TODO Auto-generated method stub
		return iter.next();
	}

}
