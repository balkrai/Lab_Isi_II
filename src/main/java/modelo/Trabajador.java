package modelo;

public class Trabajador {
    private String usuario, contrasenya;
    
    public Trabajador(String usuario, String contrasenya)
    {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
    }
    
    public static Trabajador IniciarSesion(String usu, String contra) 
    {
        return Camping.getInstancia().loginT(usu,contra);
    }
    
    public String getUsuario()
    {
        return usuario;
    }
    public String getContrasenya()
    {
        return contrasenya;
    }
}
