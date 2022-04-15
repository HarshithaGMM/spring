package tnsif.c2tc.b09.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tnsif.c2tc.b09.Entity.Item;
import tnsif.c2tc.b09.Service.ItemService;

@RestController
public class ItemController {
	@Autowired
	ItemService service;
	@RequestMapping("/addEmployee")
	public void addItem(@RequestBody Item item)
	{
		service.addItem(item);
	}
	@GetMapping("/getItem/{id}")
	public Item getItem(@PathVariable int id)
	{
		return service.getItem(id);
	}
	
	@PutMapping("/updateItem")
	public Item updateItem(@RequestBody Item item)
	{
		return service.updateItem(item);
	}
	@DeleteMapping("/deleteitem/{id}")
	public int deleteItem(@PathVariable int id)
	{
		return service.deleteItem(id);
	}


}
