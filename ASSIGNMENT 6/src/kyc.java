import java.text.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.lang.*;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) throws ParseException {

        int noOfTestCases ;
        Scanner read = new Scanner(System.in);
        noOfTestCases = read.nextInt();
        for(int i =0;i<noOfTestCases;i++) {
            String signupDate;
            String currentDate;
            System.out.println();
            signupDate = read.next();
            currentDate = read.next();
            String str = signupDate.substring(0, 6) + currentDate.substring(6);
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");


            Date myDate = dateFormat.parse(signupDate);
            Date toDate = dateFormat.parse(currentDate);
            Date s = dateFormat.parse(str);
            long difference_In_Time = toDate.getTime() - myDate.getTime();
            long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24));
            if (difference_In_Days < 330) {
                System.out.println("No Range");
                continue;
            }
            Date oneDayBefore = new Date(s.getTime() - 1000L * 60 * 60 * 24 * 30);
            Date oneDayAfter = new Date(s.getTime() + 1000L * 60 * 60 * 24 * 30);

            String result = dateFormat.format(oneDayBefore);
            String result1 = dateFormat.format(oneDayAfter);
            if (oneDayAfter.compareTo(toDate) > 0) {
                System.out.println(result + " " + currentDate);
            } else {
                System.out.println(result + " " + result1);
            }
        }

    }
}






