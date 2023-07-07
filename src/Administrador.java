public class Administrador extends Funcionario implements Autenticable {

    @Override
    public double getBonificacion() {
        return 0;
    }

    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }
}
