package io.yupiik.kubernetes.bindings.v1_14_2;

import java.util.List;
import java.util.Objects;

public class ConfigMapMetadataInitializers {
    private List<ConfigMapMetadataInitializersPending> pending;
    private ConfigMapMetadataInitializersResult result;

    public ConfigMapMetadataInitializers() {
        // no-op
    }

    public ConfigMapMetadataInitializers(final List<ConfigMapMetadataInitializersPending> pending,
                                         final ConfigMapMetadataInitializersResult result) {
        // no-op
    }

    public List<ConfigMapMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ConfigMapMetadataInitializersPending> pending) {
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
