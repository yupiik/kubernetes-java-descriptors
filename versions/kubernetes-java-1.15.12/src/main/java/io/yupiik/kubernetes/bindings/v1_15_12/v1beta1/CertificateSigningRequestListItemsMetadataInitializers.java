package io.yupiik.kubernetes.bindings.v1_15_12.v1beta1;

import java.util.List;
import java.util.Objects;

public class CertificateSigningRequestListItemsMetadataInitializers {
    private List<CertificateSigningRequestListItemsMetadataInitializersPending> pending;
    private CertificateSigningRequestListItemsMetadataInitializersResult result;

    public CertificateSigningRequestListItemsMetadataInitializers() {
        // no-op
    }

    public CertificateSigningRequestListItemsMetadataInitializers(final List<CertificateSigningRequestListItemsMetadataInitializersPending> pending,
                                                                  final CertificateSigningRequestListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<CertificateSigningRequestListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<CertificateSigningRequestListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public CertificateSigningRequestListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final CertificateSigningRequestListItemsMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CertificateSigningRequestListItemsMetadataInitializers)) {
            return false;
        }
        final CertificateSigningRequestListItemsMetadataInitializers __otherCasted = (CertificateSigningRequestListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
