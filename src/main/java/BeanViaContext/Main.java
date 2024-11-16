package BeanViaContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext bucket = new AnnotationConfigApplicationContext("BeanViaContext"); // this will scan the whole package and create beans (objects via spring) of those classes having @Component annotation.
        NotificationService service = (NotificationService) bucket.getBean("notiffService"); // notificationService is bean id. By default, bean id generated is same name as class with 1st char small.
        service.sendSMS("sending otp as 1234");
    }
}
