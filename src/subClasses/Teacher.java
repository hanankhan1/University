
package subClasses;


public class Teacher {
    private String tName;
    private String tId;
    private String salary;
    private String deprt;
    private String Address;
    private String phoneNo;
    private String epass;
    private String equestion;
    private String eanswer;
    private Section sec;

    public Teacher(){}

    public Teacher(String tName, String epass, String equestion, String eanswer) {
        this.tName = tName;
        this.epass = epass;
        this.equestion = equestion;
        this.eanswer = eanswer;
    }

    public Teacher(String tName, String tId, String salary, String deprt, String Address,String phoneNo,Section sec) {
        this.tName = tName;
        this.tId = tId;
        this.salary = salary;
        this.deprt = deprt;
        this.Address=Address;
        this.phoneNo = phoneNo;
        this.sec = sec;
    }

    public Teacher(String tName, String tId, String salary, String deprt, String Address, String phoneNo, String epass, String equestion, String eanswer, Section sec) {
        this.tName = tName;
        this.tId = tId;
        this.salary = salary;
        this.deprt = deprt;
        this.Address = Address;
        this.phoneNo = phoneNo;
        this.epass = epass;
        this.equestion = equestion;
        this.eanswer = eanswer;
        this.sec = sec;
    }
    
    

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDeprt() {
        return deprt;
    }

    public void setDeprt(String deprt) {
        this.deprt = deprt;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEpass() {
        return epass;
    }

    public void setEpass(String epass) {
        this.epass = epass;
    }

    public String getEquestion() {
        return equestion;
    }

    public void setEquestion(String equestion) {
        this.equestion = equestion;
    }

    public String getEanswer() {
        return eanswer;
    }

    public void setEanswer(String eanswer) {
        this.eanswer = eanswer;
    }
    
}
