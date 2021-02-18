package Views;

import Behaviors.TeacherManagement;
import Entities.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    static Scanner input = new Scanner(System.in);

    static TeacherManagement tm = new TeacherManagement();

    public static void main(String[] args) {
        do{System.out.println("-----Teacher Management-----");
            System.out.println("1. Add Teacher");
            System.out.println("2. Delete Teacher");
            System.out.println("3. Show All Teacher's Infos");
            System.out.println("4. Show Teacher's Info By Id");
            System.out.println("5. Calculate Teacher's Salary By Id");
            System.out.println("6. Show All Teacher Has Salary Higher Than 8 Millions VND");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    Teacher teacher = Menus.getTeacherInfo();
                    tm.addTeacher(teacher);
                    break;
                case 2:
                    System.out.println("Enter Teacher's Id:");
                    int id = Integer.parseInt(input.nextLine());
                    tm.deleteTeacher(id);
                    break;
                case 3:
                    tm.showAllTeachersInfo();
                    break;
                case 4:
                    System.out.println("Enter Teacher's Id:");
                    int id1 = Integer.parseInt(input.nextLine());
                    tm.showTeacherInfoById(id1);
                    break;
                case 5:
                    System.out.println("Enter Teacher's Id:");
                    int id2 = Integer.parseInt(input.nextLine());
                    int salary = tm.getTeacherById(id2).getSalary();
                    System.out.println(salary);
                    break;
                case 6:
                    String result = "";
                    ArrayList<Teacher> teachers = tm.getTeachers();
                    for (Teacher t: teachers) {
                        if(t.getSalary() > 8000000){
                            result += t.toString();
                            result += "\n";
                        }
                    }
                    System.out.println(result);
                    break;
                default:
                    continue;
            }
        }
        while (true);
    }
}
