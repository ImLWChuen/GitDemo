public class Main {
    public static void main (String[] args) {
        // Test
        System.out.println("Hello GitHub!");
        System.out.println("This is my second commit!");


        Register reg = new Register();
        reg.registerUser("Alice123", "123", "alice123@gmail.com", "123");
        Login login = new Login();
        login.loginUser("Alice123");

    }
}
