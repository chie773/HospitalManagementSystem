import java.util.ArrayList;
public final class Patient extends Person{
    private int ID;
    private String illness;
    private ArrayList<String> medications;


    Patient(){}

    Patient(String pName, String pGender, String pAddress, String pIllness) {
        this.name = pName;
        this.gender = pGender;
        this.address = pAddress;
        this.illness = pIllness;
    }





}
