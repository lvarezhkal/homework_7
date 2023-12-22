public class Main {
    public static void main(String[] args) {
        //1
        int money = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + money;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //2
        int n = 0;
        while (n < 10) {
            n = n + 1;
            System.out.print(n + " ");
        }
        System.out.println();
        while (n > 0) {
            System.out.print(n + " ");
            n = n - 1;
        }
        System.out.println();
        //3
        int totalPeople = 12_000_000;
        int mortality = (totalPeople / 1000) * 8;
        int birthRate = (totalPeople / 1000) * 17;
        int populationChange = birthRate - mortality;
        for (int z = 1; z <= 10; z = z + 1) {
            totalPeople = totalPeople + populationChange;
            System.out.println("Год " + z + ", численность населения составляет " + totalPeople);
        }
        //4
        int contribution = 15000;
        for (int o = 1; contribution <= 12_000_000; o = o + 1) {
            contribution = contribution + ((contribution * 7) / 100);
            System.out.println("Месяц " + o + ", сумма накоплений равна " + contribution + " рублей");
        }
        //5
        int contribution2 = 15000;
        int p = 0;
        for (; contribution2 <= 12_000_000; p++) {
            contribution2 = contribution2 + (contribution2/100)*7;
            if (p % 6 == 0) {
                System.out.println("Месяц " + p + " Итого " + contribution2);
            }
        }
        //6
        long contribution3 = 15000;
        for (int v = 1; v <= 108; v++) {
            contribution3 = contribution3 + (contribution3/100)*7;
            if (v % 6 == 0) {
                System.out.println("Месяц " + v + " Итого " + contribution3);
            }
        }
        //7
        int month = 3;
        while (month <= 31){
            System.out.println("Сегодня пятница, " + month + "-е число. Необходимо подготовить отчет");
            month = month + 7;
        }
        //8
        for (int x = 0; x < 2123; x = x +79){
            if (x > 1823){
                System.out.println(x);
            }
        }

    }
}