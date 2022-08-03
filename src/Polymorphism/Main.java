package Polymorphism;

/*The make sound method is common for all the animals but every animal's sound is different.
* Here it is shown that how the different animal classes are implementing the makeSound method
* in their own way. */
public class Main {
    public static void main(String[ ] args) {
        Animal a = new Dog();
        Animal b = new Cat();
        Animal h = new Horse();

        a.makeSound();
        b.makeSound();
        h.makeSound();
    }
}
class Animal {
    public void makeSound() {
        System.out.println("grrrr");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meowww");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Wooooof");
    }
}
class Horse extends Animal{
    public void makeSound(){
        System.out.println("Hein");
    }
}