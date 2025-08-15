package BasicsCodingRevision;

public class BasicsQuestions {
    public static void gp(int n) {
        int answer = 1;
        for(int i=1; i<=n; i++) {
            System.out.print(answer + " ");
            answer = answer * 2;
        }
    }
    public static void main(String[] args) {
        gp(6);
    }
}
