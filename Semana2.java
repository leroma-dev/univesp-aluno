package aluno.univesp.exercicios.apoio;

public class Semana2 {

    public static void main(String[] args) {

    	// o metodo main é static, e só pode referenciar outros metodos static
    	// para acessar
		// os demais metodos não são static
		// para acessar os demais metodos é necessário criar um objeto da classe Semana2
		// o ato de criar um objeto de uma classe chamamos de "instanciar" ou "criar uma instancia da classe Semana2"
    	
    	Semana2 objetoInstancia = new Semana2();
    	
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
    	
    	System.out.println("\n ---- EXERCICIO 5 - INICIO ----\n");
    	objetoInstancia.exercicio5();
    	System.out.println("\n ---- EXERCICIO 5 - FIM ----\n");
    	
    	System.out.println("\n ---- EXERCICIO 6 - INICIO ----\n");
    	objetoInstancia.exercicio6();
    	System.out.println("\n ---- EXERCICIO 6 - FIM ----\n");
    	

    }
    

	/*
	################################################
	Exercício de apoio - Semana 2 - EXERCÍCIO 1
	
	Determine o que será impresso (pelos comandos println()) após a exe-
	cução das instruções a seguir:
	int a = 3;
	int b = 5;
	int c = 8;
	int d = a * (b + c * 3) - 7;
	int e = a - b - c;
	System.out.println(a+" "+b+" "+c+" "+d+" "+e);
	a = a + 1;
	b = (4 * a + 1) / 10;
	c = (4 * a + 1) % 10;
	System.out.println(a+" "+b+" "+c+" "+d+" "+e);
	################################################ 
	*/    
    public void exercicio1(){
    	 
		int a = 3;
		int b = 5;
		int c = 8;
		int d = a * (b + c * 3) - 7;
		int e = a - b - c;
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);

