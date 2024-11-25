import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Subscriber tony = new Subscriber();
        tony.setSubscriberName("Tony Stark");

        Subscriber steve = new Subscriber();
        steve.setSubscriberName("Steve Rogers");

        Subscriber peter = new Subscriber();
        peter.setSubscriberName("Peter Parker");

        List<Subscriber> subscribers = new ArrayList<>();

        NewsAgency news = new NewsAgency();
        news.setSubscriberList(subscribers);
        news.subscribe(tony);
        news.subscribe(steve);
        news.subscribe(peter);
        news.setBreakingNews("Volcanic eruption observed at Mount Mayon, alert level raised!");

        System.out.println("\nNEWS FLASH!");
        System.out.println(news.notifySubscriber());

        news.unsubscribe(peter);

        Subscriber wade = new Subscriber();
        wade.setSubscriberName("Wade Wilson");
        news.subscribe(wade);

        System.out.println("\nFRESH UPDATE JUST IN!");
        System.out.println(news.notifySubscriber());

        wade.updateNewsAgency(news);
    }
}