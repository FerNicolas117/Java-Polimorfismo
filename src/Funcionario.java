// Un funcionario es cualquier trabajador del banco
public abstract class Funcionario {

    // Funcionario va a contar con 3 atributos
    private String nombre;
    private String documento;
    private double salario;
    private int tipo;

    // Metodo constructor
    // Los constructores defaul, son aquellos que no reciben parametros
    public Funcionario() {

    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    // Metodo de bonificacion basado en un 10% de su salrio
    /* Como Funcionario es una clase abstracta, esta no deberia tener
       una propia regla para la bonificacion */
    // Gerente y Contador definen su propia bonificacion (polimorfimso).
    public abstract double getBonificacion();
}
