
public class Main {

	public static void main(String[] args) {

		boolean needToLearn = true;
		String concept = "Collections";
		String unknownConcept = "Generics";
		while (needToLearn) {
			studyConcept(concept, unknownConcept);
			discussConcept();
			workWithOthers();
		}
		
	}

	private static void studyConcept(String concept, String unknownConcept) {
		if (unknownConcept != null) {
			studyConcept(unknownConcept, null);
		}
	}
	
	private static void discussConcept() {
		
	}
	
	private static void workWithOthers() {
		
	}
	
}
