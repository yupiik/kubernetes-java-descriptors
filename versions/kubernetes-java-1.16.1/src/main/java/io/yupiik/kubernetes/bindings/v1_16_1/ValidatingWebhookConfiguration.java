package io.yupiik.kubernetes.bindings.v1_16_1;

import java.util.List;
import java.util.Objects;

public class ValidatingWebhookConfiguration {
    private String apiVersion;
    private String kind;
    private ValidatingWebhookConfigurationMetadata metadata;
    private List<ValidatingWebhookConfigurationWebhooks> webhooks;

    public ValidatingWebhookConfiguration() {
        // no-op
    }

    public ValidatingWebhookConfiguration(final String apiVersion,
                                          final String kind,
                                          final ValidatingWebhookConfigurationMetadata metadata,
                                          final List<ValidatingWebhookConfigurationWebhooks> webhooks) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ValidatingWebhookConfigurationMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ValidatingWebhookConfigurationMetadata metadata) {
        this.metadata = metadata;
    }

    public List<ValidatingWebhookConfigurationWebhooks> getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(final List<ValidatingWebhookConfigurationWebhooks> webhooks) {
        this.webhooks = webhooks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                webhooks);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ValidatingWebhookConfiguration)) {
            return false;
        }
        final ValidatingWebhookConfiguration __otherCasted = (ValidatingWebhookConfiguration) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(webhooks, __otherCasted.webhooks);
    }
}
