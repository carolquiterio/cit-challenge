public class Castlevania
{
	public static void main(String[] args)
	{
		try
		{
			int movesNumber = 0;
			int discsNumber = 5;

			System.out.println(calculatesMoves(discsNumber));
		}
		catch (Exception err)
		{
			System.out.println(err.getMessage()); //in this case it will never give an error, but if someone change the values the error is already been treated
		}
	}

	private static int calculatesMoves(int discsNumber) throws Exception
	{
		if (discsNumber <=0)
			throw new Exception("Invalid discs number!");

		return (int)Math.pow(2, discsNumber) - 1; //because I know that the moves number is 2 to n power -1
	}
}

/*
8 - Castlevânia

Em Castlevania, Christopher Belmont busca vingança contra o Conde Drácula, que sequestrou o seu filho Soleiyu Belmont. Depois de uma longa saga pelo castelo do conde, Christopher descobre uma sala que possui uma passagem secreta. Para destravar a passagem ele precisa resolver um desafio.

A passagem conta com uma base contendo três pinos, em um dos quais são dispostos 5 discos, uns sobre os outros, em ordem crescente de diâmetro, de cima para baixo. Ele deve mover um disco de cada vez, sendo que um disco maior nunca pode ficar em cima de um disco menor.

Para destravar o segredo da passagem, Christopher deve informar qual é o número mínimo de movimentos necessários para mover todos os discos para o pino da direita.

Desenvolva um código para que sua saída seja o resultado. Você pode usar sua IDE de preferência, mas não esqueça de colocar o código abaixo e preencher o campo “Result” com o resultado gerado pelo seu código.

*/