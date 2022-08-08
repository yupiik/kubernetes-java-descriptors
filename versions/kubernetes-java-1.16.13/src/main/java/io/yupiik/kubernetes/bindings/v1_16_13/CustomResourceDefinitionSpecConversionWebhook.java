package io.yupiik.kubernetes.bindings.v1_16_13;

import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionSpecConversionWebhook {
    private CustomResourceDefinitionSpecConversionWebhookClientConfig clientConfig;
    private List<String> conversionReviewVersions;

    public CustomResourceDefinitionSpecConversionWebhook() {
        // no-op
    }

    public CustomResourceDefinitionSpecConversionWebhook(final CustomResourceDefinitionSpecConversionWebhookClientConfig clientConfig,
                                                         final List<String> conversionReviewVersions) {
        // no-op
    }

    public CustomResourceDefinitionSpecConversionWebhookClientConfig getClientConfig() {
        return clientConfig;
    }

    public void setClientConfig(final CustomResourceDefinitionSpecConversionWebhookClientConfig clientConfig) {
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
        if (!(__other instanceof CustomResourceDefinitionSpecConversionWebhook)) {
            return false;
        }
        final CustomResourceDefinitionSpecConversionWebhook __otherCasted = (CustomResourceDefinitionSpecConversionWebhook) __other;
        return Objects.equals(clientConfig, __otherCasted.clientConfig) &&
            Objects.equals(conversionReviewVersions, __otherCasted.conversionReviewVersions);
    }
}
