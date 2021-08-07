//1) Crie uma classe cliente e apresente os atributos e m�todos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias 
//deste objeto e apresente as informa��es deste objeto no console.

package ExercicioPPO;

import java.text.NumberFormat;

public class Cliente {

	//cria��o dos atributos da classe
	
	public String nome;
	public String bike;
	public double valor;
	public String modelo;
	public int ano;
	
	// cria��o do m�todo construtor
	
	public Cliente(String nome,String bike, double valor, String modelo, int ano)
	{
		this.nome = nome;
		this.bike = bike;
		this.valor = valor;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getBike() {
		return bike;
	}

	public void setBike(String bike) {
		this.bike = bike;
	}

	public String getModelo() {
		return modelo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //define a moeda padr�o do pais
		nf.setMinimumFractionDigits(2);//define a quantidade de casas depois da v�rgula
		String formatoMoeda = nf.format(valor);//formata a sa�da do sal�rio
		return formatoMoeda;
	}

	public void imprimirInfo()
	{
		System.out.println("\t\t ::: Compra ::: \n\n"
		 +"Cliente: " +nome	+ "\nBicicleta: "+bike
		 +"\nValor: " + valor+ "\nModelo: "+modelo+ "\nAno: " +ano);
	}
}
