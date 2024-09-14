public class HomeTask08                 //Симметричное время на электтронных часах: сколько раз в сутки такое бывает?
{
    public static void main(String[] args)
    {
        int hour = -1, minute = 0, count = 0;
        String hourStr = "00", minuteStr = "00";

        for (int i = 0; i < 1440; i++)
        {
            minute = i % 60;
            if (minute < 10)
            {
                minuteStr = "0" + String.valueOf(minute);
            }
            else minuteStr = String.valueOf(minute);

            if (i % 60 == 0)
            {
                hour++;
                if (hour < 10)
                {
                    hourStr = "0" + String.valueOf(hour);
                }
                else hourStr = String.valueOf(hour);
            }

            if (hourStr.charAt(0) == minuteStr.charAt(1) && hourStr.charAt(1) == minuteStr.charAt(0))
            {
                System.out.printf("%s:%s%n", hourStr, minuteStr);
                count++;
            }
        }
        System.out.printf("На электронных часах %d раз в сутки бывает симметричное время", count);
    }
}