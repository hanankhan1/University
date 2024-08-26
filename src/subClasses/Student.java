
package subClasses;


public class Student {
    private String sname;
    private String sid;
    private String PhoneNo;
    private String email;
    private String address;

    public Student(String sname, String sid, String PhoneNo, String email, String address) {
        this.sname = sname;
        this.sid = sid;
        this.PhoneNo = PhoneNo;
        this.email = email;
        this.address = address;
    }

    public Student() {
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

}
