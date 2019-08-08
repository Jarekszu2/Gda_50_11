package packZad11;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
11 Zadanie:
W plikach dane_uniq_x.txt znajdują się nazwiska gości. Na jednej liście wkradł się błąd i nazwisko się powtarza. Znajdź to nazwisko.

 */
public class Main {
    public static void main(String[] args) {
        System.out.println();
        Utilities utilities = new Utilities();

        System.out.println("Aplikacja znajduje powtarzające się nazwisko na liście gości umieszczonej w pliku.");
        System.out.println();

        String fromFile_1 = utilities.getStringFromFile("dane_uniq_1.txt");
        String fromFile_2 = utilities.getStringFromFile("dane_uniq_2.txt");
        String fromFile_3 = utilities.getStringFromFile("dane_uniq_3.txt");
        String fromFile_4 = utilities.getStringFromFile("dane_uniq_4.txt");

        List<String> listFrom_1 = utilities.getListStringFromString(fromFile_1);
        List<String> listFrom_2 = utilities.getListStringFromString(fromFile_2);
        List<String> listFrom_3 = utilities.getListStringFromString(fromFile_3);
        List<String> listFrom_4 = utilities.getListStringFromString(fromFile_4);

        System.out.println();
        List<String> result_1 = utilities.getTheSame(listFrom_1);
        if (result_1.size() > 0) {
            System.out.println("Plik 1, powtarzające się nazwisko:");
            utilities.printList(result_1);
        }
        List<String> result_2 = utilities.getTheSame(listFrom_2);
        if (result_2.size() > 0) {
            System.out.println("Plik 2, powtarzające się nazwisko:");
            utilities.printList(result_2);
        }
        List<String> result_3 = utilities.getTheSame(listFrom_3);
        if (result_3.size() > 0) {
            System.out.println("Plik 3, powtarzające się nazwisko:");
            utilities.printList(result_3);
        }
        List<String> result_4 = utilities.getTheSame(listFrom_4);
        if (result_4.size() > 0) {
            System.out.println("Plik 4, powtarzające się nazwisko:");
            utilities.printList(result_4);
        }
    }
}
