public class Cat {
    public String name = "Bob";
    public int age = 2;
    public String furColor = "Orange";
    public String sound = "Meow";

    public void speak() {
        System.out.println("My cat sounds " + sound);
    }

    public void getName() {
        System.out.println("My cat name is " + name);
    }

    public void getAge() {
        System.out.println("My cat is " + age + " years old");
    }

    public void getFurColor() {
        System.out.println("The fur color of my cat is " + furColor);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.speak();
        cat.getName();
        cat.getAge();
        cat.getFurColor();
    }
}
