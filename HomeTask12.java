import java.util.Scanner;

public class HomeTask12 //номер дня, на который спортсмен, начиная с x км, пробежит y км, увеличивая на 10% в день от предыдущего
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double x, y;
        int d = 1;
        System.out.print("Введите исходное количество километров -> ");
        x = input.nextDouble();
        System.out.print("Введите результирующее количество километров -> ");
        y = input.nextDouble();
        for(int i = 1; x < y ; i++)
        {
            x = x + x*0.1;
            d = i;
        }
        System.out.printf("Спортсмен пробежит не менее %.3f км (по факту %.3f км) на %d день", y, x, d);
    }
}
