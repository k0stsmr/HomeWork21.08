public class HomeTask07                 //Битовое представление числа
{
    public static void main(String[] args)
    {
        int i = 35;
        System.out.printf("Битовое представление числа %d в обратной записи (с последнего бита): ", i);
        while (i > 1)
        {
            System.out.printf("%d", i % 2);
            i >>= 1;
        }
        System.out.printf("%d", i);
    }
}