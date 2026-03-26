package Encapsulacion;

public class Cuenta {

	 //Atributos
    private String titular;
    private double saldo;

    //Constructor
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //Getters y Setters
    public String getTitular() {return titular;}
	public void setTitular(String titular) {this.titular = titular;}

	public double getSaldo() {return saldo;}
	public void setSaldo(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}
	
    //Método para depositar dinero
    public void depositar(double monto) {

        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado: Q." + monto);
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
            System.out.println("Retiro realizado: Q." + monto);
        }
    }

    //Método para mostrar estado
    public void mostrar() {
        System.out.println("Titular: " + titular + 
        				   "\nSaldo: Q." + saldo + 
        				   "\n----------------------");
    }

}
