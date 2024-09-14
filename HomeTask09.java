public class HomeTask09                 //Сумма чисел, кратных 3 и 5, до 1000
{
    public static void main(String[] args)
    {
        int summa=0;

        for (int i = 1; i < 1000 ; i++)
        {
            if (i % 3 == 0  || i % 5 == 0)
            {
                summa += i;
            }
        }
        System.out.printf("Сумма чисел, кратных 3 и 5, в диапазоне [1;1000): %d", summa);
    }
}