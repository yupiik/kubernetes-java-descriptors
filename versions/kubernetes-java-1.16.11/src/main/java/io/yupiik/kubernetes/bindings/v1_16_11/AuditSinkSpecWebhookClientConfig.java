package io.yupiik.kubernetes.bindings.v1_16_11;

import java.util.Objects;

public class AuditSinkSpecWebhookClientConfig {
    private String caBundle;
    private AuditSinkSpecWebhookClientConfigService service;
    private String url;

    public AuditSinkSpecWebhookClientConfig() {
        // no-op
    }

    public AuditSinkSpecWebhookClientConfig(final String caBundle,
                                            final AuditSinkSpecWebhookClientConfigService service,
                                            final String url) {
        // no-op
    }

    public String getCaBundle() {
        return caBundle;
    }

    public void setCaBundle(final String caBundle) {
        this.caBundle = caBundle;
    }

    public AuditSinkSpecWebhookClientConfigService getService() {
        return service;
    }

    public void setService(final AuditSinkSpecWebhookClientConfigService service) {
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
        if (!(__other instanceof AuditSinkSpecWebhookClientConfig)) {
            return false;
        }
        final AuditSinkSpecWebhookClientConfig __otherCasted = (AuditSinkSpecWebhookClientConfig) __other;
        return Objects.equals(caBundle, __otherCasted.caBundle) &&
            Objects.equals(service, __otherCasted.service) &&
            Objects.equals(url, __otherCasted.url);
    }
}
