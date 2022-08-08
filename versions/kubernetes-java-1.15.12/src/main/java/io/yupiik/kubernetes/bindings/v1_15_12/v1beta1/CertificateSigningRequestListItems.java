package io.yupiik.kubernetes.bindings.v1_15_12.v1beta1;

import java.util.Objects;

public class CertificateSigningRequestListItems {
    private String apiVersion;
    private String kind;
    private CertificateSigningRequestListItemsMetadata metadata;
    private CertificateSigningRequestListItemsSpec spec;
    private CertificateSigningRequestListItemsStatus status;

    public CertificateSigningRequestListItems() {
        // no-op
    }

    public CertificateSigningRequestListItems(final String apiVersion,
                                              final String kind,
                                              final CertificateSigningRequestListItemsMetadata metadata,
                                              final CertificateSigningRequestListItemsSpec spec,
                                              final CertificateSigningRequestListItemsStatus status) {
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

    public CertificateSigningRequestListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CertificateSigningRequestListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public CertificateSigningRequestListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final CertificateSigningRequestListItemsSpec spec) {
        this.spec = spec;
    }

    public CertificateSigningRequestListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final CertificateSigningRequestListItemsStatus status) {
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
        if (!(__other instanceof CertificateSigningRequestListItems)) {
            return false;
        }
        final CertificateSigningRequestListItems __otherCasted = (CertificateSigningRequestListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
