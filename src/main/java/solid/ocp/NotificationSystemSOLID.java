package solid.ocp;

public class NotificationSystemSOLID {

    public void sendMail(Object content, Object user) throws Exception {
        throw new Exception("Not implemented yet");
    }

    public void sendPushNotification(Object content, Object user) throws Exception {
        throw new Exception("Not implemented yet");
    }

    public void sendDesktopNotification(Object content, Object user) throws Exception {
        throw new Exception("Not implemented yet");
    }

    public void sendMailAndPushNotification(Object content, Object user) throws Exception {
        this.sendMail(content, user);
        this.sendMailAndPushNotification(content, user);
    }

}
