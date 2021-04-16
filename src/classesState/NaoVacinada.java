package classesState;

import java.util.Arrays;
import java.util.List;

import lab6.Pessoa;

public class NaoVacinada extends EstadoVacinacao {

	private List<String> comorbidadesPrioritarias = Arrays.asList("Diabetes mellitus", "Pneumopatias crônicas graves",
			"Hipertensão", "Problemas de coração", "Doença cerebrovascular", "Doença renal crônica",
			"Anemia falciforme", "Obesidade mórbida", "Síndrome de down", "HIV", "Cirrose hepática");
	private List<String> profissoesPrioritarias = Arrays.asList("Médico", "Serviços Gerais: Hospital", "Professor",
			"Dentista", "Enfermeiro");

	@Override
	public void alteraEstado(Pessoa pessoa) {

		if (pessoa.getIdade() > 65 | comorbidadesPrioritarias.contains(pessoa.getComorbidade())
				| profissoesPrioritarias.contains(pessoa.getProfissao())) {
			System.out.println("Você está habilitado(a) para tomar a primeira dose.");
			pessoa.setEstadoVacinacao(new TomarPrimeiraDose());
			pessoa.atualizaEstadoVacina(pessoa);

		} else
			System.out.println("Você não está habilitado(a) para tomar a primeira dose.");

	}
}
