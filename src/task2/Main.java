package task2;
//Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу.
//Добавить классам животных из предыдущего задания имплементацию этих интерфейсов. Некоторые животные могут реализовать больше одного интерфейса (утка может и плавать, и летать и бегать).
interface Fly {
  abstract String getFly();
}
interface Run {
    abstract String getRun();
}
interface Swim {
    abstract String getSwim();
}

public class Main {

    public static void main(String[] args) {
        Herbivores Herb = new Herbivores("Слон", "Бегает", "Плавает");
        Predators Predators1 = new Predators( "Тигр","не может летать", "Бегает", "Плавает");
        System.out.println("Травоядное животное: " +Herb.getName()+ " - " +Herb.getRun()+ ", " +Herb.getSwim());
        System.out.println("Хищное животное: " + Predators1.getName () + " - " + Predators1.getFly() + ", "+"но " + Predators1.getRun () + " и " +Predators1.getSwim());
    }



}