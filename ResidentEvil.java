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

Em Resident Evil 2, lan�ado em 1998, Claire Redfield est� presa na esta��o de pol�cia de Racoon City inaugurada em 1969. Ela est� cercada por zumbis e encontrou uma porta de acesso � uma sa�da de emerg�ncia. Essa porta precisa de um c�digo de 2 d�gitos para ser aberta.
Claire encontrou uma pista em um bilhete rasgado ao lado do painel de controle contendo os seguintes n�meros.
Linha 1 -> 1
Linha 2 -> 2 3 4
Linha 3 -> 5 6 7 8 9
Linha 4 -> 10 11 12 13 14 15 16
Linha 5 -> 17 18 19 20 21 22 23 24 25
Linha N -> (...) 1969 (...)

Observe que na primeira linha foi escrito o n�mero 1 e nas seguintes h� dois n�meros a mais do que na linha anterior.

Agora Claire precisa descobrir em qual linha foi escrito o n�mero 1969, o ano de inaugura��o da esta��o de pol�cia para usar como c�digo da porta.

Desenvolva um c�digo para que sua sa�da seja o resultado. Voc� pode usar sua IDE de prefer�ncia, mas n�o esque�a de colocar o c�digo abaixo e preencher o campo �Result� com o resultado gerado pelo seu c�digo.


*/