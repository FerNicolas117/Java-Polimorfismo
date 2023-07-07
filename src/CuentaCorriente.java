public class CuentaCorriente extends Cuenta {

    /* Como la clase cuanta requiere necesariamente de una agencia y un
       numero, tambien en la clase CuentaCorriente debe de seguir la misma regla
       de negocio, por lo tanto, como "super" invoca al metodo constructor de la
       super clase, y no hay un constructor default, tenemos que pasarle los parametros
       del mismo tipo de dato */

    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    /* Esto es polimorfismo, ya que tiene su propia logica
       sobreescribiendo el metodo de la clase madre */
    @Override // Confirma que el metodo se esta sobreescribiendo
    public boolean saca(double valor) {
        // Comision de retiro o transferencia de 20 centavos
        double comision = 0.2;
        return super.saca(valor + comision);
    }


}
