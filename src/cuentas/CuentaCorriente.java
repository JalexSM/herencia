package cuentas;

public class CuentaCorriente extends Cuenta{
	
	private double limite;
	

	public CuentaCorriente(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}


	@Override
	public void retirar(double monto) {
		if (monto > 0 && monto <= (saldo + limite)) {
            saldo -= monto;
            System.out.println("Saldo actual " + saldo);
        } else {
            System.out.println("Excede el límite de sobregiro");
        }
	}
	
	

}
