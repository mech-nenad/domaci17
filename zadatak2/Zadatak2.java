package domaci17.zadatak2;
/*
Zasnovano na zadacima iz 14. Domaceg (16.12.2022)
Napraviti metode koje rade kao sql min, max, sum, avg i distinct u SQLu koristeci ArrayList<Integer>.
Ne morate praviti drugu klasu sem main, a metode prihvataju ArrayList<Integer> kao parametar.
Distinct vraca novi ArrayList<Integer> dok ostale metode imaju povratne tipove tipa int (za min, max i sum) i double (za avg)

 */

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number = new ArrayList<>();
        number.add(11);
        number.add(5);
        number.add(10);
        number.add(15);
        number.add(20);
        number.add(25);
        System.out.println(number);
        int sum = 0;
        for (int i = 0; i < number.size(); i++) {
            sum += number.get(i);
        }
        System.out.println("\n" + "The sum for the Array list is " + sum);

        int minNum = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (minNum > number.get(i)) {
                minNum = number.get(i);
            }
        }
        System.out.println("\n" + "The minimum for an Array list is" +minNum);

        int maxNum = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (maxNum < number.get(i)) {
                maxNum = number.get(i);
            }
        }
        System.out.println("The maximum for an Array list is " + maxNum);

        double avg = (double) sum / number.size();

        System.out.printf("The average for the Array list is" + " %.2f \n", avg);
    }
}
