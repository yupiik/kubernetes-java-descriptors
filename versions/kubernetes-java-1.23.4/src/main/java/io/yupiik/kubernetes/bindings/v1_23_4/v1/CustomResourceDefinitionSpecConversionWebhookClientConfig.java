package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class CustomResourceDefinitionSpecConversionWebhookClientConfig {
    private String caBundle;
    private CustomResourceDefinitionSpecConversionWebhookClientConfigService service;
    private String url;

    public CustomResourceDefinitionSpecConversionWebhookClientConfig() {
        // no-op
    }

    public CustomResourceDefinitionSpecConversionWebhookClientConfig(final String caBundle,
                                                                     final CustomResourceDefinitionSpecConversionWebhookClientConfigService service,
                                                                     final String url) {
        // no-op
    }

    public String getCaBundle() {
        return caBundle;
    }

    public void setCaBundle(final String caBundle) {
        this.caBundle = caBundle;
    }

    public CustomResourceDefinitionSpecConversionWebhookClientConfigService getService() {
        return service;
    }

    public void setService(final CustomResourceDefinitionSpecConversionWebhookClientConfigService service) {
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
        if (!(__other instanceof CustomResourceDefinitionSpecConversionWebhookClientConfig)) {
            return false;
        }
        final CustomResourceDefinitionSpecConversionWebhookClientConfig __otherCasted = (CustomResourceDefinitionSpecConversionWebhookClientConfig) __other;
        return Objects.equals(caBundle, __otherCasted.caBundle) &&
            Objects.equals(service, __otherCasted.service) &&
            Objects.equals(url, __otherCasted.url);
    }
}
