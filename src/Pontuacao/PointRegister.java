package Pontuacao;

public class PointRegister {

    private BonusCalculator bonus;

    public PointRegister(BonusCalculator bc) {
        bonus = bc;
    }

    public void doComent(User u) {
        u.pontos += 3 * bonus.bonusUser(u);
    }

    public void topicCreate(User u) {
        u.pontos += 5 * bonus.bonusUser(u);
    }

    public void doLike(User u) {
        u.pontos += 1 * bonus.bonusUser(u);
    }

}
