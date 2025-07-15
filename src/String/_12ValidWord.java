package String;

public class _12ValidWord {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        String lower = word.toLowerCase();
        if(word.matches("[a-zA-Z0-9]+") && lower.matches(".*[aeiou].*")
            && lower.matches(".*[bcdfghjklmnpqrstvwxyz].*")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
