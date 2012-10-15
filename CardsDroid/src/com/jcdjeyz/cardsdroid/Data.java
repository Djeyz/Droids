package com.jcdjeyz.cardsdroid;

public class Data {

    // Chargement des donées 
    public static enum CardsData {
    	AS_TREFLE (R.drawable.c1, "c1", "As de trèfle"),
    	DEUX_TREFLE (R.drawable.c2, "c2", "Deux de trèfle"),
    	TROIS_TREFLE (R.drawable.c3, "c3", "Trois de trèfle"),
    	QUATRE_TREFLE (R.drawable.c4, "c4", "Quatre de trèfle"),
    	CINQ_TREFLE (R.drawable.c5, "c5", "Cinq de trèfle"),
    	SIX_TREFLE (R.drawable.c6, "c6", "Six de trèfle"),
    	SEPT_TREFLE (R.drawable.c7, "c7", "Sept de trèfle"),
    	HUIT_TREFLE (R.drawable.c8, "c8", "Huit de trèfle"),
    	NEUF_TREFLE (R.drawable.c9, "c9", "Neuf de trèfle"),
    	DIX_TREFLE (R.drawable.c10, "c10", "Dix de trèfle"),
    	VALET_TREFLE (R.drawable.cj, "cj", "Valet de trèfle"),
    	DAME_TREFLE (R.drawable.cq, "cq", "Dame de trèfle"),
    	ROI_TREFLE (R.drawable.ck, "ck", "Roi de trèfle"),
    	  
    	AS_COEUR (R.drawable.h1, "h1", "As de coeur"),
    	DEUX_COEUR (R.drawable.h2, "h2", "Deux de coeur"),
    	TROIS_COEUR (R.drawable.h3, "h3", "Trois de coeur"),
    	QUATRE_COEUR (R.drawable.h4, "h4", "Quatre de coeur"),
    	CINQ_COEUR (R.drawable.h5, "h5", "Cinq de coeur"),
    	SIX_COEUR (R.drawable.h6, "h6", "Six de coeur"),
    	SEPT_COEUR (R.drawable.h7, "h7", "Sept de coeur"),
    	HUIT_COEUR (R.drawable.h8, "h8", "Huit de coeur"),
    	NEUF_COEUR (R.drawable.h9, "h9", "Neuf de coeur"),
    	DIX_COEUR (R.drawable.h10, "h10", "Dix de coeur"),
    	VALET_COEUR (R.drawable.hj, "hj", "Valet de coeur"),
    	DAME_COEUR (R.drawable.hq, "hq", "Dame de coeur"),
    	ROI_COEUR (R.drawable.hk, "hk", "Roi de coeur"),

    	AS_PIQUE (R.drawable.s1, "s1", "As de pique"),
    	DEUX_PIQUE (R.drawable.s2, "s2", "Deux de pique"),
    	TROIS_PIQUE (R.drawable.s3, "s3", "Trois de pique"),
    	QUATRE_PIQUE (R.drawable.s4, "s4", "Quatre de pique"),
    	CINQ_PIQUE (R.drawable.s5, "s5", "Cinq de pique"),
    	SIX_PIQUE (R.drawable.s6, "s6", "Six de pique"),
    	SEPT_PIQUE (R.drawable.s7, "s7", "Sept de pique"),
    	HUIT_PIQUE (R.drawable.s8, "s8", "Huit de pique"),
    	NEUF_PIQUE (R.drawable.s9, "s9", "Neuf de pique"),
    	DIX_PIQUE (R.drawable.s10, "s10", "Dix de pique"),
    	VALET_PIQUE (R.drawable.sj, "sj", "Valet de pique"),
    	DAME_PIQUE (R.drawable.sq, "sq", "Dame de pique"),
    	ROI_PIQUE (R.drawable.sk, "sk", "Roi de pique"),
    	
    	AS_CARREAU (R.drawable.d1, "d1", "As de carreau"),
    	DEUX_CARREAU (R.drawable.d2, "d2", "Deux de carreau"),
    	TROIS_CARREAU (R.drawable.d3, "d3", "Trois de carreau"),
    	QUATRE_CARREAU (R.drawable.d4, "d4", "Quatre de carreau"),
    	CINQ_CARREAU (R.drawable.d5, "d5", "Cinq de carreau"),
    	SIX_CARREAU (R.drawable.d6, "d6", "Six de carreau"),
    	SEPT_CARREAU (R.drawable.d7, "d7", "Sept de carreau"),
    	HUIT_CARREAU (R.drawable.d8, "d8", "Huit de carreau"),
    	NEUF_CARREAU (R.drawable.d9, "d9", "Neuf de carreau"),
    	DIX_CARREAU (R.drawable.d10, "d10", "Dix de carreau"),
    	VALET_CARREAU (R.drawable.dj, "dj", "Valet de carreau"),
    	DAME_CARREAU (R.drawable.dq, "dq", "Dame de carreau"),
    	ROI_CARREAU (R.drawable.dk, "dk", "Roi de darreau");
    	
        public final Integer pathId;   
        public final String id;
        public final String name;   
           
        
        CardsData(Integer path, String id, String name) {
            this.pathId = path;
            this.name = name;
            this.id = id;
        }
    }
}
