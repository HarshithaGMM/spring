package tnsif.c2tc.b09.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tnsif.c2tc.b09.Entity.Item;



public interface ItemRepo extends
                  //CrudRepository<Student, Integer> {
                  JpaRepository<Item, Integer>{ 



}
