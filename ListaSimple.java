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
	


}