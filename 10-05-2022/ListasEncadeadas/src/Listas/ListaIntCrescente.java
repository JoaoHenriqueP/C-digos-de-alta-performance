package Listas;

public class ListaIntCrescente {

	private class NO {
		int dado;
		NO prox;
	}

	NO lista = null;

	public void insere(int elemento) {

		NO novo = new NO();
		novo.dado = elemento;

		if (lista == null) { // Se a lista está vazia
			novo.prox = null;
			lista = novo;
		} else {
			if (novo.dado < lista.dado) { // Se o nó for o primeiro da lista
				novo.prox = lista;
				lista = novo;
			} else {
				NO aux = lista;
				boolean achou = false;
					while (aux.prox != null && !achou) {
						if (aux.prox.dado < novo.dado) {
							aux = aux.prox;
						}else {
							achou = true;
						}
					}
					novo.prox = aux.prox;
					aux.prox = novo;
			}
		}

	}
	public void show() {
		NO aux = lista;
		while (aux!=null) {
			System.out.println("Dado:"+ aux.dado);
			aux = aux.prox;
		}
	}

}
