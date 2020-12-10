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

Em 17 de julho de 1992 chegava ao mercado o game “Ayrton Senna’s Super Monaco GP II“, um jogo que marcou o Mega Drive e especialmente os fãs brasileiros, pelo envolvimento do lendário piloto de Fórmula 1.

Ayrton Senna estava no auge de sua carreira, sendo que em 1991 já havia conquistado o tricampeonato mundial de F1 – a sua última grande conquista.

Assim nasceu “Ayrton Senna’s Super Monaco GP II“, que além de contar com a presença do piloto virtualmente, também teve sua colaboração pessoal, ao lado do pessoal da Sega, no desenvolvimento do game, sugerindo mudanças para transformá-lo em um dos jogos de corridas mais complexos e divertidos da época.

Depois de muitas pesquisas, especialistas concluíram ser possível calcular a frenagem de um veículo através de uma fórmula. De forma geral, obtemos a distância em metros (D) através da divisão da velocidade (V) ao quadrado, em quilômetros por hora, que o veículo utilizava no momento da frenagem, pelo coeficiente de atrito (250µ).

Suponha que você esteja jogando Super Monaco GP II, e esteja em uma reta. Imagine que você começa a reta a uma velocidade de 260 km/h. Quantos metros você precisará que a reta tenha para que você consiga frear totalmente o veículo, considerando µ=1?

Você pode usar sua IDE de preferência, mas não esqueça de colocar o código abaixo e preencher o campo “Result” com o resultado gerado pelo seu código.
*/