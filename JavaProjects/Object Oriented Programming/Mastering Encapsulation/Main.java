/* Class to serve as template to Student object using private attributes which are string name and int age */
class Student {
    private String name;
    private int age;

    /* Default Constructor for Student Object */
    Student() {
        this.name = "Student Name";
        this.age = 0;
    }

    /* Constructor for Student object */
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* Public getter method for Student Object name */
    public String getName(){
        return name;
    }

    /* Public setter method for Student Object name */
    public void setName(String name){
        this.name = name;
    }

    /* Public getter method for Student Object name */
    public int getAge(){
        return age;
    }

    /* Public setter method for Student Object name */
    public void setAge(int age){
        this.age = age;
    }

    /* Instance void method to display the details/attributes of Student object using getter methods */
    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}

/* Primary class named Main (similar to file name) */
public class Main {
    /* main method for starting the program */
    public static void main(String[] args) {
        /* Create a Student object*/
        Student student1 = new Student();

        /* Use setter methods to set Student object attributes */
        student1.setName("John Doe");
        student1.setAge(20);

        /* Display the information using displayInfo() method */
        student1.displayInfo();
    }
}

