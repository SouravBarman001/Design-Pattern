package mediator.deisgn.pattern.chat.example;

import java.util.HashMap;
import java.util.Map;

//Concrete Mediator
public class ChatRoom implements IChatRoom{

    private Map<String,User> userMap = new HashMap<String, User>();


    @Override
    public void sendMessage(String msg, String userId) {
       User u = userMap.get(userId);
    }

    @Override
    public void addUser(User user) {

    }
}
