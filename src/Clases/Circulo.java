package Clases;

public class Circulo implements Interface_forma {

    private String color;
    private int x;
    private int y;
    private int radio;
    
    public Circulo(String color){
    
        this.color=color;
    
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    
    @Override
    public void Dibujar() {
        
        System.out.println("Circulo: Dibujar() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radio);
           
    }

}
