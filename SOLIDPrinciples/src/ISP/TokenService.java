package ISP;
class TokenService implements TokenVerificationAPI {
    @Override
    public boolean verifyToken(String token) {
        if ("VALID_TOKEN".equals(token)) {
            System.out.println("✅ Token is valid.");
            return true;
        } else {
            System.out.println("❌ Token is invalid.");
            return false;
        }
    }
}
