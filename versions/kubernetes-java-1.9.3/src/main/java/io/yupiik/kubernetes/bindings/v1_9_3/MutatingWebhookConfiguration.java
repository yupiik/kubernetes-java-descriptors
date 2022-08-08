package io.yupiik.kubernetes.bindings.v1_9_3;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class MutatingWebhookConfiguration {
    private String apiVersion;
    private String kind;
    private MutatingWebhookConfigurationMetadata metadata;
    private List<JsonValue> webhooks;

    public MutatingWebhookConfiguration() {
        // no-op
    }

    public MutatingWebhookConfiguration(final String apiVersion,
                                        final String kind,
                                        final MutatingWebhookConfigurationMetadata metadata,
                                        final List<JsonValue> webhooks) {
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

    public MutatingWebhookConfigurationMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final MutatingWebhookConfigurationMetadata metadata) {
        this.metadata = metadata;
    }

    public List<JsonValue> getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(final List<JsonValue> webhooks) {
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
        if (!(__other instanceof MutatingWebhookConfiguration)) {
            return false;
        }
        final MutatingWebhookConfiguration __otherCasted = (MutatingWebhookConfiguration) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(webhooks, __otherCasted.webhooks);
    }
}
