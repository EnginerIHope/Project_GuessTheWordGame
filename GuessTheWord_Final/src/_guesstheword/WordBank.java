package _guesstheword;

//@author Abdalhadi Al-shehri || 443004342

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WordBank { // constructor for the WordBank Class

    public static int NumOfWords; // number of words to guess

    public WordBank(int numOfWords, int a) { // this constructor for the HowManyWordsToGuess Class to initialize
                                             // NumOfWords
        NumOfWords = numOfWords;
        new GuessTheWord(numOfWords).setVisible(true);
    }

    public WordBank(int numOfWords) { // this constructor for the GuessTheWord Class to initialize NumOfWords and get
                                      // the method from here
        NumOfWords = numOfWords;
    }

    // the words That Get taken to be guessed
    private List<String> Words = new ArrayList<>(
            Arrays.asList("driver", "signature","afternoon","airport","always","catch","classroom",
                    "coach","college","dead","daughter","defense","example","family","famous","generation",
                    "golden","government","helicopter","impressive","knowledge", "history", "response",
                    "president", "highway","computer", "appartment", "forest", "chocolat", "lawyer",
                    "appear", "ticket","witness", "guerrilla", "command", "calendar", "illusion",
                    "provoke", "button","pocket", "print", "wagon", "freedom", "umbrella","language"));

    // generates a random numbers without repeating in the arraylist to use as index
    // for getChosenWords()
    public List<Integer> Randoom() {
        List<Integer> nums = new ArrayList();
        Set<Integer> hash = new HashSet<Integer>();

        while (hash.size() < NumOfWords) {
            int num = (int) (Math.random() * Words.size());
            hash.add(num);
        }
        Iterator<Integer> it = hash.iterator();

        while (it.hasNext()) { // while the set has a next value
            nums.add(it.next()); // add to nums arrylist
        }
        return nums;
    }

    // uses the random arraylist of numbers to get X number of words randomaly.
    public List<String> getChosenWords() {
        List<String> ChosenWords = new ArrayList<>();
        Randoom();
        for (int i = 0; i < (Randoom().size()); ++i) {
            ChosenWords.add(Words.get(Randoom().get(i)));
        }
        return ChosenWords;
    }

}