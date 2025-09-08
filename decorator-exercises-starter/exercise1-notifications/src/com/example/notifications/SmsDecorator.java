package com.example.notifications;

public class SmsDecorator extends NotifierDecorator {
    private final String phoneNumber;

    public SmsDecorator(Notifier notifier, String phoneNumber) {
        super(notifier);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String text) {
        // First send SMS
        System.out.println("[SMS -> " + phoneNumber + "]: " + text);
        // Then delegate to wrapped notifier
        super.notify(text);
    }
}
