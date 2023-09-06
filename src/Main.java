public class Main {
    public static void main(String[] args) {
        String testString = "1,5,9,3";
        char[] testArray = testString.toCharArray();
        System.out.println(testArray);
        int leghtArray = testArray.length;
        int numberOfOperation = leghtArray/2;
        int i = 0;
        int j = leghtArray-1;
        for (i=0; i<=numberOfOperation; i++){
            char saver = testArray[i];
            testArray[i]=testArray[j];
            testArray[j]= saver;
            j--;
        }
        System.out.println(testArray);
    }
}