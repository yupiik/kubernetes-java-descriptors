package io.yupiik.kubernetes.bindings.v1_11_2.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ValidatingWebhookConfigurationMetadataInitializers {
    private List<JsonValue> pending;
    private ValidatingWebhookConfigurationMetadataInitializersResult result;

    public ValidatingWebhookConfigurationMetadataInitializers() {
        // no-op
    }

    public ValidatingWebhookConfigurationMetadataInitializers(final List<JsonValue> pending,
                                                              final ValidatingWebhookConfigurationMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public ValidatingWebhookConfigurationMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ValidatingWebhookConfigurationMetadataInitializersResult result) {
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
        if (!(__other instanceof ValidatingWebhookConfigurationMetadataInitializers)) {
            return false;
        }
        final ValidatingWebhookConfigurationMetadataInitializers __otherCasted = (ValidatingWebhookConfigurationMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
