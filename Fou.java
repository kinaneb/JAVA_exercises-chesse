/*
 * @author kinan
 */
public class Fou extends Piece{
    public Fou(boolean color){
    super(color);
            }
    //redifinition de toString
    public String toString(){
        if (color == Piece.BLANC){
            return "f";
        }else{
        return "F";
        }
    }

}
