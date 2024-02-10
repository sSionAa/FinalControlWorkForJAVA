package FinalSeminarWork;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;


public class NotebookArray {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook();
        notebook1.name = "СуперДуперКрутойНоутбук";
        notebook1.ram = 32;
        notebook1.hardD1riveDisk = 1024;
        notebook1.os = "Windows";
        notebook1.color = "PremiumBlack";

        Notebook notebook2 = new Notebook();
        notebook2.name = "СуперНоутбук";
        notebook2.ram = 16;
        notebook2.hardD1riveDisk = 512;
        notebook2.os = "Windows";
        notebook2.color = "PremiumBlack";

        Notebook notebook3 = new Notebook();
        notebook3.name = "СуперКрутойНоутбук";
        notebook3.ram = 32;
        notebook3.hardD1riveDisk = 512;
        notebook3.os = "Windows";
        notebook3.color = "PremiumBlack";

        Notebook notebook4 = new Notebook();
        notebook4.name = "КрутойНоутбук";
        notebook4.ram = 16;
        notebook4.hardD1riveDisk = 256;
        notebook4.os = "Linux";
        notebook4.color = "PremiumGrey";

        Notebook notebook5 = new Notebook();
        notebook5.name = "ОфисныйНоутбук";
        notebook5.ram = 8;
        notebook5.hardD1riveDisk = 256;
        notebook5.os = "Linux";
        notebook5.color = "Grey";

        Notebook notebook6 = new Notebook();
        notebook6.name = "ДуперНоутбук";
        notebook6.ram = 16;
        notebook6.hardD1riveDisk = 1024;
        notebook6.os = "Windows";
        notebook6.color = "Grey";

        Notebook notebook7 = new Notebook();
        notebook7.name = "Ноутбук";
        notebook7.ram = 16;
        notebook7.hardD1riveDisk = 256;
        notebook7.os = "Windows";
        notebook7.color = "PremiumGrey";

        Notebook notebook8 = new Notebook();
        notebook8.name = "ШтатныйНоутбук";
        notebook8.ram = 8;
        notebook8.hardD1riveDisk = 256;
        notebook8.os = "Linux";
        notebook8.color = "PremiumGrey";

        Notebook notebook9 = new Notebook();
        notebook9.name = "НереальныйНоутбук";
        notebook9.ram = 64;
        notebook9.hardD1riveDisk = 2048;
        notebook9.os = "Windows";
        notebook9.color = "PremiumGold";

//        System.out.println(notebook9);

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);
        notebooks.add(notebook9);


//          printSet(filterAsRam(notebooks, 64));
//          printSet(filterAsHDD(notebooks, 512));
//          printSet(filterAsOS(notebooks, "Linux"));
//          printSet(filterAsColor(notebooks, "PremiumGold"));

//        printSet(notebooks);
//        notebooks.forEach(notebook -> System.out.println(notebook));


//        static Set<Notebook> filterAsRam (Set < Notebook > notebooks,int ram){
//            Set<Notebook> set_ram = new HashSet<>();
//            for (Notebook notebook : notebooks) {
//                if (notebook.ram >= ram) {
//                    set_ram.add(notebook);
//                }
//            }
//            return set_ram;
//        }
//
//        static Set<Notebook> filterAsHDD (Set < Notebook > notebooks,int hardDriveDisk){
//            Set<Notebook> set_hdd = new HashSet<>();
//            for (Notebook notebook : notebooks) {
//                if (notebook.hardD1riveDisk >= hardDriveDisk) {
//                    set_hdd.add(notebook);
//                }
//            }
//            return set_hdd;
//        }
//
//        static Set<Notebook> filterAsOS (Set < Notebook > notebooks, String os){
//            Set<Notebook> set_os = new HashSet<>();
//            for (Notebook notebook : notebooks) {
//                if (notebook.os == os) {
//                    set_os.add(notebook);
//                }
//            }
//            return set_os;
//        }
//
//        static Set<Notebook> filterAsColor (Set < Notebook > notebooks, String color){
//            Set<Notebook> set_color = new HashSet<>();
//            for (Notebook notebook : notebooks) {
//                if (notebook.color == color) {
//                    set_color.add(notebook);
//                }
//            }
//            return set_color;
//        }


