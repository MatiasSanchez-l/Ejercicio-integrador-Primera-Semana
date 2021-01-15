package ejercicioIntegrador1;


public class Yate extends Barco {
    private int potenciaCv;
    private int numeroCamarotes;

    public Yate(String matricula, int eslora, int anio, int potenciaCv, int numeroCamarotes) {
        super(matricula, eslora, anio);
        this.potenciaCv = potenciaCv;
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public int devolverModuloEspecial() {
        int resultado = this.devolverModulo() + this.potenciaCv + this.numeroCamarotes;
        return resultado;
    }
}
