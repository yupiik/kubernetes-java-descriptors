package io.yupiik.kubernetes.bindings.v1_28_12.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_28_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_12.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_12.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ClusterCIDR implements Validable<ClusterCIDR>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private ClusterCIDRSpec spec;

    public ClusterCIDR() {
        // no-op
    }

    public ClusterCIDR(final String apiVersion,
                       final String kind,
                       final ObjectMeta metadata,
                       final ClusterCIDRSpec spec) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public ClusterCIDRSpec getSpec() {
        return spec;
    }

    public void setSpec(final ClusterCIDRSpec spec) {
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
        if (!(__other instanceof ClusterCIDR)) {
            return false;
        }
        final ClusterCIDR __otherCasted = (ClusterCIDR) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public ClusterCIDR apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ClusterCIDR kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ClusterCIDR metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ClusterCIDR spec(final ClusterCIDRSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public ClusterCIDR validate() {
        if (kind == null) {
            kind = "ClusterCIDR";
        }
        if (apiVersion == null) {
            apiVersion = "networking.k8s.io/v1alpha1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (spec != null ? "\"spec\":" + spec.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
