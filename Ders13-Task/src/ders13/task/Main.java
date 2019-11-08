package ders13.task;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("Ayna");
        student1.setSurname("Amrahova");
        student1.setAge(19);
        student1.setCurrentScore(79.02);
        student1.increaseScore(6);
        student1.isContinuity();

        Student student2 = new Student();
        student2.setName("Altun");
        student2.setSurname("Kərimli");
        student2.setAge(16);
        student2.setCurrentScore(82);
        student2.increaseScore(12);

        Student student3 = new Student();
        student3.setName("Ramil");
        student3.setSurname("Mammadov");
        student3.setAge(25);
        student3.setCurrentScore(83.14);
        student3.increaseScore(5.36);
        student3.isContinuity();

        String data1 = "Student1's name: " + student1.getName() + " //Student1's surname: " + student1.getSurname() + " //Student1's age: " + student1.getAge() + " //Student1's last score: " + student1.getCurrentScore();
        String data2 = "Student2's name: " + student2.getName() + " //Student2's surname: " + student2.getSurname() + " //Student2's age: " + student2.getAge() + " //Student2's last score: " + student2.getCurrentScore();
        String data3 = "Student3's name: " + student3.getName() + " //Student3's surname: " + student3.getSurname() + " //Student3's age: " + student3.getAge() + " //Student3's last score: " + student3.getCurrentScore();

        try {
            File myObj = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Ders13-Task\\ders13.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\user\\Documents\\NetBeansProjects\\Ders13-Task\\ders13.txt");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\user\\Documents\\NetBeansProjects\\Ders13-Task\\ders13.txt");
            myWriter.write(data1);
            myWriter.write("\r\n");
            myWriter.write(data2);
            myWriter.write("\r\n");
            myWriter.write(data3);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);

    }
}
