package lessone6;

import javax.xml.crypto.Data;
import java.io.Serializable;

public class MessageData implements Serializable {
    private String userName;
    private String messageText;
    private Data sentData;

    public MessageData() {
    }

    public MessageData(String userName, String messageText) {
        this.userName = userName;
        this.messageText = messageText;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    @Override
    public String toString() {
        return "MessageData{" +
                "userName='" + userName + '\'' +
                ", messageText='" + messageText + '\'' +
                ", sentData=" + sentData +
                '}';
    }
}
