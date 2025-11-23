package io.yupiik.kubernetes.bindings.v1_26_15.v1;

import io.yupiik.kubernetes.bindings.v1_26_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_15.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_26_15.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NetworkPolicy implements Validable<NetworkPolicy>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private NetworkPolicySpec spec;
    private NetworkPolicyStatus status;

    public NetworkPolicy() {
        // no-op
    }

    public NetworkPolicy(final String apiVersion,
                         final String kind,
                         final ObjectMeta metadata,
                         final NetworkPolicySpec spec,
                         final NetworkPolicyStatus status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
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

    public NetworkPolicySpec getSpec() {
        return spec;
    }

    public void setSpec(final NetworkPolicySpec spec) {
        this.spec = spec;
    }

    public NetworkPolicyStatus getStatus() {
        return status;
    }

    public void setStatus(final NetworkPolicyStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicy)) {
            return false;
        }
        final NetworkPolicy __otherCasted = (NetworkPolicy) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public NetworkPolicy apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public NetworkPolicy kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public NetworkPolicy metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public NetworkPolicy spec(final NetworkPolicySpec spec) {
        this.spec = spec;
        return this;
    }

    public NetworkPolicy status(final NetworkPolicyStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public NetworkPolicy validate() {
        if (kind == null) {
            kind = "NetworkPolicy";
        }
        if (apiVersion == null) {
            apiVersion = "networking.k8s.io/v1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (spec != null ? "\"spec\":" + spec.asJson() : ""),
                    (status != null ? "\"status\":" + status.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
