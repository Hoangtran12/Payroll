import java.util.Scanner;

public class PayrollDemo {

    public static void main(String[] args) {
        // scanner object
        Scanner in = new Scanner(System.in);
        // Payroll object
        Payroll payroll = null;
        String name;
        while (true) {
            //get employee name
            System.out.print("Enter employee name: ");
            name = in.nextLine();
            try {
                if (name.trim().equals("")) {
                    throw new InvalidNameException("Employee name is empty");
                } else {
                    break;
                }
            } 
            catch (InvalidNameException ex) {
                System.out.println("Will not accept empty name");
            }
        }
        String id;
        while (true) {
            //get employee id
            System.out.print("Enter employee ID: ");
            id = in.nextLine();
            try {
                if (id.trim().equals("")) {
                throw new InvalidIDException("Employee id is empty");
                } else {
                    break;
                }
            } 
            catch (InvalidIDException ex) {
            System.out.println("Will not accept empty id");
            }

        }
        // initialize payroll
        payroll = new Payroll(name, id);

        double hourlyRate;
        while (true) {
            //get hourly rate
            System.out.print("Enter employee hourly rate: ");
            hourlyRate = Double.parseDouble(in.nextLine());
            try {
                if (hourlyRate > 25 || hourlyRate < 0) {
                    throw new InvalidHourlyRateException("Hourly rate is not valid");
                } else {
                    break;
                }
            } 
            catch (NumberFormatException | InvalidHourlyRateException e) {
            System.out.println("Invalid number");
            }
        }
        payroll.setHourlyRate(hourlyRate);

        int hours;
        while (true) {
            //get hours worked
            System.out.print("Enter employee hours worked: ");
            hours = Integer.parseInt(in.nextLine());
            try {
                if (hours > 84 || hours < 0) {
                    throw new InvalidHoursException("Hour is not valid");
                } else {
                    break;
                }
            } 
            catch (NumberFormatException | InvalidHoursException e) {
            System.out.println("Invalid number");
            }
        }
        payroll.setHoursWorked(hours);

        //calculate grosspay
        double grosspay = payroll.getGrossPay();
        System.out.println("Gross pay: " + grosspay);

    }
}

