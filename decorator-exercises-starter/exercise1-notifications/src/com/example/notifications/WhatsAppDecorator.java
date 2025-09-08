package com.example.notifications;

public class WhatsAppDecorator extends NotifierDecorator {
    private final String userId;

    public WhatsAppDecorator(Notifier notifier, String userId) {
        super(notifier);
        this.userId = userId;
    }

    @Override
    public void notify(String text) {
        // First send WhatsApp message
        System.out.println("[WHATSAPP -> " + userId + "]: " + text);
        // Then delegate to wrapped notifier
        super.notify(text);
    }
}
