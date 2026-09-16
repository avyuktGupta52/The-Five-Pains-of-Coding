// Avyukt Gupta
// AP Computer Science A
// Period 6
// The Five Pains of Coding

public class TheFivePainsofCoding { // Define the class
    public static void main(String[] args) { // main function: run everything inside this
        System.out.println("I once wrote a program that wouldn't compile");
        taSmile();
        System.out.println("I searched my brain for all that I knowed");
        System.out.println("System.out.println(\"I <3 the code\");");
        addCompile();
        taSmile();
        System.out.println("I read all the notes I wrote down in class,");
        System.out.println("Looking for something that might help me pass.");
        checkNotes();
        addCompile();
        taSmile();
        System.out.println("The info I needed, oh where would it hide?");
        System.out.println("One of my classmates said \"look at the slides!\"");
        slides();
        checkNotes();
        addCompile();
        taSmile();
        System.out.println("I fixed all my syntax, the ; and \\");
        System.out.println("My program, it ran, but stopped with a crash.");
        System.out.println("I typed everything like it said in the slides");
        slides();
        checkNotes();
        addCompile();
        taSmile();
        System.out.println("With effort and patience I wrote perfect source,\nIt worked, of course!");
    }

    public static void taSmile() {
        System.out.println("I don't know why it wouldn't compile.\nMy TA just smiled.\n");
    }

    public static void addCompile() {
        System.out.println("I added the println to make things compile,");
    }

    public static void checkNotes() {
        System.out.println("I read the notes to ease my brain,");
    }

    public static void slides() {
        System.out.println("I went through the slides to check my notes");
    }
}
