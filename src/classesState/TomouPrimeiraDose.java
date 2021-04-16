package classesState;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lab6.Pessoa;

public class TomouPrimeiraDose extends EstadoVacinacao {

	private LocalDate dataPrimeira = LocalDate.now();

	@Override
	public void alteraEstado(Pessoa pessoa) {
		LocalDate dataAtual = LocalDate.now();
		long diasPrimeiraDose = ChronoUnit.DAYS.between(dataPrimeira, dataAtual);
		if (diasPrimeiraDose >= 20) {
			pessoa.setEstadoVacinacao(new TomarSegundaDose());
			pessoa.atualizaEstadoVacina(pessoa);
		}
	}
}