//        Set<Notebook> allNoteBooks = new HashSet<>();
//        printSet(allNoteBooks);

//        Set<Notebook> notebooks = Set.copyOf(allNoteBooks);
        while (true) {
            System.out.println("Введите цифру, соответствующую необходимому критерию: \n" +
                    "1 - ОЗУ\n" +
                    "2 - Объем ЖД\n" +
                    "3 - Операционная система\n" +
                    "4 - Цвет \n" +
                    "5 - Поиск ");
            Scanner scanner = new Scanner(System.in);
            String pr = scanner.nextLine();
            Set<Notebook> filterBook = new HashSet<>();
            switch (pr) {
                case "1":
                    System.out.println("Введите минимальное значение желаемой памяти ОЗУ в Гигабайтах");
                    int minRam = scanner.nextInt();
                    System.out.println("Введите максимальное значение желаемой памяти ОЗУ Гигабайтах");
                    int maxRam = scanner.nextInt();
                    for (Notebook notebook : notebooks) {
                        if (notebook.getRAM() >= minRam && notebook.getRAM() <= maxRam) {
                            filterBook.add(notebook);
                        }
                    }
                    notebooks = Set.copyOf(filterBook);
                    break;
                case "2":
                    System.out.println("Введите минимальное значение желаемой памяти  в Мегабайтах");
                    int minHdd = scanner.nextInt();
                    System.out.println("Введите максимальное значение желаемой памяти в Мегабайтах");
                    int maxHdd = scanner.nextInt();
                    for (Notebook noteBook : notebooks) {
                        if (noteBook.getHDD() >= minHdd && noteBook.getHDD() <= maxHdd) {
                            filterBook.add(noteBook);
                        }
                    }
                    notebooks = Set.copyOf(filterBook);
                    break;
                case "3":
                    System.out.println("Выберите Операционую систему:\n1 - Windows\n2 - Linux");
                    String os = scanner.nextLine();
                    switch (os) {
                        case "1":
                            for (Notebook notebook : notebooks) {
                                if (notebook.getOS().equals("Windows")) {
                                    filterBook.add(notebook);
                                }
                            }
                            break;
                        case "2":
                            for (Notebook notebook : notebooks) {
                                if (notebook.getOS().equals("Linux")) {
                                    filterBook.add(notebook);
                                }
                            }
                            break;
                        default:
                            System.out.println("Некорректный ввод");
                            break;
                    }
                    notebooks = Set.copyOf(filterBook);
                    break;
                case "4":
                    System.out.println("Выберите цвет:\n1 - PremiumBlack\n2 - PremiumGrey\n3 - PremiumGold\n4 - Grey");
                    String col = scanner.nextLine();
                    switch (col) {
                        case "1":
                            for (Notebook notebook : notebooks) {
                                if (notebook.getColor().equals("PremiumBlack")) {
                                    filterBook.add(notebook);
                                }
                            }
                            break;
                        case "2":
                            for (Notebook notebook : notebooks) {
                                if (notebook.getColor().equals("PremiumGrey")) {
                                    filterBook.add(notebook);
                                }
                            }
                            break;
                        case "3":
                            for (Notebook notebook : notebooks) {
                                if (notebook.getColor().equals("PremiumGold")) {
                                    filterBook.add(notebook);
                                }
                            }
                            break;
                        case "4":
                            for (Notebook notebook : notebooks) {
                                if (notebook.getColor().equals("Grey")) {
                                    filterBook.add(notebook);
                                }
                            }
                            break;
                        default:
                            System.out.println("Некорректный ввод");
                            break;
                    }
                    notebooks = Set.copyOf(filterBook);
                    break;
                case "5":
                    System.out.println("Подбор окончен");
                    if (notebooks.isEmpty()) {
                        System.out.println("Нет ноутбуков подходящих по выбранные параметры\nОзнакомьтесь с полным списком имеющихся в наличии ноутбуков");
                    } else {
                        System.out.println("Подходящие ноутбуки");
                        printSet(notebooks);
                    }
                    return;
                default:
                    System.out.println("Некорректный ввод");
                    break;

            }

        }
    }

    static void printSet(Set<Notebook> set) {
        for (Notebook notebook : set) {
            System.out.println(notebook);
        }
    }
}

