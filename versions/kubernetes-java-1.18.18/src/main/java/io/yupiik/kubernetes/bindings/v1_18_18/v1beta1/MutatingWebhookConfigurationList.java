package io.yupiik.kubernetes.bindings.v1_18_18.v1beta1;

import java.util.List;
import java.util.Objects;

public class MutatingWebhookConfigurationList {
    private String apiVersion;
    private List<MutatingWebhookConfigurationListItems> items;
    private String kind;
    private MutatingWebhookConfigurationListMetadata metadata;

    public MutatingWebhookConfigurationList() {
        // no-op
    }

    public MutatingWebhookConfigurationList(final String apiVersion,
                                            final List<MutatingWebhookConfigurationListItems> items,
                                            final String kind,
                                            final MutatingWebhookConfigurationListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<MutatingWebhookConfigurationListItems> getItems() {
        return items;
    }

    public void setItems(final List<MutatingWebhookConfigurationListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public MutatingWebhookConfigurationListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final MutatingWebhookConfigurationListMetadata metadata) {
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
        if (!(__other instanceof MutatingWebhookConfigurationList)) {
            return false;
        }
        final MutatingWebhookConfigurationList __otherCasted = (MutatingWebhookConfigurationList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
