package io.yupiik.kubernetes.bindings.v1_14_0;

import java.util.Objects;

public class MutatingWebhookConfigurationWebhooksClientConfig {
    private String caBundle;
    private MutatingWebhookConfigurationWebhooksClientConfigService service;
    private String url;

    public MutatingWebhookConfigurationWebhooksClientConfig() {
        // no-op
    }

    public MutatingWebhookConfigurationWebhooksClientConfig(final String caBundle,
                                                            final MutatingWebhookConfigurationWebhooksClientConfigService service,
                                                            final String url) {
        // no-op
    }

    public String getCaBundle() {
        return caBundle;
    }

    public void setCaBundle(final String caBundle) {
        this.caBundle = caBundle;
    }

    public MutatingWebhookConfigurationWebhooksClientConfigService getService() {
        return service;
    }

    public void setService(final MutatingWebhookConfigurationWebhooksClientConfigService service) {
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
        if (!(__other instanceof MutatingWebhookConfigurationWebhooksClientConfig)) {
            return false;
        }
        final MutatingWebhookConfigurationWebhooksClientConfig __otherCasted = (MutatingWebhookConfigurationWebhooksClientConfig) __other;
        return Objects.equals(caBundle, __otherCasted.caBundle) &&
            Objects.equals(service, __otherCasted.service) &&
            Objects.equals(url, __otherCasted.url);
    }
}
