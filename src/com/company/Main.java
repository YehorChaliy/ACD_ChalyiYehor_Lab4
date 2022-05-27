package com.company;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

class ListElement<E> {
        ListElement next;
        E data;
        String City;
        String Type;
        int Num;
    }

    class List<E> {
        private ListElement head;
        private ListElement tail;

        void addFront(E data) {
            Scanner add = new Scanner(System.in);
            int selection;

            while (true) {
                data = (E) add.next();
                ListElement a = new ListElement();
                a.data = data;

                if (head == null)
                {
                    head = a;
                    tail = a;
                } else {
                    a.next = head;
                    head = a;
                }
                while (true){
                    System.out.println("Додати ще елемент, натисніть 1.");
                    System.out.println("Перейти до головного меню, натисніть 2.");
                    selection = add.nextInt();
                    if(selection < 1 || selection > 2 ){
                        System.out.println("Укажіть вірне значення!");
                        continue;
                    }
                    break;
                }
                if(selection == 1){
                    continue;
                }
                else {
                    System.out.println(" ");
                    System.out.println("Виходимо у головне меню!");
                    break;
                }
            }
        }

        void removeElement(E data) {
            Scanner remove = new Scanner(System.in);
            int selection;
            E rem;
            while (true) {
                rem = (E) remove.next();

                if (head == null) {
                    System.out.println("Список порожній! Спочатку додайте елементи!");
                    return;
                }

                if ((head.data == rem || head.data.equals(rem))&& head == tail){
                    head = null;
                    tail = null;
                    System.out.println(" ");
                    System.out.println("Єдиний єелемент списку видалено успішно!");
                    return;
                }

                if (head.data == rem || head.data.equals(rem)) {
                    head = head.next;
                    System.out.println(" ");
                    System.out.println("Перший елемент списку видалено успішно!");
                    return;
                }

               /* if (tail.data == rem || tail.data.equals(rem) ){
                    tail.data = pointer;
                    System.out.println("Останній елемент списку видалено успішно!");
                    return;
                }*/

                ListElement pointer = head;

                while (pointer.next != null) {
                    if (pointer.next.data == rem || pointer.next.data.equals(rem)) {
                        if (tail == pointer.next)
                        {
                            tail = pointer;
                        }
                        pointer.next = pointer.next.next;
                        return;
                    }
                    pointer = pointer.next;
                }
                while (true) {
                    System.out.println("Видалити ще один елемент, натисніть 1.");
                    System.out.println("Перейти до головного меню, натисніть 2.");
                    selection = remove.nextInt();
                    if (selection < 1 || selection > 2) {
                        System.out.println("Укажіть вірне значення!");
                        continue;
                    }
                    break;
                }
                if (selection == 1) {
                    continue;
                } else {
                    System.out.println("Виходимо у головне меню!");
                    break;
                }
            }
        }

        void addBack(E data) {

            Scanner add = new Scanner(System.in);
            int selection;

            while (true) {
                data = (E) add.next();
                ListElement a = new ListElement();
                a.data = data;
                if (tail == null)
                {
                    head = a;
                    tail = a;
                } else {
                    tail.next = a;
                    tail = a;
                }
                while (true){
                    System.out.println("Додати ще елемент, натисніть 1.");
                    System.out.println("Перейти до головного меню, натисніть 2.");
                    selection = add.nextInt();
                    if(selection < 1 || selection > 2 ){
                        System.out.println("Укажіть вірне значення!");
                        continue;
                    }
                    break;
                }
                if(selection == 1){
                    continue;
                }
                else {
                    System.out.println(" ");
                    System.out.println("Виходимо у головне меню!");
                    break;
                }
            }
        }

        void printList()
        {
            ListElement pointer = head;
            System.out.println("Виводимо список:");
            while (pointer != null)
            {
                System.out.print(pointer.data + " ");
                pointer = pointer.next;
            }
            if (head == null){
                System.out.println("Список порожній! Спочатку додайте елементи!");
            }
        }

    }

public class Main {
    static String[] surnames = new String[10];
    static String[] presents = new String[10];

    static void menu1() {
        System.out.println("Меню: ");
        System.out.println("Додавання елементів на початок списку: 1");
        System.out.println("Вилучення елементів зі списку: 2");
        System.out.println("Додавання елементів у кінець списку: 3");
        System.out.println("Пошук за заданим полем: 4");
        System.out.println("Друкування списку: 5");
        System.out.println("Повернутися до головного меню: 6");
    }

    static void menu2() {
        System.out.println("Меню: ");
        System.out.println("Заповнити список учасників лотереї: 1");
        System.out.println("Вивести список учасникіа лотереї: 2");
        System.out.println("Заповнити список найменувань призів: 3");
        System.out.println("Вивести список найменувань призів: 4");
        System.out.println("Отримати список переможців та їх призів: 5");
        System.out.println("Повернутися до головного меню: 6");
    }

    public static void FillSurnameList(){
        Scanner in = new Scanner(System.in);
        System.out.println("Вам потрібно заповнити прізвищами список участників лотереї");
        for(int i = 0; i < 10; i++){
            System.out.println("Введіть прізвище " + (i+1) + "-ого учасника:");
            surnames[i] = in.nextLine();
        }
        System.out.println("Список успішно заповнений.");
        System.out.println(" ");
    }

