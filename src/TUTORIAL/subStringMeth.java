package TUTORIAL;
import java.util.*;

public class subStringMeth {
    public static void main (String args []) {
        // .substring() = A method used to extract a portion of a string e.g  string.substring(start, end)

        Scanner input = new Scanner(System.in);
        String email;
        String username;
        String domain;

        System.out.print("Enter your Email: ");
        email = input.nextLine();

        if (email.contains("@")) {
             username = email.substring(0, email.indexOf("@"));
             domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else {
            System.out.println("Emails must contain @");
        }

        //email = "larrythomzy@gmail.com";
//        username = email.substring(0,11);
//        String username2 = email.substring(0, email.indexOf("@"));
//        domain = email.substring(12,21); // or email.substring(12)
//        String domain2 = email.substring(12);
//        String domain3 = email.substring(email.indexOf("@") + 1);
//        System.out.println(username2);
//        System.out.println(domain3);

        input.close();
    }
}
