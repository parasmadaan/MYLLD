package Queue.Model;

import java.sql.SQLOutput;

public class SleepingSubscriber implements Isubscriber{

    final String subscriberId;
    final int timeInMillis;

    public SleepingSubscriber(String subscriberId, int timeInMillis) {
        this.subscriberId = subscriberId;
        this.timeInMillis = timeInMillis;

    }


    @Override
    public String getSubscriberId() {
        return this.subscriberId;
    }

    @Override
    public void consume(Message message) throws InterruptedException {
        System.out.println("Subscriber with subscriberId "+subscriberId +" Started consuming message "+ message.getMessage());
        Thread.sleep(timeInMillis);
        System.out.println("Subscriber with subscriberId "+subscriberId +" Done consuming message");
    }
}
