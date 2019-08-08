package packZad11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Utilities {

    public String getStringFromFile(String file) {
        String stringFromFile = "";
        String line;
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
//            bufferedReader.lines().forEach(stringBuilder::append);
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(",");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Błąd pliku.");
        } catch (IOException e) {
            System.err.println("Błąd wejścia-wyjścia.");
        }
        stringFromFile = stringBuilder.toString();
        return stringFromFile;
    }

    public List<String> getListStringFromString(String stringFromFile) {
        List<String> list = new ArrayList<>();

        String[] tab = stringFromFile.split(",");
        for (int i = 0; i < tab.length; i++) {
            list.add(tab[i]);
        }
        return list;
    }

    public int getListSizeMinusSetSize(List<String> list, Set<String> set) {
        return (list.size() - set.size());
    }

    public List<String> getTheSame(List<String> list) {
        List<String> help = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!help.contains(list.get(i))) {
                help.add(list.get(i));
            } else {
                result.add(list.get(i));
            }
        }
        return result;
    }

    public void printList(List<String> list) {
        list.forEach(System.out::println);
    }
}
