// 1) Repository name makes no sence, better give repo the name according to the content.
// Like: "String-Reverse"
// 2) Put task description in the comment on top ot Main class so I can easier understand that am I looking at.

public class Main {
    
    public static void main(String[] args) {
        // Better read input data from the console. So the one who is testing the task can enter different input data without editing the code.
        // Anyway it's fine to have constants while debugging.
        String testString = "1,5,9,3";
        //
        char[] testArray = testString.toCharArray();
        System.out.println(testArray);
        // In english word order is different. Proper valiable name will be arrayLength.
        // Also having array length in a separate variable is not nessesary, you can always access it as testArray.length.
        int leghtArray = testArray.length;
        // Always separate =+-*/ with spaces.
        // This is important for readability and searchability
        int numberOfOperation = leghtArray / 2;
        int i = 0;
        // In fact having j variable is fine as it optimizes the code but j is not needed there as it can be calculated from i
        // It's fine to have j, but algorithmization tasks also expect the code to be as compact as possible.
        int j = leghtArray - 1;
        // there should always be space between ){
        // <= is overkill, < is enough
        for (i = 0; i < numberOfOperation; i++) {
            // tmp is kinda conventional variable name for this case
            char tmp = testArray[i];
            testArray[i] = testArray[j];
            testArray[j] = tmp;
            j--;
        }
        // In the end you just print the array, I expected the String.
        System.out.println(testArray);
        // Tests:
        System.out.println(StringUtils.reverse("Hello World!")); // Casual test case
        System.out.println(StringUtils.reverse("")); // Edge case
        System.out.println(StringUtils.reverse("1")); // Odd number of symbols
        System.out.println(StringUtils.reverse("12")); // Even number of symbols
        System.out.println(StringUtils.reverse("123")); // Odd but > 1
        // Also tests can be done like that, but I'm not sure how it works in Java:
        assert StringUtils.reverse("123").equals("321")

    }
    
    // Task can also be solved using StringBuilder
    
    // Btw, you can swap testArray[i] and testArray[j] without additional variable, can you solve it?
}

// Also solution is better to implement your work as component that can be used as a blackbox:
// My solution would look like this:
class StringUtils {
    
    public static String reverse(String input) {
        char[] characters = input.toCharArray();
        int halfLength = characters.length / 2;
        for (int i = 0; i < halfLength; i++) {
            char tmp = characters[i];
            characters[i] = characters[characters.length - i - 1];
            characters[characters.length - i - 1] = tmp;
        }
        return new String(characters);
    }
    
}
