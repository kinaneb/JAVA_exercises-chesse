/*
 * @author kinan
 */
public class Dame extends Piece{
    public Dame(boolean color){
    super(color);
            }
    //redifinition de toString
    public String toString(){
        if (color == Piece.BLANC){
            return "d";
        }else{
        return "D";
        }
    }

}