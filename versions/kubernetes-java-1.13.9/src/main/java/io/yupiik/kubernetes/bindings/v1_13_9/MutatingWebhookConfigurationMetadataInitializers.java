package io.yupiik.kubernetes.bindings.v1_13_9;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class MutatingWebhookConfigurationMetadataInitializers {
    private List<JsonValue> pending;
    private MutatingWebhookConfigurationMetadataInitializersResult result;

    public MutatingWebhookConfigurationMetadataInitializers() {
        // no-op
    }

    public MutatingWebhookConfigurationMetadataInitializers(final List<JsonValue> pending,
                                                            final MutatingWebhookConfigurationMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
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
