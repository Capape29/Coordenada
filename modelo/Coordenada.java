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


    
}