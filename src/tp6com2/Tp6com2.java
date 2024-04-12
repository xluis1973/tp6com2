
package tp6com2;

import java.util.TreeSet;
import tp6com2.entidades.*;



public class Tp6com2 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        
        TreeSet<Producto> productos=new TreeSet<>();
        Rubro comestible=new Rubro(1,"Comestible");
        Producto arroz=new Producto(10,"arroz gallo",1234,comestible,10);
        Producto cafe=new Producto(5,"cafe cabrale",4550,comestible,20);
        
        productos.add(arroz);
        productos.add(cafe);
        for(Producto prod:productos){
        
            System.out.println(prod.toString());
        }
    }
    
}
