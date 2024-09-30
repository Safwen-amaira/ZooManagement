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
        
        
        myZoo.displayZoo(); 
        lion.displayAnimal();

        Animal lion1 = new Animal("Famille des lion", "Simba ", 5, true);
        Animal lion2 = new Animal("Famille des lion", "Simba ", 5, true);
        Animal lion3 = new Animal("Famille des lion", "Simba ", 5, true);
        Animal lion4 = new Animal("Famille des lion", "Simba ", 5, true);
        Animal lion5 = new Animal("Famille des lion", "Simba ", 5, true);

            myZoo.addAnimal(lion1);
                        myZoo.addAnimal(lion2);
            myZoo.addAnimal(lion3);
            myZoo.addAnimal(lion4);
            myZoo.addAnimal(lion5);
            myZoo.searchAnimal(lion4);
            myZoo.addAnimal(lion4);
            myZoo.searchAnimal(lion4);


        }
    }
}
