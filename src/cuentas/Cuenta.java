package cuentas;

public class Cuenta {
	
	protected double saldo;//protected: Útil en herencia, cuando se desea compartir un miembro
						   //(método o variable) con clases hijas, pero mantenerlo oculto al mundo exterior. 		
	
	public Cuenta(double saldo) {
		this.saldo = saldo;
		}

	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void depositar(double monto) {
		saldo += monto;
		System.out.println("Saldo actual " + saldo);
		
		}

	public void retirar(double monto) {
		if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Saldo actual " + saldo);
        } else {
            System.out.println("Fondos insuficientes");
            }
		}
}
