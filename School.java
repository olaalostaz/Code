

package school;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.ArrayList;

public class School {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Scanner Enter = new Scanner(System.in);
        FileOutputStream file = new FileOutputStream("data.dat");
        boolean loop = true;
        ObjectOutputStream data = new ObjectOutputStream(file);
        ArrayList<Student> Students = new ArrayList<>();
        ArrayList<Teacher> Teachers = new ArrayList<>();
        ArrayList<Subject> Subjects = new ArrayList<>();
        Principal obj = null;
        Teacher TeacherObject = null; // for choice 3
        Student StudentObject = null; // for choice 3
        boolean findTeacher = false; // for choice 3
        boolean findStudent = false;
        while (loop) {
            System.out.println("******** Main Menu ********");
            System.out.print(
                    "1- Add Employee\n"
                    + "2- Add Student. \n"
                    + "3- Add Subject.\n"
                    + "4- Show Subjects.\n"
                    + "5- Show Employees Salaries.\n"
                    + "6- Count of student in any subject.\n"
                    + "7- Save data in file\n"
                    + "8- Exit. \n"
                    + "Enter your choice :");
            int choice = Enter.nextInt();
            if (choice == 1) {
                System.out.println("****** Add Employee *****");
                System.out.print(
                        "1. Principal\n"
                        + "2. Teacher\n"
                        + "3. Exist\n");
                int choiceAdd = Enter.nextInt();
                String employee = "";
                if (choiceAdd == 1 || choiceAdd == 2) {
                    System.out.print("Enter " + employee + "Name: ");
                    String Name = Enter.next();
                    System.out.print("Enter " + employee + " id: ");
                    int id = Enter.nextInt();
                    System.out.print("Enter " + employee + " Address: ");
                    String Address = Enter.next();
                    System.out.print("Enter " + employee + " phone: ");
                    long phone = Enter.nextLong();
                    System.out.print("Enter " + employee + " Email: ");
                    String Email = Enter.next();
                    System.out.print("Enter " + employee + " basic Salary: ");
                    double basicSalary = Enter.nextDouble();
                    if (choiceAdd == 1) {
                        employee = "Principal";
                        System.out.print("Enter Principal Bonus: ");
                        double PrincipalBonus = Enter.nextDouble();
                        obj = new Principal(PrincipalBonus, Name, id, Address, phone, Email, basicSalary);
                    } else {
                        employee = "Teacher";
                        System.out.print("Enter Teacher number Of Classes: ");
                        int numberOfClasses = Enter.nextInt();
                        Teachers.add(new Teacher(numberOfClasses, Name, id, Address, phone, Email, basicSalary));
                    }
                } else if (choiceAdd != 3) {
                    loop = false;
                    break;
                }
            }
            if (choice == 2) {
                System.out.println("****** Add Student *****");
                System.out.print("Enter Name of Stdent: ");
                String Name = Enter.next();
                System.out.print("Enter id for Student: ");
                int id = Enter.nextInt();
                System.out.print("Enter level for Student: ");
                int level = Enter.nextInt();
                Students.add(new Student(id, Name, level));
            } else if (choice == 3) {
                System.out.println("****** Add Subject *****");
                System.out.print("Enter Name Subject: ");
                String Name = Enter.next();

                System.out.println("======= All Teachers Available =======");
                for (Teacher teacher : Teachers) {
                    System.out.println(teacher.getName());
                }

                System.out.print("Choose Teacher : ");
                String TeacherName = Enter.next();

                System.out.println("======= All Students In School =======");
                for (Student student : Students) {
                    System.out.println(student.getName());
                }
                System.out.print("Choose the names of the students from the previous list :");
                String StudentName = Enter.next();
                for (Student student : Students) {
                    if (StudentName.equals(student.getName())) {
                        StudentObject = student;
                        findStudent = true;
                    }
                }
                for (Teacher teacher : Teachers) {
                    if (TeacherName.equals(teacher.getName())) {
                        TeacherObject = teacher;
                        findTeacher = true;
                    }
                }
                Subjects.add(new Subject(Name, TeacherObject, StudentObject));
                if (findStudent == false || findTeacher == false) {
                    System.out.print("The course is not added >_<");
                } else {
                    System.out.print("The course is Successfully added *_^");
                }
            } else if (choice == 4) {
                System.out.println("****** Display Data ^_^ *****");
                for (Student student : Students) {
                    System.out.println(student.toString());
                }
                for (Teacher teacher : Teachers) {
                    System.out.println(teacher.toString());
                }
                for (Subject subject : Subjects) {
                    System.out.println(subject.toString());
                }
            }
            
            
            else if (choice == 5) {
                for (Teacher teacher : Teachers) {
                    
                    System.out.println(teacher.getSalary());
                    System.out.println("Principal Salary=");
                    System.out.println(obj.getSalary());
                }
                
            } else if (choice == 6) {
                System.out.print("Enter subject to know How many students are "
                        + "registered in this subject? ");
                String nameSubject = Enter.next();
                System.out.println(1);
            } else if (choice == 7) {
                System.out.println("**** Add Data To Binary File ****");
                for (Student student : Students) {
                    data.writeUTF(student.toString());
                }
                for (Teacher teacher : Teachers) {
                    data.writeUTF(teacher.toString());
                }
                for (Subject subject : Subjects) {
                    data.writeUTF(subject.toString());
                    
                }
                data.writeUTF(obj.toString());
                System.out.println("Done ^_^ ");
            } else if (choice == 8) {
                loop = false;
                break;

            }
        }
    }
}


//Ola Alostaz  الاسم
//2301202683 الرقم الجامعي :
