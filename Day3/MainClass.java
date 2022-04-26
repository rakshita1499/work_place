package Day3;

abstract class Identity{
	abstract void getName(String name); 
	  abstract void getGender(String gender); 
	  abstract void getCity(String city); 
}
 class Person extends Identity{
  void getName(String name) 
  { 
    System.out.println("Name : " +name); 
  } 
  void getGender(String gender) 
  	{ 
  System.out.println("Gender : " +gender); 
} 
void getCity(String city)
{ 
  System.out.println("City: " +city); 
} 
void getCountry(String country)
{ 
  System.out.println("Country: " +country); 
 } 
} 


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Identity i = new Person(); 
	     i.getName("RAKSHITA"); 
	     i.getGender("FEMALE"); 
	     i.getCity("BIDAR"); 
		
		

	}

}
