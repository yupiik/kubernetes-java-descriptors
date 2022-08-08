package io.yupiik.kubernetes.bindings.v1_14_4.v1beta1;

import java.util.Objects;

public class CertificateSigningRequestListItemsMetadataInitializersPending {
    private String name;

    public CertificateSigningRequestListItemsMetadataInitializersPending() {
        // no-op
    }

    public CertificateSigningRequestListItemsMetadataInitializersPending(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CertificateSigningRequestListItemsMetadataInitializersPending)) {
            return false;
        }
        final CertificateSigningRequestListItemsMetadataInitializersPending __otherCasted = (CertificateSigningRequestListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
