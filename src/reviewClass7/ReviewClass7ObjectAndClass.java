package reviewClass7;

public class ReviewClass7ObjectAndClass {
    String empName="Tarik";
    int empID=12345;
    String group;

    void employeeDetails() {
        System.out.println("This method shows the details of the employee");
    }
    void employeeGroup() {
        System.out.println("This method shows the group of the employee");

    }
    public static void main(String[] args) {
        ReviewClass7ObjectAndClass obj=new ReviewClass7ObjectAndClass();
        obj.employeeGroup();
        obj.employeeDetails();
    }

}
