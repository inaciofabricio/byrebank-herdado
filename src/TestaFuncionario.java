
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("José Silva");
		funcionario.setCpf("123.123.123.99");
		funcionario.setSalario(1000);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCpf());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getBonificacao());
		
		System.out.println();
		
		Gerente gerente = new Gerente();
		gerente.setNome("Manoel de Almeida");
		gerente.setCpf("987.654.321.99");
		gerente.setSalario(5000);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacao());
	
		gerente.setSenha(2587);
		
		System.out.println(gerente.autentica(2587));
		
		
	}

}

