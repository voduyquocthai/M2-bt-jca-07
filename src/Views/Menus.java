package Views;

import Entities.Teacher;

import java.util.Scanner;

public class Menus {

    static Scanner input = new Scanner(System.in);

    public static Teacher getTeacherInfo(){
        System.out.println("----------------------------");
        System.out.println("Enter teacher's id:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter teacher's name:");
        String name = input.nextLine();
        System.out.println("Enter teacher's date of birth:");
        String dob = input.nextLine();
        System.out.println("Enter teacher's address:");
        String address = input.nextLine();
        System.out.println("Enter teacher's hard salary:");
        int hardSalary = Integer.parseInt(input.nextLine());
        System.out.println("Enter teacher's bonus:");
        int bonus = Integer.parseInt(input.nextLine());
        System.out.println("Enter teacher's fine:");
        int fine = Integer.parseInt(input.nextLine());
        Teacher teacher = new Teacher(id, name, dob, address, hardSalary, bonus, fine);
        return teacher;
    }
}
