package classesState;


import lab6.Pessoa;

public class TomarPrimeiraDose extends EstadoVacinacao {

	@Override
	public void alteraEstado(Pessoa pessoa) {
		pessoa.setEstadoVacinacao(new TomouPrimeiraDose());
		pessoa.atualizaEstadoVacina(pessoa);
	}

	@Override
	public String toString() {
		return "A pessoa irá tomar a primeira dose.";
	}

}