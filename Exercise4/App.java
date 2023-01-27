public class App {
    public static void main(String[] args) throws Exception {
        
        Person Me = new Person ("Jessa", 19);

        Person Friend = new Person ("Raph", 23);


        Me.addFriend(Friend);


        Pet Cat = new Pet("kuki", 2, Me);
        Cat.showOwner();

        Person Classmate = new Person ("Berna", 18);

        Person Classmate2 = new Person ("Anrry", 19);

        Person Classmate3 = new Person ("Jerone", 20);

        Me.addClassmate(Classmate);
        Me.addClassmate(Classmate2);
        Me.addClassmate(Classmate3);

        Cars Car = new Cars("Ford", 2022, Me);
        Car.showOwner();

    }
}
