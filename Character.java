abstract class Character {
    protected String name;                    // optional: for nicer output
    protected AttackStrategy attackStrategy;
    protected DefenseStrategy[] defenseStrategies;  // multiple possible defenses

    public Character(String name) {
        this.name = name;
    }

    public void setAttackStrategy(AttackStrategy strategy) {
        this.attackStrategy = strategy;
    }

    public void attack() {
        if (attackStrategy != null) {
            System.out.print(name + " ");
            attackStrategy.execute();
        }
    }

    public void defend() {
        System.out.println(name + " tries to defend:");
        if (defenseStrategies != null) {
            for (DefenseStrategy strategy : defenseStrategies) {
                strategy.execute();
            }
        } else {
            System.out.println("  (no defense available)");
        }
    }

    // Optional: for dynamic change at runtime
    public void setDefenseStrategies(DefenseStrategy... strategies) {
        this.defenseStrategies = strategies;
    }
}