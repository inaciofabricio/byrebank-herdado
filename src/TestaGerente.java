
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		
		g.setNome("Jose");
		g.setCpf("12345678999");
		g.setSalario(5000);
		
		g.setSenha(2222);
		boolean autenticou = g.autentica(2222);
		
		System.out.println(autenticou);
		
		System.out.println(g.getNome());
		System.out.println(g.getCpf());
		System.out.println(g.getSalario());
		System.out.println(g.getBonificacao());
	}

}
