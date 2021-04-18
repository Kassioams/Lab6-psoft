package classesState;

import lab6.Pessoa;

public class TomouPrimeiraDose extends EstadoVacinacao {

	@Override
	public void alteraEstado(Pessoa pessoa) {
		pessoa.setEstadoVacinacao(new TomarSegundaDose());
		pessoa.atualizaEstadoVacina(pessoa);
	}

	@Override
	public String toString() {
		return "A pessoa tomou a primeira dose";
	}
}
