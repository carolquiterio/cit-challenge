public class YoshiIsland
{
	public static void main (String[] args)
	{
		try
		{
			int yoshisTotal = 1000;
			int islandsTotal = 450+330+340;
			int twoIslandsTotal = 200+180+100;
			int threeIslandsTotal = 30;

			int totalYoshisInTheIsland = calculatesYoshisTotal(islandsTotal, twoIslandsTotal, threeIslandsTotal);
			System.out.println("Total Yoshis living on the islands: " + totalYoshisInTheIsland); // I found it necessary to print the total of yoshis to be clearer to you guys :)

			int totalYoshisThatDontLike = yoshisTotal - totalYoshisInTheIsland;
			System.out.println("Total Yoshis who don't live on any island: " + totalYoshisThatDontLike);

			int totalYoshiInJustOneIsland = islandsTotal - twoIslandsTotal - threeIslandsTotal;
			System.out.println("Total Yoshis who live on just one island: " + totalYoshiInJustOneIsland);
		}
		catch (Exception err)
		{
			System.out.println(err.getMessage()); //in this case it will never give an error, but if someone change the values the error is already been treated
		}
	}

	private static int calculatesYoshisTotal(int geralTotal, int totalToBeDiscountedFromTwoIsland, int totalToBeDiscountedFromThreeIsland) throws Exception
	{
		if (geralTotal <= 0 || totalToBeDiscountedFromTwoIsland < 0 || totalToBeDiscountedFromThreeIsland <0)
			throw new Exception("Invalid islands number!");

		return geralTotal - (totalToBeDiscountedFromTwoIsland/2) - (totalToBeDiscountedFromThreeIsland/3);
	}
}

/*
5 - Yoshi's Island

Mario e a Princesa Peach, fizeram uma pesquisa com 1000 Yoshis que vivem no Dinosaur Land (universo do Super Mario World) e concluíram que:
450 gostam de viver no Yoshi's Island.
330 gostam de viver no Chocolate Island.
340 gostam de viver Cookie Mountain.
200 gostam de viver Yoshi's Island e Chocolate Island.
180 gostam de viver Yoshi's Island e Cookie Mountain.
100 gostam de viver no Chocolate Island e Cookie Mountain.
30 gostam dos três locais para viver.

Ajude Mario e Peach a entenderem qual o número de Yoshis que não gostam de nenhuma destas localidades e que gostam apenas de uma única localidade!
Você pode usar sua IDE de preferência, mas não esqueça de colocar o código abaixo e preencher o campo “Result” com o resultado gerado pelo seu código.



*/