		a = a + 1;
		b = (4 * a + 1) / 10;
		c = (4 * a + 1) % 10;
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
    }
    
    /*
    ################################################
    Exercício de apoio - Semana 2 - EXERCÍCIO 2

    Escreva um método que converta um valor em real (recebido em um
    parâmetro), para dólar e retorne o valor em dólar. A taxa de conversão
    real para dólar também será um parâmetro de entrada desse método. O
    valor em real, a taxa de conversão e o valor em dólar deverão ser do tipo
    float.
    ################################################ 
    */

	//o metodo converteParaDolar() pertence a classe Semana2
	public float converteParaDolar(float valorReal, float taxaConversao) {
		float valorConvertidoDolar = valorReal * taxaConversao;
		return valorConvertidoDolar;
	}    
    
    public void exercicio2(){

		// a partir do objeto executar o metodo de conversão
		System.out.println( "Valor Conversão: " +  this.converteParaDolar(1.0f, 3.57f) );
 
		// outra forma de executar o metodo 		
		float qtdReais  = 1f;
		float taxaDoDia = 3.57f;
 
		System.out.println( "Valor Conversao: " + qtdReais + "Reais = "+  this.converteParaDolar(qtdReais, taxaDoDia) + " Dolares" ) ;
 
		qtdReais = 3f;
		System.out.println( "Valor Conversao: " + qtdReais + "Reais = "+  this.converteParaDolar(qtdReais, taxaDoDia) + " Dolares" ) ;
 
		qtdReais = 7f;
		System.out.println( "Valor Conversao: " + qtdReais + "Reais = "+  this.converteParaDolar(qtdReais, taxaDoDia) + " Dolares" ) ;
 
		qtdReais = 10f;
		System.out.println( "Valor Conversao: " + qtdReais + "Reais = "+  this.converteParaDolar(qtdReais, taxaDoDia) + " Dolares" ) ;
	}
 
	/*
	################################################
	Exercício de apoio - Semana 2 - EXERCÍCIO 3
	
	Escreva um método que determine quanto tempo leva para um corpo
	cair de determinada altura a partir do repouso. Este método receberá
	como parâmetro um valor do tipo double contendo a altura em centímetros 
	em que o corpo está e deverá retornar um valor do tipo double contendo o 
	tempo da queda em segundos.
	Considere que a força da gravidade é igual a 9,8m/s 2 . 
	
	Use o método Math.sqrt() 1 para obter a raiz quadrada.
	################################################ 
	*/	

    /*
        Equação da posição:y = Vo.t + (g.t²)/2
    	y = alturaEmCentimetros
    	Vo = Velocidade inicial é 0
    	g = aceleração da gravidade = forcaDaGravidade
    	
    	a equação pode ser reduzida:
    	y = 0.t + (g.t²)/2
    	y * 2 = g.t²
    	t² = (y * 2) / g
    	    	
    	chegando a formula que queremos calcular: 
    	t = raiz( (y * 2) / g )
    	
    	no java, a raiz quadrada pode ser calculada usando o pacote.metodo Math.sqrt() 
     */
    double tempoDeQuedaEmSegundos(double alturaEmCentimetros){
    	double tempoQueda;
    	double forcaDaGravidade = 9.8;

    	tempoQueda = Math.sqrt( (alturaEmCentimetros*2) / forcaDaGravidade );
    	
    	return tempoQueda;
    }
    	
    public void exercicio3(){
    	double altura;
    	
    	altura = 137;
		System.out.println( "Altura: " + altura + "cm - Tempo de queda= "+  this.tempoDeQuedaEmSegundos(altura) + " segundos" ) ;
    	
    	altura = 198;
		System.out.println( "Altura: " + altura + "cm - Tempo de queda= "+  this.tempoDeQuedaEmSegundos(altura) + " segundos" ) ;

    	altura = 4.9;    
		System.out.println( "Altura: " + altura + "cm - Tempo de queda= "+  this.tempoDeQuedaEmSegundos(altura) + " segundos" ) ;
    		
    	altura = 10;    
		System.out.println( "Altura: " + altura + "cm - Tempo de queda= "+  this.tempoDeQuedaEmSegundos(altura) + " segundos" ) ;
    		
    	altura = 100;
		System.out.println( "Altura: " + altura + "cm - Tempo de queda= "+  this.tempoDeQuedaEmSegundos(altura) + " segundos" ) ;
    	
    	altura = 1000;   
		System.out.println( "Altura: " + altura + "cm - Tempo de queda= "+  this.tempoDeQuedaEmSegundos(altura) + " segundos" ) ;
    	 	
    	altura = 10000;
		System.out.println( "Altura: " + altura + "cm - Tempo de queda= "+  this.tempoDeQuedaEmSegundos(altura) + " segundos" ) ;
    	
    	
    }
    
    
    /*
	################################################
	Exercício de apoio - Semana 2 - EXERCÍCIO 4
	
	Escreva um método que, a partir dos coeficientes(a, b, c)de uma equação
	do segundo grau (recebidos como parâmetros do tipo double), calcule
	suas raízes reais, caso existam, escrevendo a resposta na tela. Considere
	que a equação é escrita no seguinte formato: ax^2 + bx + c = 0. 
	Utilize condicionais para tratar as diferentes possibilidades. 
	O que acontece se a for igual a zero? 
	E se a e b forem iguais a zero? 
	E se o delta (da equação de Bhaskara) for igual a zero? 
	E se for menor que zero?. 
	Se não existirem raízes reais, imprima “Não há raízes reais.”.
	################################################ 
     */
   /*
    calculo das raizes:
	delta = raiz( b^2 - 4ac)
    x = (-b +- delta ) / 2a
    x1 = (-b + delta ) / 2a
    x2 = (-b - delta ) / 2a
    
	no java, a raiz quadrada pode ser calculada usando o pacote.metodo Math.sqrt()
	no java, a potencia pode ser calcula usando o pacote.metodo Math.pow(base, potencia); 
    */
    

    public void calculaEquacaoSegundoGrau(double a, double b, double c){
    	
    	double x1;
    	double x2;
    	double delta;
    	
    	//se a for igual a zero?
    	if (a == 0 ){
    		
    		//E se a e b forem iguais a zero? 
    		if ( b == 0) {
    			x1 = 0;
    			x2 = 0;
    			delta = 0;
    		} else { // somente a é zero, causará uma divisão por zero
    			System.out.println( "a=" + a + " b=" + b + " c=" + c + " Não há raízes reais." );
    			return; //encerra a execução do metodo 
    		}
    	} else {
    		delta = Math.pow(b, 2) + (-1)*(4*a*c) ;

        	// E se o delta for menor que zero?.
    		// Resposta: não é possível calcular a raiz quadrada usando a Math.sqrt 
    		if (delta < 0){
    			System.out.println( "a=" + a + " b=" + b + " c=" + c + " delta=" + delta + " Não há raízes reais." );
    			return; //encerra a execução do metodo    			
    		} else {
        		// E se o delta (da equação de Bhaskara) for igual a zero?
            	// Resposta: ele será utilizado no resto da formula de x1 e x2    			
    			x1 = ( (-1) * b +  Math.sqrt(delta) ) / 2*a;
    			x2 = ( (-1) * b -  Math.sqrt(delta) ) / 2*a ;   		
    		}
    		
    	}
    	
		System.out.println( "a=" + a + " b=" + b + " c=" + c + " delta=" + delta + " x1=" + x1 + " x2=" + x2);
    } 
    
    public void exercicio4(){
    	calculaEquacaoSegundoGrau(0,2,3);
    	calculaEquacaoSegundoGrau(0,0,3);
    	calculaEquacaoSegundoGrau(1,2,3);
    	calculaEquacaoSegundoGrau(2,3,1);
    }


    /*
	################################################
	Exercício de apoio - Semana 2 - EXERCÍCIO 5
	
	A CBF resolveu cobrar uma multa para os jogadores que no campeonato
	brasileiro receber em cartões amarelos e vermelhos. Dados quatro números
	inteiros, representando o time, o número do jogador, o número de cartões
	amarelos e vermelhos do jogador, calcule o valor da multa, escrevendo a
	resposta na tela. Considere que a multa por cartão amarelo é de R$1000,20
	e por cartão vermelho é de R$4523,75.
	
	################################################ 
     */
    
    // Foi assumido que deve-se calcular o valor da multa por jogador 
    // no enunciado não é especificado que deve-se calcular a multa por time
    // A teoria apresentada até esse ponto do curso não envolve outras estruturas de dados 
    // que permitiriam organizar e somar por time  
    public void calculaMulta(int time, int jogador, int cartoesAmarelos, int cartoesVermelhos){
    	double valorMultaCartaoVermelho = 4523.75;
    	double valorMultaCartaoAmarelo = 1000.20;
    	
    	double valorCalculadoMultaCartoesVermelhos = cartoesVermelhos * valorMultaCartaoVermelho;
    	double valorCalculadoMultaCartoesAmarelos  = cartoesAmarelos * valorMultaCartaoAmarelo;
    	double valorTotalMulta = valorCalculadoMultaCartoesVermelhos + valorCalculadoMultaCartoesAmarelos;
    	
    	System.out.println("Time=" + time + " Jogador=" + jogador + " MultaAmarelos=R$" + valorCalculadoMultaCartoesAmarelos + " MultaVermelhos=R$=" + valorCalculadoMultaCartoesVermelhos + " MultaTotal=R$" + valorTotalMulta );
    }
    
    public void exercicio5(){
    	calculaMulta(1, 1, 5, 1);
    	calculaMulta(1, 2, 10, 3);
    	calculaMulta(1, 3, 8, 6);
    	calculaMulta(1, 7, 4, 5);
    	calculaMulta(1, 10, 5, 0);
    }
    
    
    /*
	################################################
	Exercício de apoio - Semana 2 - EXERCÍCIO 6
	
	Escreva um método que receba um inteiro de 3 dígitos como parâmetro,
	retornando seu inverso. Por exemplo, inv(321) = 123. Utilize os 
	comandos (divisão) e % (resto da divisão inteira). 
	Se o inteiro de entrada tiver mais de três dígitos, retorne -1.
	################################################ 
     */
    public int inv(int numeroOriginal){
    	int numeroInvertido;
    	
    	if (numeroOriginal < 100){
    		numeroInvertido = -1;
    	} else {
    		int posicaoTres = numeroOriginal % 10;
    		int posicaoDois = ( (numeroOriginal % 100) - posicaoTres ) / 10;
    		int posicaoUm = ( numeroOriginal  - posicaoDois - posicaoTres ) / 100;
    		
    		numeroInvertido = (posicaoTres*100) + (posicaoDois*10) +  posicaoUm;
    	}
    	
    	return numeroInvertido;
    }
    
    public void exercicio6(){
    	int numero;
    	
    	numero = 99;
    	System.out.println( "NumeroOriginal="+numero+ " NumeroInvertido=" + inv(numero));
    	numero = 101;
    	System.out.println( "NumeroOriginal="+numero+ " NumeroInvertido=" + inv(numero));
    	numero = 123;
    	System.out.println( "NumeroOriginal="+numero+ " NumeroInvertido=" + inv(numero));
    	numero = 987;
    	System.out.println( "NumeroOriginal="+numero+ " NumeroInvertido=" + inv(numero));
    }

}
	

