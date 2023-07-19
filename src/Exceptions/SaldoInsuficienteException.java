package Exceptions;
public class SaldoInsuficienteException extends RuntimeException {

    /**Se declara el constructor de SaldoInsuficienteException y cada vez que
     * se lance esa excepcion le vamos a mandar un mensaje y el medianete el construcctor de la
     * clase padrea (RuntimeException) el va a settear dicho mensaje
     */
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
