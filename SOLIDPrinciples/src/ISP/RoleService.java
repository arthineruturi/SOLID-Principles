package ISP;

class RoleService implements RoleManagementAPI {
    @Override
    public void assignRole(String username, String role) {
        if (username != null && !username.isEmpty() && role != null && !role.isEmpty()) {
            System.out.println("✅ Role \"" + role + "\" assigned to user \"" + username + "\".");
        } else {
            System.out.println("❌ Role assignment failed. Username and role are required.");
        }
    }

    @Override
    public void revokeRole(String username, String role) {
        if (username != null && !username.isEmpty() && role != null && !role.isEmpty()) {
            System.out.println("✅ Role \"" + role + "\" revoked from user \"" + username + "\".");
        } else {
            System.out.println("❌ Role revocation failed. Username and role are required.");
        }
    }
}
