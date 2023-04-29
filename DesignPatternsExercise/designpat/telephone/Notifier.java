package designpat.telephone;

public interface Notifier {

    public void notifyObservers(ObserverType type);
    public void add(Observer observer);
}
