package io.yupiik.kubernetes.bindings.v1_31_8.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_31_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_8.Validable;
import io.yupiik.kubernetes.bindings.v1_31_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceClaim implements Validable<ResourceClaim>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private ResourceClaimSpec spec;
    private ResourceClaimStatus status;

    public ResourceClaim() {
        // no-op
    }

    public ResourceClaim(final String apiVersion,
                         final String kind,
                         final ObjectMeta metadata,
                         final ResourceClaimSpec spec,
                         final ResourceClaimStatus status) {
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

    public ResourceClaimSpec getSpec() {
        return spec;
    }

    public void setSpec(final ResourceClaimSpec spec) {
        this.spec = spec;
    }

    public ResourceClaimStatus getStatus() {
        return status;
    }

    public void setStatus(final ResourceClaimStatus status) {
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
        if (!(__other instanceof ResourceClaim)) {
            return false;
        }
        final ResourceClaim __otherCasted = (ResourceClaim) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public ResourceClaim apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ResourceClaim kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ResourceClaim metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ResourceClaim spec(final ResourceClaimSpec spec) {
        this.spec = spec;
        return this;
    }

    public ResourceClaim status(final ResourceClaimStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public ResourceClaim validate() {
        if (kind == null) {
            kind = "ResourceClaim";
        }
        if (apiVersion == null) {
            apiVersion = "resource.k8s.io/v1alpha3";
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
                    (spec != null ? "\"spec\":" + spec.asJson() : ""),
                    (status != null ? "\"status\":" + status.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
