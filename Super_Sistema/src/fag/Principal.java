package fag;

import Metodos.Jogos;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
	
	static List<Jogos> biblioteca = new ArrayList <>();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String args[]) {
		aBiblioteca();
		mostrarMenu();
	}
		public static void mostrarMenu() {
			int escolha = 10000;
			do {
			System.out.println("-----Bem-vindos-----");
			System.out.println("aqui a melhor loja de videogames do mundo");
			System.out.println("digite uma opção abaixo");
			System.out.println("1-cadastrar novo jogo");
			System.out.println("2-exibir jogos");
			System.out.println("3-fazer compra");
			System.out.println("4-exibir ganhos no caixa");
			System.out.println("0-sair");
			System.out.println("---------------------");
			escolha = scan.nextInt();
			scan.nextLine();
			validarEscolha(escolha);
			}while(escolha != 0);
		}
		public static void validarEscolha(int escolha) {
			switch (escolha) {
			case 1:
				cadastrarjogos();
				break;
			case 2:
				mostrarResumo();
				break;
			case 3:
				removerJogo();
				break;
			case 4:
				break;
			case 0:
				break;
			default:
					System.out.println("digite uma opção valida!!");
				break;
			}
		}
		public static void mostrarResumo() {
			for(int i = 0 ; i < biblioteca.size(); i++) {
				System.out.printf("posição %d -", i+1);
				biblioteca.get(i).mostrarResumo();
			}
		}
		public static void removerJogo() {
			mostrarResumo();
			System.out.println("qual jogo voce deseja remover:(posição)");
			int escolha = scan.nextInt();
			scan.nextLine();
			if (escolha > biblioteca.size()) {
				System.out.println("jogo não foi encontrado");
				return;
			}
			Jogos jogoEscluido = biblioteca.get(escolha);
			biblioteca.remove(escolha - 1);
			System.out.println("jogo removido com sucesso!!");
		}
		public static void cadastrarjogos() {
			Jogos jogos = new Jogos();
			System.out.println("digite o titulo do Game:");
			jogos.setNome(scan.nextLine());
			System.out.println("digite o genero do Game:");
			jogos.setGenero(scan.nextLine());
			System.out.println("digite o valor do Game:");
			jogos.setPreco(scan.nextDouble());
			scan.nextLine();
			biblioteca.add(jogos);
			System.out.println("jogo adicionado com sucesso!");
		}
		public static void aBiblioteca() {
			Jogos jogosum = new Jogos("Tomb Raider","aventura",15.00);
			Jogos jogosdois = new Jogos("Homen Aranha","ação",25.00);
			Jogos jogostres = new Jogos("Resende Evil","terror",45.00);
			biblioteca.add(jogosum);
			biblioteca.add(jogosdois);
			biblioteca.add(jogostres);
		}
		
	}

