public class MyDate {
    
    private int day, month, year;
    public MyDate()
    {
        day = 18;
        month = 1;
        year = 2024;
    }
    public MyDate(int d, int m, int y)
    {
        day=d;
        month=m;
        year=y;
    }
    public void dispDate()
    {
    System.out.println("Date is: "+day+"/"+month+"/"+year);
    }
    public int getDay()
    {
        return day;
    }
    public void setDay(int d)
    {
        day = d;
    }
}
