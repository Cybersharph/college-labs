import java.util.Random;

/**
 * This program generates random sentences based on the provided BNF grammar rules.
 */
public class RandomSentenceGenerator {

    // Static arrays to store possible words for each category
    static final String[] properNouns = { "Fred", "Jane", "Richard Nixon", "Miss America" };
    static final String[] commonNouns = { "man", "woman", "fish", "elephant", "unicorn" };
    static final String[] determiners = { "a", "the", "every", "some" };
    static final String[] adjectives = { "big", "tiny", "pretty", "bald" };
    static final String[] intransitiveVerbs = { "runs", "jumps", "talks", "sleeps" };
    static final String[] transitiveVerbs = { "loves", "hates", "sees", "knows", "looks for", "finds" };
    static final String[] conjunctions = { "and", "or", "but", "because" };

    
    public static void main(String[] args) {
    	
        int numberOfSentencesToGenerate = 3;
        
        for (int i = 0; i < numberOfSentencesToGenerate; i++) {
            randomSentence();
            System.out.println(".\n\n");
            try {
                Thread.sleep(1000); // Pause for 3 seconds before generating the next sentence
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * Generates a random sentence following the BNF grammar rules.
     */
    static void randomSentence() {
        randomSimpleSentence();
        if (Math.random() > 0.2) {
            String conjunction = randomItem(conjunctions);
            System.out.print(" " + conjunction + " ");
            randomSentence();
        }
    }

    /**
     * Generates a random simple sentence following the BNF grammar rules.
     */
    static void randomSimpleSentence() {
        randomNounPhrase();
        randomVerbPhrase();
    }

    /**
     * Generates a random noun phrase following the BNF grammar rules.
     */
    static void randomNounPhrase() {
        if (Math.random() > 0.5) {
            String properNoun = randomItem(properNouns);
            System.out.print(properNoun);
        } else {
            String determiner = randomItem(determiners);
            System.out.print(determiner);
            if (Math.random() > 0.5) {
                String adjective = randomItem(adjectives);
                System.out.print(" " + adjective);
            }
            String commonNoun = randomItem(commonNouns);
            System.out.print(" " + commonNoun);
            if (Math.random() > 0.3) {
                System.out.print(" who ");
                randomVerbPhrase();
            }
        }
    }

    /**
     * Generates a random verb phrase following the BNF grammar rules.
     */
    static void randomVerbPhrase() {
        double rand = Math.random();
        if (rand < 0.2) {
            String intransitiveVerb = randomItem(intransitiveVerbs);
            System.out.print(" " + intransitiveVerb);
        } else if (rand < 0.6) {
            String transitiveVerb = randomItem(transitiveVerbs);
            System.out.print(" " + transitiveVerb);
            randomNounPhrase();
        } else {
            System.out.print(" is ");
            String adjective = randomItem(adjectives);
            System.out.print(adjective);
        }
    }

    /**
     * This method chooses a random item from the given array.
     * @param list The array of items to choose from.
     * @return A randomly selected item from the array.
     * @author Muyivu Shafiq
     */
    static String randomItem(String[] list) {
        int index = new Random().nextInt(list.length);
        return list[index];
    }
}
