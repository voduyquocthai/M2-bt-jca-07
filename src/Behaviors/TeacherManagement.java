package Behaviors;

import Entities.Teacher;

import java.util.ArrayList;

public class TeacherManagement {

    ArrayList<Teacher> teachers = new ArrayList<>();

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void deleteTeacher(int id){
        teachers.removeIf(t -> t.getId() == id);
    }

    public Teacher getTeacherById(int id){
        Teacher teacher = null;
        for (Teacher t: teachers) {
            if(t.getId() == id){
                teacher = t;
            }
        }
        return teacher;
    }

    public void showAllTeachersInfo(){
        for (Teacher t: teachers) {
            System.out.println(t.toString());
        }
    }

    public void showTeacherInfoById(int id){
        for (Teacher t: teachers) {
            if(t.getId() == id){
                System.out.println(t.toString());
            }
        }
    }



}
