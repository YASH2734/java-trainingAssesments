/*package day1.oppsConcepts;

import java.util.Scanner;

public class classInheritanceEx {

    String username = "Abc";
    String pass = "sitcoe";

    void check(String u, String p) {
        if (username.equals(u) && pass.equals(p)) {
            System.out.println("Login Successful...!");
        } else {
            System.out.println("Login Failed...!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String u = sc.nextLine();

        System.out.print("Enter Password: ");
        String p = sc.nextLine();

        classInheritanceEx l = new classInheritanceEx();
        l.check(u, p);

        sc.close();
    }
} */


package day1.oppsConcepts;

import java.util.Scanner;

// Parent Class
class User {

    String username = "Abdd";
    String password = "sitcoe";
}

// Child Class
class Login extends User {

    void check(String u, String p) {
        if (username.equals(u) && password.equals(p)) {
            System.out.println("Login Successful...!");
        } else {
            System.out.println("Login Failed...!");
        }
    }
}

public class classInheritanceEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String u = sc.nextLine();

        System.out.print("Enter Password: ");
        String p = sc.nextLine();

        Login l = new Login(); // Child class object
        l.check(u, p);

        sc.close();
    }
}