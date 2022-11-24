
public class Teste {

	public static void main(String[] args) {

		Componente c = new NadArme();
		c = new OlhoLuz(c);
		c = new MordVeliz(c);
		c = new MordVeliz(c);
		c = new OlhoLuz(c);

		System.out.println(c.getPoder());
		System.out.println(c.getNome());

	}

}
