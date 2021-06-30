public abstract class Produto{

    private String nomeProduto;
    protected float preco;
    protected float precoFinal;

    public float getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(float precoFinal) {
        this.precoFinal = precoFinal;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String perfume) {
        this.nomeProduto = nomeProduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

   public abstract float calculaLucro();
    public abstract float calculaProdutos();

}