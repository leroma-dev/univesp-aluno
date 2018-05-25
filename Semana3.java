package aluno.univesp.exercicios.apoio;
/*soluções disponibilizadas no caderno de questões e agregadas para permitir a execução*/

public class Semana3 {

	public static void main(String[] args) {

		// o metodo main é static, e só pode referenciar outros metodos static
		// para acessar
		// os demais metodos não são static
		// para acessar os demais metodos é necessário criar um objeto da classe
		// Semana2
		// o ato de criar um objeto de uma classe chamamos de "instanciar" ou
		// "criar uma instancia da classe Semana2"

		Semana3 objetoInstancia = new Semana3();

		System.out.println("\n ---- EXERCICIO 1 - INICIO ----\n");
		objetoInstancia.exercicio1();
		System.out.println("\n ---- EXERCICIO 1 - FIM ----\n");

		System.out.println("\n ---- EXERCICIO 2 - INICIO ----\n");
		objetoInstancia.exercicio2();
		System.out.println("\n ---- EXERCICIO 2 - FIM ----\n");

		System.out.println("\n ---- EXERCICIO 3 - INICIO ----\n");
		objetoInstancia.exercicio3();
		System.out.println("\n ---- EXERCICIO 3 - FIM ----\n");

		System.out.println("\n ---- EXERCICIO 4 - INICIO ----\n");
		objetoInstancia.exercicio4();
		System.out.println("\n ---- EXERCICIO 4 - FIM ----\n");

	}

	/*
	 * Exercício de apoio - Semana 3 - EXERCÍCIO 1
	 * 
	 * Escreva um método chamado cor que receba como parâmetro uma va- riável do
	 * tipo inteiro chamada identificador e imprime a palavra verde caso o valor
	 * do identificador seja igual a 1, amarelo caso o valor do iden- tificador
	 * seja igual a 2, azul caso o valor do identificador seja igual a 3, e
	 * branco caso o valor do identificador seja igual a 4. Caso contrário (isto
	 * é, se o valor do identificador não for 1, 2, 3 ou 4) deverá imprimir
	 * “iden- tificador invalido”. Utilize a estrutura switch...case...default
	 * para resolver este problema.
	 */
	public void exercicio1() {

		cor(0);
		cor(1);
		cor(2);
		cor(3);
		cor(4);
		cor(5);
	}

	public static void cor(int identificador) {
		switch (identificador) {
		case 1:
			System.out.println("verde");
			break;
		case 2:
			System.out.println("amarelo");
			break;
		case 3:
			System.out.println("azul");
			break;
		case 4:
			System.out.println("branco");
			break;
		default:
			System.out.println("identificador invalido");
		}
	}

	/*
	 * Exercício de apoio - Semana 3 - EXERCÍCIO 2
	 * 
	 * Escreva um método chamado media que recebe quatro variáveis do tipo
	 * double chamadas v1, v2, v3 e v4 e imprime: “Media maior que zero.” caso a
	 * média dos quatro valores seja maior que zero ou “Media menor ou igual a
	 * zero.”, caso contrário.
	 */
	public void exercicio2() {
		media(1, 2, 3, 4);
		media(1.0, 2.0, 3.0, 4.0);
		media(1, 2, 3, -9);
		media(-651984, 965816591.09814, -589698.981651, 61321.05984168);
	}

	public static void media(double v1, double v2, double v3, double v4) {
		double media = (v1 + v2 + v3 + v4) / 4;
		if (media > 0)
			System.out.println("Media maior que zero.");
		else
			System.out.println("Media menor ou igual a zero.");
	}

	/*
	 * Exercício de apoio - Semana 3 - EXERCÍCIO 3
	 * 
	 * Escreva um método chamado mediana que recebe três variáveis do tipo int
	 * chamadas v1, v2 e v3 e imprime o valor da mediana dessas três variá-
	 * veis.
	 */
	public void exercicio3() {
		mediana(1, 2, 9);
		mediana2(1, 2, 9);
		mediana(4, 1, 3);
		mediana2(4, 1, 3);
	}

	public static void mediana(int v1, int v2, int v3) {
		if (v2 < v3 && v2 > v1 || v2 < v1 && v2 > v3) {
			System.out.println(v2);
		} else if (v1 < v3 && v1 > v2 || v1 < v2 && v1 > v3) {
			System.out.println(v1);
		} else if (v3 < v2 && v3 > v1 || v3 < v1 && v3 > v2) {
			System.out.println(v3);
		}
	}

	public static void mediana2(int v1, int v2, int v3) {
		if (v1 < v2) {
			if (v1 > v3)
				System.out.println(v1);
			else {
				if (v2 < v3)
					System.out.println(v2);
				else
					System.out.println(v3);
			}
		} else {
			if (v1 < v3)
				System.out.println(v1);
			else {
				if (v2 > v3)
					System.out.println(v2);
				else
					System.out.println(v3);
			}
		}
	}

	/*
	 * Exercício de apoio - Semana 3 - EXERCÍCIO 4
	 * 
	 * Escreva o que será impresso pela execução do método abaixo, caso ele
	 * receba como parâmetro o número 10.
	 * 
	 */
	public void exercicio4() {
		conjecturaDeCollatz(10);
	}

	public static void conjecturaDeCollatz(int n) {
		System.out.println("Imprimindo sequencia iniciando em " + n);
		while (n > 1) {
			if (n % 2 == 0)
				n = n / 2;
			else
				n = 3 * n + 1;
			System.out.println(n);
		}
	}
}
