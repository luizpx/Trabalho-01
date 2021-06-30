import java.util.List;

public class LucroTotal extends Lucro{

    public static float calculaTotalLucro(List<Produto> produtos) {

        float totalLucro = 0f;

        for (Produto produto : produtos) {
            totalLucro += produto.calculaLucro();
        }
        return totalLucro;
    }

    public static float calculaTotalProdutos(List<Produto> produtos) {

        float totalProdutos = 0f;

        for (Produto produto: produtos) {
            totalProdutos += produto.calculaProdutos();
        }
        return totalProdutos;
    }
}
