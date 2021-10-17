import java.util.Random;
public class EmpWage {
    public static final int is_present=1;
    public static final int is_absent=0;
    public static final int fulltime=8;
    public static final int parttime=4;
    public static final int wagePerHour=20;
    public static final int noOfWorkingDays=20;
    public static int dailyWage=0;
    public static int monthlyWage=0;
    public static int hours=0;
    public static int totalHours=0;
    public static void main(String[] args){
         System.out.println("Welcome to Employee Wage Computation Program");
         for( int i=0; i<noOfWorkingDays && totalHours<100; i++ ){
	  Random random = new Random();
	  int r = random.nextInt(3);
	  switch (r) {
               case is_present: {
	            System.out.println("Employee Present");
                    dailyWage = fulltime * wagePerHour;
                    hours=fulltime;
                    break;
               }
               case is_absent: {
                    System.out.println("Employee Absent");
                    break;
               }
               default: {
                    System.out.println("Emoloyee did part time");
                    dailyWage = parttime * wagePerHour;
                    hours=parttime;
                    break;
               }
           }
           monthlyWage = dailyWage + monthlyWage;
           totalHours = hours + totalHours;
          }
         System.out.println("Daily Wage : " +dailyWage);
         System.out.println("Monthly Wage : " +monthlyWage);
	}
}	
