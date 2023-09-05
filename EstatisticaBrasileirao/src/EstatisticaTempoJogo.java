

public class EstatisticaTempoJogo implements CalcularEstatisticas {
	
	double PosseBolaTimeVisitanteDefesaEmPorcentagem = 0;
	double PosseBolaTimeVisitanteAtaqueEmPorcentagem = 0;
	double PosseBolaTimeMandanteDefesaEmPorcentagem = 0;
	double PosseBolaTimeMandanteAtaqueEmPorcentagem = 0;
	double TempoTotalBolaRolandoEmPorcentagem = 0;
	
	private double getPosseBolaTimeVisitanteDefesaEmPorcentagem(int posseBolaTimeVisitanteDefesaEmMin, int posseBolaTimeVisitanteAtaqueEmMin) {
		return (posseBolaTimeVisitanteDefesaEmMin / (posseBolaTimeVisitanteDefesaEmMin + posseBolaTimeVisitanteAtaqueEmMin)) * 100;
	}

	private double getPosseBolaTimeVisitanteAtaqueEmPorcentagem(int posseBolaTimeVisitanteDefesaEmMin, int posseBolaTimeVisitanteAtaqueEmMin) {
		return (posseBolaTimeVisitanteAtaqueEmMin / (posseBolaTimeVisitanteDefesaEmMin + posseBolaTimeVisitanteAtaqueEmMin)) * 100;
	}

	private double getPosseBolaTimeMandanteDefesaEmPorcentagem(int posseBolaTimeMandanteDefesaEmMin, int posseBolaTimeMandanteAtaqueEmMin) {
		return (posseBolaTimeMandanteDefesaEmMin / (posseBolaTimeMandanteDefesaEmMin + posseBolaTimeMandanteAtaqueEmMin)) * 100;
	}

	private double getPosseBolaTimeMandanteAtaqueEmPorcentagem(int posseBolaTimeMandanteDefesaEmMin, int posseBolaTimeMandanteAtaqueEmMin) {
		return (posseBolaTimeMandanteAtaqueEmMin / (posseBolaTimeMandanteDefesaEmMin + posseBolaTimeMandanteAtaqueEmMin)) * 100;
	}

	private double getTempoTotalBolaRolandoEmPorcentagem(int tempoTotalBolaRolandoEmMin, int tempoTotalJogoEmMin) {
		return (tempoTotalBolaRolandoEmMin / tempoTotalJogoEmMin) * 100;
	}
	
	@Override
	public String calcular (Jogo jogo) {
		PosseBolaTimeVisitanteDefesaEmPorcentagem = getPosseBolaTimeVisitanteDefesaEmPorcentagem(jogo.getPosseBolaTimeVisitanteDefesaEmMin(), 
																								 jogo.getPosseBolaTimeVisitanteAtaqueEmMin());
		
		PosseBolaTimeVisitanteAtaqueEmPorcentagem = getPosseBolaTimeVisitanteAtaqueEmPorcentagem(jogo.getPosseBolaTimeVisitanteDefesaEmMin(), 
																								 jogo.getPosseBolaTimeVisitanteAtaqueEmMin());
		
		PosseBolaTimeMandanteDefesaEmPorcentagem = getPosseBolaTimeMandanteDefesaEmPorcentagem(jogo.getPosseBolaTimeMandanteDefesaEmMin(),
																							   jogo.getPosseBolaTimeMandanteAtaqueEmMin());
		
		PosseBolaTimeMandanteAtaqueEmPorcentagem = getPosseBolaTimeMandanteAtaqueEmPorcentagem(jogo.getPosseBolaTimeMandanteDefesaEmMin(),
		  																					   jogo.getPosseBolaTimeMandanteAtaqueEmMin());
		
		TempoTotalBolaRolandoEmPorcentagem = getTempoTotalBolaRolandoEmPorcentagem(jogo.getTempoTotalBolaRolandoEmMin(),
																				   jogo.getTempoTotalJogoEmMin());
		
		return "A bola ficou rolando por " + TempoTotalBolaRolandoEmPorcentagem + "% do tempo de jogo" + System.lineSeparator() +
				"O time mandante ficou " + PosseBolaTimeMandanteDefesaEmPorcentagem + "% do tempo de jogo na defesa" + System.lineSeparator() +
				"O time mandante ficou " + PosseBolaTimeMandanteAtaqueEmPorcentagem + "% do tempo de jogo no ataque" + System.lineSeparator() +
				"O time visitante ficou " + PosseBolaTimeVisitanteDefesaEmPorcentagem + "% do tempo de jogo na defesa" + System.lineSeparator() +
				"O time visitante ficou " + PosseBolaTimeVisitanteAtaqueEmPorcentagem + "% do tempo de jogo no ataque" + System.lineSeparator();
		
	}	
}
