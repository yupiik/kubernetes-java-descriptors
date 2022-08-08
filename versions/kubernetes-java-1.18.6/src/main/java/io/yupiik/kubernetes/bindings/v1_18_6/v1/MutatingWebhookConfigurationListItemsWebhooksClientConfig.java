package io.yupiik.kubernetes.bindings.v1_18_6.v1;

import java.util.Objects;

public class MutatingWebhookConfigurationListItemsWebhooksClientConfig {
    private String caBundle;
    private MutatingWebhookConfigurationListItemsWebhooksClientConfigService service;
    private String url;

    public MutatingWebhookConfigurationListItemsWebhooksClientConfig() {
        // no-op
    }

    public MutatingWebhookConfigurationListItemsWebhooksClientConfig(final String caBundle,
                                                                     final MutatingWebhookConfigurationListItemsWebhooksClientConfigService service,
                                                                     final String url) {
        // no-op
    }

    public String getCaBundle() {
        return caBundle;
    }

    public void setCaBundle(final String caBundle) {
        this.caBundle = caBundle;
    }

    public MutatingWebhookConfigurationListItemsWebhooksClientConfigService getService() {
        return service;
    }

    public void setService(final MutatingWebhookConfigurationListItemsWebhooksClientConfigService service) {
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
        if (!(__other instanceof MutatingWebhookConfigurationListItemsWebhooksClientConfig)) {
            return false;
        }
        final MutatingWebhookConfigurationListItemsWebhooksClientConfig __otherCasted = (MutatingWebhookConfigurationListItemsWebhooksClientConfig) __other;
        return Objects.equals(caBundle, __otherCasted.caBundle) &&
            Objects.equals(service, __otherCasted.service) &&
            Objects.equals(url, __otherCasted.url);
    }
}
