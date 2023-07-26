import java.util.Scanner;
class Countwords{
    /**
     * @param args
     * @param string TODO
     */
    public static void main(String args[], String string){
        final String words =string;
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}