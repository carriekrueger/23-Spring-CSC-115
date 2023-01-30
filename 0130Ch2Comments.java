// Carrie Krueger
// 1-30-23
// Chapter 2 Notes: comments


public class Ch2Comments {

    public static void main(String[] args) {

        comments(); // in this method we will explore comments
    }

    // a method to investigate comments
    public static void comments() {

        // anything that you write in a comment is NOT read by the computer/compiler

        // We use comments for:
        // -Adding your name to the program
        // -Adding a brief description of the program
        // -As you go along, to explain to others (and yourself) what your code should do

        // ALSO: Debugging 
        // If there's code that doesn't work quite yet
        // If there's a bunch of lines of code that don't work and you want to isolate  an error

        // GIVE CREDIT
        // If you use someone else's code, use comments to credit the source
        // ex. shamelessly stolen from https://github.com/awesomecoder
        
        // HOW DO WE MAKE COMMENTS?

        // Line comments: anything after the // is ignored by the compiler
        // Block comments: /* */ (slash star star slash) (comment sandwich)
        // Java Doc comments: /**  */ will automatically generate code documentation

        // Examples:

        /* When you have multiple lines of comments
           it's helpful to do a block comment
           because you can do as many lines as you want. 
           Good for top heading comment.
        */   

        // Debugging 

        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        //System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        /*
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        */
        System.out.println("Hello World!");


    }


}
