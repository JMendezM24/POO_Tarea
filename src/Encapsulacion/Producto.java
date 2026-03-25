package Encapsulacion;

public class Producto {

    // 🔒 Atributos
    private String codigo;
    private String nombre;
    private double precio;               // precio final
    //Sé que esto no se solicitó, pero quería que se mostrara en consola la información completa
    private double precioOriginal;       // precio inicial
    private double porcentajeDescuento;  // porcentaje de descuento
    
    // 🏗️ Constructor
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.precioOriginal = precio;
        this.porcentajeDescuento = 0; //sin descuento
    }

    //Aplicar descuento
    public void aplicarDescuento(double porcentaje) {

        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Descuento inválido");
            return;
        }

        this.porcentajeDescuento = porcentaje; //guardar porcentaje

        double descuento = precioOriginal * (porcentaje / 100);
        precio = precioOriginal - descuento;
    }

    //Mostrar información completa
    public void mostrar() {

        double descuentoAplicado = precioOriginal - precio;

        System.out.println(
            "Código: " + codigo + "\n" +
            "Nombre: " + nombre + "\n" +
            "Precio original: Q" + precioOriginal + "\n" +
            "Descuento (%): " + porcentajeDescuento + "%\n" +
            "Descuento (Q): " + descuentoAplicado + "\n" +
            "Precio final: Q" + precio + "\n" +
            "----------------------"
        );
    }
}