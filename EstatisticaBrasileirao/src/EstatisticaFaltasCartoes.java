
public class EstatisticaFaltasCartoes implements CalcularEstatisticas {
	
	int TotalFaltas = 0;
	double PorcentagemFaltasTimeVisitante = 0;
	double PorcentagemFaltasTimeMandante = 0;

	private int getTotalFaltas(int totalFaltasTimeVisitante, int totalFaltasTimeMandante) {
		return totalFaltasTimeVisitante + totalFaltasTimeMandante;
	}
	
	private double getPorcentagemFaltasTimeVisitante(int totalFaltasTimeVisitante, int TotalFaltas) {
		return ((double)totalFaltasTimeVisitante / TotalFaltas) * 100;
	}
	
	private double getPorcentagemFaltasTimeMandante(int totalFaltasTimeMandante, int TotalFaltas) {
		return ((double)totalFaltasTimeMandante / TotalFaltas) * 100;
	}

	@Override
	public String calcular(Jogo jogo) {
		TotalFaltas = getTotalFaltas(jogo.getFaltasTimeVisitante(), jogo.getFaltasTimeMandante());
		
		PorcentagemFaltasTimeVisitante = getPorcentagemFaltasTimeVisitante(jogo.getFaltasTimeVisitante(), TotalFaltas); 
		
		PorcentagemFaltasTimeMandante = getPorcentagemFaltasTimeMandante(jogo.getFaltasTimeMandante(), TotalFaltas);
		
		return "Total de Faltas: " + TotalFaltas + System.lineSeparator() +
				"O time mandante teve " + PorcentagemFaltasTimeMandante + "% das faltas do jogo" + System.lineSeparator() +
				"O time visitante teve " + PorcentagemFaltasTimeVisitante + "% das faltas do jogo" + System.lineSeparator() +
				"Total de cartões amarelos do time visitante: " + jogo.getCartoesAmarelosVisitante() + System.lineSeparator() +
				"Total de cartões vermelhos do time visitante: " + jogo.getCartoesVermelhosVisitante() + System.lineSeparator() +
				"Total de cartões amarelos do time mandante: " + jogo.getCartoesAmarelosMandante() + System.lineSeparator() +
				"Total de cartões vermelhos do time mandante: " + jogo.getCartoesVermelhosMandante() + System.lineSeparator();
		
	}
}
