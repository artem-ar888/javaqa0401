public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println();
        System.out.println("За билет стоимостью " + price + " руб.");
        System.out.println("Начислено бонусных милей: " + miles);

        price = 1_000;
        miles = service.calculate(price);
        System.out.println();
        System.out.println("За билет стоимостью " + price + " руб.");
        System.out.println("Начислено бонусных милей: " + miles);

        price = 50;
        miles = service.calculate(price);
        System.out.println();
        System.out.println("За билет стоимостью " + price + " руб.");
        System.out.println("Начислено бонусных милей: " + miles);

        price = 19;
        miles = service.calculate(price);
        System.out.println();
        System.out.println("За билет стоимостью " + price + " руб.");
        System.out.println("Начислено бонусных милей: " + miles);
    }
}