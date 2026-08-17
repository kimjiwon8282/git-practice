public class UserService {

    public String getUserMessage(String userId) {
        if(userId == null || userId.isBlank()){
            return "INVALID_USER";
        }
        return "사용자 조회 완료:"+userId;
    }
}