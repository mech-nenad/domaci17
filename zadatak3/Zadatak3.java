package domaci17.zadatak3;

import java.util.ArrayList;

/*
Zasnovano na zadacima iz 14. Domaceg (16.12.2022)

Napraviti metodu koja vraca ArrayList brojeva koji se ne pojavljuju u listi (ArrayList) koja je prosledjena kao parametar.
 Ako imam listu 1 5 10 7, ocekujem da povratna lista ima 2, 3, 4, 6, 8, 9.



 */
public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number = new ArrayList<>();
        number.add(1);
        number.add(5);
        number.add(10);
        number.add(7);
        number.add(9);
        number.add(12);

        System.out.println(number);
        System.out.println(newNumbers(number));

    }

    public static ArrayList<Integer> newNumbers(ArrayList<Integer> number) {
        ArrayList<Integer> uniqueList = new ArrayList<>();


        int minNum = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (minNum > number.get(i)) {
                minNum = number.get(i);
            }
        }

        int maxNum = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (maxNum < number.get(i)) {
                maxNum = number.get(i);
            }
        }


        for (int i = minNum; i < maxNum; i++) {
            if (!uniqueList.add(i));


        }
        for (int i = 0; i < number.size(); i++) {
            if (uniqueList.contains(number.get(i))) {
                uniqueList.remove(number.get(i));
            }
        }
        return uniqueList;
    }
}



