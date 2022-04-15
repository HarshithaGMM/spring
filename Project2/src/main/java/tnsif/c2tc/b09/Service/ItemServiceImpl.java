package tnsif.c2tc.b09.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnsif.c2tc.b09.Entity.Item;
import tnsif.c2tc.b09.Repo.ItemRepo;
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	ItemRepo ir;

	@Override
	public Item getItem(int id) {
		Item it=ir.findById(id).get();
		return it;
	}

	@Override
	public void addItem(Item item) {
		ir.save(item);
		
	}

	@Override
	public Item updateItem(Item item) {
		Item it=ir.save(item);
		return it;
	}

	@Override
	public int deleteItem(int id) {
		Item it=ir.findById(id).get();
		ir.delete(it);
		return 1;
	}

}
