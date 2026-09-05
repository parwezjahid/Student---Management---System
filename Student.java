import java.util.Scanner;
class Student {
    int id;
    String name;
    int age;
    double marks;
    Student(int id, String name, int age, double marks){
       this.id = id;
       this.name = name;
       this.age = age;
       this.marks = marks;
    }
    void displayDetails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Student Name: ");
        String name = sc.next();
        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Student Marks: ");
        double marks = sc.nextDouble();
        students[count] = new Student(id, name, age, marks);
        count++;
        }
        System.out.print("Enter Student ID to search: ");
        int searchId = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < count; i++){
            if(students[i].id == searchId) {
            System.out.println("----- Student " + (i + 1) + " -----");
            students[i].displayDetails();
            found = true;
            }
        }
        if(found == false) {
            System.out.println("Student not found!");
        }
        System.out.print("Enter Student ID to update marks: ");
        int updateId = sc.nextInt();
        System.out.print("Enter new marks: ");
        double newMarks = sc.nextDouble();
        boolean updated = false;
        for(int i = 0; i < count; i++){
            if(students[i].id == updateId){
                students[i].marks = newMarks;
                updated = true;
                System.out.println("Marks updated successfully!");
                break;
            }
        
            if(updated == false){
                System.out.println("Student not found!");
            }
        }
    }
}
