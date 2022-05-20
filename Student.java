//Ola Alostaz  الاسم
//2301202683 الرقم الجامعي :

package school;

public class Student {

    private int id;
    private String Name;
    private int level;

    public Student() {
    }

    public Student(int id, String Name, int level) {
        this.id = id;
        this.Name = Name;
        this.level = level;
    }

    public Student(Student student) {
        this.id = student.id;
        this.Name = student.Name;
        this.level = student.level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", Name=" + Name + ", level=" + level + '}';
    }

}


//Ola Alostaz  الاسم
//2301202683 الرقم الجامعي :