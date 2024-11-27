package ISP;
interface RoleManagementAPI {
    void assignRole(String username, String role);
    void revokeRole(String username, String role);
}