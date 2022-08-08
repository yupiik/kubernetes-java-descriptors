package io.yupiik.kubernetes.bindings.v1_21_4;

import java.util.List;
import java.util.Objects;

public class EphemeralContainers {
    private String apiVersion;
    private List<EphemeralContainersEphemeralContainers> ephemeralContainers;
    private String kind;
    private EphemeralContainersMetadata metadata;

    public EphemeralContainers() {
        // no-op
    }

    public EphemeralContainers(final String apiVersion,
                               final List<EphemeralContainersEphemeralContainers> ephemeralContainers,
                               final String kind,
                               final EphemeralContainersMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<EphemeralContainersEphemeralContainers> getEphemeralContainers() {
        return ephemeralContainers;
    }

    public void setEphemeralContainers(final List<EphemeralContainersEphemeralContainers> ephemeralContainers) {
        this.ephemeralContainers = ephemeralContainers;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public EphemeralContainersMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final EphemeralContainersMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                ephemeralContainers,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EphemeralContainers)) {
            return false;
        }
        final EphemeralContainers __otherCasted = (EphemeralContainers) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(ephemeralContainers, __otherCasted.ephemeralContainers) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
