package Entities;

public class Teacher extends Officer{

    private int hardSalary;

    private int bonus;

    private int fine;

    public Teacher(int id, String name, String dateOfBirth, String address, int hardSalary, int bonus, int fine) {
        super(id, name, dateOfBirth, address);
        this.hardSalary = hardSalary;
        this.bonus = bonus;
        this.fine = fine;
    }

    public Teacher() {
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getSalary(){
        int salary = this.hardSalary - this.fine + this.bonus;
        return salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString() +
                " hardSalary=" + hardSalary +
                ", bonus=" + bonus +
                ", fine=" + fine ;
    }
}
