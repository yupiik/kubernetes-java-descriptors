package io.yupiik.kubernetes.bindings.v1_20_6.v1beta1;

import java.util.Objects;

public class ValidatingWebhookConfigurationWebhooksClientConfig {
    private String caBundle;
    private ValidatingWebhookConfigurationWebhooksClientConfigService service;
    private String url;

    public ValidatingWebhookConfigurationWebhooksClientConfig() {
        // no-op
    }

    public ValidatingWebhookConfigurationWebhooksClientConfig(final String caBundle,
                                                              final ValidatingWebhookConfigurationWebhooksClientConfigService service,
                                                              final String url) {
        // no-op
    }

    public String getCaBundle() {
        return caBundle;
    }

    public void setCaBundle(final String caBundle) {
        this.caBundle = caBundle;
    }

    public ValidatingWebhookConfigurationWebhooksClientConfigService getService() {
        return service;
    }

    public void setService(final ValidatingWebhookConfigurationWebhooksClientConfigService service) {
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
        if (!(__other instanceof ValidatingWebhookConfigurationWebhooksClientConfig)) {
            return false;
        }
        final ValidatingWebhookConfigurationWebhooksClientConfig __otherCasted = (ValidatingWebhookConfigurationWebhooksClientConfig) __other;
        return Objects.equals(caBundle, __otherCasted.caBundle) &&
            Objects.equals(service, __otherCasted.service) &&
            Objects.equals(url, __otherCasted.url);
    }
}
