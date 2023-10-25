package in.bip;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.bip.entity.Book;
import in.bip.repo.bookrepo;
import sun.jvm.hotspot.ui.FindByQueryPanel;

@SpringBootApplication
public class CrudImplementationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(CrudImplementationApplication.class, args);
		bookrepo repo =context.getBean(bookrepo.class);
		
		Book b1 = new Book();
//		=================================
//             save() 
		
// this is used to insert a record into database one by one.
		b1.setBookId(102);
		b1.setBookName("alpha");
		b1.setBookPrice(1800.0);
		repo.save(b1);
		System.out.println("Record inserted ...............");
		
		
//     ========================================
//            saveall()
		/*
		Book b2 = new Book();
		b2.setBookId(109);
		b2.setBookName("Android");
		b2.setBookPrice(2170.0);
		
		Book b3 = new Book();
		b3.setBookId(109);
		b3.setBookName("c");
		b3.setBookPrice(8000.0);
		
		repo.saveAll(Arrays.asList(b2,b3));
		// if Arrays.asList(b2,b3) == List<Book> al = new ArrayList<>();
		//							  al.add(b2);
		//							  al.add(b3);
		//	                          repo.saveAll(al);
	
		*/
//      ===============================================
//				existById(int)
		/*
		boolean status1 = repo.existsById(101);
		System.out.println("Status of this searched book is :"+status1);
		*/
//      ===============================================
//				count() -> return type is long
		/*
		long records =repo.count();
		System.out.println("The totle numbers of record in database is:"+records);
		*/
//      ===============================================
//				findById() --> return type is optional
		/*
		Optional<Book>  book =repo.findById(1022);
		if(book.isPresent())
		{
			System.out.println(book.get());
		}
		else
		{
			System.out.println("Book with this id is not present");
		}
		*/
//      ===============================================
//				findAllById() --> return type is optional
		/*
		Iterable<Book> books =repo.findAllById(Arrays.asList(101,103,107,301));
		for(Book b:books)
		{
			System.out.println(b);
			// it will only return the boooks which will present among these ids.
		}
		*/
//      ===============================================
//				findAll() --> it is equal to select * from table.
		/*
		Iterable<Book> books = repo.findAll();
		for(Book b : books)
		{
			System.out.println(b);
		}
		*/
//      ===============================================
//			DeleteBYId() --> delete record based on given PK.
		/*
		repo.deleteById(1);
	// if the id doesnot present it will through an exception in order to avoid this we can write this as
	   
		if(repo.existsById(101))
		{
			repo.deleteById(101);
		}
		else
		{
			System.out.println("This id is not in the table");
		}
		*/
		
//      ===============================================
//			DeleteAllBYId() --> delete records based on multiples PK
		/*
		repo.deleteAllById(Arrays.asList(101,103,2));
		*/	
//      ===============================================
//			Delete(E) --> delete based on the given entity obj.
		/*
		Book b3 = new Book();
		b3.setBookName("Jinkins");
		b3.setBookPrice(1750.0);
		repo.delete(b3);
		*/
//      ===============================================
//			DeleteAll() --> it is used to delete all records from the table.
		/*
		repo.deleteAll();
		*/
		
	
		
	}

}
