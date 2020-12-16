package ejecutable;

import interfaces.IBuscar;
import interfaces.IPoblar;
import interfaces.IRetiro;
import interfaces.implementaciones.BuscarImp;
import interfaces.implementaciones.PoblarImp;
import interfaces.implementaciones.RetiroImp;
import modelos.Cuenta;
import modelos.Usuario;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IPoblar listaCuentas = new PoblarImp();
        List<Cuenta> cuentas = listaCuentas.crearCuentas();
        System.out.println("***********TODAS LAS CUENTAS : *************");
        System.out.println(cuentas);

        IBuscar cliente = new BuscarImp();
        List<Cuenta> cuenta = cliente.buscarCuenta(cuentas, 2, "abcd");
        System.out.println("*********** BUSQUEDA DE UN CLIENTE X : *************");
        System.out.println(cuenta);

        IRetiro retiro = new RetiroImp(); // primero buscar y si es valido retirar
        Cuenta cuentaNuevoSaldo = retiro.retirarDiner(cuenta.get(0), 100);
        System.out.println(cuentaNuevoSaldo);

    }
}
