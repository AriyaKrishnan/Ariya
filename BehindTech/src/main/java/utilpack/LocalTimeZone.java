package utilpack;
import java.util.Scanner;
import java.util.TimeZone;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
class LocalTimeZone{
    public static void main(String args[])
    {
        double speed,distance,time;
        int count =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter speed in kmph..:");
        speed = sc.nextDouble();
        System.out.println("Enter distance in km..:");
        distance = sc.nextDouble();
        time = distance / speed ;
        System.out.println("Time taken in hrs is :"+time);
        LocalDate ld = LocalDate.now();
        System.out.println("Starting date:"+ld);
        LocalTime lt = LocalTime.now();
        System.out.println("Staring time:"+lt);
        LocalDateTime ldt=LocalDateTime.of(ld, lt);
        ZonedDateTime Zdt=ZonedDateTime.of(ldt, ZoneId.of("Asia/Calcutta"));
        System.out.println(Zdt);
        RequiredDays Cab = new RequiredDays();
        Cab.DaysRequired(time,Zdt);
    }
}
 class RequiredDays{
    int count = 0;
    public void DaysRequired(double time,ZonedDateTime Zdt)
    {
          while(time>0){
            String week = String.valueOf(Zdt.getDayOfWeek());
            if(week.equals("SUNDAY")){
                Zdt = Zdt.plusDays(1);
            }
            else if(week.equals("SATURDAY")){
               Zdt = Zdt.plusDays(1);
               count=count+1;
               time=time-4;
            }
            else{
               Zdt = Zdt.plusDays(1);
               count=count+1;
               time=time-12;
            }
        }
        System.out.println("No.of days required to reach destination is :"+count+" days");
        System.out.println("Reach destination on :"+Zdt);
    }
}