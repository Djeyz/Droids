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
    	ROI_TREFLE (R.drawable.ck, "ck", "Roi de trèfle");
    	            
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
