package io.yupiik.kubernetes.bindings.v1_12_0.v1;

import io.yupiik.kubernetes.bindings.v1_12_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_12_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_12_0.Validable;
import io.yupiik.kubernetes.bindings.v1_12_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NetworkPolicy implements Validable<NetworkPolicy>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private NetworkPolicySpec spec;

    public NetworkPolicy() {
        // no-op
    }

    public NetworkPolicy(final String apiVersion,
                         final String kind,
                         final ObjectMeta metadata,
                         final NetworkPolicySpec spec) {
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
        if (!(__other instanceof NetworkPolicy)) {
            return false;
        }
        final NetworkPolicy __otherCasted = (NetworkPolicy) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
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
                    (spec != null ? "\"spec\":" + spec.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
