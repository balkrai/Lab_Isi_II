package modelo;

public class ReservaActividad {
    private int dia, horas, minutos, segundos;
    private Cliente cliente;
    public ReservaActividad(int dia, int horas, int minutos, int segundos, 
            Cliente cliente)
    {
        this.dia = dia;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.cliente = cliente;
    }
    public Cliente getCliente()
    {
        return cliente;
    }
}
