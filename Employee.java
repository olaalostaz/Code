//Ola Alostaz  الاسم
//2301202683 الرقم الجامعي :


package school;

public abstract class Employee {

    private String Name;
    private int id;
    private String Address;
    private long phone;
    private String Email;
    private double basicSalary;
    private double liveExpensive;

    public double getLiveExpensive() { //  The living Expensive is only 10% of the basic salary
        return this.basicSalary * (10.0f / 100.0f);
    }

    public void setLiveExpensive(double liveExpensive) {
        this.liveExpensive = liveExpensive;
    }

    Employee() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Employee(String Name, int id, String Address, long phone, String Email, double basicSalary) {
        this.Name = Name;
        this.id = id;
        this.Address = Address;
        this.phone = phone;
        this.Email = Email;
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "Employee{" + "Name=" + Name + ", id=" + id + ", Address=" + Address + ", phone=" + phone + ", Email=" + Email + ", basicSalary=" + basicSalary + ", liveExpensive=" + liveExpensive + '}';
    }

}




//Ola Alostaz  الاسم
//2301202683 الرقم الجامعي :