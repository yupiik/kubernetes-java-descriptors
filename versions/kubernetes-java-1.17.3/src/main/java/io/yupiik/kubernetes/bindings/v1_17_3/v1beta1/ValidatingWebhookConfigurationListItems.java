package io.yupiik.kubernetes.bindings.v1_17_3.v1beta1;

import java.util.List;
import java.util.Objects;

public class ValidatingWebhookConfigurationListItems {
    private String apiVersion;
    private String kind;
    private ValidatingWebhookConfigurationListItemsMetadata metadata;
    private List<ValidatingWebhookConfigurationListItemsWebhooks> webhooks;

    public ValidatingWebhookConfigurationListItems() {
        // no-op
    }

    public ValidatingWebhookConfigurationListItems(final String apiVersion,
                                                   final String kind,
                                                   final ValidatingWebhookConfigurationListItemsMetadata metadata,
                                                   final List<ValidatingWebhookConfigurationListItemsWebhooks> webhooks) {
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

    public ValidatingWebhookConfigurationListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ValidatingWebhookConfigurationListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public List<ValidatingWebhookConfigurationListItemsWebhooks> getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(final List<ValidatingWebhookConfigurationListItemsWebhooks> webhooks) {
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
        if (!(__other instanceof ValidatingWebhookConfigurationListItems)) {
            return false;
        }
        final ValidatingWebhookConfigurationListItems __otherCasted = (ValidatingWebhookConfigurationListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(webhooks, __otherCasted.webhooks);
    }
}
