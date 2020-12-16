package modelos;

public class Cuenta {
    private int numCta;
    private int monto;
    private String tipoCta;
    private String clave;
    Usuario user;

    public Cuenta(int numCta, int monto, String tipoCta, String clave, Usuario user) {
        this.numCta = numCta;
        this.monto = monto;
        this.tipoCta = tipoCta;
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

    public String getTipoCta() {
        return tipoCta;
    }

    public void setTipoCta(String tipoCta) {
        this.tipoCta = tipoCta;
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
                ", tipoCta='" + tipoCta + '\'' +
                ", clave='" + clave + '\'' +
                ", user=" + user +
                '}';
    }
}
