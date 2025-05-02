public class massive {
    public static void main(String[] args) {
        int [] mas1 = {1, 45, 555, 55, 989};
        System.out.print("\nМассив изначально: ");
        int len = mas1.length;
        for (int i = 0; i < len; i++){
            System.out.print(" [" + mas1[i] + "] ");
        }

        int tmp;
        tmp = mas1[0];
        mas1[0] = mas1[len - 1];
        mas1[len - 1] = tmp;

        System.out.print("\n\nМассив после замены первого и последнего элементов местами: ");
        for (int i = 0; i < len; i++){
            System.out.print(" [" + mas1[i] + "] ");
        }

        int sum = mas1[0] + mas1[len - 3];
        System.out.print("\n\nСумма первого и среднего элементов(с учетом замены): " + sum + "\n");
    }
}