public class Animal {

private String family;
private String name;
private int age;
private boolean isMammal;


//constructeurs : 

    Animal (String family, String name , int age , boolean isMammal) {


        this.family = family ; 
        this.name=name; 
        this.age = age; 
        this.isMammal=isMammal; 
    }


//getters and setters : 

public void setFamily (String family) {
    this.family = family; 

}

public String getFamily () {
    return(this.family); 
}


public void setName (String name) {
    this.name = name; 
    
}
public String getName() {

    return(this.name) ;
    
}


public void setAge (int age) {
    this.age = age; 
    
}
public int getage () {

        return (this.age);
}
public void setIsmammal (boolean isMammal) {
    this.isMammal = isMammal; 
    
}
public boolean getIsmammal () {
        return (this.isMammal);
}


//methods : 

public void displayAnimal(){
    System.out.print('family = ',this.family,'name = ', this.name,' age=  ',this.age)
        if (this.isMammal){
            System.out.println('this animal is mammal') ;
        }else{
            System.out.println('this  animal is not a mammal animal'); 


        }
    }   



}

