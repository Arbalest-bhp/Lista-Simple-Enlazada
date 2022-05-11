public class ProgramaListas {
	

	public static void main(String[] args){
		ListaSimple miLista = new ListaSimple();

		miLista.insertaPrimerNodo("A");
		miLista.imprimir();
		miLista.insertarAntesPrimerNodo("B");
		miLista.imprimir();
		miLista.insertarAntesPrimerNodo("C");
		miLista.imprimir();

	}
}
