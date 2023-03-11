public class app2 {
    public static void main(String[] args) {
        Ator a1 = new Ator("José");
        Ator a2 = new Ator("Maria");
        Ator a3 = new Ator("João");

        Genero g1 = new Genero("Ficção Científica");
        Genero g2 = new Genero("Terror");

        Diretor d1 = new Diretor("James");
        Diretor d2 = new Diretor("Diana");
        d2.setQuantidadePremios(14);

        Filme f1 = new Filme(g1, d2, a1);
        f1.setNome("Matrix");
        f1.addAtor(a2);
        f1.addAtor(a3);

        f1.imprimirInformacoes();
    }
}
