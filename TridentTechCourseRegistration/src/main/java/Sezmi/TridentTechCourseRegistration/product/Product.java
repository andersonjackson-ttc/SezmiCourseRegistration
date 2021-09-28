package Sezmi.TridentTechCourseRegistration.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//the Product class creates product objects to be loaded into the database

@Entity 		//@Entity specifies that this will be an object (an object that will be loaded into the database)
				//this tag is important because it is flagged to for the repository interface that handles CRUD operations. 
public class Product 
{
	//declare variables
	private Integer id;
	private String name;
	private float price;
	
	//create class constructor
	public Product()
	{}
	
	//create overloaded class constructor with variables passed. 
	public Product(Integer id, String name, float price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}//end Product constructor
	
	@Id					//@ID declares that the following line will be a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) 	//@GeneratedValue generates a unique value for the purpose of being a primary key
	public Integer getId() 									//the getID method is going to return a uniquely generated id as the primary key
	{														//Using the strategy = GenerationType.IDENTITY allows MySQL to determine the primary key.
		return id;
	}//end getId
	
	//other getters/setters generated by Source

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}//end Product