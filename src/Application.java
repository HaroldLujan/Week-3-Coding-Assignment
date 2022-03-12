
public class Application {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    // Question 1 Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
    //Question 1b. added a new age to the array 204.
    int [] ages = {3, 9, 23, 204, 64, 2, 8, 28, 93,};
   
    // Question 1a. Subtract the first number in the array from the last number. took the 
    int subtractAgeValues = ages[ages.length -1] - ages [0];
    System.out.printf("When you subtract the first and last numbers in this ages array you get: %d\n", subtractAgeValues);
    
    //Question 1c. Use a loop to iterate through the array and calculate the average age.
    double avgSum = 0;
    for (int age : ages) {
      avgSum += age;    
    }
    System.out.printf("The average age in the ages array is: %.2f\n", avgSum / ages.length);
    
    //Question 2 Create an array of String called s that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
    String [] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
    
    //Question 2a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
    double avgChar = 0;
    for(String name : names) {
      avgChar += name.length();
      
    }
    System.out.printf("The number of letters in each name is: %.2f\n",avgChar/names.length);
    //Question 2b.Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console
    String name1 = " ";
    for(String name : names) {
      name1 = name1 + name + " ";
    }
    System.out.printf("These are the names in the names array:%s\n", name1);
    //Question 3 How do you access the last element of any array?
    System.out.printf("This is the last element in the ages array: %d\n", ages[ages.length-1]);
    //Question 4 How do you access the first element of any array?
    System.out.printf("This is the first element in the names array: %s\n", names[0]);
    //Question 5 Create a new array of int called nameLengths. 
    //Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
    int [] nameLengths = new int [names.length];
    
    for(int n = 0; n < names.length; n++) {
      String name = names[n];
      nameLengths[n] = name.length();
    }
     //Question 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
    //Print the result to the console.
    int sumOfNames =0; 
    for(int sum : nameLengths) {
    sumOfNames += sum;
    }
    System.out.printf("The sum of all the elements in the nameLengths array is: %d\n",sumOfNames);
    
    // the output of question7
    System.out.printf("This method prints a given name by however many times you need: %s\n", greeting("Harold",4));
    
    //the output of question 8
    System.out.printf("This method will print out any given first and last name: %s\n", fullName ("Harold", "Lujan"));
    
    //the output of question 9
    System.out.printf("This method will print true if the sum is greater that 100 or false if it isn't: %s\n", sumInts(ages));
    
    // creating the first double array and printing out its average for question 10.
    double[] double1 = {2.99, 4.75, 11.28, 20.99};
    System.out.printf("This will print out the avgerage of double1: %.2f\n", sumAvg (double1));
    
    //creating the second array that will get compared to the first array to print out true or false is its greater than 100 for question 11.
    double[] double2 = {4.99, 2.12, 9.00, 12.25};
    System.out.printf("This method will check to see if double2 array is larger than double1 array and print: %s\n",sumAvgDouble(double1,double2));
    
    //this is the output for question 12
    boolean isHotOutside = true;
    double moneyInPocket = 10.50;
    System.out.printf("This method will print :%s\n", willBuyDrink(isHotOutside, moneyInPocket));
    
    //this is the output for question 13.
    double x = 29.75;
    double y = 34.50;
    double z = 45.90;
    System.out.printf("This will print out the average of these doubles: %.2f", doubleAvg(x,y,z));
   } // end of main method
  
    //Question7.  Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
    //(i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
    public static String greeting(String word, int n) {
      String wordConcant = "";
      for(int i = 0; i< n; i++) {
        wordConcant += word;
    }
      return wordConcant;
      
   }
    //Question 8 Write a method that takes two Strings, firstName and lastName, and returns a full name.
    //(the full name should be the first and the last name as a String separated by a space).
    public static String fullName(String firstName, String lastName){
      return firstName +" "+ lastName;
   }// end of fullName method
    
    //Question 9 Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
    public static boolean sumInts(int[] num) {
    int total =0;
    for(int num1 : num) {
      total += num1;
      
     }
     
     if (total >100) {
     return true;
     }
     else {
       return false;
     }
    }//end of sumInts method
    
      //Question 10 Write a method that takes an array of double and returns the average of all the elements in the array.
      public static double sumAvg(double[] double1) {
      double total =0;
      for(double num1 : double1) {
        total += num1;
        
        }
      return total/double1.length;
      }
      //Question 11 Write a method that takes two arrays of double
      //and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
      public static boolean sumAvgDouble(double[] firstDouble, double[] secondDouble) {
        if(sumAvg(firstDouble) > sumAvg (secondDouble)) {
          return true;
        }
          return false;
     }//end of sumAvgDouble method
      
      //Question 12 Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
      //and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
      public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
      if(isHotOutside && moneyInPocket >= 10.50) {
      return true;
      }
      return false;
      }//end of willBuyDrink method
      
      //Question 13 Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
      // please see added java doc for information on what this method does.
      /***
       * takes the sum of 3 doubles and returns the average.
       * @param x   the first double
       * @param y   the second double
       * @param z   the third double
       * @return    takes the sum of all 3 doubles and divides them by 3.
       */
      public static double doubleAvg(double x, double y, double z) {
        return (x + y +z)/3;
      }
    }// end of application
