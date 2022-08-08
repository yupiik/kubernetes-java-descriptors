package io.yupiik.kubernetes.bindings.v1_14_2;

import java.util.List;
import java.util.Objects;

public class ConfigMapListItemsMetadataInitializers {
    private List<ConfigMapListItemsMetadataInitializersPending> pending;
    private ConfigMapListItemsMetadataInitializersResult result;

    public ConfigMapListItemsMetadataInitializers() {
        // no-op
    }

    public ConfigMapListItemsMetadataInitializers(final List<ConfigMapListItemsMetadataInitializersPending> pending,
                                                  final ConfigMapListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<ConfigMapListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ConfigMapListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ConfigMapListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ConfigMapListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof ConfigMapListItemsMetadataInitializers)) {
            return false;
        }
        final ConfigMapListItemsMetadataInitializers __otherCasted = (ConfigMapListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
