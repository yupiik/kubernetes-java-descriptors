package io.yupiik.kubernetes.bindings.v1_16_13;

import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionListItemsSpecConversionWebhook {
    private CustomResourceDefinitionListItemsSpecConversionWebhookClientConfig clientConfig;
    private List<String> conversionReviewVersions;

    public CustomResourceDefinitionListItemsSpecConversionWebhook() {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpecConversionWebhook(final CustomResourceDefinitionListItemsSpecConversionWebhookClientConfig clientConfig,
                                                                  final List<String> conversionReviewVersions) {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpecConversionWebhookClientConfig getClientConfig() {
        return clientConfig;
    }

    public void setClientConfig(final CustomResourceDefinitionListItemsSpecConversionWebhookClientConfig clientConfig) {
        this.clientConfig = clientConfig;
    }

    public List<String> getConversionReviewVersions() {
        return conversionReviewVersions;
    }

    public void setConversionReviewVersions(final List<String> conversionReviewVersions) {
        this.conversionReviewVersions = conversionReviewVersions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clientConfig,
                conversionReviewVersions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionListItemsSpecConversionWebhook)) {
            return false;
        }
        final CustomResourceDefinitionListItemsSpecConversionWebhook __otherCasted = (CustomResourceDefinitionListItemsSpecConversionWebhook) __other;
        return Objects.equals(clientConfig, __otherCasted.clientConfig) &&
            Objects.equals(conversionReviewVersions, __otherCasted.conversionReviewVersions);
    }
}
