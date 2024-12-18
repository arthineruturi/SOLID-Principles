package ISP;
//interface segregation principle
public class Main {
    public static void main(String[] args) {
        UserAuthAPI userAuthService = new UserAuthService();
        TokenVerificationAPI tokenService = new TokenService();
        RoleManagementAPI roleService = new RoleService();

        System.out.println("\n=== User Authentication ===");
        userAuthService.login("john_doe", "password123");
        //userAuthService.refreshSession("john_doe");
        userAuthService.logout("john_doe");

        System.out.println("\n=== Token Verification ===");
        tokenService.verifyToken("VALID_TOKEN");
        tokenService.verifyToken("INVALID_TOKEN");

        System.out.println("\n=== Role Management ===");
        roleService.assignRole("john_doe", "Admin");
        roleService.revokeRole("john_doe", "Admin");
    }
}
