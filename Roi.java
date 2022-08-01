/*
 * @author kinan
 */
public class Roi extends Piece{
    public Roi(boolean color){
    super(color);
            }
    //redifinition de toString
    public String toString(){
        if (color == Piece.BLANC){
            return "r";
        }else{
        return "R";
        }
    }

}
