public class ProgramaListas {
	

	public static void main(String[] args){
		ListaSimple miLista = new ListaSimple();

		miLista.insertaPrimerNodo("A");
		miLista.imprimir();
		miLista.insertaAntesPrimerNodo("B");
		miLista.imprimir();
		miLista.insertaAntesPrimerNodo("C");
		miLista.imprimir();
		System.out.println(miLista); // miLista.toString();

		miLista.insertaAlFinal("D");
		System.out.println(miLista); // miLista.toString();

		miLista.insertaAlFinal("E");
		System.out.println(miLista); // miLista.toString();

		boolean result = miLista.insertaEntreNodos("F", "A");
		if (result){
			System.out.println("Se insertó el nodo F");
		}
		else System.out.println("No se encontró el nodo Z");

		System.out.println(miLista); // miLista.toString();
		
		/*//Removing Nodes
		//Final Scenario in this test = C -> B -> A -> F -> D -> E
		miLista.top = miLista.top.next.next.next;
		System.out.println(miLista); //miLista to String()
		//After Execution = F -> D -> E
		
		//Clear all NODES
		miLista.top = null;
		System.out.println(miLista);//miLista to String()*/
		
		miLista.borrarPrimerNodo();
		System.out.println(miLista);//miLista to String()
		
		miLista.borrarCualquierNodo("F");
		System.out.println(miLista);//miLista to String()
		
		result = miLista.borrarCualquierNodo("A");
		
		if (result){
			System.out.println("Si se borro el Nodo \n");
		}
		else System.out.println("No se borro el Nodo \n");
                System.out.println(miLista);//miLista to String()
		
		miLista.borrarUltimoNodo();
		System.out.println(miLista);//miLista to String()
	}
}
