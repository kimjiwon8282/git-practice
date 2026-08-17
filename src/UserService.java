public class UserService {

    public String getUserMessage(String userId) {
        if(userId == null || userId.isBlank()){
            return "사용자 ID가 필요합니다.";
        }
        return "사용자 조회 완료:"+userId;
    }
}