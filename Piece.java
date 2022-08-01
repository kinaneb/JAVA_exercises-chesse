/*
 * @author kinan
 */
public class Piece {
    protected boolean color = true;
    public static final boolean BLANC = true, NOIR = false;
    public Piece(boolean color){
        this.color = color;
    }

    @Override
    public String toString() {
        if (color == BLANC) {
            return"p";
        } else {
        return "P";
        }
    }
    
    
    public boolean estValideDA(Deplacement d, Plateau p){
        if (p.getCase(d.x0,d.y0).estVide()){
            System.out.println("Case départ est vide");
            return false;
        }
        if (p.getCase(d.x1, d.y1).getPiece().color == p.getCase(d.x0, d.y0).getPiece().color){
            System.out.println("Case arrivée a une de vos pièces");
            return false;
        }
        return true;
    }
}
