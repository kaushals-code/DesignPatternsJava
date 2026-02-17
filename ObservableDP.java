
import java.util.*;

interface NotifyInterface {
    public void sendMsg();
}

class EmailMsgListener implements NotifyInterface {
    public final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    public void sendMsg() {
        System.out.println("Email sent to " + email);
    }
}

class AppNotificationListener implements NotifyInterface {
    public final String userName;

    public AppNotificationListener(String un) {
        this.userName = un;
    }

    public void sendMsg() {
        System.out.println("Notification has been sent to " + userName);
    }
}

class NotificationService {
    
    private final List<NotifyInterface> customerList;

    public NotificationService() {
        customerList = new ArrayList<>();
    }

    public void subscribe(NotifyInterface listener) {
        customerList.add(listener);
    }

    public void unsubscribe(NotifyInterface listener) {
        customerList.remove(listener);
    }

    public void noticeAll() {
        customerList.forEach(listener -> listener.sendMsg());
    }

}

class Store {

    public NotificationService notificationService;

    public Store() {
        this.notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.noticeAll();
    }

}

class obsdp {
    public void main(String[] args) {
        Store store = new Store();
        store.notificationService.subscribe(
            new EmailMsgListener("kaushal21gs@gmail.com") 
        );

        store.notificationService.subscribe(
            new EmailMsgListener("thondakumar27@gmail.com")
        );

        store.notificationService.subscribe(
            new AppNotificationListener("kaushals_dev")
        );

        store.notificationService.noticeAll();

    }
}





// import java.util.*;

// interface NotifyInterface {
//     public void notice();
// }

// class EmailMsgListener implements NotifyInterface {
//     public final String email;

//     public EmailMsgListener(String email) {
//         this.email = email;
//     }

//     public void notice() {
//         System.out.println("The email has been successfully went to " + email);
//     }
// }

// class NotificationService {
//     public List<NotifyInterface> customers;

//     public NotificationService() {
//         customers = new ArrayList<>();
//     }

//     public void subscribe(NotifyInterface listener) {
//         customers.add(listener);
//     }

//     public void unsubscribe(NotifyInterface listener) {
//         customers.remove(listener);
//     }

//     public void noticeAll() {
//         customers.forEach(listener -> listener.notice());
//     }

// }

// class Store {
//     public NotificationService notificationService;

//     public Store() {
//         notificationService = new NotificationService();
//     }
// }

// class obsdp {
//     public void main(String[] args) {
//         Store store = new Store();

//         store.notificationService.subscribe(
//             new EmailMsgListener("kaushal21gs@gmail.com")
//         );

//         store.notificationService.subscribe(
//             new EmailMsgListener("triansh24gs@gmail.com")
//         );

//         store.notificationService.noticeAll();

//     }
// }