package io.yupiik.kubernetes.bindings.v1_14_1;

import java.util.Objects;

public class CustomResourceDefinitionListItemsSpecConversionWebhookClientConfig {
    private String caBundle;
    private CustomResourceDefinitionListItemsSpecConversionWebhookClientConfigService service;
    private String url;

    public CustomResourceDefinitionListItemsSpecConversionWebhookClientConfig() {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpecConversionWebhookClientConfig(final String caBundle,
                                                                              final CustomResourceDefinitionListItemsSpecConversionWebhookClientConfigService service,
                                                                              final String url) {
        // no-op
    }

    public String getCaBundle() {
        return caBundle;
    }

    public void setCaBundle(final String caBundle) {
        this.caBundle = caBundle;
    }

    public CustomResourceDefinitionListItemsSpecConversionWebhookClientConfigService getService() {
        return service;
    }

    public void setService(final CustomResourceDefinitionListItemsSpecConversionWebhookClientConfigService service) {
        this.service = service;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                caBundle,
                service,
                url);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionListItemsSpecConversionWebhookClientConfig)) {
            return false;
        }
        final CustomResourceDefinitionListItemsSpecConversionWebhookClientConfig __otherCasted = (CustomResourceDefinitionListItemsSpecConversionWebhookClientConfig) __other;
        return Objects.equals(caBundle, __otherCasted.caBundle) &&
            Objects.equals(service, __otherCasted.service) &&
            Objects.equals(url, __otherCasted.url);
    }
}
