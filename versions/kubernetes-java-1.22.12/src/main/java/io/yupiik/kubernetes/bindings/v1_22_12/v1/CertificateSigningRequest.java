package io.yupiik.kubernetes.bindings.v1_22_12.v1;

import java.util.Objects;

public class CertificateSigningRequest {
    private String apiVersion;
    private String kind;
    private CertificateSigningRequestMetadata metadata;
    private CertificateSigningRequestSpec spec;
    private CertificateSigningRequestStatus status;

    public CertificateSigningRequest() {
        // no-op
    }

    public CertificateSigningRequest(final String apiVersion,
                                     final String kind,
                                     final CertificateSigningRequestMetadata metadata,
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

    public CertificateSigningRequestMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CertificateSigningRequestMetadata metadata) {
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
}
