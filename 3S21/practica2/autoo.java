package practica2;

public class autoo {
    public static void main(String[] args) {

        auto objauto1 = new auto("Toyota", "Corolla", 2024, "Rojo");

        System.out.println("--- Auto 1 ---");
        System.out.println("Marca: " + objauto1.getMarca());
        System.out.println("Modelo: " + objauto1.getModelo());
        System.out.println("Año: " + objauto1.getAño());
        System.out.println("Color: " + objauto1.getColor());
    }
}