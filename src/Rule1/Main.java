package src.Rule1;

public class Main {
    public static void main(String[] args) {
        Dog first=new Dog("Bob",5);
        first.dogNoise();
        first.getInfo();

        try{
            Dog second=new Dog(null,4);
        } catch(IllegalArgumentException e){
            System.out.println("Object not created: "+e.getMessage());
        }
    }
}
