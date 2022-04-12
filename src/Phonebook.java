import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private int pin;
    private long phoneNumber;

    //    public Phonebook(String firstName, String lastName, String address, String city, int pin, long phoneNumber){
//        super();
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.address = address;
//        this.city = city;
//        this.pin = pin;
//        this.phoneNumber = phoneNumber;
//    }
    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }

    public int setPin(int pin) {
        this.pin = pin;
        return pin;
    }

    public long setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }

    public String setAddress(String address) {
        this.address = address;
        return address;
    }

    public String setCity(String city) {
        this.city = city;
        return city;
    }
    ArrayList<Phonebook> persons = new ArrayList<>();

    public void search(){
        System.out.println("enter the first name");
        Scanner sc = new Scanner(System.in);
        String searchName = sc.next();

        for (int i = 0; i < persons.size(); i++) {

            if (persons.get(i).getFirstName().equals(searchName))
                System.out.println("person is present");
            else
                System.out.println("person is not present");
        }
    }
    public void add(){
        Phonebook contact = new Phonebook();
        contact.setFirstName("jeevan");
        contact.setLastName("nayak");
        contact.setAddress("bhadrak");
        contact.setCity("bhadrak");
        contact.setPin(756100);
        contact.setPhoneNumber(908765432);
        persons.add(contact);
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public int getPin() {
        return pin;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
class main{
    public static void main(String[] args) {
        Phonebook person = new Phonebook();
        person.add();
        person.search();
    }
}


//    WAP to make a phonebook containing field names, addresses, and phone numbers.
//    A user can add a contact in the phonebook and  search contact in the phonebook by using name