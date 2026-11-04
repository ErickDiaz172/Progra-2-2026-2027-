	package practica;

public class CuentaBancaria {
	
	private static String nombreBanco = "Banco de Erick";
	private static int totalCuentasCreadas =0;
	private String numerodecuenta;
	private String titular;
	private double saldo;
	public String getNumerodecuenta() {
		return numerodecuenta;
	}
	public void setNumerodecuenta(String numerodecuenta) {
		this.numerodecuenta = numerodecuenta;
	}
	public String getTitual() {
		return titular;
	}
	public void setTitular(String titular) {
		if(titular != null && titular.equals("")) {
			this.titular=titular;
		} else {
			System.out.println("Error no se puede asignar un titular vacio ");
		}
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public static int getTotalCuentasCreadas() {
		return totalCuentasCreadas;
	}
	
	
	
	
	
	public static void setTotalCuentasCreadas(int totalCuentasCreadas) {
		CuentaBancaria.totalCuentasCreadas = totalCuentasCreadas;
	}
	public CuentaBancaria(String numerodecuenta,String titular,double saldo) {
		if(numerodecuenta == null || numerodecuenta.equals("")) {
			System.out.println("El numero de cuenta esta vacio, se asigna uno desconodido");
			this.numerodecuenta="Desconocido";
		}else {
			this.numerodecuenta = numerodecuenta;
		}
		if(titular == null|| titular.equals("")) {
			System.out.println("no se a asignado un titular de la cuenta, se asigna un desconocido");
			this.titular = "desconocido";
		}else {
			this.titular=titular;
		}
		if(saldo<0) {
			System.out.println("Error el saldo no puede ser negativo se asiganara en 0.0");
			this.saldo= 0.0;
		}
		else {
			this.saldo = saldo;
		}
		totalCuentasCreadas++;
		
	}
	
	public void depositar(double monto) {
		double bonificacion = 0.0;
		
		if(monto<0) {
			System.out.println("Error el monto a depositar debe ser mayor a 0");
			return;
		}
		if(monto>1000.0) {
			bonificacion=20;
			System.out.println("Felicidades pasaste el monto de mayor o igual a 1000 tu bonificacion es " + bonificacion);
		}
		this.saldo=this.saldo +bonificacion + monto;
		System.out.println("Deposito realizado con exito se a depositado " + this.saldo + "del titular: " + this.titular);
		
	}
	
	public boolean retirar(double monto) {
		double comisionfija = 2.0;
		double totalNecesario = monto + comisionfija;
		if (monto <0) {
			System.out.println("Error el monto a retirar debe ser mayor a 0");
			return false;
		}
		
		if(this.saldo>= totalNecesario) {
			this.saldo = this.saldo - totalNecesario;
			System.out.println("Retiro exitoso su retiro a sido por " + monto + "La comision por el retiro es" + comisionfija + "Su saldo restante es" + this.saldo  );
			return true;
		} else {
			System.out.println("Fondos insuficientes para retirar");
			return false;
		}
	}
	
	
	
	
	
	
	
	
	

}
