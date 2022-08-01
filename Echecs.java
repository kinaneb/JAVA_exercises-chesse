/*
 * @author kinan
 */
public class Echecs {
    int lo = 4, la = 4;
    final Plateau p;
    public Echecs(int lo, int la){
        if(lo > this.lo){this.lo = lo;}
        if(la > this.la){this.la = la;}
        p = new Plateau(this.lo, this.la);
        p.remplirCase(0, 0, new Tour(Piece.BLANC));
        p.remplirCase(0, 1, new Dame(Piece.BLANC));
        p.remplirCase(0, 2, new Roi(Piece.BLANC));
        p.remplirCase(0, 3, new Tour(Piece.BLANC));
        for(int i = 0; i < this.la; i++){
            p.remplirCase(1, i, new Pion(Piece.BLANC));
            p.remplirCase(2, i, new Pion(Piece.NOIR));
        }
        p.remplirCase(3, 0, new Tour(Piece.NOIR));
        p.remplirCase(3, 1, new Dame(Piece.NOIR));
        p.remplirCase(3, 2, new Roi(Piece.NOIR));
        p.remplirCase(3, 3, new Tour(Piece.NOIR));
    }
    
}
