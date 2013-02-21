
public class RomanComputer {

	public Object compute(String string) {
		
		ExtractionNumb Membre = new ExtractionNumb();
		int TabResult[] = Membre.Extract(string);
		
		Addition Add = new Addition();
		int Result = Add.Addi(TabResult);
		
		return null;
	}

}
