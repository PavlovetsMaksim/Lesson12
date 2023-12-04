package edu.training.lesson12.example03;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[10];

        students[0] = new Student("Иванов", "Иван", 1, new int[]{10, 9, 9, 10, 10});
        students[1] = new Student("Петров", "Петр", 1, generateStudentMarks());
        students[2] = new Student("Александров", "Александр", 2, generateStudentMarks());
        students[3] = new Student("Иванова", "Мария", 2, new int[]{10, 9, 8, 10, 10});

        for (int i = 0; i < 4; i++) {
            System.out.println(students[i]);
        }

        System.out.println("\nОтличники:");

        for (int i = 0; i < 4; i++) {
            if (students[i].isPerfectStudent()) {
                System.out.println(students[i].getSurname() + " " + students[i].getName() + ", группа: " + students[i].getGroupNumber());
            }
        }

    }

    public static int generateMark() {
        int min = 1;
        int max = 10;
        int diff = max - min;
        
        Random random = new Random();
        
        return random.nextInt(diff + 1);
    }

    public static int[] generateStudentMarks() {
        int[] marks = new int[5];
        
        for (int i = 0; i < 5; i++) {
            marks[i] = generateMark();
        }
        return marks;
    }
}
