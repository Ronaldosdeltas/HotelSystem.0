package backfirststeps;

public class Guest {
    private String name;
    private int cpf;
    private int age;
    private Cottege cottege;
    private String ArrivedDay;
    private String LeftDay;
    private String NumberOfDaysInCottege;

    public Guest(String name, int cpf, int age, Cottege cottege,
                 String arrivedDay, String numberOfDaysInCottege, String leftDay) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
        this.cottege = cottege;
        ArrivedDay = arrivedDay;
        NumberOfDaysInCottege = numberOfDaysInCottege;
        LeftDay = leftDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cottege getCottege() {
        return cottege;
    }

    public void setCottege(Cottege cottege) {
        this.cottege = cottege;
    }

    public String getArrivedDay() {
        return ArrivedDay;
    }

    public void setArrivedDay(String arrivedDay) {
        ArrivedDay = arrivedDay;
    }

    public String getLeftDay() {
        return LeftDay;
    }

    public void setLeftDay(String leftDay) {
        LeftDay = leftDay;
    }

    public String getNumberOfDaysInCottege() {
        return NumberOfDaysInCottege;
    }

    public void setNumberOfDaysInCottege(String numberOfDaysInCottege) {
        NumberOfDaysInCottege = numberOfDaysInCottege;
    }
}
