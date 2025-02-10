/**
 * This program displays a greeting for the reader
 * @version 1.0 2025-02-10
 * @author Fathin Yassarahman 
 */
public class Welcome {
    public static void main(String[] args) {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++){
            System.out.print("=");
        }
        System.out.println();
    }
}