package guru.qa;

public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }
    void addAge(int value){
        this.age = age + 10;
    }

    void goToPension(){
        if(age>65){
            System.out.println("I'm pensioner");
        }else{
            System.out.println("I'm young");
        }
    }
    void sayName(){
        System.out.println("My name is" + name);
    }

}
