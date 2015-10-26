package modelo;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
	
	List<Item> listaInventario = new ArrayList<Item>();
	
	public Inventario(List<Item> listaProdutos) {
		this.listaInventario = listaProdutos;
	}
	
	public List<Item> getListaInventario() {
		return listaInventario;
	}
	
	public void setListaInventario (List<Item> listaInventario) {
		this.listaInventario = listaInventario;
	}

}
