package lab9;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Exercise 2
        String[] fruits = {"apple", "banana", "orange", "apple"};
        List<Object> myFruits = Arrays.asList(fruits);

        Integer[] integers = {1, 2, 3, 4, 5, 1, 2, 3};
        List<Object> myIntegers = Arrays.asList(integers);

        System.out.println(myFruits);
        System.out.println(myIntegers);
        System.out.println();

        System.out.println(Ex2_removeDuplicates(myFruits));
        System.out.println(Ex2_removeDuplicates(myIntegers));
        System.out.println();

        //Exercise 3
        long startTime;
        long endTime;
        long timeElapsed;

        //ArrayList

        ArrayList<Object> arrayList = new ArrayList<>();
        System.out.println(arrayList.size());

        startTime = System.currentTimeMillis();
        Ex3_addObjectArrayList(arrayList);
        endTime = System.currentTimeMillis();
        timeElapsed = endTime - startTime;
        System.out.println(timeElapsed);

        System.out.println(arrayList.size());
        System.out.println(Ex3_findObjectArrayList(arrayList));
        System.out.println();

        //LinkedList

        LinkedList<Object> linkedList = new LinkedList<>();
        System.out.println(linkedList.size());

        startTime = System.currentTimeMillis();
        Ex3_addObjectLinkedList(linkedList);
        endTime = System.currentTimeMillis();
        timeElapsed = endTime - startTime;
        System.out.println(timeElapsed);

        System.out.println(linkedList.size());
        System.out.println(Ex3_findObjectArrayList(linkedList));
        System.out.println();

        //Вывод: многочисленные тесты показали, что ArrayList выигрывает как по времени вставки в конец списка, так и по скорости поиска.
        //ArrayList - динамический массив, а LinkedList - связанный список, поэтому при поиске в массиве затраченное время (при условии отсортированности) скорее всего O(logn), а в списке O(n)

        //Exercise 4
        Map<User, Integer> map = new HashMap<>();
        map.put(new User("111"),1);
        map.put(new User("222"),2);
        map.put(new User("333"),3);
        map.put(new User("444"),4);

        User user5 = new User("555");
        map.put(user5,5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String nameFind = scanner.nextLine();

        Set<User> keys = map.keySet();

        User search = new User(nameFind);
        for(User test : keys){
            if(test.equals(search)){
                search = test;
                break;
            }
        }

        Integer points = map.get(search);
        if (points!=null)
        {
            System.out.print("Очки: ");
            System.out.println(points);
        }
        else {
            System.out.print("Игрок с именем " + nameFind + " не найден");
        }

    }

    //Exercise 2
    public static List<Object> Ex2_removeDuplicates(List<Object> listWithDuplicates) {
        Set<Object> uniques = new HashSet<>(listWithDuplicates);
        List<Object> listWithoutDuplicates = new ArrayList<Object>(uniques);
        return listWithoutDuplicates;
    }

    //Exercise 3

    // ArrayList
    public static List<Object> Ex3_addObjectArrayList(ArrayList<Object> arrayList) {
        Random rnd = new Random();
        for (int i = 0; i<1000000; i++){
            arrayList.add(rnd.nextInt(100));
        }
        return arrayList;
    }

    public static long Ex3_findObjectArrayList(ArrayList<Object> arrayList) {
        long startTime = System.currentTimeMillis();
        Random rnd = new Random();
        for (int i = 0; i<100000; i++){
            arrayList.contains(rnd.nextInt(100));
        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        return timeElapsed;
    }

    //LinkedList
    public static List<Object> Ex3_addObjectLinkedList(LinkedList<Object> linkedList) {
        Random rnd = new Random();
        for (int i = 0; i<1000000; i++){
            linkedList.add(rnd.nextInt(100));
        }
        return linkedList;
    }

    public static long Ex3_findObjectArrayList(LinkedList<Object> linkedList) {
        long startTime = System.currentTimeMillis();
        Random rnd = new Random();
        for (int i = 0; i<100000; i++){
            linkedList.contains(rnd.nextInt(100));
        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        return timeElapsed;
    }

    public static long Ex3_Speed(LinkedList<Object> linkedList) {
        long startTime = System.currentTimeMillis();
        Random rnd = new Random();
        for (int i = 0; i<100000; i++){
            linkedList.contains(rnd.nextInt(100));
        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        return timeElapsed;
    }

}
