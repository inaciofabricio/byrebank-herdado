
public class TestaReferencia {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Jos�");
		g1.setSalario(5000);
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Maria");
		f1.setSalario(2000);
		
		EditorVideo e1 = new EditorVideo();
		f1.setNome("Josefa");
		f1.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(e1);
		
		System.out.println(controle.getSoma());
		
		
	}

}
