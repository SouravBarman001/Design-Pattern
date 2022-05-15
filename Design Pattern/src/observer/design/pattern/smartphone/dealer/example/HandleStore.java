package observer.design.pattern.smartphone.dealer.example;

import java.util.ArrayList;
import java.util.List;

public class HandleStore implements DealerStore{

    private List<ObserverStore> stores = new ArrayList<ObserverStore>();

    @Override
    public void attach(ObserverStore o) {
        stores.add(o);
    }

    @Override
    public void detach(ObserverStore o) {
         stores.remove(o);
    }

    @Override
    public void notifyUpdate(Message m) {
    for (ObserverStore o : stores){
    o.update(m);
}
    }
}
