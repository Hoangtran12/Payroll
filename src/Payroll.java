public class Payroll {
    private String empName;
    private String empID;
    private double hourlyRate;
    private int hoursWorked;

    //default constructor
    public Payroll() {
    }

    //constructor
    public Payroll(String empName, String empID) {
        this.empName = empName;
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
    return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //gross pay calculation
    public double getGrossPay(){
        return hourlyRate*hoursWorked;
    }

}
