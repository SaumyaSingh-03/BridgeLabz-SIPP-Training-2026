package Hashing;
public class DuplicateTokenMain {

    public static void main(String[] args) {

        String[] tokens = {
                "ABC123",
                "XYZ789",
                "LMN456",
                "ABC123"
        };

        DuplicateToken obj = new DuplicateToken();

        if (obj.hasDuplicateToken(tokens)) {
            System.out.println("Duplicate token found.");
        } else {
            System.out.println("No duplicate token found.");
        }
    }
}