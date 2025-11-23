package io.yupiik.kubernetes.bindings.v1_29_15.v1beta1;

import io.yupiik.kubernetes.bindings.v1_29_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_15.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_15.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ValidatingAdmissionPolicy implements Validable<ValidatingAdmissionPolicy>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private ValidatingAdmissionPolicySpec spec;
    private ValidatingAdmissionPolicyStatus status;

    public ValidatingAdmissionPolicy() {
        // no-op
    }

    public ValidatingAdmissionPolicy(final String apiVersion,
                                     final String kind,
                                     final ObjectMeta metadata,
                                     final ValidatingAdmissionPolicySpec spec,
                                     final ValidatingAdmissionPolicyStatus status) {
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

    public ValidatingAdmissionPolicySpec getSpec() {
        return spec;
    }

    public void setSpec(final ValidatingAdmissionPolicySpec spec) {
        this.spec = spec;
    }

    public ValidatingAdmissionPolicyStatus getStatus() {
        return status;
    }

    public void setStatus(final ValidatingAdmissionPolicyStatus status) {
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
        if (!(__other instanceof ValidatingAdmissionPolicy)) {
            return false;
        }
        final ValidatingAdmissionPolicy __otherCasted = (ValidatingAdmissionPolicy) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public ValidatingAdmissionPolicy apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ValidatingAdmissionPolicy kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ValidatingAdmissionPolicy metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ValidatingAdmissionPolicy spec(final ValidatingAdmissionPolicySpec spec) {
        this.spec = spec;
        return this;
    }

    public ValidatingAdmissionPolicy status(final ValidatingAdmissionPolicyStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public ValidatingAdmissionPolicy validate() {
        if (kind == null) {
            kind = "ValidatingAdmissionPolicy";
        }
        if (apiVersion == null) {
            apiVersion = "admissionregistration.k8s.io/v1beta1";
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
