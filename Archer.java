class Archer extends Character {
    public Archer(String name) {
        super(name);
        setAttackStrategy(new ShootArrow());
        // Archer only uses dodge
        setDefenseStrategies(new DodgeDefense());
    }
}