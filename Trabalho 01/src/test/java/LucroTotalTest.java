import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LucroTotalTest {

    @Test
    void calculaTotalLucro() {

        Lucro produto1 = new Lucro();
        produto1.setNomeProduto("Perfume");
        produto1.setPorcentagemLucro(50);
        produto1.setPreco(2000);

        Lucro produto2 = new Lucro();
        produto2.setNomeProduto("Camisa");
        produto2.setPorcentagemLucro(50);
        produto2.setPreco(100);

        List<Produto> lista = new ArrayList<Produto>();
        lista.add(produto1);
        lista.add(produto2);

        LucroTotal lucro = new LucroTotal();
        assertEquals(1050.0f, lucro.calculaTotalLucro(lista));

    }

    @Test
    void calculaTotalProdutos() {

        Lucro produto1 = new Lucro();
        produto1.setNomeProduto("Perfume");
        produto1.setPorcentagemLucro(50);
        produto1.setPreco(2000);

        Lucro produto2 = new Lucro();
        produto2.setNomeProduto("Camisa");
        produto2.setPorcentagemLucro(50);
        produto2.setPreco(100);

        List<Produto> lista = new ArrayList<Produto>();
        lista.add(produto1);
        lista.add(produto2);

        LucroTotal lucro = new LucroTotal();
        assertEquals(3150.0f, lucro.calculaTotalProdutos(lista));
    }
}