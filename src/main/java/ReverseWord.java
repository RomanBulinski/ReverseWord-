


public class ReverseWord {

    public String checkString(String input) {

        String[] inputWords = input.split(" ");
        String outputWords = "";

        for (int i = inputWords.length - 1; i >= 0; i--) {
            outputWords = outputWords + inputWords[i] + " ";
        }
        return outputWords.substring(0, outputWords.length() - 1);
    }

}
