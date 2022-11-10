package ejecutable;

import modelo.Coordenada;

public class Test 
{
    public static void main(String[] args) 
    {
        
        Coordenada C1 = new Coordenada ();
        C1.setX(0);
        C1.setY(0);

        Coordenada C2 = new Coordenada(0, 0); 

        //Imprimir Coordenada1
        System.out.println("Posicion en X: " + C1.getX());
        System.out.println("Posicion en Y: " + C1.getY());
        System.out.println(C1.toString());
        System.out.println("---------------------------------");
        
        //Imprimir Coordenada2
        System.out.println("Posicion en X: " + C2.getX());
        System.out.println("Posicion en Y: " + C2.getY());
        System.out.println(C2.toString());

        

        if(C1.equals(C2))
        {
            
            System.out.println("Las Coordenada son iguales");
        }
        else
        {
            System.out.println("Las Coordenadas son Diferentes");
        }

       
        
        
        
    }
}
