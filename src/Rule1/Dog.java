package src.Rule1;

public final class Dog {
    private String name;
    private int age;

    public Dog(String name,int age){
        if(name==null){
            throw new IllegalArgumentException("Name cannot be null!");
        }
        this.name=name;
        this.age=age;
    }

    public void dogNoise(){
        System.out.println("bark");
    }

    public void getInfo(){
        System.out.println("Dog Information:\nName: "+this.name+"\nAge: "+this.age+" years old");
    }
}
