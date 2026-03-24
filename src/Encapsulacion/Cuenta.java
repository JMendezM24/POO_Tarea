package Encapsulacion;

public class Cuenta {

	 //Atributos
    private String titular;
    private double saldo;

    //Constructor
    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;

        //Validación inicial
        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    //Método para depositar dinero
    public void depositar(double monto) {

        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado: Q" + monto);
        } else {
            System.out.println("Monto inválido");
        }
    }

    //Método para retirar dinero
    public void retirar(double monto) {

        if (monto <= 0) {
            System.out.println("Monto inválido");
            return;
        }

        if (monto > saldo) {
            System.out.println("Fondos insuficientes ❌");
        } else {
            saldo -= monto;
            System.out.println("Retiro realizado: Q" + monto);
        }
    }

    //Método para mostrar estado
    public void mostrar() {
        System.out.println("Titular: " + titular + "\n" + "Saldo: Q" + saldo + "\n" + "----------------------");
    }

}
