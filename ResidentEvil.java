public class ResidentEvil
{
	public static void main(String[] args)
	{
		try
		{
			int numberToFind = 1969;

			if (hasRoot(numberToFind))
				System.out.println(Math.sqrt(numberToFind));

			else
			{
				for (int i=numberToFind; i<numberToFind*2; i++)
				{
					if (hasRoot(i))
					{
						System.out.println((int)Math.sqrt(i)); //because I know that the number of the line is the square root of the last number in the line
						break;
					}
				}
			}
		}
		catch(Exception err)
		{
			System.out.println(err.getMessage()); //in this case it will never give an error, but if someone change the values the error is already been treated
		}
	}

	private static boolean hasRoot(int number) throws Exception
	{
		if (number <= 0)
			throw new Exception("Invalid number!");

		if (Math.sqrt(number) - ((int) Math.sqrt(number)) > 0 )
			return false;

		return true;
	}
}

/*
10 - Resident Evil 2

Em Resident Evil 2, lançado em 1998, Claire Redfield está presa na estação de polícia de Racoon City inaugurada em 1969. Ela está cercada por zumbis e encontrou uma porta de acesso à uma saída de emergência. Essa porta precisa de um código de 2 dígitos para ser aberta.
Claire encontrou uma pista em um bilhete rasgado ao lado do painel de controle contendo os seguintes números.
Linha 1 -> 1
Linha 2 -> 2 3 4
Linha 3 -> 5 6 7 8 9
Linha 4 -> 10 11 12 13 14 15 16
Linha 5 -> 17 18 19 20 21 22 23 24 25
Linha N -> (...) 1969 (...)

Observe que na primeira linha foi escrito o número 1 e nas seguintes há dois números a mais do que na linha anterior.

Agora Claire precisa descobrir em qual linha foi escrito o número 1969, o ano de inauguração da estação de polícia para usar como código da porta.

Desenvolva um código para que sua saída seja o resultado. Você pode usar sua IDE de preferência, mas não esqueça de colocar o código abaixo e preencher o campo “Result” com o resultado gerado pelo seu código.


*/