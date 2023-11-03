package modelo;

public class Tienda {
    private String nombre;
    private int m2;
    private Parcela parcela;
    public Tienda(String nombre, int m2)
    {
        this.nombre = nombre;
        this.m2 = m2;
        this.parcela = parcela;
    }
    public String getNombre()
    {
        return nombre;
    }
    public int getm2()
    {
        return m2;
    }
    public Parcela getParcela()
    {
        return parcela;
    }
}
