package modelo;

public class Trabajador {
    int id;
    private String usuario, contrasenya;
    public Trabajador(){}
    public Trabajador(String usuario, String contrasenya)
    {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
    }
    public Trabajador(String usuario, String contrasenya, int id)
    {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.id = id;
    }
    
    public static Trabajador IniciarSesion(String usu, String contra) 
    {
        return Camping.getInstancia().loginT(usu,contra);
    }

    public int getId() {
        return id;
    }
    
    public String getUsuario()
    {
        return usuario;
    }
    public String getContrasenya()
    {
        return contrasenya;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }
    
    
}
