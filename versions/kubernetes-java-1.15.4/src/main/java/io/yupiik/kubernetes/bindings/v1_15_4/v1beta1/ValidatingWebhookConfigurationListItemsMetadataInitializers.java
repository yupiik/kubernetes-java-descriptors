package io.yupiik.kubernetes.bindings.v1_15_4.v1beta1;

import java.util.List;
import java.util.Objects;

public class ValidatingWebhookConfigurationListItemsMetadataInitializers {
    private List<ValidatingWebhookConfigurationListItemsMetadataInitializersPending> pending;
    private ValidatingWebhookConfigurationListItemsMetadataInitializersResult result;

    public ValidatingWebhookConfigurationListItemsMetadataInitializers() {
        // no-op
    }

    public ValidatingWebhookConfigurationListItemsMetadataInitializers(final List<ValidatingWebhookConfigurationListItemsMetadataInitializersPending> pending,
                                                                       final ValidatingWebhookConfigurationListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<ValidatingWebhookConfigurationListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ValidatingWebhookConfigurationListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ValidatingWebhookConfigurationListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ValidatingWebhookConfigurationListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof ValidatingWebhookConfigurationListItemsMetadataInitializers)) {
            return false;
        }
        final ValidatingWebhookConfigurationListItemsMetadataInitializers __otherCasted = (ValidatingWebhookConfigurationListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
