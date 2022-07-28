package hometask;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Testov", "Biology", 1, 3.55, 3.2, 2.9, 3.9);
        Student student2 = new Student("Anna", "Testova", "Math", 1, 2.0, 3.5, 4.8, 5.0);
        Student student3 = new Student("Max", "Coins", "Philosophy", 1, 1.0, 4.2, 2.0, 4.3);
        Student student4 = new Student("Teo", "Neo", "English", 1, 4.5, 3.2, 4.0, 4.1);
        Student student5 = new Student("Lina", "Malina", "Philosophy", 2, 4.0, 3.3, 4.0, 4.8);
        Student student6 = new Student("Jane", "Air", "English", 2, 4.0, 4.2, 4.8, 2.5);
        Student student7 = new Student("Greg", "House", "Math", 2, 4.8, 3.2, 4.0, 4.6);
        Student student8 = new Student("Tom", "Cat", "Biology", 3, 1.1, 3.5, 2.5, 2);
        Student student9 = new Student("Jerry", "Mouse", "Math", 3, 4.0, 3.7, 4.7, 4.0);
        Student student10 = new Student("Nikolas", "Claus", "Philosophy", 4, 4.1, 4.8, 4.0, 3.8);
        Student student11 = new Student("Sara", "Connor", "Philosophy", 4, 5.0, 3.2, 4.5, 4.4);
        Student student12 = new Student("Elena", "Wise", "Math", 2, 1.8, 4.1, 2.5, 3.78);
        Student student13 = new Student("Anton", "Trustov", "Biology", 5, 4.0, 3.2, 4.8, 4.9);
        Student student14 = new Student("Dan", "Kruger", "Biology", 4, 2.7, 4.2, 4.8, 4.9);

        Student[] students = new Student[]{student1, student2, student3, student4, student5, student6, student7, student8, student9, student10, student11, student12, student13, student14};
        ArrayList<Student> biologyStudents = new ArrayList<>();
        ArrayList<Student> mathStudents = new ArrayList<>();
        ArrayList<Student> englishStudents = new ArrayList<>();
        ArrayList<Student> philosophyStudents = new ArrayList<>();

        double[] allStudentsGradeAvg = new double[students.length];
        double[] mathStudentsGradeAvg = new double[students.length];
        double[] biologyStudentsGradeAvg = new double[students.length];
        double[] englishStudentsGradeAvg = new double[students.length];
        double[] philosophyStudentsGradeAvg = new double[students.length];


        for (Student i : students) {
            i.gradeAvg = i.calculateGradePointAverage();
            i.checkYearAndGrades(i.gradeAvg);
        }

        for (int i = 0; i < students.length; ++i) {
            allStudentsGradeAvg[i] = students[i].gradeAvg;
        }
        for (Student i : students) {
            if (i.faculty == "Biology") {
                biologyStudents.add(i);
            } else if (i.faculty == "Math") {
                mathStudents.add(i);
            } else if (i.faculty == "English") {
                englishStudents.add(i);
            } else if (i.faculty == "Philosophy") {
                philosophyStudents.add(i);
            }
        }
        for (int i = 0; i < biologyStudents.stream().count(); ++i) {
            biologyStudentsGradeAvg[i] = biologyStudents.get(i).gradeAvg;
        }
        for (int i = 0; i < mathStudents.stream().count(); ++i) {
            mathStudentsGradeAvg[i] = mathStudents.get(i).gradeAvg;
        }
        for (int i = 0; i < englishStudents.stream().count(); ++i) {
            englishStudentsGradeAvg[i] = englishStudents.get(i).gradeAvg;
        }
        for (int i = 0; i < philosophyStudents.stream().count(); ++i) {
            philosophyStudentsGradeAvg[i] = philosophyStudents.get(i).gradeAvg;
        }
        OptionalDouble maxAllGrade = Arrays.stream(allStudentsGradeAvg).max();
        OptionalDouble maxBiologyGrade = Arrays.stream(biologyStudentsGradeAvg).max();
        OptionalDouble maxMathGrade = Arrays.stream(mathStudentsGradeAvg).max();
        OptionalDouble maxEnglishGrade = Arrays.stream(englishStudentsGradeAvg).max();
        OptionalDouble maxPhilosophyGrade = Arrays.stream(philosophyStudentsGradeAvg).max();


        for (Student i : students) {
            if (Math.abs(i.gradeAvg - maxAllGrade.getAsDouble()) < 0.000000001) {
                System.out.printf("%s %s is the best student! Her/His GPA is max in school: %.3f.\n", i.name, i.surname, i.gradeAvg);
            }
        }

        for (Student i : biologyStudents) {

            if (Math.abs(i.gradeAvg - maxBiologyGrade.getAsDouble()) < 0.000000001) {
                System.out.printf("%s %s is the best student of faculty %s! Her/His GPA is max in faculty: %.3f.\n", i.name, i.surname, i.faculty, i.gradeAvg);
            }
        }
        for (Student i : mathStudents) {

            if (Math.abs(i.gradeAvg - maxMathGrade.getAsDouble()) < 0.000000001) {
                System.out.printf("%s %s is the best student of faculty %s! Her/His GPA is max in faculty: %.3f.\n", i.name, i.surname, i.faculty, i.gradeAvg);
            }
        }
        for (Student i : englishStudents) {

            if (Math.abs(i.gradeAvg - maxEnglishGrade.getAsDouble()) < 0.000000001) {
                System.out.printf("%s %s is the best student of faculty %s! Her/His GPA is max in faculty: %.3f.\n", i.name, i.surname, i.faculty, i.gradeAvg);
            }
        }
        for (Student i : philosophyStudents) {

            if (Math.abs(i.gradeAvg - maxPhilosophyGrade.getAsDouble()) < 0.000000001) {
                System.out.printf("%s %s is the best student of faculty %s! Her/His GPA is max in faculty: %.3f.\n", i.name, i.surname, i.faculty, i.gradeAvg);
            }
        }
    }

}