public class Metroid {

    public static void main(String[] args)
    {
		try
		{
			int distanceToBeCovered = 149600000;
			int averageSpeed = 28440;
			int hours = 24;

			System.out.println(calculatesTimeInDays(distanceToBeCovered, averageSpeed, hours));
		}
		catch (Exception err)
		{
			System.out.println(err.getMessage()); //in this case it will never give an error, but if someone change the values the error is already been treated
		}
	}

	private static int calculatesTimeInDays(int dist, int speed, int hor) throws Exception
	{
		if (dist==0 || hor==0 || speed==0)
			throw new Exception("Invalid parameters!");

		return (dist / speed) / hor;
	}
}

/*
public class Metroid {

    public static void main(String[] args)
    {
        int distanciaASerPercorrida = 149600000;
		int velocidadeMedia = 28440;
		int horas = 24;

		int tempoEmDias = (distanciaASerPercorrida / velocidadeMedia) / horas;

		System.out.println(tempoEmDias);
	}
}

1 - Metroid

Metroid � uma s�rie de videogames da Nintendo. A hist�ria se passa num cen�rio de fic��o cient�fica, inspirado nos filmes Alien que tem como personagem a ca�adora de recompensas Samus Aran.

Samus Aran est� � procura do Metroid roubado pelos Piratas do espa�o. Para isso ela precisa ir ao planeta Zebes.
Considerando a dist�ncia a ser percorrida (149.600.000 km) e a velocidade m�dia de sua nave (28.440 km/h), construa um c�digo que determinar� o tempo em dias que ser� necess�rio para percorrer essa dist�ncia.

Voc� pode usar sua IDE de prefer�ncia, mas n�o esque�a de colocar o c�digo abaixo e preencher o campo �Result� com o resultado gerado pelo seu c�digo.
*/