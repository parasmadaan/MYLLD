package Queue.Model;

import java.util.concurrent.atomic.AtomicInteger;

public class TopicSubscriber {
    private  final Isubscriber isubscriber;
    private final AtomicInteger currentOffSet;

    public TopicSubscriber(Isubscriber isubscriber, AtomicInteger currentOffSet) {
        this.isubscriber = isubscriber;
        this.currentOffSet = currentOffSet;
    }

    public Isubscriber getIsubscriber() {
        return isubscriber;
    }

    public AtomicInteger getCurrentOffSet() {
        return currentOffSet;
    }
}
