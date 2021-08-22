package b7_abstract_class_interface.thuc_hanh.Animal;
import b7_abstract_class_interface.thuc_hanh.Animal.Animal;
import b7_abstract_class_interface.thuc_hanh.Animal.Chicken;
import b7_abstract_class_interface.thuc_hanh.Animal.Tiger;
import b7_abstract_class_interface.thuc_hanh.fruit.Orange;
import b7_abstract_class_interface.thuc_hanh.fruit.Apple;
import b7_abstract_class_interface.thuc_hanh.fruit.Fruit;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
