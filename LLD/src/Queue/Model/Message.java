package Queue.Model;

public class Message {

    private final String messageId;

    private String message;

    public Message(String messageId){
        this.messageId = messageId;
    }

    public Message(String messageId,String message){
        this.messageId = messageId;
        this.message = message;
    }

    public String getMessageId(){
        return this.messageId;
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
