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

O jogo Super Mario World possui uma fase bastante curiosa, chamada Chocolate Island 2. Ao entrar nela o jogador recebe um aviso de que o número de moedas coletadas ou o tempo na fase podem influenciar no seu progresso.

Basicamente, a fase é dividida em 4 áreas com diferentes variações que são influenciadas pela maneira como o jogador passou pelas áreas anteriores.

Essas são as regras que regem o acesso a cada uma das áreas:
Área 1
Parte inicial do jogo. Sempre a mesma.
Área 2
Afetada pelo número de moedas que o jogador coletou na área 1
- 21 moedas ou mais: variação A
- Menos de 8 moedas: variação B
- Entre 9 e 20 moedas: variação C
Área 3
Afetada pela quantidade de tempo que o jogador tem restando
- 250 segundos ou mais - variação A (saída secreta)
Obs: se o jogador vai para essa parte, não acessa a área 4 já que aqui há uma saída
- Entre 235 e 249 - variação B
- Menos de 235 segundos - variação C
Área 4
Afetada pela quantidade de Dragon Coins que o Mário coletou durante essa área
- 3 Dragon Coins ou menos - variação A
- Pelo menos 4 Dragon Coins - variação B
Calcule e liste o número de variações diferentes do nível que são possíveis com essas combinações. Faça um programa que retorne como resultado esse número.

Você pode usar sua IDE de preferência, mas não esqueça de colocar o código abaixo e preencher o campo “Result” com o resultado gerado pelo seu código.

*/