//Ola Alostaz  الاسم
//2301202683 الرقم الجامعي :



package school; // Problem : setStudentObject

public class Subject {

    String Name;
    Teacher TeacherObject;
    Student StudentObjects;

    public Subject(String Name, Teacher TeacherObject, Student StudentObjects) {
        this.Name = Name;
        this.TeacherObject = TeacherObject;
        this.StudentObjects = StudentObjects;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Teacher getTeacherObject() {
        return TeacherObject;
    }

    public void setTeacherObject(Teacher TeacherObject) {
        this.TeacherObject = TeacherObject;
    }

    public Student getStudentObject() {
        return StudentObjects;
    }

    public void setStudentObject(Student StudentObjects) {
        this.StudentObjects = StudentObjects;
    }

    @Override
    public String toString() {
        return "Subject Name " + Name + " ,Teacher= " + TeacherObject.getName() + ", Students= " + StudentObjects + '}';
    }

}



//Ola Alostaz  الاسم
//2301202683 الرقم الجامعي :