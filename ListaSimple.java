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
	
	//Insertion at the end of a list
	public void insertarAlFinal(String nombre){
		//create new node
		temp = new Node();
		temp.name = nombre;
		temp.next = null;
		Node temp2;
		temp2 = this.top;

		//rerun list to reach the end -- then insert the new node by adding it as the last node
		while(temp2.next != null)
			temp2 = temp2.next;

		//Eliminate the temporary variables
		temp2.next = temp;
		temp = null;
		temp2 = null;
	}	
	//Insertion between two nodes
	public boolean insertarEntreNodos(String nombre, String buscado){
		Node temp = new Node;
		temp.name = nombre;
		Node temp2 = this.top;
			
		//boolean NodoNoEncontrado = true;
			
		while((temp2 != null)
		      && temp2.name.equals(buscado) == false){
			temp2 = temp2.next;
		}
		if (temp2 != null){ //Node has been found
			temp.next = temp2.next;
			temp2.next = temp;
			temp = null;
			temp2 = null;
			return true;
		}
		else return false;
		
	}
	//Removal of Nodes
	//Removing the first Node
	public void borrarPrimerNodo{
		this.top = this.top.next;
	}
	
	//Removing a node that is not the first
	public boolean borrarCualquierNodo(String buscado){
		Node temp = this.top;
		while((temp != null)
		      && temp.name.equals(buscado) == false){
			temp = temp.next;
		}
		if (temp != null){ //Node has been found
			temp.next = temp.next.next;
			temp = null;
			return true;
		}
		else return false;
		}
	}
	/*To remove a node
	
	top = top.next*/
}
