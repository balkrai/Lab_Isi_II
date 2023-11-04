package modelo;

public class Parcela {
    private int id, m2;
    private Boolean luz;
    private float precio;
    //private String imagen;
    public Parcela(int id, int m2, Boolean luz, float precio/*, String imagen*/)
    {
        this.id = id;
        this.m2 = m2;
        this.luz = luz;
        this.precio = precio;
        //this.imagen = imagen;
    }
    public int getId()
    {
        return id;
    }
    public int getm2()
    {
        return m2;
    }
    public Boolean getLuz()
    {
        return luz;
    }
    public float getPrecio()
    {
        return precio;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setm2(int m2)
    {
        this.m2 = m2;
    }
    public void setLuz(Boolean luz)
    {
        this.luz = luz;
    }
    public void setPrecio(float precio)
    {
        this.precio = precio;
    }
}
