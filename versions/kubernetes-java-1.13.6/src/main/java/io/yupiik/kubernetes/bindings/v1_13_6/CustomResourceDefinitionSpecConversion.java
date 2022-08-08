package io.yupiik.kubernetes.bindings.v1_13_6;

import java.util.Objects;

public class CustomResourceDefinitionSpecConversion {
    private String strategy;
    private CustomResourceDefinitionSpecConversionWebhookClientConfig webhookClientConfig;

    public CustomResourceDefinitionSpecConversion() {
        // no-op
    }

    public CustomResourceDefinitionSpecConversion(final String strategy,
                                                  final CustomResourceDefinitionSpecConversionWebhookClientConfig webhookClientConfig) {
        // no-op
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(final String strategy) {
        this.strategy = strategy;
    }

    public CustomResourceDefinitionSpecConversionWebhookClientConfig getWebhookClientConfig() {
        return webhookClientConfig;
    }

    public void setWebhookClientConfig(final CustomResourceDefinitionSpecConversionWebhookClientConfig webhookClientConfig) {
        this.webhookClientConfig = webhookClientConfig;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                strategy,
                webhookClientConfig);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionSpecConversion)) {
            return false;
        }
        final CustomResourceDefinitionSpecConversion __otherCasted = (CustomResourceDefinitionSpecConversion) __other;
        return Objects.equals(strategy, __otherCasted.strategy) &&
            Objects.equals(webhookClientConfig, __otherCasted.webhookClientConfig);
    }
}
