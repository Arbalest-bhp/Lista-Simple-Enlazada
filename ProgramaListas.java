public class ProgramaListas {
	

	public static void main(String[] args){
		ListaSimple miLista = new ListaSimple();

		miLista.insertaPrimerNodo("A");
		miLista.imprimir();
		miLista.insertarAntesPrimerNodo("B");
		miLista.imprimir();
		miLista.insertarAntesPrimerNodo("C");
		miLista.imprimir();
		
		System.out.println(miLista); //miLista.toString
		
		miLista.insertarAlFinal("D");
		System.out.println(miLista); //miLista.toString

		miLista.insertarAlFinal("E");
		System.out.println(miLista); //miLista.toString
		
		//To insert the First element depending on the second input of the value given.
		//Here, F is the letter that we want to insert between two elements.
		//A is the element we want to end up at the left side of F
		//So we would get A -> F -> B
		boolean result = miLista.insertarEntreNodos("F", "A");
		if (result){
			System.out.println("Si inserto el nodo F");
		}
		else System.out.print("No se encontro el nodo Z");
		
		System.out.println(miLista);//miLista to String()
		
		/*//Removing Nodes
		//Final Scenario in this test = C -> B -> A -> F -> D -> E
		miLista.top = miLista.top.next.next.next;
		System.out.println(miLista); //miLista to String()
		//After Execution = F -> D -> E
		
		//Clear all NODES
		miLista.top = null;
		System.out.println(miLista);//miLista to String()*/
	}
}
