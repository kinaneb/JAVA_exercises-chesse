/*
 * @author kinan
 */
public class Tour extends Piece{
    public Tour(boolean color){
    super(color);
            }
    //redifinition de toString
    public String toString(){
        if (color == Piece.BLANC){
            return "t";
        }else{
        return "T";
        }
    }

}
