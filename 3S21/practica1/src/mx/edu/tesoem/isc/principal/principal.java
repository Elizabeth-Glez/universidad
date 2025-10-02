package mx.edu.tesoem.isc.principal;

import mx.edu.tesoem.isc.informacion.datos.datos;

public class principal {
    public static void main(String[] args) {
        datos objdatos = new datos("yoongi", 32, "suga@gmail.com");
        System.out.println("nombre: " + objdatos.getNomre());
        System.out.println("edad: " + objdatos.getEdad());
        System.out.println("correo: " + objdatos.getCorreo());

        datos objdatos2 = new datos();
        objdatos2.setNombre("yoongi");
        objdatos2.setEdad(32);
        objdatos2.setCorreo("suga@gmail.com");

        System.out.println("nombre: " + objdatos2.getNomre());
        System.out.println("edad: " + objdatos2.getEdad());
        System.out.println("correo: " + objdatos2.getCorreo());
    }
}
