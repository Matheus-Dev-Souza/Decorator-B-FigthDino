
public abstract class Armadura extends Componente {

	private Componente componente;

	public Armadura(Componente componente) {
		this.componente = componente;
	}

	public Componente getComponente() {
		return componente;
	}

	@Override
	public double getPoder() {

		return this.poder + this.componente.getPoder();
	}

	@Override
	public String getNome() {

		return this.componente.getNome() + ", " + this.nome;
	}

}
