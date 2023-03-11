import java.util.ArrayList;
import java.util.Collection;

public class Ator extends Pessoa{
    private String registro;
    private Collection<Filme> filmes = new ArrayList<>();
    public Ator(Diretor diretor) {
        this.diretor = diretor;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
