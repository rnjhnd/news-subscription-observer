public class Subscriber implements SubscriberObserver {
    private String subscriberName;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void updateNewsAgency(NewsAgency news) {
        System.out.println("Greetings, " + subscriberName + "!");
        System.out.println("BREAKING NEWS: " + news.getBreakingNews());
    }
}