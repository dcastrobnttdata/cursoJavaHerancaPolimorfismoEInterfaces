//Gerente eh um funcionario, Gerente herda da classe Funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Designer");
		return 200;
	}
	
}
