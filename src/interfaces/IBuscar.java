package interfaces;

import modelos.Cuenta;

import java.util.List;

public interface IBuscar {
    List<Cuenta> buscarCuenta(List <Cuenta> cuentas, int numCta, String clave);
}
