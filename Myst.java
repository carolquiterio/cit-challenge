public class Myst
{
	public static void main (String[] args)
	{
		try
		{
			int maxNumber = 120;
			int[] primesArray = new int[maxNumber-2];

			for (int i=2; i<maxNumber; i++)
			{
				if (isPrime(i))
				{
					primesArray[i] = i;
					System.out.println(primesArray[i]);
				}
			}
		}
		catch(Exception err)
		{
			System.out.println(err.getMessage()); //in this case it will never give an error, but if someone change the values the error is already been treated
		}
	}

	private static boolean isPrime(int number) throws Exception
	{
		if (number == 0)
			throw new Exception("Invalid number!");

		for (int i = 2; i < number; i++)
		{
			if (number % i == 0)
				return false;
		}
		return true;
	}
}

/*for (int i = 1; i < raiz; i++)
		{
			int quantosDivisores = 0;
			int multiplos;
			for ( multiplos = 0; multiplos < numeroPrimo-1; multiplos++)
			{
				if(ehPrimo(multiplos))
			}
			if (quantosDivisores == 2)
			{
				vetorPrimos[i] = multiplos;
				System.out.println("primo" + multiplos);
			}
}*/

/*
2 - Myst

Em Myst, um jogo de “Puzzle Adventure” lançado em 1993, o jogador está preso em uma ilha misteriosa cheia de quebra cabeças que precisam ser resolvidos para avançar em sua aventura.

Em um tabuleiro, que contém um dos quebra-cabeças, é necessário que o jogador selecione todos os numero primos existentes na sequência que inicia no número 2 e termina no número 120.

Um número primo é um número divisível apenas por 1 e por ele mesmo.
Existe uma técnica para encontrar números primos que em montar uma lista de 2 até n, onde n é o número máximo que se quer verificar. O primeiro número (que é 2) é primo. Qualquer outro múltiplo dele, não é primo.
Após chegar ao último múltiplo desse número até n, voltamos ao início e pegamos o próximo número existente: 3. Este número é primo. Qualquer múltiplo dele, não é. E assim sucessivamente até o valor inteiro inferior da raiz de n (ex.: se n for 30, devo realizar a iteração até 5).
*/