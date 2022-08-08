package io.yupiik.kubernetes.bindings.v1_18_17;

import java.util.Objects;

public class ValidatingWebhookConfigurationListItemsWebhooksClientConfig {
    private String caBundle;
    private ValidatingWebhookConfigurationListItemsWebhooksClientConfigService service;
    private String url;

    public ValidatingWebhookConfigurationListItemsWebhooksClientConfig() {
        // no-op
    }

    public ValidatingWebhookConfigurationListItemsWebhooksClientConfig(final String caBundle,
                                                                       final ValidatingWebhookConfigurationListItemsWebhooksClientConfigService service,
                                                                       final String url) {
        // no-op
    }

    public String getCaBundle() {
        return caBundle;
    }

    public void setCaBundle(final String caBundle) {
        this.caBundle = caBundle;
    }

    public ValidatingWebhookConfigurationListItemsWebhooksClientConfigService getService() {
        return service;
    }

    public void setService(final ValidatingWebhookConfigurationListItemsWebhooksClientConfigService service) {
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
        if (!(__other instanceof ValidatingWebhookConfigurationListItemsWebhooksClientConfig)) {
            return false;
        }
        final ValidatingWebhookConfigurationListItemsWebhooksClientConfig __otherCasted = (ValidatingWebhookConfigurationListItemsWebhooksClientConfig) __other;
        return Objects.equals(caBundle, __otherCasted.caBundle) &&
            Objects.equals(service, __otherCasted.service) &&
            Objects.equals(url, __otherCasted.url);
    }
}
