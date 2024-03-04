import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        //PRIMITIVE TYPES
        //-128 127 8bit 1byte
        byte age = 25;
        System.out.println("Age: "+age);

        //short 16bit 2byte -32,768 32,767
        short temperature = -200;
        System.out.println("Temp: "+temperature);

        //32bit  -2^31  2^31-1
        int  salary = 5000;
        System.out.println("salary: "+salary);

        //long 64bit -2^63 2^63-1
        long distanceToMoon = 384400000L;
        System.out.println("distance to moon: "+distanceToMoon);

        //float 32bit 6-7 number precision
        float height = 1.75F;
        System.out.println("height: "+height);

        //double 64bit 15 number precision
        double pi = 3.141592653589793;
        System.out.println("pi: "+pi);

        //8bit
        boolean isTrue = true;
        System.out.println("isTrue: "+isTrue);

        //char 16bit unicode 0 65,535
        char grade = 'A';
        System.out.println("grade: "+grade);

        System.out.println("------------------------------------------------------------------");
        
        String myText = "text";
        String myText2 = "text text text";
        //System.out.println(myText == myText2);

        System.out.println("strings have the same content: "+myText.equals(myText2));
        
        String greeting = new String("hello");

        String name = "Nikos";

        String wholeGreeting = greeting +" "+name;
        System.out.println(wholeGreeting);

        String example = "This is a test...";
        System.out.println(example.length());

        String sub = example.substring(0,4);
        System.out.println(sub);

        String myName = "NIKOS";
        String myNameToLower = myName.toLowerCase();
        System.out.println(myNameToLower);

        String myNameLower = "nikos";
        String myNameToUpper = myNameLower.toUpperCase();
        System.out.println(myNameToUpper);

        System.out.println(myName.equalsIgnoreCase(myNameLower));

        String toTrim ="      hello Nikos george kas takis       ";
        System.out.println(toTrim.length());

        String trimmed = toTrim.trim();
        System.out.println(trimmed.length());
        System.out.println(trimmed);

        String fruit = "apple banana cherry";
        String[] parts = fruit.split(" ");
        System.out.println(Arrays.toString(parts));

        String original = "Java";
        String modified = original.replace('a', 'o');
        System.out.println(modified);

        // write a program that takes a string and prints its length

        // write a program that prints first and last chars of a string

        //write a program that checks if two strings are equal in terms of content

        //"hello world" -> replace world with your name

        // extra -> (a, e, i, o, u)  -> count vowels -> tip use loop


    }
}
