
public class EstatisticaGolsChutes implements CalcularEstatisticas {
	
	int TotalGols = 0;
	
	private int getTotalGols(int golsTimeMandante, int golsTimeVisitante) {
		return golsTimeMandante + golsTimeVisitante;
	}
	
	@Override
	public String calcular (Jogo jogo) {
		TotalGols = getTotalGols(jogo.getGolsTimeMandante(), jogo.getGolsTimeVisitante());
		
		return "Total de gols no jogo: " + TotalGols  + System.lineSeparator() +
				"O time mandante fez " + jogo.getGolsTimeMandante() + " gols" + System.lineSeparator() +
				"O time visitante fez " + jogo.getGolsTimeVisitante() + " gols" + System.lineSeparator() +
				"O time mandante chutou " + jogo.getChutesAGolTimeMandante() + " vezes no gol" + System.lineSeparator() +
				"O time visitante chutou " + jogo.getChutesAGolTimeVisitante() + " vezes no gol" + System.lineSeparator();
	}
}
