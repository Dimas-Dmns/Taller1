package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("03476");
        cuenta1.setSaldo(675);

        Cuenta cuenta2 = new Cuenta("03476", "C", 98);

        Cuenta cuenta3 = new Cuenta("03476");
        cuenta3.setTipo("C");

        System.out.println("-------- Valores Iniciales ---------");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();

        System.out.println("-------- Valores Modificados ---------");
        cuenta1.setSaldo(1000);
        cuenta1.setTipo("B");
        cuenta1.imprimir();

        Cuenta cuenta4 = new Cuenta("001", "A", 500);
        Cuenta cuenta5 = new Cuenta("002");
        cuenta5.setSaldo(250);
        Cuenta cuenta6 = new Cuenta("003", "C", 1200);

        cuenta4.imprimirConMiEstilo();
        cuenta5.imprimirConMiEstilo();
        cuenta6.imprimirConMiEstilo();
    }
}