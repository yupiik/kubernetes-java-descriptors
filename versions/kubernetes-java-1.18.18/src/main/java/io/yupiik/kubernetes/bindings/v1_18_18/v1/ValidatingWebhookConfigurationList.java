package io.yupiik.kubernetes.bindings.v1_18_18.v1;

import java.util.List;
import java.util.Objects;

public class ValidatingWebhookConfigurationList {
    private String apiVersion;
    private List<ValidatingWebhookConfigurationListItems> items;
    private String kind;
    private ValidatingWebhookConfigurationListMetadata metadata;

    public ValidatingWebhookConfigurationList() {
        // no-op
    }

    public ValidatingWebhookConfigurationList(final String apiVersion,
                                              final List<ValidatingWebhookConfigurationListItems> items,
                                              final String kind,
                                              final ValidatingWebhookConfigurationListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<ValidatingWebhookConfigurationListItems> getItems() {
        return items;
    }

    public void setItems(final List<ValidatingWebhookConfigurationListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ValidatingWebhookConfigurationListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ValidatingWebhookConfigurationListMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                items,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ValidatingWebhookConfigurationList)) {
            return false;
        }
        final ValidatingWebhookConfigurationList __otherCasted = (ValidatingWebhookConfigurationList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
