import java.util.HashMap;

public class Person {

    String name;

    String gender;

    String address;

    Person(){}

    Person(String pName, String pGender, String pAddress) {
        name = pName;
        gender = pGender;
        address = pAddress;
    }

    public String getDetails() {
        return "Name: " + name + "\nGender: " + gender + "\nAddress: " + address;
    }


}