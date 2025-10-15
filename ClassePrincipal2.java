package relacaoClasses.associacao;

public class ClassePrincipal2 {

	public static void main(String[] args) {
		Universidade universidade = new Universidade("USP");
		Estudante estudante = new Estudante("Nay", universidade);
		System.out.println("Estudante: " + estudante.getNome() + "universidade: " + universidade.getNome());
	}

}
