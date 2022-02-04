package relacionamento;

public class Empregado {

	private String nome;
	private int codigo;
	private Endereco endereco;

	public Empregado(String nome, int codigo, Endereco endereco) {
		this.nome = nome;
		this.codigo = codigo;
		this.endereco = endereco;
	}

	public void apresentar() {
		System.out.println("Codigo: " + this.getCodigo());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Cidade: " + endereco.getCidade());
		System.out.print("Pais: " + endereco.getPais());
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public Endereco getEndereco() {
		return endereco;
	}
}
