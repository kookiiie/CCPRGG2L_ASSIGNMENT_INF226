public class Pet {
    
    int age;
    String name;
    Person owner;

    
    Pet(String petName, int petAge, Person ownerName){

        this.name = petName;
        this.age = petAge; 
        this.owner = ownerName;

    }

    void showOwner(){
        System.out.println("My name is " + this.name + ". My owner name is " + owner.name);
        
    }
}

