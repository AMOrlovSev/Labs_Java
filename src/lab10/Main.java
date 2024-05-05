package lab10;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Exercise 1
        File fileExists = new File("files/text.txt");
        File fileNotExists = new File("files/NOTtext.txt");

        ArrayList<String> listExists = Ex1_readTXT(fileExists);
        System.out.println(listExists);

        ArrayList<String> listNotExists = Ex1_readTXT(fileNotExists);
        System.out.println(listNotExists);

        //Exercise 2
        String fileName = "files/Ex2.txt";
        String textWrite = "C:\\Program Files\\Java\\jdk-11.0.15\\bin\\java.exe";
        Ex2_writeTXT(fileName,textWrite);

        //Exercise 3
        File file1 = new File("files/text.txt");
        File file2 = new File("files/Ex2.txt");
        String fileNameEx3 = "files/Ex3.txt";
        Ex3_mergeFiles(file1, file2, fileNameEx3);

        //Exercise 4
        String fileNameEx4 = "files/Ex4.txt";
        String textWrite4 = "1 2 345 asd !@#$% 5fd@344!4gf";
        Ex2_writeTXT(fileNameEx4,textWrite4);
        Ex4_replacement$(fileNameEx4);
    }

        //Exercise 1 Написать метод, который читает текстовый файл и возвращает его в виде списка строк
    public static ArrayList<String> Ex1_readTXT(File file) {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = br.readLine()) != null) {
                list.add(input);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return list;
    }

    //Exercise 2 Написать метод, который записывает в файл строку, переданную параметром
    public static void Ex2_writeTXT(String file, String text) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file)))
        {
            bw.write(text);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    //Exercise 3 Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один
    public static void Ex3_mergeFiles(File file1, File file2, String file){
        ArrayList<String> list1 = Ex1_readTXT(file1);
        ArrayList<String> list2 = Ex1_readTXT(file2);

        ArrayList<String> mergeLists = new ArrayList<>();

        mergeLists.addAll(list1);
        mergeLists.addAll(list2);

        String listString = String.join(", ", mergeLists);

        Ex2_writeTXT(file, listString);
    }

    //Exercise 4 Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’
    public static void Ex4_replacement$(String file){
        String result = "";
        try(BufferedReader br = new BufferedReader (new FileReader(file)))
        {
            int c;
            while((c=br.read())!=-1){
                if (Character.isLetter((char)c) || Character.isDigit((char)c)){
                    result += (char)c;
                }
                else{
                    result += "$";
                }
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        Ex2_writeTXT(file, result);
    }

}
