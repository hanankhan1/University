package subClasses;

public class Section {

    private Teacher teach;
    private String secName;
    private String secDay;
    private String secRoom;
    private String secTime;       
    private Attendence attend;

    public Section(Teacher teach, String secName, String secDay, String secRoom,String secTime, Attendence attend) {
        this.teach = teach;
        this.secName = secName;
        this.secDay = secDay;
        this.secRoom = secRoom;
        this.secTime=secTime;
        this.attend = attend;
    }

    public Section() {
    }

    public Teacher getTeach() {
        return teach;
    }

    public void setTeach(Teacher teach) {
        this.teach = teach;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getSecDay() {
        return secDay;
    }

    public void setSecDay(String secDay) {
        this.secDay = secDay;
    }

    public String getSecRoom() {
        return secRoom;
    }

    public void setSecRoom(String secRoom) {
        this.secRoom = secRoom;
    }

    public Attendence getAttend() {
        return attend;
    }

    public void setAttend(Attendence attend) {
        this.attend = attend;
    }

    public String getSecTime() {
        return secTime;
    }

    public void setSecTime(String secTime) {
        this.secTime = secTime;
    }

}
