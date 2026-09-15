import java.util.Scanner;

class Member
{
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void printSalary()
    {
        System.out.println("Salary: " + salary);
    }
}

class PrimeMembers extends Member
{
    private int joiningYear;
    private double joiningFees;
    private boolean isActive;

    public void setJoiningYear(int joiningYear)
    {
        this.joiningYear = joiningYear;
    }

    public int getJoiningYear()
    {
        return joiningYear;
    }

    public void setJoiningFees(double joiningFees)
    {
        this.joiningFees = joiningFees;
    }

    public double getJoiningFees()
    {
        return joiningFees;
    }

    public void setActive(boolean isActive)
    {
        this.isActive = isActive;
    }

    public boolean getActive()
    {
        return isActive;
    }

    void display()
    {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + getSalary());
        System.out.println("Joining Year: " + getJoiningYear());
        System.out.println("Joining Fees: " + getJoiningFees());
        System.out.println("Active: " + getActive());
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        PrimeMembers p = new PrimeMembers();

        System.out.print("Enter name: ");
        p.setName(sc.nextLine());

        System.out.print("Enter age: ");
        p.setAge(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter phone number: ");
        p.setPhoneNumber(sc.nextLine());

        System.out.print("Enter address: ");
        p.setAddress(sc.nextLine());

        System.out.print("Enter salary: ");
        p.setSalary(sc.nextDouble());

        System.out.print("Enter joining year: ");
        p.setJoiningYear(sc.nextInt());

        System.out.print("Enter joining fees: ");
        p.setJoiningFees(sc.nextDouble());

        System.out.print("Is active: ");
        p.setActive(sc.nextBoolean());

        System.out.println();

        p.display();
    }
}