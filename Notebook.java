package FinalSeminarWork;



/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
Критерии фильтрации можно хранить в Map.
Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет
5 - Поиск
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
Работу сдать как обычно ссылкой на гит репозиторий
Частые ошибки:
1. Заставляете пользователя вводить все существующие критерии фильтрации
2. Невозможно использовать более одного критерия фильтрации одновременно
3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики ноутбуков или добавить еще ноутбук,
то программа начинает работать некорректно
 */
public class Notebook {
    String name;
    int ram;
    int hardD1riveDisk;
    String os;
    String color;

    public int getRAM() {
        return ram;
    }

    public void setRAM(int ram) {
        this.ram = ram;
    }

    public int getHDD() {
        return hardD1riveDisk;
    }

    public void setHDD(int hardD1riveDisk) {
        this.hardD1riveDisk = hardD1riveDisk;
    }

    public String getOS() {
        return os;
    }

    public void setOS(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }



    public void setColour(String colour) {
        this.color = color;
    }


    @Override
    public String toString(){
        return "Name: " + name + ", Ram: " + ram + ", HDD: " + hardD1riveDisk + ", OperationSystem: " + os + ", Color: " + color;
    }

}
