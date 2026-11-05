import java.util.Scanner;

public class PersonalIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        String college;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your college name: ");
        college = sc.nextLine();

        System.out.println();

        System.out.println("My name is " + name +
                ". I am " + age +
                " years old. I study at " + college + ".");

        sc.close();
    }
}