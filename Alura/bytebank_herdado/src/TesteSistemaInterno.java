public class TesteSistemaInterno {

       public static void main(String[] args) {
        Gerente comercial = new Gerente();
        comercial.setSenha(2020);

        Administrador admin = new Administrador();
        admin.setSenha(2021);

        SistemaInterno si = new SistemaInterno();
        si.autentica(comercial);
        si.autentica(admin);
    }
}
