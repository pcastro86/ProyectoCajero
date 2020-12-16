package interfaces.implementaciones;

import interfaces.IBuscar;
import modelos.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class BuscarImp implements IBuscar {
    @Override
    public List<Cuenta> buscarCuenta(List<Cuenta> cuentas, int numCta, String clave) {
        List <Cuenta> cliente = new ArrayList<>();

        for (Cuenta i: cuentas) {
            if(i.getNumCta() == numCta && i.getClave() == clave) { // agregar && else return leyenda
                cliente.add(i);
            } else {
                return  System.out.println( "no hay coincidencias");
            }
        }
        return cliente;
    }
}
