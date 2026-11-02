interface StringOperations {
    int countChars(String text);
    String oddPositions(String text);
    String reverse(String text);
}

public class ProcessStrings implements StringOperations {
    @Override
    public int countChars(String text) {
        return text.length();
    }

    @Override
    public String oddPositions(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i += 2) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static void main(String[] args) {
        ProcessStrings processor = new ProcessStrings();
        String text = "Привет";

        System.out.println("Символов: " + processor.countChars(text));
        System.out.println("Нечётные позиции: " + processor.oddPositions(text));
        System.out.println("Наоборот: " + processor.reverse(text));
    }
}
