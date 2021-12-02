package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Controle {
	List<Carro> produtos = new ArrayList<>();
}
public void adicionar(Carro car) {
    produtos.add(car);
}

public void listaCarros() {
    produtos.forEach((p) -> {
        System.out.println("Modelo: " + p.getModelo());
        System.out.println("Plaaca: " + p.getPlaca());
        System.out.println("Preço: " + p.getPreco());
        System.out.println("-----------------------------");
    });
}