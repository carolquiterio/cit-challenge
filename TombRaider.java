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
A senha do cofre é uma combinação de 3 letras seguidas por 3 dígitos no formato
LLLDDD. Além disso ela possui as seguintes pistas que obteve ao entreouvir
conversas dos capangas:

1 - A senha corresponde a um número em hexadecimal.
DICA: Isso significa que apenas as letras A, B, C, D, E e F são válidas.
2 - Não há letras repetidas.
3 - As letras A e D estão presentes na senha.
4 - O primeiro dígito é 3 ou 6 (Eles estavam sussurrando então não deu para ouvir
muito bem)
5 - A soma dos dígitos é 8.
6 - O dígito zero não aparece na senha
*/

/*
6 - Tomb Raider

Lara Croft, uma personagem fictícia e a protagonista da série de videojogos Tomb Raider, é apresentada como uma arqueóloga britânica que se aventura em antigas tumbas e ruínas perigosas ao redor do mundo à procura de artefatos valiosos.
Lara se infiltrou na base de uma organização secreta e precisa abrir um cofre digital para conseguir o mapa que a levará para sua próxima aventura.

A senha do cofre é uma combinação de 3 letras seguidas por 3 dígitos no formato LLLDDD. Além disso ela possui as seguintes pistas que obteve ao entreouvir conversas dos capangas:
1 - A senha corresponde a um número em hexadecimal.
DICA: Isso significa que apenas as letras A, B, C, D, E e F são válidas.
2 - Não há letras repetidas.
3 - As letras A e D estão presentes na senha.
4 - O primeiro dígito é 3 ou 6 (Eles estavam sussurrando então não deu para ouvir muito bem)
5 - A soma dos dígitos é 8.
6 - O dígito zero não aparece na senha
O cofre possui um sistema anti-roubo que dispara um alarme 5 minutos depois da primeira tentativa incorreta caso o cofre não seja aberto nesse meio tempo.

Lara sabe que consegue lutar sozinha e derrotar todo mundo caso o alarme soe, mas conseguir fugir sem que descubram seus planos significa menos dor de cabeça para ela.

Sabendo que a Lara leva em média 2 segundos para testar cada possível senha, será que ela vai ser capaz de testar todas as combinações válidas no cofre (caso necessário) antes de o alarme soar? Quanto tempo nossa heroína levará para testar todas essas combinações?

Desenvolva um código que liste todas as possíveis combinações e retorne o tempo que Lara levará para testá-las.

Você pode usar sua IDE de preferência, mas não esqueça de colocar o código abaixo e preencher o campo “Result” com o resultado gerado pelo seu código.

*/