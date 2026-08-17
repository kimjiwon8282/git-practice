public class UserService {

    public String getUserMessage(String userId) {

        if (userId == null || userId.isBlank()) {
            return "INVALID_USER";
        }

        String message = "USER_LOOKUP_SUCCESS:" + userId;
        System.out.println("[AUDIT] " + message);
        return message;
    }
}