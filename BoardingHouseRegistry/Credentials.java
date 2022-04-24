package BoardingHouseRegistry;

public class Credentials {
    private String fullName;
    private String phNumber;
    private String age;
    private String address;
    private String gender;
    private String email;
    private String dateOfBirth;
    private String maidenName;

    public void setCredentials(String name, String phNumber, String age, String address, String gender, String email, String DOB, String maidenName){
        this.fullName = name;
        this.phNumber = phNumber;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.email = email;
        dateOfBirth = DOB;
        this.maidenName = maidenName;
    }

    public String getCredentials(){
        return fullName + '\n' 
        + phNumber + '\n' 
        + age + '\n' 
        + address + '\n' 
        + gender + '\n' 
        + email + '\n' 
        + dateOfBirth + '\n'
         + maidenName;
    }
}
