
package Pontuacao;

public class BonusCalculator {

    public int bonusDay = 1;

    public int bonusUser(User u) {
        int multiplier = bonusDay;
        if (u.vip) {
            multiplier *= 5;
        }
        return multiplier;
    }

}
