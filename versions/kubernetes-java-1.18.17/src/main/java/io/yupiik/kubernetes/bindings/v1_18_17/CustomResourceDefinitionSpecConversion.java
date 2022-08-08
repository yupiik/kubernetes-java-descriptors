package io.yupiik.kubernetes.bindings.v1_18_17;

import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionSpecConversion {
    private List<String> conversionReviewVersions;
    private String strategy;
    private CustomResourceDefinitionSpecConversionWebhookClientConfig webhookClientConfig;

    public CustomResourceDefinitionSpecConversion() {
        // no-op
    }

    public CustomResourceDefinitionSpecConversion(final List<String> conversionReviewVersions,
                                                  final String strategy,
                                                  final CustomResourceDefinitionSpecConversionWebhookClientConfig webhookClientConfig) {
        // no-op
    }

    public List<String> getConversionReviewVersions() {
        return conversionReviewVersions;
    }

    public void setConversionReviewVersions(final List<String> conversionReviewVersions) {
        this.conversionReviewVersions = conversionReviewVersions;
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
                conversionReviewVersions,
                strategy,
                webhookClientConfig);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionSpecConversion)) {
            return false;
        }
        final CustomResourceDefinitionSpecConversion __otherCasted = (CustomResourceDefinitionSpecConversion) __other;
        return Objects.equals(conversionReviewVersions, __otherCasted.conversionReviewVersions) &&
            Objects.equals(strategy, __otherCasted.strategy) &&
            Objects.equals(webhookClientConfig, __otherCasted.webhookClientConfig);
    }
}
