package ejercicioIntegrador1;

public class Velero extends Barco {
    private int nroMastiles;

    public Velero(String matricula, int eslora, int anio, int nroMastiles) {
        super(matricula, eslora, anio);

        this.nroMastiles = nroMastiles;
    }

    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public int devolverModuloEspecial() {
        int resultado = this.devolverModulo() + this.nroMastiles;
        return resultado;
    }
}
