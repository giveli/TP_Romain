
public class ExtractionNumb {

	public ExtractionNumb() {}
	
	public int[] Extract(String addition) {

		String[] roman = addition.split(" ");
		int taille = roman.length;
		RomanToNumeral RomanConvert;
		
		int tabResult[] = new int[taille - (taille -1)];
		
		for (int i = 1; i <= taille ; i+=2) {
			RomanConvert = new RomanToNumeral();
			tabResult[i - 1] = RomanConvert.Convert(roman[i]);	
		}
	
		return tabResult;
	}
}
