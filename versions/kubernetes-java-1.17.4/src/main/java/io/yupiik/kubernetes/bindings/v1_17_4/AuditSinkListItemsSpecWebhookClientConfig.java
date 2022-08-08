package io.yupiik.kubernetes.bindings.v1_17_4;

import java.util.Objects;

public class AuditSinkListItemsSpecWebhookClientConfig {
    private String caBundle;
    private AuditSinkListItemsSpecWebhookClientConfigService service;
    private String url;

    public AuditSinkListItemsSpecWebhookClientConfig() {
        // no-op
    }

    public AuditSinkListItemsSpecWebhookClientConfig(final String caBundle,
                                                     final AuditSinkListItemsSpecWebhookClientConfigService service,
                                                     final String url) {
        // no-op
    }

    public String getCaBundle() {
        return caBundle;
    }

    public void setCaBundle(final String caBundle) {
        this.caBundle = caBundle;
    }

    public AuditSinkListItemsSpecWebhookClientConfigService getService() {
        return service;
    }

    public void setService(final AuditSinkListItemsSpecWebhookClientConfigService service) {
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
        if (!(__other instanceof AuditSinkListItemsSpecWebhookClientConfig)) {
            return false;
        }
        final AuditSinkListItemsSpecWebhookClientConfig __otherCasted = (AuditSinkListItemsSpecWebhookClientConfig) __other;
        return Objects.equals(caBundle, __otherCasted.caBundle) &&
            Objects.equals(service, __otherCasted.service) &&
            Objects.equals(url, __otherCasted.url);
    }
}
