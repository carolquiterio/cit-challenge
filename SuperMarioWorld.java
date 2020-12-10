public class SuperMarioWorld
{
	public static void main (String[] args)
	{
		int variationAreaOne = 1; //just to simbolize if it was more than 1
		int variationAreaTwo = 3;
		int variationAreaThree = 3;
		int variationAreaFour = 2;

		int totalVariationWithoutDiscounting =  variationAreaTwo * variationAreaThree * variationAreaFour;

		int variationToBeDiscounted = variationAreaOne * variationAreaThree; // secret passage

		int totalVariation = totalVariationWithoutDiscounting - variationToBeDiscounted;

		System.out.println(totalVariation);
	}
}

/*
4 - Super Mario World

O jogo Super Mario World possui uma fase bastante curiosa, chamada Chocolate Island 2. Ao entrar nela o jogador recebe um aviso de que o n�mero de moedas coletadas ou o tempo na fase podem influenciar no seu progresso.

Basicamente, a fase � dividida em 4 �reas com diferentes varia��es que s�o influenciadas pela maneira como o jogador passou pelas �reas anteriores.

Essas s�o as regras que regem o acesso a cada uma das �reas:
�rea 1
Parte inicial do jogo. Sempre a mesma.
�rea 2
Afetada pelo n�mero de moedas que o jogador coletou na �rea 1
- 21 moedas ou mais: varia��o A
- Menos de 8 moedas: varia��o B
- Entre 9 e 20 moedas: varia��o C
�rea 3
Afetada pela quantidade de tempo que o jogador tem restando
- 250 segundos ou mais - varia��o A (sa�da secreta)
Obs: se o jogador vai para essa parte, n�o acessa a �rea 4 j� que aqui h� uma sa�da
- Entre 235 e 249 - varia��o B
- Menos de 235 segundos - varia��o C
�rea 4
Afetada pela quantidade de Dragon Coins que o M�rio coletou durante essa �rea
- 3 Dragon Coins ou menos - varia��o A
- Pelo menos 4 Dragon Coins - varia��o B
Calcule e liste o n�mero de varia��es diferentes do n�vel que s�o poss�veis com essas combina��es. Fa�a um programa que retorne como resultado esse n�mero.

Voc� pode usar sua IDE de prefer�ncia, mas n�o esque�a de colocar o c�digo abaixo e preencher o campo �Result� com o resultado gerado pelo seu c�digo.

*/