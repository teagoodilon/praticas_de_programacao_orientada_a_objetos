package carros;

import fabricaautomoveis.carros.Carro;
import fabricaautomoveis.carros.Categoria;

public class Argo extends Carro {

    public Argo(String cor) {
        super("Argo", Marca.FIAT, cor, 80000, Categoria.POPULAR);
    }
}
