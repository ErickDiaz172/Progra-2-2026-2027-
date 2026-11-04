package practica;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("INICIALIZANDO BANCO DE ERICK");
		
		System.out.println("Creacion de cuentas");
		CuentaBancaria cuenta1= new CuentaBancaria("2151625156", "Erick", 1000);
		CuentaBancaria cuenta2 = new CuentaBancaria("12648157815", "Dayana", 150);
		
		
		System.out.println("Prueba de transacciones");
		System.out.println("Deposito de dinero en cuenta 1");
		cuenta1.depositar(1200);
		System.out.println("Retiro de dinero en cuenta 1");
		cuenta1.retirar(90);
		System.out.println("Deposito de dinero cuenta 2");
		cuenta2.depositar(500);
		System.out.println("Comprobacion de retiro fallido");
		cuenta2.retirar(1000);
		
		System.out.println("Estado de cuentas");
		
		System.out.println("Cuenta 1");
		System.out.println("el titular es" + cuenta1.getTitual());
		System.out.println("Su numero de cuenta es" + cuenta1.getNumerodecuenta());
		System.out.println("Su saldo restante es" + cuenta1.getSaldo());
		
		System.out.println("Cuenta 2");
		System.out.println("El titular es" + cuenta2.getTitual());
		System.out.println("Su numero de cuenta es "+ cuenta2.getNumerodecuenta());
		System.out.println("Su saldo restante es " + cuenta2.getSaldo());
		
		
		System.out.println("Total de cuentas registradas en el banco " + CuentaBancaria.getTotalCuentasCreadas());
		
		
		System.out.println("Gracias por preferir el banco de Erick");
		
		
			
		

	}

}
