package task2;

class Predators extends Animal implements Fly, Swim, Run {
    String Fly;
    String Swim;
    String Run;

    public String getFly(){
        return Fly;
    }

    public String getRun(){
        return Run;
    }

    public String getSwim(){
        return Swim;
    }
   public String getName(){
        return NameAnimal;
    }

    Predators(String name, String F, String R, String S){
       NameAnimal = name;
       Fly = F;
       Run = R;
       Swim = S;
    }
}

