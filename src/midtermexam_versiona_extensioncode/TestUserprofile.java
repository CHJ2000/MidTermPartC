package midtermexam_versiona_extensioncode;
 import java.util.Scanner;
/**
 * This is main class for Java programs
 * @author Carter Jeffery
 */
public class TestUserprofile {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = input.next();
        
        System.out.println("Choose your favourite genre from the following options:");
        System.out.println("1.Action");
        System.out.println("2.Comedy");
        System.out.println("3.Drama");
        System.out.println("4.Horror");
        System.out.println("5.Romance");
        
        int choice = input.nextInt();
        String genre;
        
        switch (choice){
            case 1:
                genre = "Action";
                break;
            case 2: 
                genre = "Comedy";
                break;
            case 3: 
                genre = "Drama";
                break;
            case 4: 
                genre = "Horror";
                break;
            case 5:
                genre = "Romance";
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        UserProfile userProfile = new UserProfile(name, genre);
        System.out.println("Your userProfile was created: " + userProfile.toString());
    }
}
