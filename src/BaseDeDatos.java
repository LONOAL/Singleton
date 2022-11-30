public class BaseDeDatos {
    private String usuario;
    private String token;

    private BaseDeDatos() {}

    private static BaseDeDatos instance = null;

    public static BaseDeDatos getInstance() {
        if (instance == null) {
            // desde aqui si que puedo acceder al constructor
            // porque estoy en la misma clase
            instance = new BaseDeDatos();
        }
        return instance;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getToken() {
        return token;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return
                " usuario=" + usuario +
                        " token=" + token
                ;
    }
}
