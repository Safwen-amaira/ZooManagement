import java.util.Scanner;
public class ZooManagement {


    //Attributs && initialisations :

    int nbrCage = 20;
    String ZooName = "My zoo";


    // Constructeurs & destrecteurs (future work if needed :)   . ) :


    //Getters + Setters (future work if needed :)   .  )



    //Comportement && methodes :



    public static void main(String[] args) {

        ZooManagement MyZoo = new ZooManagement();
        System.out.println(MyZoo.ZooName + " comporte " + MyZoo.nbrCage + " cages");

        Scanner s = new Scanner(System.in);

        System.out.print("Enterer le nouveau Zoo Name: ");
        MyZoo.ZooName = s.nextLine();

        System.out.print("Enterer le nouveau numbre des  cages: ");
        MyZoo.nbrCage = s.nextInt();
        s.close();

        System.out.println("_________________");
        System.out.println(" updated :  ");
        System.out.println("_________________");
        System.out.println(" le Zoo " + MyZoo.ZooName + " comporte "+MyZoo.nbrCage+" cages ");



    }
}
