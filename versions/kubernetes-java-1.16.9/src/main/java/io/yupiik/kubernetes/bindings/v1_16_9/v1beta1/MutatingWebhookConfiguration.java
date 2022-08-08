package io.yupiik.kubernetes.bindings.v1_16_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_16_9.Validable;
import io.yupiik.kubernetes.bindings.v1_16_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MutatingWebhookConfiguration implements Validable<MutatingWebhookConfiguration> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private List<MutatingWebhook> webhooks;

    public MutatingWebhookConfiguration() {
        // no-op
    }

    public MutatingWebhookConfiguration(final String apiVersion,
                                        final String kind,
                                        final ObjectMeta metadata,
                                        final List<MutatingWebhook> webhooks) {
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public List<MutatingWebhook> getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(final List<MutatingWebhook> webhooks) {
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

    public MutatingWebhookConfiguration apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public MutatingWebhookConfiguration kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public MutatingWebhookConfiguration metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public MutatingWebhookConfiguration webhooks(final List<MutatingWebhook> webhooks) {
        this.webhooks = webhooks;
        return this;
    }

    @Override
    public MutatingWebhookConfiguration validate() {
        return this;
    }
}
