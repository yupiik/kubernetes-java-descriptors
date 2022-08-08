package io.yupiik.kubernetes.bindings.v1_9_3.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ConfigMapMetadataInitializers {
    private List<JsonValue> pending;
    private ConfigMapMetadataInitializersResult result;

    public ConfigMapMetadataInitializers() {
        // no-op
    }

    public ConfigMapMetadataInitializers(final List<JsonValue> pending,
                                         final ConfigMapMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public ConfigMapMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ConfigMapMetadataInitializersResult result) {
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
        if (!(__other instanceof ConfigMapMetadataInitializers)) {
            return false;
        }
        final ConfigMapMetadataInitializers __otherCasted = (ConfigMapMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
