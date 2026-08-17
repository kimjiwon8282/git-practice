public class UserService {

    public String getUserMessage(String userId) {

        if (userId == null) {
            return "INVALID_USER";
        }

        return "사용자 조회 성공";
    }
}