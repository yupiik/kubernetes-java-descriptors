package io.yupiik.kubernetes.bindings.v1_14_9.v1beta1;

import java.util.Objects;

public class CertificateSigningRequestMetadataInitializersPending {
    private String name;

    public CertificateSigningRequestMetadataInitializersPending() {
        // no-op
    }

    public CertificateSigningRequestMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof CertificateSigningRequestMetadataInitializersPending)) {
            return false;
        }
        final CertificateSigningRequestMetadataInitializersPending __otherCasted = (CertificateSigningRequestMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
