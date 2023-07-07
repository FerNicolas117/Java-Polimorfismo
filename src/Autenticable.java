// Esta es una superclase
public abstract class Autenticable extends Funcionario {

    // Atributos
    private String clave;

    //Metodos
    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave) {
        return clave == "AluraCursosOnLine";
    }
}
