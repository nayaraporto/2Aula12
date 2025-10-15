package diagrama.agregacao;

public class ClassePrincipal5 {

	public static void main(String[] args) {
		
		Departamento departamento = new Departamento("Projetos");
		Empresa empresa = new Empresa("MindMachines", departamento);
		
		System.out.println("A empresa " + empresa.getNome() + " possui o departamento " + departamento.getNome());

	}

}
