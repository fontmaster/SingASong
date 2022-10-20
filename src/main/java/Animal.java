public class Animal {
    String animalName = "";
    Animal nextAnimal = null;
    public Animal(String animalName) {
        this.animalName = animalName;
    }
    public Animal(String animalName, Animal animal) {
        this.animalName = animalName;
        this.nextAnimal = animal;
    }

    public String printToSwallow() {
        if (nextAnimal == null) {
            return "I don't know why she swallowed a " +animalName + " - perhaps she'll die!\n\n";
        }
        return "She swallowed the "+animalName +" to catch the " + nextAnimal.animalName +",\n" + nextAnimal.printToSwallow();


    }
}
