package exercicio1;

public class Carro {

    private String modelo;
    private String placa;
    private double preco;

    public String getModelo() {
        return modelo;
    }
    public String getTamanho() {
        return placa;
    }
    public double getPreco() {
        return preco;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
		return null;
	}
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}