package classesState;

import lab6.Pessoa;

public class TomarSegundaDose extends EstadoVacinacao {
	@Override
	public void alteraEstado(Pessoa pessoa) {
		pessoa.setEstadoVacinacao(new FinalizadaVacinacao());
		pessoa.atualizaEstadoVacina(pessoa);

	}
}
