package com.jcdjeyz.cardsdroid;

public class Data {

    // Chargement des don�es 
    public static enum CardsData {
    	AS_TREFLE (R.drawable.c1, "c1", "As de tr�fle"),
    	DEUX_TREFLE (R.drawable.c2, "c2", "Deux de tr�fle"),
    	TROIS_TREFLE (R.drawable.c3, "c3", "Trois de tr�fle"),
    	QUATRE_TREFLE (R.drawable.c4, "c4", "Quatre de tr�fle"),
    	CINQ_TREFLE (R.drawable.c5, "c5", "Cinq de tr�fle"),
    	SIX_TREFLE (R.drawable.c6, "c6", "Six de tr�fle"),
    	SEPT_TREFLE (R.drawable.c7, "c7", "Sept de tr�fle"),
    	HUIT_TREFLE (R.drawable.c8, "c8", "Huit de tr�fle"),
    	NEUF_TREFLE (R.drawable.c9, "c9", "Neuf de tr�fle"),
    	DIX_TREFLE (R.drawable.c10, "c10", "Dix de tr�fle"),
    	VALET_TREFLE (R.drawable.cj, "cj", "Valet de tr�fle"),
    	DAME_TREFLE (R.drawable.cq, "cq", "Dame de tr�fle"),
    	ROI_TREFLE (R.drawable.ck, "ck", "Roi de tr�fle");
    	            
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
