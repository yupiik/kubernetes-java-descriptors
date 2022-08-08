package io.yupiik.kubernetes.bindings.v1_19_11;

import java.util.Objects;

public class PodPreset {
    private String apiVersion;
    private String kind;
    private PodPresetMetadata metadata;
    private PodPresetSpec spec;

    public PodPreset() {
        // no-op
    }

    public PodPreset(final String apiVersion,
                     final String kind,
                     final PodPresetMetadata metadata,
                     final PodPresetSpec spec) {
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

    public PodPresetMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodPresetMetadata metadata) {
        this.metadata = metadata;
    }

    public PodPresetSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodPresetSpec spec) {
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
        if (!(__other instanceof PodPreset)) {
            return false;
        }
        final PodPreset __otherCasted = (PodPreset) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
