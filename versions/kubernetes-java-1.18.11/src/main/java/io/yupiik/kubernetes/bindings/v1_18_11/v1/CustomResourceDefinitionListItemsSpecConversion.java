package io.yupiik.kubernetes.bindings.v1_18_11.v1;

import java.util.Objects;

public class CustomResourceDefinitionListItemsSpecConversion {
    private String strategy;
    private CustomResourceDefinitionListItemsSpecConversionWebhook webhook;

    public CustomResourceDefinitionListItemsSpecConversion() {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpecConversion(final String strategy,
                                                           final CustomResourceDefinitionListItemsSpecConversionWebhook webhook) {
        // no-op
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(final String strategy) {
        this.strategy = strategy;
    }

    public CustomResourceDefinitionListItemsSpecConversionWebhook getWebhook() {
        return webhook;
    }

    public void setWebhook(final CustomResourceDefinitionListItemsSpecConversionWebhook webhook) {
        this.webhook = webhook;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                strategy,
                webhook);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionListItemsSpecConversion)) {
            return false;
        }
        final CustomResourceDefinitionListItemsSpecConversion __otherCasted = (CustomResourceDefinitionListItemsSpecConversion) __other;
        return Objects.equals(strategy, __otherCasted.strategy) &&
            Objects.equals(webhook, __otherCasted.webhook);
    }
}
