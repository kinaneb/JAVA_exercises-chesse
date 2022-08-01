/*
 * @author kinan
 */
public class Plateau {
    final int longueur, largeur;
    final Case[][] tCase;
    private boolean color = Piece.BLANC;
    public Plateau(int longueur, int largeur){
        this.longueur = longueur;
        this.largeur = largeur;
        this.tCase = new Case[longueur][largeur];
        //while(int r = 0; r <  largeur; r++){
        //System.out.println(longueur+" "+largeur);
        //System.out.println(tCase.length);
        for(int r = 0; r <  longueur; r++){
			for(int c = 0; c <  largeur; c++){
				tCase[r][c] = new Case(color);
				if (c !=  largeur - 1){
					color = !color;
					}
			}
		}
        /*int r = 0;
        while(r < longueur){
            int c = 0;
			while(c < largeur){
                            System.out.println(c+" "+r);
				tCase[r][c] = new Case(color);
				if (c !=  largeur - 1){
                                    color = !color;
					}
                                c++;
			}
                        r++;
		}*/
    }
    public Case getCase(int x,int y){
        return tCase[x][y];
    }
    public void videCase(int x, int y){
        tCase[x][y].enleverPiece();
    }
    void remplirCase(int x, int y, Piece p){
        tCase[x][y].remplirPiece(p);
    }
    public void afficher(){
		String affichage =" ";
		char columnNo = 'A';
		for  (int c = 1; c <= largeur; c++) {
        	affichage += "  "+columnNo+" ";
        	columnNo++;
        }
		affichage += "\n ";
		for  (int c =1; c <= largeur; c++) {
			affichage += "|———";
        }
		affichage += "|";
		
        //affichage += "\n";
		char rowsNo = '1';
		for (int c = 0; c < longueur; c++) {
			affichage += "\n" + rowsNo;
			affichage+="|";
			for (int r=0; r< largeur; r++) {
				affichage += tCase[c][r].toString();
			}
			affichage += rowsNo;
        	rowsNo++;
			if ( c == longueur-1){continue;}
			affichage+= "\n |";
                        affichage+= new String(new char[largeur]).replace("\0","———|");
		}
		affichage += "\n ";
		for  (int c =1; c <= largeur; c++) {
			affichage += "|———";
        }
		affichage += "|\n ";
		char columnNo1 = 'a';
		for  (int c = 1; c <= largeur; c++) {
        	affichage += "  "+columnNo1+" ";
        	columnNo1++;
        }
		System.out.println(affichage);
	
    }
    public boolean horsLimite(int x, int y){
        if ( (x < longueur && x > -1) && (y < largeur && y > -1) ){
            return true;
        }else{
            return false;
        }
    }
    public Case getCaseDep(Deplacement d){
        return tCase[d.x0][d.y0];
    }
    public Case getCaseArr(Deplacement d){
        return tCase[d.x1][d.y1];
    }
    public void videCaseDep(Deplacement d){
        tCase[d.x0][d.y0].enleverPiece();
    }
    void remplirCaseArr(Deplacement d){
        tCase[d.x1][d.y1].remplirPiece(getCaseDep(d).getPiece());
    }
    
    public boolean horsLimite(Deplacement d){
        if ( (d.x0 < longueur && d.x0 > -1) && (d.x1 < longueur && d.x1 > -1) &&
                (d.y0 < largeur && d.y0 > -1) && (d.y1 < largeur && d.y1 > -1)){
            return true;
        }else{
            return false;
        }
    }

}