    public static void FillPresentList(){
        Scanner in = new Scanner(System.in);
        System.out.println("Вам потрібно заповнити список найменування призів");
        for(int i = 0; i < 10; i++){
            System.out.println("Введіть найменування " + (i+1) + "-ого приза:");
            presents[i] = in.nextLine();
        }
        System.out.println("Список успішно заповнений.");
        System.out.println(" ");
    }

    public static void GetSurnameList(){
        System.out.println("Список учасників лотереї:");
        for(int i = 0; i < 10; i++){
            System.out.print(surnames[i] + " ");
        }
        System.out.println(" ");
    }

    public static void GetPresentList(){
        System.out.println("Список найменувань призів:");
        for(int i = 0; i < 10; i++){
            System.out.print(presents[i] + " ");
        }
        System.out.println(" ");
    }

    public static void Winners(int K, int t) {
        Scanner num = new Scanner(System.in);
        int numberOfWinners;
        int x = 1;
        int y = 2;
        int K1 = K;
        int t1 = t;
        LinkedList<String> win = new LinkedList<String>(new ArrayList(Arrays.asList(surnames)));
        LinkedList<String> winPresents = new LinkedList<String>(new ArrayList(Arrays.asList(presents)));
        System.out.println("Введіть число переможців:");
        numberOfWinners = 3;
        System.out.println("Список переможців та їх призів:");
        for(int i = 0; i < numberOfWinners; i++){
            System.out.println(win.get(i + K - x)+ " виграв " + winPresents.get(i + t - x));
            K = K1*y;
            t = t1*y;
            x++;
            y++;
        }
      /*  for (int i = 0; i < surnames.length; i++) {
            if ((i + 1) % K == 0) {
                counter1++;
                temp1 = i;
                win.add(temp1);
            }
        }*/

        /*for (int i = 0; i < presents.length; i++) {
            do {
                if ((i + 1) % t == 0) {
                    counter2++;
                    temp2 = i;
                    winPresents.add(temp2);
                }
            }while (counter2 <= counter1);
        }*/

      /*  System.out.println("Список переможців та їх призів:");
        for (int i = 0; i < counter1; i++) {
            System.out.print(surnames[win.get(i)].Surname);
        }
        for (int i = 0; i < counter2; i++) {
            System.out.print(presents[winPresents.get(i)].Present);
        }
    }*/
        /*for (int i = 0; i < surnames.length; i++){
                win.set(i, surnames[i].Surname);
            }
        System.out.println(win + " ");*/
    }
    /*public class Surname {
        public String Surname;

        Surname() {
            this.Surname = "None";
        }
    }*/
    public static void Task1() {

        List firstTask = new List();

        Scanner scanner = new Scanner(System.in);
        int selection;
        while (true) {
            System.out.println(" ");
            menu1();
            selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Вкажіть елемент, який хочете додати на початок списку:");
                    firstTask.addFront(null);
                    break;
                case 2:
                    System.out.println("Вкажіть елемент, який хочете вилучити:");
                    firstTask.removeElement(null);
                    break;
                case 3:
                    System.out.println("Вкажіть елемент, який хочете додати у кінець списку:");
                    firstTask.addBack(null);
                    break;
                case 4:
                    System.out.println("Вкажіть поле, за яким хочете отримати список:");
                    break;
                case 5:
                    System.out.println(" ");
                    firstTask.printList();
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println(" ");
                    System.out.println("Повернення, зачекайте...");
                    return;
                default:
                    System.out.println("Введіть вірне значення!");
            }
        }
    }

    public static void Task2() {
        Scanner scanner = new Scanner(System.in);
        int selection;
        while (true) {
            System.out.println(" ");
            menu2();
            selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.println(" ");
                    FillSurnameList();
                    break;
                case 2:
                    System.out.println(" ");
                    GetSurnameList();
                    break;
                case 3:
                    System.out.println(" ");
                    FillPresentList();
                    break;
                case 4:
                    System.out.println(" ");
                    GetPresentList();
                    break;
                case 5:
                    System.out.println(" ");
                    Winners(3, 3);
                    break;
                case 6:
                    System.out.println(" ");
                    System.out.println("Повернення, зачекайте...");
                    return;
                default:
                    System.out.println(" ");
                    System.out.println("Введіть вірне значення!");
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            surnames[i] = new String();
            presents[i] = new String();
        }

        Scanner scanner = new Scanner(System.in);
        int selection;
        while (true) {
            System.out.println(" ");
            System.out.println("Меню: ");
            System.out.println("Виконати перше завдання, натисніть: 1");
            System.out.println("Виконати друге завдання, натисніть: 2");
            System.out.println("Завершити програму, натисніть: 3");
            selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    Task1();
                    break;
                case 2:
                    Task2();
                    break;
                case 3:
                    System.out.println("Програму завершено!");
                    System.exit(0);
                default:
                    System.out.println("Введіть вірне значення!");
            }
        }
    }
}
