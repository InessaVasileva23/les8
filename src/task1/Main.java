package task1;

//Написать абстрактный класс Animal с абстрактным методом getName. Сделать несколько классов животных, наследников Animal.
// Метод getName должен выводит название каждого животного.


public class Main {


    public static void main(String[] args) {
        Herbivores Herb = new Herbivores("Слон ");
        Predators Predators1 = new Predators( "Тигр");
        System.out.println("Травоядное животное: " +Herb.getName());
        System.out.println("Хищное животное: " +Predators1.getName());
    }
}
