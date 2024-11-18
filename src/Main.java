public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 10_000;
        int bonusMiles = service.calculate(ticketPrice); // должно получиться 500
        System.out.println();
        System.out.println("За билет стоимостью " + ticketPrice + " руб.");
        System.out.println("Начислено бонусных милей: " + bonusMiles);

        ticketPrice = 1_000;
        bonusMiles = service.calculate(ticketPrice);
        System.out.println();
        System.out.println("За билет стоимостью " + ticketPrice + " руб.");
        System.out.println("Начислено бонусных милей: " + bonusMiles);

        ticketPrice = 50;
        bonusMiles = service.calculate(ticketPrice);
        System.out.println();
        System.out.println("За билет стоимостью " + ticketPrice + " руб.");
        System.out.println("Начислено бонусных милей: " + bonusMiles);

        ticketPrice = 19;
        bonusMiles = service.calculate(ticketPrice);
        System.out.println();
        System.out.println("За билет стоимостью " + ticketPrice + " руб.");
        System.out.println("Начислено бонусных милей: " + bonusMiles);
    }
}