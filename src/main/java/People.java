public class People{
    public String name;
    private String firstame;

    private int age;
    private int birthYear;

    private String status;

    public People(String name, String firstname, int age){
        this.name = name;
        this.firstame = firstname;
        this.age  = age;
        this.birthYear = 2017 - this.age;

        //System.out.println("Hello " + this.firstame);
        String status = "Single";
    }

    public String getFirstame(){return this.firstame;}

    public String getStatus(){return this.status;}

    public int getAge() {return age;}

    public int getBirthYear() {return birthYear;}

    public void setStatus(String setStatus){this.status = setStatus;}

    public void setAge(int age){
        this.age = age;
        this.birthYear = 2017 - age;
    }

    public int getOlder(int year){
        int res = this.age + year;
        return res;
    }
}