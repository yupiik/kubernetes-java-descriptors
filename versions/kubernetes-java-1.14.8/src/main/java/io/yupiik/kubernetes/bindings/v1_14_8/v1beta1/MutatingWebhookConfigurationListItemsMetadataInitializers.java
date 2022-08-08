package io.yupiik.kubernetes.bindings.v1_14_8.v1beta1;

import java.util.List;
import java.util.Objects;

public class MutatingWebhookConfigurationListItemsMetadataInitializers {
    private List<MutatingWebhookConfigurationListItemsMetadataInitializersPending> pending;
    private MutatingWebhookConfigurationListItemsMetadataInitializersResult result;

    public MutatingWebhookConfigurationListItemsMetadataInitializers() {
        // no-op
    }

    public MutatingWebhookConfigurationListItemsMetadataInitializers(final List<MutatingWebhookConfigurationListItemsMetadataInitializersPending> pending,
                                                                     final MutatingWebhookConfigurationListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<MutatingWebhookConfigurationListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<MutatingWebhookConfigurationListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public MutatingWebhookConfigurationListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final MutatingWebhookConfigurationListItemsMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof MutatingWebhookConfigurationListItemsMetadataInitializers)) {
            return false;
        }
        final MutatingWebhookConfigurationListItemsMetadataInitializers __otherCasted = (MutatingWebhookConfigurationListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
