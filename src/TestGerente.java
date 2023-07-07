public class TestGerente {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setSalario(6000);
        gerente.setClave("AluraCursosOnLine");
        gerente.setTipo(1);

        System.out.println("Bonificacion de gerente: " + gerente.getBonificacion());
        System.out.println("Acceso: " + gerente.iniciarSesion("AluraCursosOnLine"));
    }
}
