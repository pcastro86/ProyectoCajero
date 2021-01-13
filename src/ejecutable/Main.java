package ejecutable;

import interfaces.IBuscar;
import interfaces.IPoblar;
import interfaces.IRetiro;
import interfaces.implementaciones.BuscarImp;
import interfaces.implementaciones.PoblarImp;
import interfaces.implementaciones.RetiroImp;
import modelos.Cuenta;
import modelos.Usuario;
import modelos.enums.TipoCuenta;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IPoblar listaCuentas = new PoblarImp();
        List<Cuenta> cuentas = listaCuentas.crearCuentas();
        System.out.println("***********TODAS LAS CUENTAS : *************");
        System.out.println(cuentas.get(0));

        // solo quiero que ingresn los que tiene cuenta de tipo ahorros.
        if(TipoCuenta.AHORROS == cuentas.get(0).getTipocuenta()) {
            System.out.println(cuentas.get(0).getUser().getNombre() + " , bienvenido");
        } else {
            System.out.println("acceso restringido");
        }

        IBuscar cliente = new BuscarImp();
        List<Cuenta> cuenta = cliente.buscarCuenta(cuentas, 2, "abcd111");
        //System.out.println("*********** BUSQUEDA DE UN CLIENTE X : *************");
        //System.out.println(cuenta);

        IRetiro retiro = new RetiroImp(); // primero buscar y si es valido retirar
        Cuenta cuentaNuevoSaldo = retiro.retirarDiner(cuenta.get(0), 100);
        //System.out.println(cuentaNuevoSaldo);


    }
}
