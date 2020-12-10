public class AyrtonSennasSuperMonaco
{
	public static void main(String[] args)
	{
		try
		{
			float velocity = 260;
			float frictionCoefficient = 1f;

			System.out.println(calculatesBraking(velocity, frictionCoefficient) + " meters");
		}
		catch (Exception err)
		{
			System.out.println(err.getMessage()); //in this case it will never give an error, but if someone change the values the error is already been treated
		}
	}

	private static float calculatesBraking (float velo, float coef) throws Exception
	{
		if (velo == 0 || coef ==0)
			throw new Exception("Invalid parameters!");

		return (velo*velo) / (250*coef);
	}
}

/*
7 - Ayrton Senna's Super Monaco GP II

Em 17 de julho de 1992 chegava ao mercado o game �Ayrton Senna�s Super Monaco GP II�, um jogo que marcou o Mega Drive e especialmente os f�s brasileiros, pelo envolvimento do lend�rio piloto de F�rmula 1.

Ayrton Senna estava no auge de sua carreira, sendo que em 1991 j� havia conquistado o tricampeonato mundial de F1 � a sua �ltima grande conquista.

Assim nasceu �Ayrton Senna�s Super Monaco GP II�, que al�m de contar com a presen�a do piloto virtualmente, tamb�m teve sua colabora��o pessoal, ao lado do pessoal da Sega, no desenvolvimento do game, sugerindo mudan�as para transform�-lo em um dos jogos de corridas mais complexos e divertidos da �poca.

Depois de muitas pesquisas, especialistas conclu�ram ser poss�vel calcular a frenagem de um ve�culo atrav�s de uma f�rmula. De forma geral, obtemos a dist�ncia em metros (D) atrav�s da divis�o da velocidade (V) ao quadrado, em quil�metros por hora, que o ve�culo utilizava no momento da frenagem, pelo coeficiente de atrito (250�).

Suponha que voc� esteja jogando Super Monaco GP II, e esteja em uma reta. Imagine que voc� come�a a reta a uma velocidade de 260 km/h. Quantos metros voc� precisar� que a reta tenha para que voc� consiga frear totalmente o ve�culo, considerando �=1?

Voc� pode usar sua IDE de prefer�ncia, mas n�o esque�a de colocar o c�digo abaixo e preencher o campo �Result� com o resultado gerado pelo seu c�digo.
*/