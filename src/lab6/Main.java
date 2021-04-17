package lab6;

import java.util.HashMap;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		HashMap<String, Pessoa> mapaPessoas = new HashMap<String, Pessoa>();

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n Sistema de vacinação COVID-19 \n" + "(1) - Cadastrar no sistema\n"
					+ "(2) - Atualizar cadastro \n" + "(3) - Checar pessoa \n" + "(4) - Sair");

			int opcao = sc.nextInt();
			if (opcao == 1) {
				System.out.println("Digite seu nome:");
				String nome = sc.next();
				System.out.println("Digite seu cpf:");
				String cpf = sc.next();
				System.out.println("Digite seu endereço:");
				String endereco = sc.next();
				System.out.println("Digite o numero do seu cartão do SUS:");
				String cartaoSUS = sc.next();
				System.out.println("Digite seu e-mail:");
				String email = sc.next();
				System.out.println("Digite seu telefone:");
				String telefone = sc.next();
				System.out.println("Digite sua profissão:");
				String profissao = sc.next();
				System.out.println("Digite sua comorbidade:");
				String comorbidade = sc.next();
				System.out.println("Digite sua idade:");
				int idade = sc.nextInt();

				Pessoa pessoa = new Pessoa(nome, cpf, endereco, cartaoSUS, email, telefone, profissao, comorbidade,
						idade);
				mapaPessoas.put(cpf, pessoa);

				System.out.println("Cadastro concluido");
				pessoa.atualizaEstadoVacina(pessoa);

			} else if (opcao == 2) {
				System.out.println("Digite seu cpf:");
				String cpf = sc.next();
				if (!mapaPessoas.containsKey(cpf)) {
					System.out.println("Pessoa não cadastrada");
					break;
				}

				System.out.println("Digite qual dado você deseja alterar:");
				String dado = sc.next();
				System.out.println("Digite o novo dado:");
				String novo = sc.next();

				Pessoa pessoa = mapaPessoas.get(cpf);

				switch (dado) {
				case "nome":
					pessoa.setNome(novo);
					System.out.println("Nome alterado com sucesso. \n");
					System.out.println("A situação da vacinação é:");
					pessoa.atualizaEstadoVacina(pessoa);
					break;
					
				case "cpf":
					pessoa.setCpf(novo);
					System.out.println("Cpf alterado com sucesso. \n");
					System.out.println("A situação da vacinação é:");
					pessoa.atualizaEstadoVacina(pessoa);
					break;
					
				case "endereco":
					pessoa.setEndereco(novo);
					System.out.println("Endereço alterado com sucesso. \n");
					System.out.println("A situação da vacinação é:");
					pessoa.atualizaEstadoVacina(pessoa);
					break;
					
				case "cartao do sus":
					pessoa.setCartaoSUS(novo);
					System.out.println("Cartão do SUS alterado com sucesso. \n");
					System.out.println("A situação da vacinação é:");
					pessoa.atualizaEstadoVacina(pessoa);
					break;
					
				case "email":
					pessoa.setEmail(novo);
					System.out.println("Email alterado com sucesso.\n");
					System.out.println("A situação da vacinação é:");
					pessoa.atualizaEstadoVacina(pessoa);
					break;
					
				case "telefone":
					pessoa.setTelefone(novo);
					System.out.println("Telefone alterado com sucesso. \n");
					System.out.println("A situação da vacinação é:");
					pessoa.atualizaEstadoVacina(pessoa);
					break;
					
				case "profissao":
					pessoa.setProfissao(novo);
					System.out.println("Profissão alterada com sucesso. \n");
					System.out.println("A situação da vacinação é:");
					pessoa.atualizaEstadoVacina(pessoa);
					break;
					
				case "comorbidade":
					pessoa.setComorbidade(novo);
					System.out.println("Comorbidade alterada com sucesso. \n");
					System.out.println("A situação da vacinação é:");
					pessoa.atualizaEstadoVacina(pessoa);
					break;
					
				case "idade":
					int idade = Integer.parseInt(novo);
					pessoa.setIdade(idade);
					System.out.println("Idade alterada com sucesso. \n");
					System.out.println("A situação da vacinação é:");
					pessoa.atualizaEstadoVacina(pessoa);
					break;
					
				default:
					System.out.println("Opção indisponível.");
					break;
				}

			} else if (opcao == 3) {
				System.out.println("Digite o cpf:");
				String cpf = sc.next();
				if (mapaPessoas.containsKey(cpf)) {
					System.out.println("A situação da vacinação é: \n");
					mapaPessoas.get(cpf).atualizaEstadoVacina(mapaPessoas.get(cpf));
				} else {
					System.out.println("Cadastro não encontrado.");
				}

			} else if (opcao == 4) {
				System.out.println("Saindo do Sistema.");
				break;

			} else {
				System.out.println("Opção não encontrada.");
				break;
			}
		}
	}
}