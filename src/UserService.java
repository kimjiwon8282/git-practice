public class UserService {

    public String getUserMessage(String userId) {

        if (userId == null || userId.isBlank()) {
            return "INVALID_USER";
        }

        return "USER_LOOKUP_SUCCESS:" + userId;
    }
}