package modelo;

public class Tienda {
    private String nombre;
    private int m2, id;
    //private Parcela parcela;
    public Tienda() {}
    public Tienda(String nombre, int m2, int id)
    {
        this.nombre = nombre;
        this.m2 = m2;
        this.id = id;
    }
    public String getNombre()
    {
        return nombre;
    }
    public int getm2()
    {
        return m2;
    }
    public int getIdTienda()
    {
        return id;
    }
    public void setIdTienda(int id)
    {
        this.id = id;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setm2(int m2)
    {
        this.m2 = m2;
    }
    /*public Parcela getParcela()
    {
        return parcela;
    }*/
}
