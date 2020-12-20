package task3;
// Написать абстрактный класс Человек реализующий интерфейсы «бежать» и «плавать»(в каждом сделать 1-2 метода).
// Сделать несколько наследников этого класса с конкретной реализацией методов, которые объявлены в интерфейсах.

//абстрактный класс
abstract class Person implements Run, Swim {
    //абстрактный метод
    abstract String getName ();
}
//интерфейсы
interface Run {
    abstract String getRun ();
    abstract String getShoes ();
}
interface Swim {
    abstract String getSwim ();
}
//класс Мужчины
class Male extends Person {
    String Name;
    String Run;
    String Swim;
    String Shoes;

    //метод получения имени
    public String getName () {
        return Name;
    }
//конструктор
    Male (String name, String R, String S, String H){ // конструктор
        Name =name;
        Run = R;
        Swim = S;
        Shoes = H;
    }

    public String getRun () {
        return Run;
    }
    public String getSwim () {
        return Swim;
    }
    public String getShoes () {
        return Shoes;
    }
}
//класс Женщины
class Woman extends Person {
    String Name;
    String Run;
    String Swim;
    String Shoes;

    public String getName () {
        return Name;
    }

    Woman (String name, String R, String S, String H){ // конструктор
        Name =name;
        Run = R;
        Swim = S;
        Shoes = H;
    }

    public String getRun () {
        if (Shoes.startsWith("туф"))  Run ="не бежит";
        return Run;
    }
    public String getSwim () {
        return Swim;
    }
    public String getShoes () {
        return Shoes;

    }
}

public class Main {

    public static void main(String[] args) {

        Male Male1 = new Male("Саша","бегает", "умеет отлично плавать","кедах");
        Woman Woman1 = new Woman("Галина", "бежит","не умеет плавать","туфлях");
        System.out.println(Male1.getName()+ ", "+Male1.getRun()+" в "+Male1.getShoes()+", "+Male1.getSwim()+".");
        System.out.println(Woman1.getName()+ ", "+Woman1.getRun()+" в "+Woman1.getShoes()+", "+Woman1.getSwim()+".");
    }
}