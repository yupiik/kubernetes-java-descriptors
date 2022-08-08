package io.yupiik.kubernetes.bindings.v1_15_3.v1beta1;

import java.util.List;
import java.util.Objects;

public class MutatingWebhookConfigurationMetadataInitializers {
    private List<MutatingWebhookConfigurationMetadataInitializersPending> pending;
    private MutatingWebhookConfigurationMetadataInitializersResult result;

    public MutatingWebhookConfigurationMetadataInitializers() {
        // no-op
    }

    public MutatingWebhookConfigurationMetadataInitializers(final List<MutatingWebhookConfigurationMetadataInitializersPending> pending,
                                                            final MutatingWebhookConfigurationMetadataInitializersResult result) {
        // no-op
    }

    public List<MutatingWebhookConfigurationMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<MutatingWebhookConfigurationMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public MutatingWebhookConfigurationMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final MutatingWebhookConfigurationMetadataInitializersResult result) {
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
        if (!(__other instanceof MutatingWebhookConfigurationMetadataInitializers)) {
            return false;
        }
        final MutatingWebhookConfigurationMetadataInitializers __otherCasted = (MutatingWebhookConfigurationMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
