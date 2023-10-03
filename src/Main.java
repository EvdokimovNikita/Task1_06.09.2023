public class Main {
    //1) Развернуть строку задом на перёд
    public static void main(String[] args) {
        String testString = "1,5,9,3";
        char[] characters = testString.toCharArray();
        int halfLength = characters.length / 2;
        for (int i = 0; i < halfLength; i++) {
            char tmp = characters[i];
            characters[i] = characters[characters.length - i - 1];
            characters[characters.length - i - 1] = tmp;
        }
        System.out.print(characters);
    }
}
