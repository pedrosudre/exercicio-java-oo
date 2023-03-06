public class Diretor extends Pessoa{
    private Integer quantidadePremios;

    public Diretor(Ator ator) {
        this.ator = ator;
    }

    private Ator ator;

    public Integer getQuantidadePremios() {
        return quantidadePremios;
    }

    public void setQuantidadePremios(Integer quantidadePremios) {
        this.quantidadePremios = quantidadePremios;
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }
}
