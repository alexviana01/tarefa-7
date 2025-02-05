package alexViana;

//Classe que representa um objeto do mundo real: Carro
	public class Carro {
	    // Propriedades (atributos) do carro
	    private String modelo;
	    private String cor;
	    private int ano;
	    private double velocidade;

	    // Construtor da classe Carro para inicializar o objeto
	    public Carro(String modelo, String cor, int ano) {
	        this.modelo = modelo;
	        this.cor = cor;
	        this.ano = ano;
	        this.velocidade = 0.0; // O carro começa parado
	    }

	    // Método para acelerar o carro
	    public void acelerar(double incremento) {
	        if (incremento > 0) {
	            velocidade += incremento;
	            System.out.println("O carro acelerou para " + velocidade + " km/h.");
	        } else {
	            System.out.println("O incremento deve ser positivo.");
	        }
	    }

	    // Método para frear o carro
	    public void frear(double decremento) {
	        if (decremento > 0 && velocidade >= decremento) {
	            velocidade -= decremento;
	            System.out.println("O carro reduziu para " + velocidade + " km/h.");
	        } else if (decremento > 0) {
	            velocidade = 0;
	            System.out.println("O carro parou.");
	        } else {
	            System.out.println("O decremento deve ser positivo.");
	        }
	    }

	    // Método para exibir informações do carro
	    public void exibirInformacoes() {
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Cor: " + cor);
	        System.out.println("Ano: " + ano);
	        System.out.println("Velocidade atual: " + velocidade + " km/h");
	    }

	    // Método principal para testar a classe Carro
	    public static void main(String[] args) {
	        Carro meuCarro = new Carro("Toyota Corolla", "Prata", 2020);
	        meuCarro.exibirInformacoes();
	        meuCarro.acelerar(50);
	        meuCarro.frear(20);
	        meuCarro.exibirInformacoes();
	    }
	}

