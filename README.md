# Real-Time News Subscription Service

A Java implementation of the **Observer Design Pattern** for real-time news subscription management. This project demonstrates how to build a scalable, decoupled notification system where subscribers receive immediate updates when breaking news is published.

## 📋 Overview

The News Subscription Observer allows you to create a dynamic news distribution system where a central news agency can publish breaking news and automatically notify all subscribed users. Instead of manually managing notification lists, the system uses the Observer pattern to maintain loose coupling between the news publisher and subscribers.

## 🏗️ Architecture

This project implements the **Observer Design Pattern** with the following components:

- **NewsAgencySubject Interface**: Defines the contract for subject behavior
- **SubscriberObserver Interface**: Defines the contract for observer behavior  
- **NewsAgency Class**: Concrete subject that manages subscribers and publishes news
- **Subscriber Class**: Concrete observer that receives news updates
- **Main Application**: Demonstrates the observer pattern in action

### Design Pattern Benefits

- **Loose Coupling**: News agency and subscribers are independent of each other
- **Scalability**: Easy to add/remove subscribers without affecting the system
- **Real-time Updates**: Immediate notification delivery to all subscribers
- **Extensibility**: Simple to add new types of observers or subjects

## 📊 UML Class Diagram

![image](https://github.com/user-attachments/assets/f92438bc-eea1-43e5-88c3-5fc6b9e4445f)

The following diagram illustrates:
- The architecture of the News Subscription Observer
- Relationships between the core components:
  - The `NewsAgencySubject` interface
  - The `SubscriberObserver` interface
  - Concrete implementations: `NewsAgency` and `Subscriber`
  - The main application class
- How the Observer design pattern is applied in this project

## 🚀 Features

- **Dynamic Subscription Management**: Subscribe and unsubscribe users in real-time
- **Automatic Notifications**: All subscribers receive updates when news is published
- **Duplicate Prevention**: System prevents duplicate subscriptions
- **Personalized Messages**: Each subscriber receives personalized notifications
- **Clean Architecture**: Well-structured, maintainable code following design patterns

## 📁 Project Structure

```
news-subscription-observer/
├── src/
│   ├── Main.java                    # Demo application
│   ├── NewsAgency.java              # Subject implementation
│   ├── NewsAgencySubject.java       # Subject interface
│   ├── Subscriber.java              # Observer implementation
│   └── SubscriberObserver.java      # Observer interface
└── README.md                        # Project documentation
```

## 🛠️ Installation & Setup

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Getting Started

1. **Clone or download** the project files
2. **Navigate** to the project directory
3. **Compile** the Java files:
   ```bash
   javac src/*.java
   ```
4. **Run** the application:
   ```bash
   java -cp src Main
   ```

## 📖 Usage

### Basic Usage

The main application (`Main.java`) demonstrates how to use the observer pattern:

```java
// Create subscribers
Subscriber tony = new Subscriber();
tony.setSubscriberName("Tony Stark");

Subscriber steve = new Subscriber();
steve.setSubscriberName("Steve Rogers");

// Create news agency and subscribe users
NewsAgency news = new NewsAgency();
news.subscribe(tony);
news.subscribe(steve);

// Publish breaking news
news.setBreakingNews("Volcanic eruption observed at Mount Mayon, alert level raised!");
String notifications = news.notifySubscriber();
System.out.println(notifications);

// Manage subscriptions
news.unsubscribe(peter);
Subscriber wade = new Subscriber();
wade.setSubscriberName("Wade Wilson");
news.subscribe(wade);
```

### Expected Output

When you run the application, you'll see:

```
Tony Stark has successfully subscribed!
Steve Rogers has successfully subscribed!
Peter Parker has successfully subscribed!

NEWS FLASH!
Greetings, Tony Stark!
BREAKING NEWS: Volcanic eruption observed at Mount Mayon, alert level raised!

Greetings, Steve Rogers!
BREAKING NEWS: Volcanic eruption observed at Mount Mayon, alert level raised!

Greetings, Peter Parker!
BREAKING NEWS: Volcanic eruption observed at Mount Mayon, alert level raised!

Peter Parker has unsubscribed.
Wade Wilson has successfully subscribed!

FRESH UPDATE JUST IN!
Greetings, Tony Stark!
BREAKING NEWS: Volcanic eruption observed at Mount Mayon, alert level raised!

Greetings, Steve Rogers!
BREAKING NEWS: Volcanic eruption observed at Mount Mayon, alert level raised!

Greetings, Wade Wilson!
BREAKING NEWS: Volcanic eruption observed at Mount Mayon, alert level raised!
```

## 🔧 Extending the Project

### Adding New Observer Types

To add a new observer type (e.g., `EmailSubscriber`):

1. **Create** a new class implementing the `SubscriberObserver` interface
2. **Implement** the required `updateNewsAgency()` method
3. **Add** the new observer to the news agency subscription list

Example:
```java
public class EmailSubscriber implements SubscriberObserver {
    private String emailAddress;
    private String subscriberName;
    
    @Override
    public void updateNewsAgency(NewsAgency news) {
        // Send email notification logic
        System.out.println("Email sent to " + emailAddress + ": " + news.getBreakingNews());
    }
}
```

### Adding New Subject Types

To add a new subject type (e.g., `SportsNewsAgency`):

1. **Create** a new class implementing the `NewsAgencySubject` interface
2. **Implement** the required methods (`subscribe()`, `unsubscribe()`, `notifySubscriber()`)
3. **Add** specific functionality for sports news

## 🎯 Design Patterns Used

### Observer Pattern
- **Purpose**: Establish a one-to-many dependency between objects
- **Benefits**: Loose coupling, automatic notification, dynamic subscription management
- **Implementation**: `NewsAgency` (Subject) notifies `Subscriber` (Observer) objects

### Interface Segregation
- **Purpose**: Define clear contracts for subject and observer behavior
- **Benefits**: Clean separation of concerns, easy to extend
- **Implementation**: `NewsAgencySubject` and `SubscriberObserver` interfaces

## 🤝 Contributing

Feel free to contribute to this project by:
- Adding new observer types (SMS, push notifications, etc.)
- Improving the notification system
- Enhancing the observer pattern implementation
- Adding unit tests and error handling

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

**Note**: This implementation demonstrates clean code principles and design patterns best practices. The Observer pattern is particularly useful when you need to establish a one-to-many dependency between objects, where changes to one object (subject) need to be automatically communicated to multiple dependent objects (observers) without tight coupling.
