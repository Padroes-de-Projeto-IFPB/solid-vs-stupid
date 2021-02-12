package solid.ocp;

public class NotificationSystem {

    public enum NotificationType { EMAIL, PUSH_NOTIFICATION, DESKTOP_NOTIFICATION }

    // Method used to send notification
    public void sendNotification(NotificationType type, Object content, Object user) throws Exception {

        if( type.equals(NotificationType.EMAIL) ){
            sendMail(content,user);
        }

        if( type.equals(NotificationType.PUSH_NOTIFICATION) ){
            sendPushNotification(content,user);
        }

        if( type.equals(NotificationType.DESKTOP_NOTIFICATION) ){
            sendDesktopNotification(content,user);
        }

    }

    private void sendMail(Object content, Object user) throws Exception {
        throw new Exception("Not implemented yet");
    }

    private void sendPushNotification(Object content, Object user) throws Exception {
        throw new Exception("Not implemented yet");
    }

    private void sendDesktopNotification(Object content, Object user) throws Exception {
        throw new Exception("Not implemented yet");
    }

}
