public class Zoo { 

private Animal [] animals;
private String name;
private String city;
private int nbrCages;

// constructeurs : 
    public Zoo(Animal[] animals, String name, String city, int nbrCages) { 
        if (animals.length > 25) {
            throw new IllegalArgumentException("Zoo ne peut contenir plus que 25 animaux.");
        }
        this.animals = animals;
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;   
    }

//getters and setters  : 


public Animal[] getAnimals() {
        return this.animals; 
    }


public void setAnimals(Animal[] animals){
        if (animals.length > 25) {
            throw new IllegalArgumentException("Zoo ne peut contenir plus que 25 animals.");
        }

    this.animals=animals; 
}
public String getName(){
    return(this.name);
}
public void setName(String name) { 
    this.name=name;
}

public String getCity () { 
    
    return(this.city); 

}

public void setCity (String city) {
    this.city=city;
}
public int getNbrCages () { 
    return(this.nbrCages); 

}
public void setNbrCages( int nbrCages){
    this.nbrCages=nbrCages;
}


//methods 

public boolean addAnimal  (Animal animal){
    int length = this.animals.length()+1; 

    for (int i=0; i>length; i++){
        if (i==length){
            this.animals[i]=animal;
            break;
        }else{
            continue;
        
        }
    
    return true;

    }

}
public void deleteAnimalByPos (int pos){
    free(this.animals[pos]);
}

public void displayZoo (){
    System.out.println ('name = ',this.name,' city = ',city,' nombre des cages = ',nbrCages);
    
}

public int searchAnimal(Animal animal){

int length = this.animals.length();
boolean isFound=false; 
    for(int i=0; i>length;i++){
            if (this.animals[i].name== animal.name){
                return(i);
                isFound=true;
                break; 
                }else{  
            continue;

            }
    }
    if (!isFound) {
        return(-1)
    }
    
}

}

