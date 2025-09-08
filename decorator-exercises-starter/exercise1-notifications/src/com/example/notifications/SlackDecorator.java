package com.example.notifications;

public class SlackDecorator extends NotifierDecorator {
    private final String channel;

    public SlackDecorator(Notifier notifier, String channel) {
        super(notifier);
        this.channel = channel;
    }

    @Override
    public void notify(String text) {
        // First send Slack message
        System.out.println("[SLACK #" + channel + "]: " + text);
        // Then delegate to wrapped notifier
        super.notify(text);
    }
}
