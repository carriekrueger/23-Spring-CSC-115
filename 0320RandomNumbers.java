// Carrie Krueger
// 3-20-23
// Making random numbers using the Random class 

// We are going to use a premade Java class (Random)
import java.util.Random;



public class RandomNumbers {
    public static void main(String[] args) {
        
        makeRandoms(); // method for making and printing random integers
    }

    // this method looks at making random integers in a range
    public static void makeRandoms() {

        // HOW TO MAKE RANDOM INTEGERS USING THE RANDOM CLASS
       
        // Step 1: Instantiate (create) a Random object
        // (make an instance of the Random class)
        // This is NOT the random number, but what we will use to get the 
        // random number

        Random rand = new Random(); 

        // Step 2: use the .nextInt(int) method to generate a random integer
        // in a range
        // integer generated is between 0 and int - 1 (exclusive of int)

        int randomNumber = rand.nextInt(100);   // gives an int between 0 - 99
        System.out.println(randomNumber);

        // How to get a random int between 1 and 100?

        randomNumber = rand.nextInt(101);  // not quite - 0 to 100

        System.out.println(rand.nextInt(100) + 1);  // end result: 1 - 100
                            //         0 - 99 = 1 - 100

        // How about a random integer between 75 - 100?
        
        int randomNum2 = rand.nextInt(26) + 75;
                              //      0 - 25 + 75 =  75 - 100     
                              
        // Formula/Rule?
        // # inside (): max # - min # + 1 [number of numbers in the range]
        // # added on outside: min # (starting number)  
        
        // How about a random integer between 20 and 50?

        randomNumber2 = rand.nextInt(31) + 20;

        // Live code demo in Brightspace!
                   
    }

}
