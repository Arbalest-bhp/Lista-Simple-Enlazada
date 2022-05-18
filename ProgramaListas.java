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
		
		boolean result = miLista.insertarEntreNodos("F", "A");
		if (result){
			System.out.println("Si inserto el nodo F");
		}
		else System.out.print("No se encontro el nodo Z");
		
		System.out.println(miLista);//miLista to String()
	}
}
