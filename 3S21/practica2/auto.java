package practica2;

public class auto {

    private String marca;
    private String modelo;
    private int año;
    private String color;

    public auto(String marca, String modelo, int año, String color) {

        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }

    public void datos() {
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public String getColor() {
        return color;
    }

}
