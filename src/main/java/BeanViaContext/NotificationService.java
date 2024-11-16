package BeanViaContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("notiffService") // bean of NotificationService will be created by notiffService id
public class NotificationService {

    /*
    Field Injection:-
    SMSGateway bean that was already created in the bucket (while scanning the package) will be linked here(reference to that particular bean will be created here).
    If Autowired is omitted, bean reference will be null.
    1 side effect --> while scanning the package (in main) if NotificationService is scanned 1st without SMSGateway being scanned then NotificationService bean would be created without creation of SMSGateway bean. So then also smsGateway value will be null and that null value will be injected. But after this, SMSGateway class will be opened/scanned and bean would be created. So here bean is created after null dependency is injected
    */
    // @Autowired
    private SMSGateway smsGateway;

    /*
    Constructor Injection:-
    At the time NotificationService bean is created, it checks what all it needs via constructor.
    Since SMSGateway is needed by constructor, it checks whether SMSGateway bean is already present in the bucket, if not, it creates the bean and links it, otherwise it uses the present bean ref
    */
    public NotificationService(SMSGateway smsGateway) {
        this.smsGateway = smsGateway;
    }

    public SMSGateway getSmsGateway() { return smsGateway; }

     /*
     Setter Injection:-
     It's like field injection i.e. already created SMSGateway bean ref will be linked here.
     */
    // @Autowired
    public void setSmsGateway(SMSGateway smsGateway) {
        this.smsGateway = smsGateway;
    }

    public void sendSMS(String sms){
        smsGateway.sendSMS(sms);
    }
}

