//Ola Alostaz  الاسم
//2301202683 الرقم الجامعي :

package school;

public class Principal extends Employee {

    private double PrincipalBonus;

    public Principal() {
    }

    public Principal(double PrincipalBonus, String Name, int id, String Address, long phone, String Email, double basicSalary) {
        super(Name, id, Address, phone, Email, basicSalary);
        this.PrincipalBonus = PrincipalBonus;
    }

    public double getPrincipalBonus() {
        return PrincipalBonus;
    }

    public void setPrincipalBonus(double PrincipalBonus) {
        this.PrincipalBonus = PrincipalBonus;
    }

    @Override
    public String toString() {
        return "Principal{" + "PrincipalBonus=" + this.PrincipalBonus + '}';
    }

    /*  The Principal’s salary is the basic salary in addition to the living Expensive and
        the Principal’s Bonus */
    public double getSalary() {
        return this.PrincipalBonus + getBasicSalary() + getLiveExpensive();
    }

}


//Ola Alostaz  الاسم
//2301202683 الرقم الجامعي :