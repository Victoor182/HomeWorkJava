package LessonWork.Lesson10.Task2;

public class UserUtils {

    public static void main(String[] args) {

    }

    public void processUsserData(String login, String password, String nickName){
        User user = new User(login,password,nickName);
    }
    public String getDescription(User user){
        StringBuilder result = null;
        result.append("User; ").append(user.login).append(" ").append(user.nickName);
        return result.toString();
    }
    class User{
        private String login;
        private String password;
        private int id;
        private String nickName;
        public User(String login, String password, String nickName ){
            this.login = password;
            this.password = password;
            this.id = id ;
            this.nickName = nickName;
        }
    }
}
