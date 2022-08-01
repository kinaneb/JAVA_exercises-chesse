/*
 * @author kinan
 */
public class testingechecs {
public static void main(String[] args){
    Fou f = new Fou(false);
    Cavalier c = new Cavalier(false);
    String cava = "vcgh vcdd vcgd vcdh";
    String n = "vcll";
    boolean t = cava.matches("(?i).*"+n+".*");
    System.out.println(t);
    Echecs e = new Echecs(5,3);
    e.p.remplirCase(3, 1, f);
    e.p.remplirCase(1, 2, c);
    e.p.afficher();
    //System.out.println(f.horsLimite(7,8));
}
}
