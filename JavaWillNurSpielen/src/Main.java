
public class Main {

	public static void main(String[] args) {

		Vertex v1 = new Vertex(42, 34);
		Vertex maus = new Vertex(3, 54);
		Vertex v3 = v1.skalarMult(3.14);
		Vertex katze = new Vertex(1,1);
		Vertex elefant = katze.add(maus);
		
		
		
		System.out.println(katze);
		katze.addMod(maus);
		System.out.println(katze);
		System.out.println(elefant);

	
		
	//	System.out.println(v1.length());
	


	}

}
