import java.util.HashMap;

class Song {

    public static void main(String[] args) {

        String song = makeSong(args);

        System.out.println(song);
    }

    static String makeSong(String[] args) {

        HashMap<String, String> oldLadySaid = new HashMap<>();

        oldLadySaid.put(args[0], "");
        oldLadySaid.put(args[1], "That wriggled and wiggled and tickled inside her.\n");
        oldLadySaid.put(args[2], "How absurd to swallow a " + args[2] + ".\n");
        oldLadySaid.put(args[3], "Fancy that to swallow a " + args[3] + "!\n");
        oldLadySaid.put(args[4], "What a hog, to swallow a " + args[4] + "!\n");
        oldLadySaid.put(args[5], "I don't know how she swallowed a " + args[5] + "!\n");

        String song = "";
        Animal previousAnimal = null;
        for (String arg : args) {
            String isDot = previousAnimal != null ? ";" :".";
            Animal animal = new Animal(arg, previousAnimal);
            previousAnimal = animal;

            song += "There was an old lady who swallowed a " + arg + isDot + "\n";
            song += oldLadySaid.get(arg);
            song += animal.printToSwallow();
        }

        song += "There was an old lady who swallowed a horse...\n" +
                "...She's dead, of course!";

        String legacySong = "There was an old lady who swallowed a " + args[0] + ".\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + args[1] + ";\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the " + args[1] + " to catch the " + args[0] + ";\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + args[2] + ";\n" +
                "How absurd to swallow a " + args[2] + ".\n" +
                "She swallowed the " + args[2] + " to catch the " + args[1] + ",\n" +
                "She swallowed the " + args[1] + " to catch the " + args[0] + ";\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + args[3] + ";\n" +
                "Fancy that to swallow a " + args[3] + "!\n" +
                "She swallowed the " + args[3] + " to catch the " + args[2] + ",\n" +
                "She swallowed the " + args[2] + " to catch the " + args[1] + ",\n" +
                "She swallowed the " + args[1] + " to catch the " + args[0] + ";\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + args[4] + ";\n" +
                "What a hog, to swallow a " + args[4] + "!\n" +
                "She swallowed the " + args[4] + " to catch the " + args[3] + ",\n" +
                "She swallowed the " + args[3] + " to catch the " + args[2] + ",\n" +
                "She swallowed the " + args[2] + " to catch the " + args[1] + ",\n" +
                "She swallowed the " + args[1] + " to catch the " + args[0] + ";\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + args[5] + ";\n" +
                "I don't know how she swallowed a " + args[5] + "!\n" +
                "She swallowed the " + args[5] + " to catch the " + args[4] + ",\n" +
                "She swallowed the " + args[4] + " to catch the " + args[3] + ",\n" +
                "She swallowed the " + args[3] + " to catch the " + args[2] + ",\n" +
                "She swallowed the " + args[2] + " to catch the " + args[1] + ",\n" +
                "She swallowed the " + args[1] + " to catch the " + args[0] + ";\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a horse...\n" +
                "...She's dead, of course!";
        return song;
    }
}