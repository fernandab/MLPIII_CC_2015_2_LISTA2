package controle;

import modelo.Item;

public interface Comparator<I> {
	
	String compare(I i1, I i2);
	Integer compare(Item i1, Item i2);

}
