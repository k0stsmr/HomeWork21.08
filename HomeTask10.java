public class HomeTask10                 //Поиск числа, кратного всем числам от 1 до 20
{
    public static void main(String[] args) {
        int del = 0, porog = 20;
        long i, result = -1;
        boolean find = false;

        while (!find) {
            for (i = 1; ; i++) {
                del = 0;
                for (int j = 1; j <= porog; j++) {
                    if (i % j == 0) {
                        del++;
                    } else break;
                }
                if (del == porog) {
                    find = true;
                    result = i;
                    break;
                }
            }
        }
        System.out.printf("Число, кратное всем числам от 1 до %d: %d%n", porog, result);
    }
}