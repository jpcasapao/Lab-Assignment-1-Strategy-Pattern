class Knight extends Character {
    public Knight(String name) {
        super(name);
        setAttackStrategy(new SwingSword());
        // Knight can use all 3 defenses
        setDefenseStrategies(
            new ShieldDefense(),
            new DodgeDefense(),
            new MagicBarrierDefense()
        );
    }
}