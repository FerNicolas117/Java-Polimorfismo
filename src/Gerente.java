// El gerente tambien corresponde a un fucionario del banco
// Gerente es o extiende de Funcionario
// Gerente ahora extiende de FuncionarioAutenticable
public class Gerente extends Autenticable {

    // Sobreescritura de metodo
    public double getBonificacion() {
        // Corresponde al 110% del salario.
        System.out.println("EJECUTANDO DESDE GERENTE!");
        return 2000;
    }
}
