package ejecutable;

import modelo.Coordenada;

public class Test{
    public static void main(String[] args) {
        Coordenada c1 = new Coordenada();
        c1.setX(1);
        c1.setY(3);
        System.out.println("Método sin parametros");
        System.out.println(c1.toString());

        Coordenada c2 = new Coordenada(1.3, 5.3);
        System.out.println("\nMétodo con parametros");
        System.out.println(c2.toString());

        System.out.println("\nequals");
        if(c1.equals(c2)){
            System.out.println("son iguales");
        }else{
            System.out.println("No son iguales");
        }

        //imprimir la distancia
        if(c1.equals(c2)){
            System.out.println("Son iguales, por ende no se puede calcular la distancia");
        }else{
            System.out.println("La distancia entre los puntos es de: " + c1.Distancia(c2));
        }
        


    }
}