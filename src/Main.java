import java.lang.reflect.Array;
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

        System.out.println("----------------------Exercises----------------------------------------");

        // write a function that takes a string and returns  its length
        //public static int calculateStringLength(String str){}
        System.out.println("1 ex");
        String  word = "A String";
        System.out.println("Length of the string: " + word.length());

        // write a function that prints and returns first and last chars of a string

        System.out.println("2 ex");
        String firstandlast = "First and last";
        System.out.println("First and last chars of the string: " + firstandlast.substring(0,1) + firstandlast.substring(13,14));

        //System.out.println("first and last chars of the string are: "+firstandlast.split("")[0]+firstandlast.split("")[firstandlast.length()-1]);
        System.out.println("first and last chars of the string are: "+firstandlast.charAt(0)+" "+firstandlast.charAt(firstandlast.length()-1));

        //write a function that checks if two strings are equal in terms of content and return (true, false)

        System.out.println("3 ex");
        String firststring = "hello";
        String secondstring = "hello hello";
        System.out.println("Two strings equals in terms of content: " + firststring.equals(secondstring));

        //"hello world" -> replace world with your name and return it

        System.out.println("4 ex");
        String helloworld = "hello world";
        String myname = "Myrto";
        String hello = helloworld.substring(0,6);
        System.out.println("Replacing world with my name: " + hello + myname);
        System.out.println("Replacing world with my name: "+helloworld.replace("world","Nikos"));

        // extra -> (a, e, i, o, u)  -> count vowels -> tip use loop
        // write a function that calculates how many vowels are in a string and returns result
        //public static int countVowels(String str){}

        String toCountVowels = "hEllo world1234";
        System.out.println("Extra ex");
        int result = 0;
        toCountVowels = toCountVowels.toLowerCase();
        for ( int i =0; i < toCountVowels.length(); i++) {
            if(Character.isLetter(toCountVowels.charAt(i))){
                if (toCountVowels.charAt(i) == 'a'  || toCountVowels.charAt(i) == 'e'  || toCountVowels.charAt(i) == 'i'  || toCountVowels.charAt(i) == 'o'   ||toCountVowels.charAt(i) == 'u'  ) {
                    //auth einai h logikh mou alla den kserw akrivws poia sunarthsh tha xreiastei gia to an oi xarakthres tou string isoutai me a,e,i,o,u
                    //result = result + 1;
                    //result +=1;
                    result++;
                }
            }

        }
        System.out.println("The number of vowels is: " + result);

    }
}
