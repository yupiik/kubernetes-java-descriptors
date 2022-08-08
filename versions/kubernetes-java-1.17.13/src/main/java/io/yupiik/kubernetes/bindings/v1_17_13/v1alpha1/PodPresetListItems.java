package io.yupiik.kubernetes.bindings.v1_17_13.v1alpha1;

import java.util.Objects;

public class PodPresetListItems {
    private String apiVersion;
    private String kind;
    private PodPresetListItemsMetadata metadata;
    private PodPresetListItemsSpec spec;

    public PodPresetListItems() {
        // no-op
    }

    public PodPresetListItems(final String apiVersion,
                              final String kind,
                              final PodPresetListItemsMetadata metadata,
                              final PodPresetListItemsSpec spec) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public PodPresetListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodPresetListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public PodPresetListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodPresetListItemsSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodPresetListItems)) {
            return false;
        }
        final PodPresetListItems __otherCasted = (PodPresetListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
