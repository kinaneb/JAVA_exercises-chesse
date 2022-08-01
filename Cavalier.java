/*
 * @author kinan
 */
public class Cavalier extends Piece{
    public Cavalier(boolean color){
    super(color);
            }
    //redifinition de toString
    public String toString(){
        if (color == Piece.BLANC){
            return "c";
        }else{
        return "C";
    }
    }

}
