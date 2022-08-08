import java.util.List;

public class ListagemUsuario {
	public static void main(String[] args) {

		Usuario u1 = new Usuario();

		u1.setId(1);
		u1.setNome("Kaleb");
		u1.setPontuacao(8);
		u1.setModerador(true);

		Usuario u2 = new Usuario();

		u2.setId(2);
		u2.setNome("Aninha");
		u2.setPontuacao(2);
		u2.setModerador(false);

		Usuario u3 = new Usuario();

		u3.setId(3);
		u3.setNome("Derick");
		u3.setPontuacao(0);
		u3.setModerador(false);

		Usuario u4 = new Usuario();

		u4.setId(4);
		u4.setNome("Irineu");
		u4.setPontuacao(10);
		u4.setModerador(false);

		Usuario u5 = new Usuario();

		u5.setId(5);
		u5.setNome("Paula");
		u5.setPontuacao(4);
		u5.setModerador(false);
		
		List<Usuario> lista=List.of(u1, u2, u3, u4, u5);

		System.out.println("Quantidade: " + lista.size());
		
		lista.forEach(e -> System.out.println("Nome: " + e.getNome()));
		
	}
}
