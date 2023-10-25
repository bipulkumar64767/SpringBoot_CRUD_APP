package in.bip.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer bookId;
	private String bookName;
	private Double bookPrice;

}
