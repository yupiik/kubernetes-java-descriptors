package io.yupiik.kubernetes.bindings.v1_17_14.v1beta1;

import java.util.Objects;

public class CSIDriver {
    private String apiVersion;
    private String kind;
    private CSIDriverMetadata metadata;
    private CSIDriverSpec spec;

    public CSIDriver() {
        // no-op
    }

    public CSIDriver(final String apiVersion,
                     final String kind,
                     final CSIDriverMetadata metadata,
                     final CSIDriverSpec spec) {
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

    public CSIDriverMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CSIDriverMetadata metadata) {
        this.metadata = metadata;
    }

    public CSIDriverSpec getSpec() {
        return spec;
    }

    public void setSpec(final CSIDriverSpec spec) {
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
        if (!(__other instanceof CSIDriver)) {
            return false;
        }
        final CSIDriver __otherCasted = (CSIDriver) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
