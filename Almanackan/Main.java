import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        List<String> m_names = new ArrayList<String>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List<Appointment> allDates = null;
        m_names.add("jan");
        m_names.add("feb");
        m_names.add("mar");
        m_names.add("apr");
        m_names.add("maj");
        m_names.add("jun");
        m_names.add("jul");
        m_names.add("aug");
        m_names.add("sep");
        m_names.add("okt");
        m_names.add("nov");
        m_names.add("dec");
        String line = null;
        try {
            while ((line = input.readLine()) != null) {
                line.trim();
                Scanner sc = new Scanner(line);
                int numberOfInputs = sc.nextInt();
                allDates = new ArrayList<Appointment>();
                for (int counter = 0; counter < numberOfInputs; counter++) {
                    String[] aAppointment = input.readLine().split("\\s+");
                    String month = aAppointment[0];
                    int monthIndex = m_names.indexOf(month);
                    int day = Integer.parseInt(aAppointment[1]);
                    String[] time = aAppointment[2].split(":");
                    int hh = Integer.parseInt(time[0]);
                    int mm = Integer.parseInt(time[1]);
                    String dispTid = time[0]+":"+time[1];

                    String description = "";
                    for (int count = 3; count < aAppointment.length; count++) {
                        if (count == 3) {
                            description += aAppointment[count];
                        } else {
                            description += " " + aAppointment[count];
                        }

                    }
                    Time tid = new Time(hh, mm, dispTid);
                    Date datum = new Date(monthIndex, month, day, tid);
                    Appointment appointment = new Appointment(datum, description);
                    allDates.add(appointment);

                }
                ArrayList<Appointment> sorted = new ArrayList<Appointment>();
                sortAppointments(allDates);
                for (Appointment app : allDates) {
                    app.printAppointment();
                }


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sortAppointments(List<Appointment> allDates) {
        int n = allDates.size();
        for (int i = 0; i < n; i++) {
            int minst = i;
            for (int j = i + 1; j < n; j++) {
                if (allDates.get(j).lessThan(allDates.get(minst)) == 1) {
                    minst = j;
                }
                Appointment jApp = allDates.get(i);
                Appointment minstApp = allDates.get(minst);
                allDates.set(minst, jApp);
                allDates.set(i, minstApp);
            }
        }
    }
}
class Time{
    int hh;
    int mm;
    String dispTid;
    public Time(int hh, int mm, String dispTid){
        this.hh=hh;
        this.mm=mm;
        this.dispTid=dispTid;
    }public int lessThan(Time b){
        if (this.hh<b.hh){
            return 1;
        }else{
            if (this.mm<b.mm){
                return 1;
            }else{
                return 0;
            }
        }
    }
}


class Date{
    int monthIndex;
    String month;
    int day;
    Time time;
    public Date(int monthIndex, String month, int day, Time time){
        this.monthIndex=monthIndex;
        this.month=month;
        this.day=day;
        this.time=time;
    }
    public int lessThan(Date b){
        if (this.monthIndex<b.monthIndex){
            return 1;
        }else if(this.monthIndex>b.monthIndex){
            return 0;
        }else{
            if (this.day<b.day){
                return 1;
            }else if(this.day>b.day) {
                return 0;
            }else{
                return this.time.lessThan(b.time);
            }
        }
    }
}
class Appointment{
    Date date;
    String description;
    public Appointment(Date date, String description){
        this.date=date;
        this.description=description;
    }public void printAppointment(){
        System.out.println(this.date.month+" "+ this.date.day+ " "+ this.date.time.dispTid+" "+this.description);
    }
    public int lessThan(Appointment b){
        return this.date.lessThan(b.date);
    }

}
