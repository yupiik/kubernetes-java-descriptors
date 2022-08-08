package io.yupiik.kubernetes.bindings.v1_18_20;

import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionListItemsSpecConversion {
    private List<String> conversionReviewVersions;
    private String strategy;
    private CustomResourceDefinitionListItemsSpecConversionWebhookClientConfig webhookClientConfig;

    public CustomResourceDefinitionListItemsSpecConversion() {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpecConversion(final List<String> conversionReviewVersions,
                                                           final String strategy,
                                                           final CustomResourceDefinitionListItemsSpecConversionWebhookClientConfig webhookClientConfig) {
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

    public CustomResourceDefinitionListItemsSpecConversionWebhookClientConfig getWebhookClientConfig() {
        return webhookClientConfig;
    }

    public void setWebhookClientConfig(final CustomResourceDefinitionListItemsSpecConversionWebhookClientConfig webhookClientConfig) {
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
        if (!(__other instanceof CustomResourceDefinitionListItemsSpecConversion)) {
            return false;
        }
        final CustomResourceDefinitionListItemsSpecConversion __otherCasted = (CustomResourceDefinitionListItemsSpecConversion) __other;
        return Objects.equals(conversionReviewVersions, __otherCasted.conversionReviewVersions) &&
            Objects.equals(strategy, __otherCasted.strategy) &&
            Objects.equals(webhookClientConfig, __otherCasted.webhookClientConfig);
    }
}
