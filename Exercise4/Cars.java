public class Cars {
    
    String brand;
    int model;
    Person owner;

    Cars(String carBrand, int carModel, Person ownerName){

        this.brand = carBrand;
        this.model = carModel; 
        this.owner = ownerName;

    }

    void showOwner(){
        System.out.println("This " + this.brand + " " + this.model + " model is owned by " + owner.name);
        
    }
}
