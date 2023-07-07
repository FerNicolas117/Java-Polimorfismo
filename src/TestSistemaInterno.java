public class TestSistemaInterno {

    public static void main(String[] args) {

        SistemaInterno sistemaInterno = new SistemaInterno();
        Gerente gerente1 = new Gerente();
        Administrador admin = new Administrador();

        sistemaInterno.auntentica(gerente1);
        sistemaInterno.auntentica(admin);
    }
}
