public class RomanToNumeral {
	
	public RomanToNumeral() {}
	
	public int Convert(String roman) {
		if (roman.equals("")) { 
			System.out.println("erreur chaine vide");
			return -1; 
		}
		int taille = roman.length();
		int compteur = 0;
		String[] carac = roman.split("");
		int TabNum[] = new int[taille];
		ConstructTab(TabNum, carac, taille);
		compteur = Comptage(taille, compteur, TabNum);
		System.out.println(roman + " est égal à : " + compteur);
		return compteur;
		
	} // Convert()
	
	private void ConstructTab(int[] TabNum, String[] carac, int taille) {
		for(int i = 1 ; i <= taille ; ++i) {
			if (carac[i].equals("I"))
				TabNum[i-1]++;
			else if (carac[i].equals("V"))
				TabNum[i-1] = 5;
			else if (carac[i].equals("X"))
				TabNum[i-1] = 10;
			else if (carac[i].equals("L"))
				TabNum[i-1] = 50;
			else if (carac[i].equals("C"))
				TabNum[i-1] = 100;
			else if (carac[i].equals("M"))
				TabNum[i-1] = 1000;
			else {
				System.out.println("Caractère invalide : " + carac[i] +
						", il sera enlevé !");
				TabNum = null; break;
			}
		}
	}// ConstructTab()
	
	private int Comptage(int taille, int compteur, int[] TabNum) {
		boolean derElem = true;
		for(int i = 0 ; i < taille-1 ; ++i) {
			if (TabNum[i] < TabNum[i+1]) {
				compteur += (TabNum[i+1] - TabNum[i]);
				++i; derElem = false;
			}
			else {
				if (TabNum[i] == 1) {
					++compteur;
					System.out.println("caca");
				}
				else if (TabNum[i] == 5)
					compteur += 5;
				else if (TabNum[i] == 10)
					compteur += 10;
				else if (TabNum[i] == 50)
					compteur += 50;
				else if (TabNum[i] == 100)
					compteur += 100;
				else if (TabNum[i] == 1000)
					compteur += 1000;
			}
		}
		
		if (derElem) {
			if (TabNum[taille-1] == 1)
				++compteur;
			else if (TabNum[taille-1] == 5)
				compteur += 5;
			else if (TabNum[taille-1] == 10)
				compteur += 10;
			else if (TabNum[taille-1] == 50)
				compteur += 50;
			else if (TabNum[taille-1] == 100)
				compteur += 100;
			else if (TabNum[taille-1] == 1000)
				compteur += 1000;
		}
		return compteur;
	} // Comptage()

} //class RomanToNumeral
