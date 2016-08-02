

public class App {

    public static void  main(String[] args) {
        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[2]);

        String[] fruits = {"apple", "banana", "pear", "kiwi"};

        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        // primitive type (lower case) allocates memory
        int value = 123;

        // Class (upper case) creates reference, doesn't allocate memory
        String text = null;

        System.out.println(text);

        // allocates space for two strings
        String[] texts = new String[2];

        System.out.println(texts[0]);

        //allocates memory for a string
        texts[0] = "one";
    }
}
