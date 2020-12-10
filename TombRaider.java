public class TombRaider
{
	public static void main (String[] args)
	{
		try
		{
			int validationsNumber = 0;
			double timeToTest = 0;
			char[] posibleLetters = {'A', 'D', 'B', 'C', 'E','F'};
			char[] numbers = {'1','2','3','4','5','6'};

			String temporary = "aaaaaa";
        	StringBuilder password = new StringBuilder(temporary);

			for (int a=0; a<6; a++)
			{
				password.setCharAt(0, posibleLetters[a]);
				for (int b=0; b<6; b++)
				{
					password.setCharAt(1, posibleLetters[b]);
					for (int c=0; c<6; c++)
					{
						password.setCharAt(2, posibleLetters[c]);
						for (int d =0; d<6; d++)
						{
							password.setCharAt(3, numbers[d]);
							for (int e=0; e<6; e++)
							{
								password.setCharAt(4, numbers[e]);
								for (int f=0; f<6; f++)
								{
									password.setCharAt(5, numbers[f]);

									if (validation(password.toString()))
									{
										System.out.println(password.toString());
										validationsNumber++;
									}
								}
							}
			        	}
					}
				}
			}
			timeToTest = (double)validationsNumber * 2;
			System.out.println("The time it will take Lara to test the " + validationsNumber + " possible combinations is equal to " + timeToTest + " seconds");
		}
		catch (Exception err)
		{
			System.out.println(err.getMessage()); //in this case it will never give an error, but if someone change the values the error is already been treated
		}
	}

	private static boolean validation(String option) throws Exception
	{
		if(option.length()<6 || option.length()>6)
			throw new Exception("Invalid password");

		if (!option.substring(0,1).equals("A") && !option.substring(1,2).equals("A") && !option.substring(2,3).equals("A"))
			return false;

		if (!option.substring(0,1).equals("D") && !option.substring(1,2).equals("D") && !option.substring(2,3).equals("D"))
			return false;

		if (!option.substring(3,4).equals("3") && !option.substring(3,4).equals("6"))
			return false;

		if (Integer.parseInt(option.substring(3,4))+Integer.parseInt(option.substring(4,5))+Integer.parseInt(option.substring(5,6)) != 8)
			return false;

		if (option.substring(3,4).equals("0") && option.substring(4,5).equals("0") && option.substring(5,6).equals("0"))
			return false;

		if (option.substring(0,1).equals(option.substring(1,2)) || option.substring(0,1).equals(option.substring(2,3)))
			return false;

		if (option.substring(1,2).equals(option.substring(2,3)))
			return false;

		return true;
	}
}

/*
A senha do cofre � uma combina��o de 3 letras seguidas por 3 d�gitos no formato
LLLDDD. Al�m disso ela possui as seguintes pistas que obteve ao entreouvir
conversas dos capangas:

1 - A senha corresponde a um n�mero em hexadecimal.
DICA: Isso significa que apenas as letras A, B, C, D, E e F s�o v�lidas.
2 - N�o h� letras repetidas.
3 - As letras A e D est�o presentes na senha.
4 - O primeiro d�gito � 3 ou 6 (Eles estavam sussurrando ent�o n�o deu para ouvir
muito bem)
5 - A soma dos d�gitos � 8.
6 - O d�gito zero n�o aparece na senha
*/

/*
6 - Tomb Raider

Lara Croft, uma personagem fict�cia e a protagonista da s�rie de videojogos Tomb Raider, � apresentada como uma arque�loga brit�nica que se aventura em antigas tumbas e ru�nas perigosas ao redor do mundo � procura de artefatos valiosos.
Lara se infiltrou na base de uma organiza��o secreta e precisa abrir um cofre digital para conseguir o mapa que a levar� para sua pr�xima aventura.

A senha do cofre � uma combina��o de 3 letras seguidas por 3 d�gitos no formato LLLDDD. Al�m disso ela possui as seguintes pistas que obteve ao entreouvir conversas dos capangas:
1 - A senha corresponde a um n�mero em hexadecimal.
DICA: Isso significa que apenas as letras A, B, C, D, E e F s�o v�lidas.
2 - N�o h� letras repetidas.
3 - As letras A e D est�o presentes na senha.
4 - O primeiro d�gito � 3 ou 6 (Eles estavam sussurrando ent�o n�o deu para ouvir muito bem)
5 - A soma dos d�gitos � 8.
6 - O d�gito zero n�o aparece na senha
O cofre possui um sistema anti-roubo que dispara um alarme 5 minutos depois da primeira tentativa incorreta caso o cofre n�o seja aberto nesse meio tempo.

Lara sabe que consegue lutar sozinha e derrotar todo mundo caso o alarme soe, mas conseguir fugir sem que descubram seus planos significa menos dor de cabe�a para ela.

Sabendo que a Lara leva em m�dia 2 segundos para testar cada poss�vel senha, ser� que ela vai ser capaz de testar todas as combina��es v�lidas no cofre (caso necess�rio) antes de o alarme soar? Quanto tempo nossa hero�na levar� para testar todas essas combina��es?

Desenvolva um c�digo que liste todas as poss�veis combina��es e retorne o tempo que Lara levar� para test�-las.

Voc� pode usar sua IDE de prefer�ncia, mas n�o esque�a de colocar o c�digo abaixo e preencher o campo �Result� com o resultado gerado pelo seu c�digo.

*/