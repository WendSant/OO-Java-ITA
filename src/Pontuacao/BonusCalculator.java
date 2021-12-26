
package Pontuacao;

public class BonusCalculator {

    public int bonusDay;

    public int bonusUser(User u) {
        int multiplier = bonusDay;
        if (u.vip) {
            multiplier = 5;
        }
        return multiplier;
    }

}
