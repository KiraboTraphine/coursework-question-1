
package balexcompany;


public class balexCalculations {
    public void calculatePay(double basePay,int hoursWorked){
        double minimumWage = 8.00;
        int maxHours = 60;
        int overtimeDuration = 40;
        double overtimeRate = 1.5;
        
        // Check if base pay is less than minimum wage
        if (basePay < minimumWage){
            System.out.println("Error:Base pay must be at least $8.00 per hour");
           // Exit the method if the base pay is invalid
        }
        //Check if hours worked exceed maximum allowed hours
        if (hoursWorked > maxHours) {
            System.out.println("Hours worked must not exceed 60 hours per week");
            //Exit the method if hours worked exceed the limit
        }
        // Calculate regular and overtime hours
        int regularHours = Math.min(hoursWorked, overtimeDuration);
        int overtimeHours = Math.max(0, hoursWorked-overtimeDuration);
        
        //Calculate totoal pay
        double totalPay = (regularHours * basePay) + (overtimeHours* basePay* overtimeRate);
         //Print the total pay
         System.out.println("Total Pay: $" + totalPay);
        
        }
        
    }
    

