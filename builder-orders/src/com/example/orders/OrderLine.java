package com.example.orders;

public class OrderLine {
    private final String sku;
    private final int quantity;
    private final int unitPriceCents;

    public OrderLine(Builder builder) {
        this.sku = builder.sku;
        this.quantity = builder.quantity;
        this.unitPriceCents = builder.unitPriceCents;
    }

    public String getSku() { return sku; }
    public int getQuantity() { return quantity; }
    public int getUnitPriceCents() { return unitPriceCents; }

    public static class Builder {
        private final String sku;
        private final int unitPriceCents;
        private int quantity;

        public Builder(String sku, int quantity, int unitPriceCents) {
            this.sku = sku;
            this.unitPriceCents = unitPriceCents;
            this.quantity = quantity;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public OrderLine build() {
            return new OrderLine(this);
        }
    }
}
