package Cas2;

class Application {
    public static void main(String[] args) {
        Character bob = new Character.CharacterBuilder("SpongeBob")
                .setSpecies("Sponge")
                .setSkinColor("Yellow")
                .build();
        System.out.println(
                "name: " + bob.getName() + "\nspiece: " + bob.getSpecies() + "\nskinColor: " + bob.getSkinColor());
    }
}