public interface NewsAgencySubject {
    public void subscribe(Subscriber subscriber);
    public void unsubscribe(Subscriber subscriber);
    public String notifySubscriber();
}