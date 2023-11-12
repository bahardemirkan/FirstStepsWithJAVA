import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordGame {

    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        // Add words and their definitions.
        dictionary.put("Feature List", "Figure out what your app is supposed to do at a high level");
        dictionary.put("Use Case Diagram", "Nail down the big processes that your app performs, and any external forces that are involved.");
        dictionary.put("Break Up the Problem", "Break your application up into modules of functionality,and then decide on an orderin which to tackle each ofyour modules.");
        dictionary.put("Requirements", "Figure out the individual requirements for each module, and make sure those fit in with the big picture.");
        dictionary.put("Domain Analysis", "Figure out how your use cases map to objects in your app, and make sure your customer is on the same page as you are.");
        dictionary.put("Preliminary Design", "Fill in details about your objects, define relationships between the objects, and apply principles and patterns.");
        dictionary.put("Implementation", "Write code, test it, and make sure it works. Do this for each behavior, each feature,each use case, each problem, until you’re done.");
        dictionary.put("Delivery", "You’re done! Release your software, submit your invoices, and get paid.");
        dictionary.put("UML", "the Unified Modeling Language, which is a language used to communicate just the details about your code and application’s structure that other developers and customers need, without getting details that aren’t necessary.");
        dictionary.put("Class Diagram", "List all the code-level constructs along with their attributes and operations.Gives you an overview of your class, including its methods and variables.");
        dictionary.put("Inheritance", "when one class extends another class to reuse or build upon the inherited class’s behavior");
        dictionary.put("Polymorphism", "when a subclass stands in for its superclass.");
        dictionary.put("Encapsulation", "when you separate or hide one part of your code from the rest of your code.breaking your application into logical parts that have a clear boundary that allows an object to hide its data and methods from other objects. Use me to keep the parts of your code that stays the same separate from the parts that change.");
        dictionary.put("Delegation", "giving another object the responsibility of handling a particular task.");
        dictionary.put("Design Pattern", "I'm all about reuse and making sure you're not trying to solve a problem that someone else has already figured out.");
        dictionary.put("Functionality","Without me, you'll never actually make the customer happy.No matter how well-designed your application is, I'm the thing that puts a smile on the customer's face.");
        dictionary.put("Clear Value", "Every use case must have this to the system. If the use case doesn't help the customer achieve their goal, then the use case isn't of much use.Without this, a use case isn't worth anything to anyone. Use cases without this always fail.");
        dictionary.put("Start Condition", "This is always the first step in the use case.");
        dictionary.put("Stop Condition", "Let's you know when a use case is finished. Without this, use cases can go forever.");
        dictionary.put("External Initiator", "Every use case is started off by this word. Outside of the system. Sometimes that initiator is a person but it could be anything outside of the system.");
        dictionary.put("Use Case", "Helps you gather good requirements. Tells a story about how a system works.");
        dictionary.put("Requirement", "Something a system has to do to be a success.");
        dictionary.put("Main Path", "How a system works when everything is going right. This is usually what customers describe when they're talking about the system.");
        dictionary.put("Scenario", "a single path through a use case from start to finish.");
        dictionary.put("Noun Analysis", "You do this to your use case to figure out what classes you need in your system.");
        dictionary.put("Multiplicity", "Describes how many of a specific type can be stored in an attribute of a class.");
        dictionary.put("Attribute","Equivalent to a member variable in a class.");
        dictionary.put("Operation","This is the UML term that usually represents a method in one of your classes.");
        dictionary.put("Association", "Visually shows that one class has a relation to another class, often through an attribute.");
        dictionary.put("Verb Analysis", "Helps you figure out the candidates for methods on the objects in your system.");
        dictionary.put("Flexibility", "Use me that your software can change and grow without constant rework. I keep your application from being fragile.");
        // You can add more words.

        Scanner scanner = new Scanner(System.in);

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            String word = entry.getKey();
            String definition = entry.getValue();

            System.out.println("Definition: " + definition);
            System.out.print("What is this word? ");
            String userGuess = scanner.nextLine();

            if (userGuess.equalsIgnoreCase(word)) {
                System.out.println("Congratulations! Your guess is right.\n");
            } else {
                System.out.println("Sorry, wrong guess. The right guess is: " + word + "\n");
            }
        }

        scanner.close();
    }
}
