public class App {
    public static void main(String[] args) throws Exception {
       
        Person me = new Person();
        
        // The name property cannot be accessed outside of the Person class.
        // Me.name;

        //System.out.print(me.name);

        //set method
        //new name
        me.setName("Mea"); 

        //get method
        System.out.println(me.getName());

        //Daughter class
        Daughter myself = new Daughter();

        System.out.println(myself.surName);
        
        //prints showSurname class
        myself.showSurname();
    }

}
