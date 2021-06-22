/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3;

/**
 *
 * @author Hussein
 */
public class OOP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to OOP3");
        System.out.println("count= " + Person.getCount());
      
        Person a1 = new Person("Bob", 19);
        Person a2 = new Person("Bob", 19);
        Person a3 = new Person("Mona", 18);
        if (a1.equals(a2)) //comparing objects
            System.out.println("a1 == a2");
        else
            System.out.println("a1 != a2");

        //Student
        System.out.println("count= " + Person.getCount());      
        Student s1 = new Student();
        Student s2 = new Student("Omar", 20, "CS", 1380444);
        Student s3 = new Student("Mona", 18, "Art", 2301222);
        Student s4 = new Student("Omar", 20, "CS", 1380444);
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);
        System.out.println("count= " + Person.getCount());

        if (s2.equals(s3)) //comparing objects
            System.out.println("objects s2 == s3");
        else
            System.out.println("objects s2 != s3");       

        if (s2.equals(s4)) //comparing objects
            System.out.println("objects s2 == s4");
        else
            System.out.println("objects s2 != s4");       

        //GradStudent
        //modify all to be GradStudents
        System.out.println("count= " + Person.getCount());      
        GradStudent g1 = new GradStudent();
        GradStudent g2 = new GradStudent("Omar", 20, "CS", 1380444, "Bob", 3);
        GradStudent g3 = new GradStudent("Mona", 18, "Art", 2301222, "Lana", 2);
        GradStudent g4 = new GradStudent("Omar", 20, "CS", 1380444, "Bob", 3);
        System.out.println("g1: " + g1);
        System.out.println("g2: " + g2);
        System.out.println("g3: " + g3);
        System.out.println("g4: " + g4);
        System.out.println("count= " + Person.getCount());    
       
        if (g2.equals(g3)) //comparing objects
            System.out.println("objects g2 == g3");
        else
            System.out.println("objects g2 != g3");       

        if (g2.equals(g4)) //comparing objects
            System.out.println("objects g2 == g4");
        else
            System.out.println("objects g2 != g4");
        System.out.println("g2: " + g2.getName());

        //Employee
        System.out.println("count= " + Person.getCount());      
        Employee e1 = new Employee();
        Employee e2 = new Employee("Omar", 20, "Librarian", 5000.50);
        Employee e3 = new Employee("Mona", 18, "Student Mentor", 3000.30);
        Employee e4 = new Employee("Omar", 20, "Librarian", 5000.50);
        System.out.println("e1: " + e1);
        System.out.println("e2: " + e2);
        System.out.println("e3: " + e3);
        System.out.println("e4: " + e4);
        System.out.println("count= " + Person.getCount());

        if (e2.equals(e3)) //comparing objects
            System.out.println("objects e2 == e3");
        else
            System.out.println("objects e2 != e3");       

        if (e2.equals(e4)) //comparing objects
            System.out.println("objects e2 == e4");
        else
            System.out.println("objects e2 != e4");      
        System.out.println("e2: " + e2.getName());
        
        int size = 10;
        Person [] pa = new Person[size];
        
        pa[0] = new Person("mr. zero", 10);
        pa[1] = new Student("ms. one", 20, "cs", 129334);
        pa[2] = new GradStudent("mr. two", 30, "art", 218912, "helen", 2);
        // leave pa[3] as it is
        pa[4] = new GradStudent("mr. four", 40, "physics", 2131293, "bob", 5);
        pa[5] = new Student("ms. five", 50, "chem", 3284328);
        pa[6] = new Person("mrs. nine", 60);
        // leave pa[7] as it is
        pa[8] = new Employee("mrs. eight", 42, "software engineer", 12939.12);
        pa[9] = new Employee("mrs. nine", 67, "librarian", 23832.32);
        
        for (int i=0;i<size;i++){
            System.out.println("a[" + i + "]--> " + pa[i]);
        }
        
        System.out.println("count= " + Person.getCount());
        
        int cc = pa[6].compareTo(pa[9]);
        if (cc == 0){
            System.out.println(pa[6].getName() + " and " + pa[9].getName() + " have the same name!");
        }
        else{
            System.out.println(pa[6].getName() + " and " + pa[9].getName() + " do not have the same name");
        }
        
        System.out.println(cc);
    }
    
}
