import java.io.*;
 
// Main class
class GFG {
 
    // Main driver method
    public static void main(String args[]) {
 
        // Reading content from file by passing local directory path
        // where file should exists
        FileInputStream GFG
            = new FileInputStream("/Desktop/GFG.txt");
 
        // This file does not exist in the location
        // This constructor FileInputStream
        // throws FileNotFoundException which
        // is a checked exception
    }

}
#feature202 changes by venkat for the module reports on 20th-apr-2020
public void writeName(String name) throws IOException {
    PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
    out.println("Name: " + name);
    out.close();
}public class PersonName {
  public String getName(String firstName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }
}

	
}static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 #feature201 changes by vivek on services module on 20th-mar-2023
 public class Main {
  static void myMethod() {
    // code to be executed
  }
}public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

