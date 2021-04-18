package classesState;

import lab6.Pessoa;

public class FinalizadaVacinacao extends EstadoVacinacao {

	@Override
	public void alteraEstado(Pessoa pessoa) {
	}

	@Override
	public String toString() {
		return "Vacina finalizada. :D";
	}
}
