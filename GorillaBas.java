import java.math.BigDecimal;
import java.math.RoundingMode;

public class GorillaBas
{
	public static void main (String[] args)
	{
		try
		{
			double initialPosition = 0;
			double velocity = 80;
			double time = 5;

			System.out.println(calculatesDistance(initialPosition, velocity, time) + "km");
		}
		catch (Exception err)
		{
			System.out.println(err.getMessage()); //in this case it will never give an error, but if someone change the values the error is already been treated
		}
	}

	private static double calculatesDistance(double initialPosition, double velocity, double time) throws Exception
	{
		if (time <= 0)
			throw new Exception ("Invalid time!");

		BigDecimal roundedTime = new BigDecimal(time/3600).setScale(3, RoundingMode.HALF_EVEN); //just to round the values

		return (initialPosition + velocity) * roundedTime.doubleValue();
	}
}

/*
3 - Gorilla BAS

Quem foi crian�a na d�cada de 80 ou 90 e teve ou conhece algu�m que tinha computador naquela �poca j� viu ou jogou esse jogo: trata-se de dois gorilas que ficam jogando bananas explosivas de cima dos pr�dios (depois procure v�deos no youtube, a m�sica de entrada � incr�vel).

O jogo foi feito em Qbasic e distribu�do em algumas vers�es do DOS e do Windows: MS-DOS 5, Windows 3.1x, Windows 95/98 e Windows NT 4.0.
Supondo movimento retil�neo uniforme, com uma velocidade de 80 km/h e um �ngulo de 45 graus, qual a dist�ncia horizontal que a banana percorrer� ap�s 5 segundos.

Voc� pode usar sua IDE de prefer�ncia, mas n�o esque�a de colocar o c�digo abaixo e preencher o campo �Result� com o resultado gerado pelo seu c�digo.

*/