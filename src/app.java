public class app {

    public static void main(String[] args) {

        Genero ficcaoCientifica = new Genero("Ficção Científica");

        Diretor diretorAvatar = new Diretor("James Cameron");
        Diretor diretorMatrix = new Diretor("Irmãs ...");


        Filme f1 = new Filme(ficcaoCientifica);
        f1.setNome("Avatar");
        f1.setAnoLancamento(2009);
        f1.setNota(8);

        System.out.println(f1);
        System.out.println(f1.getNome());
        System.out.println(f1.getGenero().getNome());

    }
}
