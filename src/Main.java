import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Animal lion = new Animal("Famille des lion", "Simba ", 5, true);

        Animal[] animals = new Animal[1]; 
        animals[0] = lion;
     

        Zoo myZoo = new Zoo(animals, "Belvidaire", "Tunis", 10);

        System.out.println("Zoo Name: " + myZoo.getName());
        System.out.println("City: " + myZoo.getCity());
        System.out.println("Number of Cages: " + myZoo.getNbrCages());
        System.out.println("Animals in the Zoo: ");

        for (Animal animal : myZoo.getAnimals()) {
            System.out.println(" - " + animal.getName() + " (" + animal.getFamily() + ")");
        }
    }
}
