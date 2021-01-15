package ejercicioIntegrador1;

public abstract class Barco {
    private String matricula;
    private int esloraMts;
    private int anio;

    public Barco(String matricula, int esloraMts, int anio) {
        this.matricula = matricula;
        this.esloraMts = esloraMts;
        this.anio = anio;
    }

    public abstract int devolverModuloEspecial();

    public int devolverModulo(){
        int resultado = this.esloraMts * 10;

        return resultado;
    }

    public String getMatricula() {

        return matricula;
    }

    public void setMatricula(String matricula) {

        this.matricula = matricula;
    }

    public int getEsloraMts() {
        return esloraMts;
    }

    public void setEsloraMts(int esloraMts) {
        this.esloraMts = esloraMts;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", esloraMts=" + esloraMts +
                ", anio=" + anio +
                '}';
    }
}
