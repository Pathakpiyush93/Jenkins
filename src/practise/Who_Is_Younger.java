package practise;

public class Who_Is_Younger {

	public static void main(String[] args) {
//		piyush 25
//		dipali 23
//		akash 30
//		youger one
		int ageDipali=23;
		int agePiyush=25;
		int ageAkash=30;
		if(ageDipali<agePiyush && ageDipali<ageAkash) {
			System.out.println("Dipali is younger");
		}
		else {
			if(agePiyush<ageDipali && agePiyush<ageAkash) {
				System.out.println("Piyush is younger");
			}
			else {
				System.out.println("Akash is younger");
			}
		}
	}
}

		

	


