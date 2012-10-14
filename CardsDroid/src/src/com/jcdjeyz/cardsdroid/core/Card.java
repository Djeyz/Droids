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
	
	
	protected Integer s_imgSrcPath; 	// chemin vers l'image
	protected String s_id; 			// Identifiant
	protected String s_nom; 			// Nom de la carte
	
	
	/*	A convertir en abstract class par la suite 	*/
	public Card(Integer path, String id, String nom)
	{
		this.s_imgSrcPath = path;
		this.s_id = id;
		this.s_nom = nom;
		
	}
	
	
	
	public String getS_id() {
		return s_id;
	}

	public String getS_nom() {
		return s_nom;
	}

	public Integer getS_imgSrcPath() {
		return s_imgSrcPath;
	}

}
