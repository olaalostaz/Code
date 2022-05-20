
package school;

public class Teacher extends Employee {

    private int numberOfClasses;

    public Teacher() {
    }

    public Teacher(int numberOfClasses, String Name, int id, String Address, long phone, String Email, double basicSalary) {
        super(Name, id, Address, phone, Email, basicSalary);
        this.numberOfClasses = numberOfClasses;
    }
    
    public Teacher(Teacher teacher) {
        this.numberOfClasses = teacher.numberOfClasses;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    @Override
    public String toString() {
        return "Teacher{" + "numberOfClasses=" + numberOfClasses + '}';
    }

    /*  The teacher's salary is the basic salary in addition to the living Expensive, 
        and 20 dinars are added to it for every class he teaches */
    public double getSalary() {
        return (this.numberOfClasses * 20) + getBasicSalary() + getLiveExpensive();
    }

}



//Ola Alostaz  الاسم
//2301202683 الرقم الجامعي :
