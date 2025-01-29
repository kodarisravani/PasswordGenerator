
    import java.util.Random;
    import java.util.Scanner;
    public class PasswordGenerator {
        private static final String CHARACTERS = "ABc()_+";
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter password length: ");
            int length = scanner.nextInt();
            scanner.close();
    
            String password = generatePassword(length);
            System.out.println("Generated Password : " + password);
        }
    
        private static String generatePassword(int length) {
            StringBuilder password = new StringBuilder(length);
            Random random = new Random(System.nanoTime());
    
            for (int i = 0; i < length; i++) {
                password.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
            }
    
            return password.toString();
        }
    }
    
    
