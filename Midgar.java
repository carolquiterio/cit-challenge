import java.math.BigDecimal;
import java.math.RoundingMode;

public class Midgar
{
	public static void main (String[] args)
	{
		try
		{
			double sectorArea = 0;
			double cityArea = 2827.43;
			double centralArea = 314.15;
			double sectorNumber = 8;

			System.out.println(calculatesSectorArea(cityArea, centralArea, sectorNumber) + "km�");
		}
		catch(Exception err)
		{
			System.out.println(err.getMessage());//in this case it will never give an error, but if someone change the values the error is already been treated
		}
	}

	private static double calculatesSectorArea (double city, double central, double sectorNumber) throws Exception
	{
		if (city <=0 || central <=0 || sectorNumber <=0)
			throw new Exception("Invalid parameters");

		BigDecimal roundedResult = new BigDecimal((city-central) /sectorNumber).setScale(3, RoundingMode.HALF_EVEN); //just to round the values

		return roundedResult.doubleValue();
	}
}

/*
9 - Midgar

Midgar, cidade capital no mundo Gaia (figura abaixo, vis�o superior). Palco de muitas aventuras, romances e lutas do Cloud, Tifa, Aerith e Barret onde o seu maior objetivo � proteger o mundo do consumo de excessivo de Mako, energia vital do mundo, pelo seu maior inimigo, a Shinra Electric Power Company.
Midgar � dividida em 8 setores de �reas iguais. A �rea de Midgar possui aproximadamente 2827.43 km2, sendo que a parte central da cidade possui aproximadamente 314.15 km2. Cloud e seus amigos est�o em uma side quest para evacuar os habitantes da cidade baixa no setor 7, antes que Shindra derrube o pilar de sustenta��o que levar� destrui��o do setor inteiro! Mas antes, os nossos her�is precisam saber qual o tamanho da �rea de busca! Consegue os ajudar os nossos amigos!?

Desenvolva um c�digo para que sua sa�da seja o resultado. Voc� pode usar sua IDE de prefer�ncia, mas n�o esque�a de colocar o c�digo abaixo e preencher o campo �Result� com o resultado gerado pelo seu c�digo.



*/