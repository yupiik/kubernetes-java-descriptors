package io.yupiik.kubernetes.bindings.v1_16_10.v1alpha1;

import java.util.List;
import java.util.Objects;

public class PodPresetList {
    private String apiVersion;
    private List<PodPresetListItems> items;
    private String kind;
    private PodPresetListMetadata metadata;

    public PodPresetList() {
        // no-op
    }

    public PodPresetList(final String apiVersion,
                         final List<PodPresetListItems> items,
                         final String kind,
                         final PodPresetListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<PodPresetListItems> getItems() {
        return items;
    }

    public void setItems(final List<PodPresetListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public PodPresetListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodPresetListMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                items,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodPresetList)) {
            return false;
        }
        final PodPresetList __otherCasted = (PodPresetList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
