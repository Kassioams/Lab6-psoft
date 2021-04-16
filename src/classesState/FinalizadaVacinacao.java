package classesState;

import lab6.Pessoa;

public class FinalizadaVacinacao extends EstadoVacinacao {

	@Override
	public void alteraEstado(Pessoa pessoa) {
		System.out.println("Vacina finalizada. :D");
	}
}
