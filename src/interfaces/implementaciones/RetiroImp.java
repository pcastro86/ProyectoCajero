package interfaces.implementaciones;

import interfaces.IRetiro;
import modelos.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class RetiroImp implements IRetiro {

    @Override
    public Cuenta retirarDiner(Cuenta cuenta, int retiro) {
       int nuevoSaldo = cuenta.getMonto() - retiro;
       cuenta.setMonto(nuevoSaldo);


       return cuenta;
    }
}
