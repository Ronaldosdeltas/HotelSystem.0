package backfirststeps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Guest> guestlist =new ArrayList<>();
        ArrayList<Character> KindOfBeds =new ArrayList<>();
       KindOfBeds.add('s');
       KindOfBeds.add('c');

        Cottege cottege = new Cottege("beach",2,KindOfBeds,guestlist);
        cottege.setCode(2);
        ArrayList<Character> KindOfKingBeds = new ArrayList<>();
        KindOfKingBeds.add('c');
        Cottege kingCottege = new Cottege("kingCottege",1,KindOfKingBeds,guestlist);
        kingCottege.setCode(2);

        Guest guest = new Guest("Ronaldoss",555555,29,kingCottege,"20/12/2024","7","26/12/2024");
        cottege.addGuest(guest);
        guestlist.add(guest);

        Guest guest2 = new Guest("Camila",555555,29,kingCottege,"20/12/2024","7","26/12/2024");
        cottege.addGuest(guest2);
        guestlist.add(guest2);


    }
}