/*
 * @author kinan
 */
public class Pion extends Piece{
    public Pion(boolean color){
    super(color);
            }
    //redifinition de toString
    public String toString(){
        if (color == Piece.BLANC){
            return "p";
        }else{
        return "P";
        }
    }
    
}
