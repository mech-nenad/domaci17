package domaci17.zadatak4;
/*
 Napraviti klasu koja predstavlja studenta. Student za atribute ima broj indeksa i prosecnu ocenu.
 Napraviti metodu koja ce da vrati koji student ima bolju ocenu (kao ona compare metoda sa predavanja).
    Metoda vraca boljeg studenta, a za parametar prima studenta.
 U klasi koja ima i main metodu napisati dodatnu staticku metodu koja vraca najboljeg studenta od liste studenata.
    Prihvata kao parametar ArrayList<Student> a vraca <Student>.
 Opciono: napraviti jednu staticku metodu koja ce da sortira studente po prosecnoj oceni (opadajuce)
    A onda u mainu da ispisete da su prva 3 studenta na budzetu (jer su najbolji) a ostali da su samofinansirajuci.

 */

import java.util.*;
public class Zadatak4 {
    public static void main(String[] args) {
        Student student1 = new Student("MM2022", 8.5);
        Student student2 = new Student("MA2022", 8.0);
        Student student3 = new Student("MB2022", 8.3);
        Student student4 = new Student("MC2022", 7.5);
        Student student5 = new Student("MD2022", 9.5);
        Student student6 = new Student("ME2022", 8.0);

        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);


        Student bestStudent = bestStudent(list);

        Student studentComparison = betterStudent(student2,student4);
        System.out.println(bestStudent.getProsekOcene());
        System.out.println("In the comparison of grades, we determined that the student with the index number " + studentComparison.getBrojIndeksa() + "with an average " + studentComparison.getProsekOcene() + " more successful!");
        System.out.println("Student with index number: " + bestStudent.getBrojIndeksa() + " has the highest average value rating: " + bestStudent.getProsekOcene());

    }


    public static Student bestStudent(ArrayList<Student> students) {

        Student max = students.get(0);
        for (int i = 1; i <students.size() ; i++) {
            double maxProsek = max.getProsekOcene();
            Student trnutnoZaPoredjenje = students.get(i);
            double prosekOceneTrnutno = trnutnoZaPoredjenje.getProsekOcene();
            if (maxProsek < prosekOceneTrnutno) {
                max = trnutnoZaPoredjenje;
            }

        }
        return max;
    }
    public static Student betterStudent(Student student1, Student student2) {
        if(student1.getProsekOcene() > student2.getProsekOcene()){
            return student1;
        } else {
            return student2;
        }
    }
}
