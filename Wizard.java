class Wizard extends Character {
    public Wizard(String name) {
        super(name);
        setAttackStrategy(new CastSpell());
        // Wizard only uses magic barrier
        setDefenseStrategies(new MagicBarrierDefense());
    }
}