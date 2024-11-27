package ISP;

class UserAuthService implements UserAuthAPI {
    @Override
    public void login(String username, String password) {
        if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
            System.out.println("✅ User \"" + username + "\" logged in successfully.");
        } else {
            System.out.println("❌ Login failed. Username and password are required.");
        }
    }

    @Override
    public void logout(String username) {
        if (username != null && !username.isEmpty()) {
            System.out.println("✅ User \"" + username + "\" logged out.");
        } else {
            System.out.println("❌ Logout failed. Username is required.");
        }
    }


}
