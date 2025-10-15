package relacaoClasses.agregacao;

public class ClassePrincipal3 {

	public static void main(String[] args) {

		Motor motor = new Motor("V8");
		Carro carro = new Carro("Mustang", motor);
		System.out.println("Carro é: " + carro.getModelo() + "Motor: " + motor.getTipo());

	}

}
