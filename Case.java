/*
 * @author kinan
 */
public class Case {
    final private boolean estBlanche;
    private Piece caseP = null;
    //constracteur
    public Case(boolean color){
        estBlanche = color;
    }
    public boolean getCaseC(){
        if (estBlanche){return Piece.BLANC;}
        else{return Piece.NOIR;}
    }
    public void remplirPiece(Piece p){
        caseP = p;
    }
    public Piece getPiece(){
        return caseP;
    }
    public void enleverPiece(){
        caseP = null;
    }
    public boolean estVide(){
        if (caseP == null){
        return true;
        }else{
        return false;
        }
    }
    public String toString(){
        if(estVide()){
            if(getCaseC()){
                return "   |";
            }
            else{return " ◊ |";}
        }else{return " " + getPiece().toString() + " |";}
        
    }
}
