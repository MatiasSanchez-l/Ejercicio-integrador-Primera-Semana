package ejercicioIntegrador1;

public class Deportivo extends Barco {
    private int potenciaCv;

    public Deportivo(String matricula, int eslora, int anio, int potenciaCv) {
        super(matricula, eslora, anio);
        this.potenciaCv = potenciaCv;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    @Override
    public int devolverModuloEspecial() {
        int resultado = this.devolverModulo() + this.potenciaCv;
        return resultado;
    }
}