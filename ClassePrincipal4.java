package diagrama.composicao;
public class ClassePrincipal4 {

	public static void main(String[] args) {
		Livro livro = new Livro("Colisão do Amor", "Bal Khabra");
		System.out.println("O autor do livro " + livro.getTitulo() + " é : " + livro.getAutor());

	}

}
