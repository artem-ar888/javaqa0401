public class BonusMilesService {
   public int calculate(int ticketPrice) {
       int bonusMilePrice = 20;
       int bonus = ticketPrice / bonusMilePrice;
       return bonus;
   }
}
