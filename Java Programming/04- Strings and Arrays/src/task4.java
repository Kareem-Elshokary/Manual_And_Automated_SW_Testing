/*
 * Java Masterclass
 * Kareem El-Shokary
 * Count the Frequency of Characters in a string
 * */


public class task4 {

    public static void main(String[] args) {
        String sentence = "programming";
        StringBuilder newSentence = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char character = sentence.charAt(i);
            boolean isDuplicate = false;

            for(int j = 0; j < newSentence.length(); j++){
                if(newSentence.charAt(j) == character){
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate){
                newSentence.append(character);
            }
        }

        for (int i = 0; i < newSentence.length(); i++) {
            int count = 0;

            for (int j = 0; j < sentence.length(); j++) {
                if(sentence.charAt(j) == newSentence.charAt(i)){
                    count++;
                }

            }

            System.out.println(newSentence.charAt(i) + ": " + count);
        }

    }

}
