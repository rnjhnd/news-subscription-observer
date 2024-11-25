import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject {
    private String breakingNews;
    private List<Subscriber> subscriberList;

    public NewsAgency() {
        subscriberList = new ArrayList<>();
    }

    public String getBreakingNews() {
        return breakingNews;
    }

    public void setBreakingNews(String breakingNews) {
        this.breakingNews = breakingNews;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        if (!subscriberList.contains(subscriber)) {
            subscriberList.add(subscriber);
            System.out.println(subscriber.getSubscriberName() + " has successfully subscribed!");
        } else {
            System.out.println(subscriber.getSubscriberName() + " is already a subscriber.");
        }
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        if (subscriberList.contains(subscriber)) {
            subscriberList.remove(subscriber);
            System.out.println(subscriber.getSubscriberName() + " has unsubscribed.");
        } else {
            System.out.println(subscriber.getSubscriberName() + " is not a subscriber.");
        }
    }

    @Override
    public String notifySubscriber() {
        StringBuilder output = new StringBuilder();
        for (Subscriber subscriber : subscriberList) {
            output.append("Greetings, ").append(subscriber.getSubscriberName()).append("!\n")
                  .append("BREAKING NEWS: ").append(breakingNews).append("\n\n");
        }
        return output.toString();
    }
}
