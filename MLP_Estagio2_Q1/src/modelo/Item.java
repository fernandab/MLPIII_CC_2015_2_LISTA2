package modelo;

public class Item implements Comparable<Item>{
	
	private int codItem;
	private String descItem;
	
	//get and set
	public int getCodItem () {
		return codItem;
	}
	
	public void setCodItem (int codItem) {
		this.codItem = codItem;
	}
	
	public String getdescItem () {
		return descItem;
	}
	
	public void setDescitem (String descItem){
		this.descItem = descItem;
	}

	//compareTo comparando a outro item
	@Override
	public int compareTo(Item outroItem) {
		// TODO Auto-generated method stub
		if (this.codItem < outroItem.codItem) {
			return -1;			
		}
		if (this.codItem > outroItem.codItem) {
			return 1;
		}
		return 0;
	}
	
	public String toString(){
		return "\nCODIGO DO ITEM: " + this.codItem + "\nDESCRICAO DO ITEM: " + this.descItem;
	}
	
	

}
