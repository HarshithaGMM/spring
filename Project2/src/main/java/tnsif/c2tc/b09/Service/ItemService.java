package tnsif.c2tc.b09.Service;

import tnsif.c2tc.b09.Entity.Item;

public interface ItemService {

	public Item getItem(int id);

	public void addItem(Item item);

	public Item updateItem(Item item);

	public int deleteItem(int id);

}
