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

Em Myst, um jogo de �Puzzle Adventure� lan�ado em 1993, o jogador est� preso em uma ilha misteriosa cheia de quebra cabe�as que precisam ser resolvidos para avan�ar em sua aventura.

Em um tabuleiro, que cont�m um dos quebra-cabe�as, � necess�rio que o jogador selecione todos os numero primos existentes na sequ�ncia que inicia no n�mero 2 e termina no n�mero 120.

Um n�mero primo � um n�mero divis�vel apenas por 1 e por ele mesmo.
Existe uma t�cnica para encontrar n�meros primos que em montar uma lista de 2 at� n, onde n � o n�mero m�ximo que se quer verificar. O primeiro n�mero (que � 2) � primo. Qualquer outro m�ltiplo dele, n�o � primo.
Ap�s chegar ao �ltimo m�ltiplo desse n�mero at� n, voltamos ao in�cio e pegamos o pr�ximo n�mero existente: 3. Este n�mero � primo. Qualquer m�ltiplo dele, n�o �. E assim sucessivamente at� o valor inteiro inferior da raiz de n (ex.: se n for 30, devo realizar a itera��o at� 5).
*/