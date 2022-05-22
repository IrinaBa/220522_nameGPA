package com.company;

public class Main {

    public static void main(String[] args) {

        //1 Given two arrays. The first is String[n] students – names of students.
        // The second is int[n][] grades – the array of grades for student homework.
        // Every row of grades array is one student's grades (grades[k] is the grades of students[k]).
        // Note, that each student has a different number of grades. You should implement the program
        // that finds and displays the student with highest GPA and the score.
        //Example:
        //{Jack, Nick} { { 3,4,2}, {5,5,5,4} } -> Nick 4.75
        String[] students = {"Jack", "Nick"};
        int[][] grades = {{3, 4, 2}, {5, 5, 5, 4}};
        printHighestGPA(students, grades);

    }

    private static void printHighestGPA(String[] students, int[][] grades) {
        double max = getGPA(grades[0]);
        int index = 0;
        for (int i = 1; i < grades.length; i++) {
            if (max < getGPA(grades[i])) {
                max = getGPA(grades[i]);
                index = i;
            }
        }
        String gpa = String.format("%.2f", max);
        System.out.println(students[index] + " " + gpa);
    }

    public static double getGPA(int[] grades) {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}


