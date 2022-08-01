/*
 * @author kinan
 */
public class Deplacement {
    int x0,y0,x1,y1;
    int x = x0-x1, y = y0-y1;
    public String quelType(){
        if (x == 0){
            if(y > 0){return "hg";}
            else if(y < 0){return "hd";}
            else return "x";
            
        }
        else if (y == 0){
            if(x > 0){return "vh";}
            else if(x < 0){return "vd";}
            else return "x";
        }
        else if ( y == Math.abs(x) ){
            if( (y > 0) && (x > 0) ){return "dgh";}
            else if( (y < 0) && (x < 0) ){return "ddd";}
            else if( (y > 0) && (x < 0) ){return "dgd";}
            else if( (y < 0) && (x > 0) ){return "ddh";}
        }
        else if ( (y == Math.abs(1)) && (x== Math.abs(2)) ){
            if( (y > 0) && (x > 0) ){return "vcgh";}
            else if( (y < 0) && (x < 0) ){return "vcdd";}
            else if( (y > 0) && (x < 0) ){return "vcgd";}
            else if( (y < 0) && (x > 0) ){return "vcdh";}
        }
        else if ( (y == Math.abs(2)) && (x== Math.abs(1)) ){
            if( (y > 0) && (x > 0) ){return "hcgh";}
            else if( (y < 0) && (x < 0) ){return "hcdd";}
            else if( (y > 0) && (x < 0) ){return "hcgd";}
            else if( (y < 0) && (x > 0) ){return "hcdh";}
        }
        return "x";
    }
    public int distDepl(){
        String c = "vcgh vcdd vcgd vcdh hcgh hcdd hcgd hcdh";
        String d = "dgh ddd dgd ddh";
        String h = "hg hd";
        String v = "vh vd";
        if(v.matches("(?i).*"+quelType()+".*")){
            return Math.abs(x0-x1);
        }else if(h.matches("(?i).*"+quelType()+".*")){
            return Math.abs(y0-y1);
        }else if(d.matches("(?i).*"+quelType()+".*")){
            return Math.abs(x0-x1);
        }else if(c.matches("(?i).*"+quelType()+".*")){
            return -1;
        }
        return 0;
    }
}
/* 1,3  
   4,1*/