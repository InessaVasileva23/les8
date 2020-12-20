package task2;
class Herbivores extends Animal implements Swim, Run {
    String Swim;
    String Run;
    public String getRun(){
        return Run;
    }

    public String getSwim(){
        return Swim;
    }
    String getName(){
        return NameAnimal;
    }
    Herbivores (String name, String R, String S){
        NameAnimal =name;
        Run = R;
        Swim = S;

    }
}

