public class Ator extends Pessoa{
    private String registro;

    public Ator(Diretor diretor) {
        this.diretor = diretor;
    }

    private Diretor diretor;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }
}
