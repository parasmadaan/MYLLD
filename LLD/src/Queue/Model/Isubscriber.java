package Queue.Model;

public interface Isubscriber {

    public String getSubscriberId();

    public void consume(Message message) throws InterruptedException;

}
