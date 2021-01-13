package modelos;

import modelos.enums.TipoCuenta;

public class Cuenta {
    private int numCta;
    private int monto;
    private TipoCuenta tipocuenta; // enumerador es un tipo de clase que me ayuda a utilizar tipos de objetos. El enum es tipo cuenta y el nombre que le doy es tipocuenta
    private String clave;
    Usuario user;

    public Cuenta(int numCta, int monto, TipoCuenta tipocuenta, String clave, Usuario user) {
        this.numCta = numCta;
        this.monto = monto;
        this.tipocuenta = tipocuenta;
        this.clave = clave;
        this.user = user;
    }

    public int getNumCta() {
        return numCta;
    }

    public void setNumCta(int numCta) {
        this.numCta = numCta;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public TipoCuenta getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(TipoCuenta tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numCta=" + numCta +
                ", monto=" + monto +
                ", tipocuenta=" + tipocuenta.name() +
                ", clave='" + clave + '\'' +
                ", user=" + user +
                '}';
    }
}


