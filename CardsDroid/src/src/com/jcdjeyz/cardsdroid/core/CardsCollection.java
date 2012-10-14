/**
 * 
 */
package com.jcdjeyz.cardsdroid.core;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import com.jcdjeyz.cardsdroid.CardsDroidActivity;
import com.jcdjeyz.cardsdroid.R;
import com.jcdjeyz.cardsdroid.Data;

/**
 * @author DJEYZ
 *
 */
public class CardsCollection<Card> implements Enumeration<Card> {

	private Vector<Card> collection;
	private int taille;
	private Iterator<Card> iter;
	



	
	public CardsCollection(Card[] cards) {
		// charge toutes les cartes en mémoire
		taille = cards.length;
		collection = new Vector<Card>(taille);
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

	public Card nextElement() {
		// TODO Auto-generated method stub
		return iter.next();
	}

}
