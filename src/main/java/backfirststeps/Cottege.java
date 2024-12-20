package backfirststeps;

import java.util.ArrayList;

public class Cottege {
  private int code;
  private String name;
  private int bedAmount;
  private ArrayList<Character> KindsOfBeds;
  private ArrayList<Guest> guests;

    public Cottege( String name, int bedAmount,
                   ArrayList<Character> kindsOfBeds, ArrayList<Guest> guests) {

        this.name = name;
        this.bedAmount = bedAmount;
        KindsOfBeds = kindsOfBeds;
        this.guests = new ArrayList<>();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBedAmount() {
        return bedAmount;
    }

    public void setBedAmount(int bedAmount) {
        this.bedAmount = bedAmount;
    }

    public ArrayList<Character> getKindsOfBeds() {
        return KindsOfBeds;
    }

    public void setKindsOfBeds(ArrayList<Character> kindsOfBeds) {
        KindsOfBeds = kindsOfBeds;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }
    public void addGuest(Guest guest){
        guests.add(guest);
    }
    public void removeGuest(int cpf){
        guests.remove(cpf);
    }

    @Override
    public String toString() {
        return "Cottege{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", bedAmount=" + bedAmount +
                ", KindsOfBeds=" + KindsOfBeds +
                ", guests=" + guests +
                '}';
    }
}
