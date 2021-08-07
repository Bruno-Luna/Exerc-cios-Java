//1) Crie uma classe cliente e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias 
//deste objeto e apresente as informações deste objeto no console.

package ExercicioPPO;

public class Cliente {

	//criação dos atributos da classe
	
	public String bike;
	public String modelo;
	public int ano;
	
	// criação do método construtor
	
	public Cliente(String bike, String modelo, int ano)
	{
		this.bike = bike;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\t\t :: Bicicleta ::"
				+ "\n Bicicleta "+bike+ ", modelo "+modelo+ " e ano " +ano);
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

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
