
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();		
		
		Gerente diego = new Gerente();
		diego.setNome("Diego Barcellos");
		diego.setCpf("123456789-01");
		diego.setSalario(2700.00);
		
		System.out.println(diego.getNome());
		System.out.println(diego.getBonificacao());
		
		//diego.salario = 300.0;

	}

}
