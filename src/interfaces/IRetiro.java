package interfaces;

import modelos.Cuenta;

import java.util.List;

public interface IRetiro {
    Cuenta retirarDiner(Cuenta cuenta, int retiro);
}
