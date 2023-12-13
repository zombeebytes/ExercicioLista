package aula1312;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFIla {

	public static void main(String[] args) {
//		Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, 
//		para organizar a ordem de chegada dos Clientes de um Banco. 
//		O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
//			1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
//			2: Listar todos os Clientes na fila
//			3: Chamar (retirar) uma pessoa da fila 
//			0: O programa deve ser finalizado. 
//			Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..

		Queue<String> filaBanco = new LinkedList<>();
		Scanner leia = new Scanner(System.in);
		int opcao = -1;
		do {
			
			System.out.println("|_*_*_*_*_*_*_*_*_ Menu _*_*_*_*_*_*_*_*_|");
			System.out.println("|-----------Digite uma opção-------------|");
			System.out.println("|                                        |");
			System.out.println("|1 - Adicionar cliente na fila           |");
			System.out.println("|2 - Listar todos os clientes            |");
			System.out.println("|3 - Retirar cliente da fila             |");
			System.out.println("|0 - Sair                                |");
			System.out.println("|                                        |");
			System.out.println("|*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_|");
			System.out.println("\n                                       |");
		
			opcao = leia.nextInt();
			leia.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do cliente: ");
				String nomeCliente = leia.nextLine();
				filaBanco.add(nomeCliente);
				System.out.println("Cliente adicionado à fila");
				leia.nextLine();
				nomeCliente = leia.nextLine();
				break;
			case 2:
				if (filaBanco.isEmpty()) {
					System.out.println("A fila está vazia");		
					leia.nextLine();
				} else {
					System.out.println("Há clientes na fila");
					for (String cliente : filaBanco) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if (filaBanco.isEmpty()) {
					System.out.println("A fila está vazia");
				} else {
					String clienteChamado = filaBanco.poll();
					System.out.println("Cliente" + clienteChamado);

				}
				break;
			case 0:
				System.out.println("Programa finalizado");
				break;
			}
			System.out.println("Opção inválida. Tente de novo.");
			break;
		}while (opcao != 0);
		}
		
	}
	
		
	
