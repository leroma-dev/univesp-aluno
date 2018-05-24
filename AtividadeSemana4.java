package aluno.univesp.avaliacao;

public class AtividadeSemana4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtividadeSemana4 x = new AtividadeSemana4();

		System.out.println("\n ---- Pergunta 1 - INICIO ----\n");
		x.pergunta1();
		System.out.println("\n ---- Pergunta 1 - FIM ----\n");

		System.out.println("\n ---- Pergunta 2 - INICIO ----\n");
		x.pergunta2();
		System.out.println("\n ---- Pergunta 2 - FIM ----\n");

		System.out.println("\n ---- Pergunta 3 - INICIO ----\n");
		x.pergunta3();
		System.out.println("\n ---- Pergunta 3 - FIM ----\n");

		System.out.println("\n ---- Pergunta 4 - INICIO ----\n");
		x.pergunta4();
		System.out.println("\n ---- Pergunta 4 - FIM ----\n");

	}

	/*
	 * Pergunta 1 2.5 pts
	 * 
	 * A potenciação serve para simplificar cálculos com números extensos. E em
	 * programação, isso é muito mais simplificado, apenas utiliza-se a função
	 * math.pow. Uma outra forma para realizar cálculos dessa natureza é
	 * utilizando o laço de repetição for através de um método que tem como
	 * parâmetros valores double e int
	 * 
	 * Com base na informação acima, realize o cálculo da potenciação utilizando
	 * o laço de repetição for conforme as orientações abaixo:
	 * 
	 * - Escreva um método em que receba em seus parâmetros um valor double x e
	 * um inteiro y;
	 * 
	 * - O método deve retornar um valor double de x^y;
	 * 
	 * - Considerar o valor de y > 0;
	 * 
	 * De acordo com as recomendações acima, o código correto para o cálculo da
	 * potenciação é:
	 * 
	 */
	void pergunta1() {
		System.out.println(eleva(2, 4));
	}

	static double eleva(double x, int y) {

		double resp = 1;

		for (int i = 0; i < y; i++)

			resp *= x; // ou resp = resp * x;

		return (resp);

	}

	/*
	 * Pergunta 2 2.5 pts
	 * 
	 * O fatorial de um número natural n é utilizado na ciência matemática e
	 * também na ciência da computação. Seu uso é de extrema importância na
	 * análise combinatória, no cálculo e na teoria da probabilidade. O fatorial
	 * de um número LaTeX: nn é representado por n! e é calculado fazendo o
	 * produto de todos os números naturais menores ou iguais a n. Quando o
	 * número natural é igual a 0, o seu fatorial é igual a 1.
	 * 
	 * De acordo com o que foi exposto, o método que descreve corretamente o
	 * fatorial do número 20 é:
	 * 
	 * O nome do metodo foi alterado de "main" para "fatorial" para permitir a
	 * compilação
	 */
	void pergunta2() {
		fatorial(null);
	}

	public static void fatorial(String[] args) {

		long fat = 1;

		for (int i = 1; i <= 20; i++) {

			fat = fat * i;

		}
		System.out.println(fat);

	}

	/*
	 * 
	 * 
	 * Enunciado Base
	 * 
	 * Os polinômios são expressões algébricas formadas por um arranjo de
	 * coeficientes e letras (partes literais). As letras (por exemplo, a
	 * variável x) de um polinômio representam os valores desconhecidos da
	 * expressão. O cálculo de um polinômio depende do valor dessa variável x. O
	 * grau do polinômio é definido pelo número de elementos do arranjo. Por
	 * exemplo, para o polinômio LaTeX:
	 * p(x)=a_0+a_1x+a_2x^2+a_3x^3p(x)=a0+a1x+a2x2+a3x3, o arranjo de
	 * coeficientes conterá LaTeX: \{a_0,a_1,a_2,a_3\}{a0,a1,a2,a3}, sendo seu
	 * grau (3) obtido a partir do tamanho do arranjo.
	 * 
	 * Baseado nas informações acima, observe as recomendações a seguir para a
	 * escrita de um método que calcule o valor de um polinômio em um
	 * determinado ponto x:
	 * 
	 * - O método deve receber um double que representa o ponto x e um arranjo
	 * de doubles, representando os coeficientes do polinômio;
	 * 
	 * - O método deverá retornar como resposta o valor de p(x) recebendo x e o
	 * arranjo de coeficientes por parâmetro.
	 * 
	 * - Para elevar os x a seus expoentes, crie um método de potenciação ou
	 * utilize um método já anteriormente abordado.
	 * 
	 */

	/*
	 * Pergunta 3 2.5 pts
	 * 
	 * Para começarmos a calcular o valor do polinômio é necessário que nos
	 * parâmetros tenhamos um arranjo de doubles. Arranjos são estruturas de
	 * dados, de tamanho fixo, que permitem armazenar um conjunto de valores de
	 * um mesmo tipo. Para a implementação de um arranjo de doubles de tamanho
	 * 10, o código correto está na alternativa:
	 */

	void pergunta3() {
		arranjoDoubles(null);
	}

	public static void arranjoDoubles(String[] args) {

		double[] d = new double[10];

		for (int i = 0; i < 10; i++) {

			d[i] = i;

			System.out.println("O vetor de double na posição " + i + " é: " + d[i]);

		}

	}

	/*
	 * 
	 * Pergunta 4 2.5 pts
	 * 
	 * Objetivo de aprendizagem: Calcular o valor de um polinômio utilizando o
	 * laço de repetição for.
	 * 
	 * Com base nas orientações apresentadas, o código para o cálculo do valor
	 * de um polinômio p(x) é:
	 * 
	 * 
	 */
	void pergunta4() {
		double[] coeficientes = { 1, 1, 1, 1 };
		System.out.println(valor(2.0, coeficientes));
	}


	static double valor(double x, double[] coef) {

		double resp = 0;

		for (int i = 0; i < coef.length; i++)

			resp += coef[i] * eleva(x, i);

		// ou resp = resp + coef[i] * eleva (x, i);

		return (resp);

	}

}
