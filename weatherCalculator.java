// Brian Lee 
//Name:Brian    Password: theonly123

import java.util.Scanner;

public class weatherCalculator {
    private static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name1 = "Brian";
        String name;

        String password1 = "theonly123";
        String password;

    System.out.println("What is your name?");
    name = in.nextLine();

    if(name.equals(name1)){
        System.out.println("What is your password?");
        password = in.nextLine();
        if(password.equals(password1)){
            System.out.println("Meet at the rendezvous at 1900");
            print("Do you want to continue? type yes, if not type exit");
            
            Scanner answer = new Scanner(System.in);
            String ans = in.nextLine();
            if(ans.equals("yes")) {	
            	System.out.println("C2FConverter");
            	print("Enter the temperature, numbers only:");
            	
            	String unit1 = "C";
            	String unit2 = "F";
            	
            	double temp = answer.nextDouble();
            	answer.nextLine();
            	System.out.println("Enter the unit, C or F:");
            	String unit3 = in.nextLine();
            	
            	if(unit3.equals(unit1)) {
            		double fahrenheit2 =(9.0/5.0*temp+32.0);
            	System.out.println("The temperature in fahrenheit is "+fahrenheit2 + unit2);
            	}
            	if(unit3.equals(unit2)){
            		double celsius2 = (5.0/9.0)*(temp-32.0);
            	System.out.println("The temperature in celsius is " +celsius2 + unit1);
            	}

            	
            	}else
            	System.out.println("The program will exit now...");
            System.exit(0);
        }else
         System.out.println("Wrong Password, please try again!");
    }
    else{
           System.out.println("Invalid user, please try again!");
    }


}
}