// Carrie Krueger
// 1-30-23
// Chapter 2 Notes: Output and Escape Sequences

public class Ch2OutputEscape {
    public static void main(String[] args) {
        
        escape(); //in this method we will explore output and escape sequences
    }

    //a method to investigate output and escape sequences
    public static void escape() {

        // print vs. println

        System.out.print("Hello Class!"); // next thing prints on same line
        System.out.println("It is Monday."); // next thing prints on next line
        System.out.println("Another week...");
        System.out.println();  // prints blank line (new line)

        // OUTPUT 
        System.out.println(2); // you can put text or numbers in print statement
        System.out.println(1 + 2 * 3);  // can even do math! (order of operations)

        // Escape Sequences
        // special characters denoted with \ (the escape character)

        // \n -> new line 
        System.out.print("Hello\n\n\n\n");
        System.out.println("Hi The\n\nre!");
        System.out.println();

        // \t -> tab
        System.out.println("Hi\tagain");
        System.out.println("Hel\t\t\tlo");
        System.out.println();

        // \\ -> \
        System.out.println("\\");
        System.out.println();

        // \"  -> "
        System.out.println("She said \"Java is the best language!\"");

        // You Try!

        // Think of a quotation/saying that you know
        // Create a new class: PrintQuote.java
        // Output your saying with visible quotation marks in the output

        //ex. output: "That's the way the cookie crumbles."


    }


}
