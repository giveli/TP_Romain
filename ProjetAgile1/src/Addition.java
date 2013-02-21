
public class Addition {

	public Addition() {}
	
	public int Addi(int[] TabResult) {
		
		int Result = 0;
		
		for (int i = 0; i < TabResult.length ; ++i) {
			Result += TabResult[i];
		}
		
		return Result;
	}
}
