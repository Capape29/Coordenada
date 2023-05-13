package modelo;

public class Coordenada{
    
    // Atributos
    private double x;
    private double y;

    // Método constructor sin parametros
    public Coordenada(){

    }

    // Método constructor con parametros
    public Coordenada(double x, double y){
        this.x = x;
        this.y = y;
    }

    //  Método constructor que calcula la distancia
    public double Distancia(Coordenada otra){
        double distancia =Math.sqrt(Math.pow(x - otra.x,2)+ Math.pow(y-otra.y, 2));
        return distancia;
    }

    // Getters and Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Métodos toString e equals
    public boolean equals(Object o){
        Coordenada otra = (Coordenada)o;
        return (x == otra.x) && (y == otra.y);
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}