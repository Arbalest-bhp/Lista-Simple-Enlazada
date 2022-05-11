public class ListaSimple{
	Node top;

	public boolean insertaPrimerNodo(String dato){
		if (top == null) { //Si lista es vacía
			return false;
		}
		else {
			top = new Node();
			top.name = dato;
			top.next = null;

			return true;
		}
	}

	public void imprimir(){
		for (Node temp = this.top; temp != null; temp = temp.next){
			System.out.print("[" + temp.name + "] -> ");
		}

		System.out.print("[X]\n");
	}
	
		public void toString(){
		String cadAux = "";
		for (Node temp = this.top; temp != null; temp = temp.next){
			System.out.print("[" + temp.name + "] -> ");
		}

		cadAux += "[X]\n";

		return cadAux;
	}
	
	public void insertarAntesPrimerNodo(String nombre){
		Node temp;
		temp = new Node ();
		temp.name = nombre;
		temp.next = this.top;
		this.top = temp;
		temp = null;
	}
	


}
