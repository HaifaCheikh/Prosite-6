package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {
        super();
        this.habitat = null;
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aquatic)) return false;
        Aquatic aquatic = (Aquatic) obj;
        return this.getName().equals(aquatic.getName()) &&
                this.getAge() == aquatic.getAge() &&
                this.habitat.equals(aquatic.habitat);
    }
}

