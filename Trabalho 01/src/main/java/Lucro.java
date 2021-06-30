public class Lucro extends Produto {

    private int porcentagemLucro;

    public int getPorcentagemLucro() {
        return porcentagemLucro;
    }

    public void setPorcentagemLucro(int porcentagemLucro) {
        this.porcentagemLucro = porcentagemLucro;
    }

    public float calculaLucro() {
        return porcentagemLucro * preco / 100;
    }

    public float calculaProdutos() {
        return precoFinal = (porcentagemLucro * preco / 100) + preco;
    }
}