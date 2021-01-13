package interfaces.implementaciones;

import interfaces.IPoblar;
import modelos.Cuenta;
import modelos.Usuario;
import modelos.enums.TipoCuenta;
import sun.awt.AWTAccessor;

import java.util.ArrayList;
import java.util.List;

public class PoblarImp implements IPoblar {
    @Override
    public List<Cuenta> crearCuentas() {
        List <Cuenta> tablaDeCuentas = new ArrayList<>();



        Cuenta c1 = new Cuenta(1, 1000,  TipoCuenta.AHORROS, "abcd", new Usuario("Pilar", "pili", "Castro"));
        Cuenta c2 = new Cuenta(2, 2000,  TipoCuenta.AHORROS, "abcd111", new Usuario("Juan", "juancho", "Perez"));
        Cuenta c3 = new Cuenta(2, 2000,  TipoCuenta.AHORROS, "abcd111", new Usuario("Juan", "juancho", "Perez"));

        tablaDeCuentas.add(c1);
        tablaDeCuentas.add(c2);
        tablaDeCuentas.add(c3);

        return tablaDeCuentas;
    }





}
