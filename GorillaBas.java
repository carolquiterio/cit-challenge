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

Quem foi criança na década de 80 ou 90 e teve ou conhece alguém que tinha computador naquela época já viu ou jogou esse jogo: trata-se de dois gorilas que ficam jogando bananas explosivas de cima dos prédios (depois procure vídeos no youtube, a música de entrada é incrível).

O jogo foi feito em Qbasic e distribuído em algumas versões do DOS e do Windows: MS-DOS 5, Windows 3.1x, Windows 95/98 e Windows NT 4.0.
Supondo movimento retilíneo uniforme, com uma velocidade de 80 km/h e um ângulo de 45 graus, qual a distância horizontal que a banana percorrerá após 5 segundos.

Você pode usar sua IDE de preferência, mas não esqueça de colocar o código abaixo e preencher o campo “Result” com o resultado gerado pelo seu código.

*/