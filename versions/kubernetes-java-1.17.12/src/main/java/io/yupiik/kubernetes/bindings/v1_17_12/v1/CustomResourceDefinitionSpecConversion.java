package io.yupiik.kubernetes.bindings.v1_17_12.v1;

import java.util.Objects;

public class CustomResourceDefinitionSpecConversion {
    private String strategy;
    private CustomResourceDefinitionSpecConversionWebhook webhook;

    public CustomResourceDefinitionSpecConversion() {
        // no-op
    }

    public CustomResourceDefinitionSpecConversion(final String strategy,
                                                  final CustomResourceDefinitionSpecConversionWebhook webhook) {
        // no-op
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(final String strategy) {
        this.strategy = strategy;
    }

    public CustomResourceDefinitionSpecConversionWebhook getWebhook() {
        return webhook;
    }

    public void setWebhook(final CustomResourceDefinitionSpecConversionWebhook webhook) {
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
        if (!(__other instanceof CustomResourceDefinitionSpecConversion)) {
            return false;
        }
        final CustomResourceDefinitionSpecConversion __otherCasted = (CustomResourceDefinitionSpecConversion) __other;
        return Objects.equals(strategy, __otherCasted.strategy) &&
            Objects.equals(webhook, __otherCasted.webhook);
    }
}
