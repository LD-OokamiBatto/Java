package exercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public static void main(String[] args){ 
	Scanner dados = new Scanner(System.in);
    Scanner dados1 = new Scanner(System.in);
    Scanner dados2 = new Scanner(System.in);
    ProdutoController produtoController = new ProdutoController();
    CadastroProduto c1 = new CadastroProduto();

    String modelo = "";
    String placa = "";
    double preco = 0;
    System.out.print(
            "Opçoes\n 1-Cadastrar carro\n 2-Remover carro\n 3-Verificar carros\n 4-Dinheiro\n");
    int values = 0;
    System.out.print(
            "nº: ");
    numopc = dados.nextInt();
    while (values
            == 1) {
        switch (values) {
            case 1:
                System.out.println("Modelo do carro: ");
                modelo = dados1.nextLine();
                c1.setModelo(modelo);

                System.out.println("Placa do carro: ");
                placa = dados2.nextLine();
                c1.setPlaca(placa);

                System.out.println("Preço do carro: ");
                preco = dados.nextDouble();
                c1.setPreco(preco);

                System.out.println("\n Cadastrar mais carros?\n  1-Sim\n  0-Não\n");
                numopc = dados.nextInt();

                produtoController.adicionar(c1);
                c1 = new CadastroProduto();
                break;
            case 2:
                break;
        }
    }
    Controle.listaCarros();
}