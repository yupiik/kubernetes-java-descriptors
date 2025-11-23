package io.yupiik.kubernetes.bindings.v1_32_1.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_32_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_1.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class MutatingAdmissionPolicyBinding implements Validable<MutatingAdmissionPolicyBinding>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private MutatingAdmissionPolicyBindingSpec spec;

    public MutatingAdmissionPolicyBinding() {
        // no-op
    }

    public MutatingAdmissionPolicyBinding(final String apiVersion,
                                          final String kind,
                                          final ObjectMeta metadata,
                                          final MutatingAdmissionPolicyBindingSpec spec) {
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

    public MutatingAdmissionPolicyBindingSpec getSpec() {
        return spec;
    }

    public void setSpec(final MutatingAdmissionPolicyBindingSpec spec) {
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
        if (!(__other instanceof MutatingAdmissionPolicyBinding)) {
            return false;
        }
        final MutatingAdmissionPolicyBinding __otherCasted = (MutatingAdmissionPolicyBinding) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public MutatingAdmissionPolicyBinding apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public MutatingAdmissionPolicyBinding kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public MutatingAdmissionPolicyBinding metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public MutatingAdmissionPolicyBinding spec(final MutatingAdmissionPolicyBindingSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public MutatingAdmissionPolicyBinding validate() {
        if (kind == null) {
            kind = "MutatingAdmissionPolicyBinding";
        }
        if (apiVersion == null) {
            apiVersion = "admissionregistration.k8s.io/v1alpha1";
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
