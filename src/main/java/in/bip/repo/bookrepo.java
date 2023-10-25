package in.bip.repo;

import org.springframework.data.repository.CrudRepository;

import in.bip.entity.Book;

public interface bookrepo extends CrudRepository<Book, Integer>{

}
