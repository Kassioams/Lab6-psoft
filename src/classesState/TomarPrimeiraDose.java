package classesState;

import java.util.List;

import lab6.Pessoa;

public class TomarPrimeiraDose extends EstadoVacinacao {

	@Override
	public void alteraEstado(Pessoa pessoa) {
		pessoa.setEstadoVacinacao(new TomouPrimeiraDose());
		pessoa.atualizaEstadoVacina(pessoa);
	}

}