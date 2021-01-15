package ejercicioIntegrador1;

public class Alquiler {
    private String nombreCliente;
    private int dniCliente;
    private int fechaInicial;
    private int fechaFinal;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler(String nombreCliente, int dniCliente, int fechaInicial, int fechaFinal, int posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public int devolverCalculoAlquiler(){
        int nroDiasOcupacion =  this.fechaFinal - this.fechaInicial;
        int moduloBarco = this.barco.devolverModuloEspecial();
        int resultado = nroDiasOcupacion * moduloBarco * 2;
        return resultado;
    }


    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(int fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public int getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(int fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", dniCliente=" + dniCliente +
                ", fechaInicial=" + fechaInicial +
                ", fechaFinal=" + fechaFinal +
                ", posicionAmarre=" + posicionAmarre +
                ", barco=" + barco +
                ", calculo del alquiler = " + this.devolverCalculoAlquiler()+
                '}';
    }
}
