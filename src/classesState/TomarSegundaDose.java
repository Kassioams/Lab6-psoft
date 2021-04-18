package classesState;

import lab6.Pessoa;

public class TomarSegundaDose extends EstadoVacinacao {
	@Override
	public void alteraEstado(Pessoa pessoa) {
		pessoa.setEstadoVacinacao(new FinalizadaVacinacao());
		pessoa.atualizaEstadoVacina(pessoa);

	}

	@Override
	public String toString() {
		return "A pessoa irá tomar a segunda dose.";
	}
}
