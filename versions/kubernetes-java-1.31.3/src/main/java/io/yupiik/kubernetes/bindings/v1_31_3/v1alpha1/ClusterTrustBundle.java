package io.yupiik.kubernetes.bindings.v1_31_3.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_31_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_3.Validable;
import io.yupiik.kubernetes.bindings.v1_31_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ClusterTrustBundle implements Validable<ClusterTrustBundle>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private ClusterTrustBundleSpec spec;

    public ClusterTrustBundle() {
        // no-op
    }

    public ClusterTrustBundle(final String apiVersion,
                              final String kind,
                              final ObjectMeta metadata,
                              final ClusterTrustBundleSpec spec) {
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

    public ClusterTrustBundleSpec getSpec() {
        return spec;
    }

    public void setSpec(final ClusterTrustBundleSpec spec) {
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
        if (!(__other instanceof ClusterTrustBundle)) {
            return false;
        }
        final ClusterTrustBundle __otherCasted = (ClusterTrustBundle) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public ClusterTrustBundle apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ClusterTrustBundle kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ClusterTrustBundle metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ClusterTrustBundle spec(final ClusterTrustBundleSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public ClusterTrustBundle validate() {
        if (kind == null) {
            kind = "ClusterTrustBundle";
        }
        if (apiVersion == null) {
            apiVersion = "certificates.k8s.io/v1alpha1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (spec == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "spec", "spec",
                "Missing 'spec' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
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
