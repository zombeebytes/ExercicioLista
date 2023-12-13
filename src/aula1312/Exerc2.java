package aula1312;

import java.util.Scanner;
import java.util.Stack;

public class Exerc2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, para organizar a retirada de livros em uma pilha. 
//		O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
//			1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
//			2: Listar todos os livros da Pilha
//			3: Retirar um livro da pilha 
//			0: O programa deve ser finalizado. 
//			Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.
		
		 Stack<String> pilhaLivros = new Stack<>();
		 Scanner leia = new Scanner(System.in);
		 int opcao = -1;
		 String livro = null;
		 while (opcao !=0) {
				System.out.println("|_*_*_*_*_*_*_*_*_ Menu _*_*_*_*_*_*_*_*_|");
				System.out.println("|-----------Digite uma opção-------------|");
				System.out.println("|                                        |");
				System.out.println("|1 - Adicionar novo livro na fila        |");
				System.out.println("|2 - Listar todos os livros              |");
				System.out.println("|3 - Retirar um livro da fila            |");
				System.out.println("|0 - Sair                                |");
				System.out.println("|                                        |");
				System.out.println("|*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_|");
				System.out.println("\n                                       |");
		 opcao = leia.nextInt();
		 switch (opcao) {
		 case 1:
		 System.out.print("Digite o nome do livro: ");
		 String livro1 = leia.nextLine();
		 pilhaLivros.add(livro1);
			
		 pilhaLivros.push(livro1);
			
		 System.out.println("Livro adicionado na pilha.");
		 break;
		 case 2:
		 if (pilhaLivros.isEmpty()) {
		 System.out.println("A pilha está vazia.");
		 } else {
		 System.out.println("Livros na pilha:");
		 for (String livroPilha : pilhaLivros) {
		 System.out.println(livroPilha);
		 }
		 }
		 break;
		 case 3:
		 if (pilhaLivros.isEmpty()) {
		 System.out.println("A pilha está vazia.");
		 } else {
		 String livroRetirado = pilhaLivros.pop();
		 System.out.println("Livro retirado: " + livroRetirado);
		 }
		 break;
		 case 0:
		 System.out.println("Opção inválida.");
		 break;
		 }
		 System.out.println();
		 }
		 leia.close();
		 }
		

	}

