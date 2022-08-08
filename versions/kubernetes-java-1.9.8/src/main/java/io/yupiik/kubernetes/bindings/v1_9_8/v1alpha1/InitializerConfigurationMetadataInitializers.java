package io.yupiik.kubernetes.bindings.v1_9_8.v1alpha1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class InitializerConfigurationMetadataInitializers {
    private List<JsonValue> pending;
    private InitializerConfigurationMetadataInitializersResult result;

    public InitializerConfigurationMetadataInitializers() {
        // no-op
    }

    public InitializerConfigurationMetadataInitializers(final List<JsonValue> pending,
                                                        final InitializerConfigurationMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public InitializerConfigurationMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final InitializerConfigurationMetadataInitializersResult result) {
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
        if (!(__other instanceof InitializerConfigurationMetadataInitializers)) {
            return false;
        }
        final InitializerConfigurationMetadataInitializers __otherCasted = (InitializerConfigurationMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
