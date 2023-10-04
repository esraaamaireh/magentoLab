import java.security.SecureRandom;
import java.util.Random;

public class Parameters {

	static  String URL="https://magento.softwaretestingboard.com/customer/account/login/";
	static  String SignupUrl="https://magento.softwaretestingboard.com/customer/account/create/";
	
      private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?";
	   
	static int numberOfFirstNames = 10; // Number of first names to generate
	static  int numberOfLastNames = 10; // Number of last names to generate
	static  int min = 2; // Minimum value
       static int max = 4; // Maximum value
       static Random random = new Random();

       static int randomNumber = random.nextInt((max - min) + 1) + min;
       static  String randomNumberText = Integer.toString(randomNumber);

	  
	public static void main(String[] args) {
	      
		        for (int i = 0; i < numberOfFirstNames; i++) {
		        	String randomFirstName = generateRandomName(5); // 5 is the length of the first name
		           
		        }

		       
		        for (int i = 0; i < numberOfLastNames; i++) {
		            String randomLastName = generateRandomName(8);}} // 8 is the length of the last name


		        
		    

		    // Function to generate a random string of a specified length
	       static String generateRandomName(int length) {
		        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		        Random random = new Random();
		        StringBuilder randomName = new StringBuilder(length);

		        for (int i = 0; i < length; i++) {
		            int randomIndex = random.nextInt(characters.length());
		            char randomChar = characters.charAt(randomIndex);
		            randomName.append(randomChar);
		        }

		        return randomName.toString();
	       }

		       
		         static String generateRandomPassword(int length) {
		            SecureRandom random = new SecureRandom();

		      
		            
		            StringBuilder password = new StringBuilder();

		            for (int i = 0; i < length; i++) {
		                int randomIndex = random.nextInt(CHARACTERS.length());
		                char randomChar = CHARACTERS.charAt(randomIndex);
		                password.append(randomChar);
		            }

		            return password.toString();
		        
		    
		 
		    
	       };
	     
	   	
	   	static	String fNameGenereate=generateRandomName(5);
	   	static	String lNameGenereate=generateRandomName(5);
	   	static	String email= fNameGenereate+lNameGenereate+randomNumberText+"@gmail.com";
	   	static String passWord = generateRandomPassword(12);
	   	}

	