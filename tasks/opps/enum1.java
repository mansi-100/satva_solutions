enum WeekDays{
    Monday,
    Tuesday,
    wednesday,
    thursday,
    friday,
    saturday,
    Sunday;
}
public class enum1{
    public static void main(String args[]){
        // int day = (int) WeekDays.Friday; // enum to int conversion
        // System.out.println(day); //output: 4 
        WeekDays d=WeekDays.Monday;
        System.out.println(d);
        // System.out.println(WeekDays.Friday);
        //some issue with java maybe
    }
}

