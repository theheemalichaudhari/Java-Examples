public class ArrayDemo 
{
    public static void main(String[] args)
    {
        MyDate[] dob = new MyDate[5];
        dob[0] = new MyDate(15,04,2001);
        dob[1] = new MyDate(20,01,2001);
        dob[2] = new MyDate(23,06,2001);
        dob[3] = new MyDate(14,11,2001);
        dob[4] = new MyDate(05,11,2001);

        for(int i=0; i<dob.length; i++)
        {
            System.out.println(dob[i]);
        }
    }
}


