

public class Main {
	public static void main(String[] args) {
		EstatisticaTempoJogo etp = new EstatisticaTempoJogo();
		EstatisticaGolsChutes egc = new EstatisticaGolsChutes();
		EstatisticaFaltasCartoes efc = new EstatisticaFaltasCartoes();
	
		Jogo jogo = new Jogo(2, 4, 21, 30, 10, 22, 18, 20, 70, 96, 32, 1, 0, 24, 1, 1);
		GerenciadorEstatisticas gerenciador = new GerenciadorEstatisticas();
		System.out.println(gerenciador.Calcular(etp, jogo));
		System.out.println(gerenciador.Calcular(egc, jogo));
		System.out.println(gerenciador.Calcular(efc, jogo));

	}

}
