package Cas2;

public class Character {
    private String name;
    private String species;
    private String skinColor;
    private String hairColor;
    private String intelligence;
    private String strength;
    private String agility;
    private String armor;
    private String weapon;

    private Character(CharacterBuilder characterBuilder) {
        this.name = characterBuilder.name;
        this.species = characterBuilder.species;
        this.skinColor = characterBuilder.skinColor;
        this.hairColor = characterBuilder.hairColor;
        this.intelligence = characterBuilder.intelligence;
        this.strength = characterBuilder.strength;
        this.agility = characterBuilder.agility;
        this.armor = characterBuilder.armor;
        this.weapon = characterBuilder.weapon;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public static class CharacterBuilder {
        private String name;
        private String species;
        private String skinColor;
        private String hairColor;
        private String intelligence;
        private String strength;
        private String agility;
        private String armor;
        private String weapon;

        public CharacterBuilder(String name) {
            this.name = name;
        }

        public CharacterBuilder setSpecies(String species) {
            this.species = species;
            return this;
        }

        public CharacterBuilder setHairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public CharacterBuilder setSkinColor(String skinColor) {
            this.skinColor = skinColor;
            return this;
        }

        // Build the Employee object
        public Character build() {
            return new Character(this);
        }
    }
}