package com.example.notifications;

public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        // Baseline behavior (already works)
        System.out.println("\n=== Email Only ===");
        base.notify("Baseline email only.");

        // Email + SMS
        System.out.println("\n=== Email + SMS ===");
        Notifier emailAndSms = new SmsDecorator(base, "+91-99999-11111");
        emailAndSms.notify("Important: Build successful!");

        // Email + WhatsApp
        System.out.println("\n=== Email + WhatsApp ===");
        Notifier emailAndWhatsApp = new WhatsAppDecorator(base, "user_wa");
        emailAndWhatsApp.notify("Deployment started...");

        // Email + Slack
        System.out.println("\n=== Email + Slack ===");
        Notifier emailAndSlack = new SlackDecorator(base, "deployments");
        emailAndSlack.notify("New version available!");

        // Email + WhatsApp + Slack
        System.out.println("\n=== Email + WhatsApp + Slack ===");
        Notifier fullNotifier = new SlackDecorator(
            new WhatsAppDecorator(base, "user_wa"),
            "deployments"
        );
        fullNotifier.notify("Deployment completed 🚀");
    }
}