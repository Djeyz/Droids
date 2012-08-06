package com.jcdjeyz.cardsdroid.core;

import android.R.string;
import android.content.Context;
import android.widget.ImageButton;

public class Card {
	
	/**
	 * Classe carte
	 * <p>
	 * Copyright (C) 2012, C. JcDjeyz Software.
	 * All rights reserved.
	 * <p>
	 * See license.txt (or license.rtf) for license information.
	 * 
	 * @author JcDjeyz
	 * @version 1.0
	 */
	
	
	private string s_imgSrcPath; 	// chemin vers l'image
	protected string s_id; 			// Identifiant
	protected string s_nom; 			// Nom de la carte
	protected ImageButton btn;

	/*	A convertir en abstract class par la suite 	*/
	public Card(Context context, string path, string id, string nom)
	{
		this.setS_imgSrcPath(path);
		this.s_id = id;
		this.s_nom = nom;
		
		 btn = new ImageButton(context);
		
	}

	protected string getS_imgSrcPath() {
		return s_imgSrcPath;
	}

	protected void setS_imgSrcPath(string s_imgSrcPath) {
		this.s_imgSrcPath = s_imgSrcPath;
	}

}
