package io.yupiik.kubernetes.bindings.v1_8_9;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ExternalAdmissionHookConfigurationMetadataInitializers {
    private List<JsonValue> pending;
    private ExternalAdmissionHookConfigurationMetadataInitializersResult result;

    public ExternalAdmissionHookConfigurationMetadataInitializers() {
        // no-op
    }

    public ExternalAdmissionHookConfigurationMetadataInitializers(final List<JsonValue> pending,
                                                                  final ExternalAdmissionHookConfigurationMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public ExternalAdmissionHookConfigurationMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ExternalAdmissionHookConfigurationMetadataInitializersResult result) {
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
        if (!(__other instanceof ExternalAdmissionHookConfigurationMetadataInitializers)) {
            return false;
        }
        final ExternalAdmissionHookConfigurationMetadataInitializers __otherCasted = (ExternalAdmissionHookConfigurationMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
