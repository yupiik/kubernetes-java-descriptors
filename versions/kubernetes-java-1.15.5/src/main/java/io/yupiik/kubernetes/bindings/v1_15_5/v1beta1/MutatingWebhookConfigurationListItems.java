package io.yupiik.kubernetes.bindings.v1_15_5.v1beta1;

import java.util.List;
import java.util.Objects;

public class MutatingWebhookConfigurationListItems {
    private String apiVersion;
    private String kind;
    private MutatingWebhookConfigurationListItemsMetadata metadata;
    private List<MutatingWebhookConfigurationListItemsWebhooks> webhooks;

    public MutatingWebhookConfigurationListItems() {
        // no-op
    }

    public MutatingWebhookConfigurationListItems(final String apiVersion,
                                                 final String kind,
                                                 final MutatingWebhookConfigurationListItemsMetadata metadata,
                                                 final List<MutatingWebhookConfigurationListItemsWebhooks> webhooks) {
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

    public MutatingWebhookConfigurationListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final MutatingWebhookConfigurationListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public List<MutatingWebhookConfigurationListItemsWebhooks> getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(final List<MutatingWebhookConfigurationListItemsWebhooks> webhooks) {
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
        if (!(__other instanceof MutatingWebhookConfigurationListItems)) {
            return false;
        }
        final MutatingWebhookConfigurationListItems __otherCasted = (MutatingWebhookConfigurationListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(webhooks, __otherCasted.webhooks);
    }
}
