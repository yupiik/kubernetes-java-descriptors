package io.yupiik.kubernetes.bindings.v1_9_11.v1beta1;

import io.yupiik.kubernetes.bindings.v1_9_11.Validable;
import io.yupiik.kubernetes.bindings.v1_9_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CertificateSigningRequest implements Validable<CertificateSigningRequest> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private CertificateSigningRequestSpec spec;
    private CertificateSigningRequestStatus status;

    public CertificateSigningRequest() {
        // no-op
    }

    public CertificateSigningRequest(final String apiVersion,
                                     final String kind,
                                     final ObjectMeta metadata,
                                     final CertificateSigningRequestSpec spec,
                                     final CertificateSigningRequestStatus status) {
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

    public CertificateSigningRequestSpec getSpec() {
        return spec;
    }

    public void setSpec(final CertificateSigningRequestSpec spec) {
        this.spec = spec;
    }

    public CertificateSigningRequestStatus getStatus() {
        return status;
    }

    public void setStatus(final CertificateSigningRequestStatus status) {
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
        if (!(__other instanceof CertificateSigningRequest)) {
            return false;
        }
        final CertificateSigningRequest __otherCasted = (CertificateSigningRequest) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public CertificateSigningRequest apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public CertificateSigningRequest kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public CertificateSigningRequest metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public CertificateSigningRequest spec(final CertificateSigningRequestSpec spec) {
        this.spec = spec;
        return this;
    }

    public CertificateSigningRequest status(final CertificateSigningRequestStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public CertificateSigningRequest validate() {
        return this;
    }
}
