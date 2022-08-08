package io.yupiik.kubernetes.bindings.v1_14_6.v1beta1;

import java.util.List;
import java.util.Objects;

public class CertificateSigningRequestListItemsStatus {
    private String certificate;
    private List<CertificateSigningRequestListItemsStatusConditions> conditions;

    public CertificateSigningRequestListItemsStatus() {
        // no-op
    }

    public CertificateSigningRequestListItemsStatus(final String certificate,
                                                    final List<CertificateSigningRequestListItemsStatusConditions> conditions) {
        // no-op
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(final String certificate) {
        this.certificate = certificate;
    }

    public List<CertificateSigningRequestListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<CertificateSigningRequestListItemsStatusConditions> conditions) {
        this.conditions = conditions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                certificate,
                conditions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CertificateSigningRequestListItemsStatus)) {
            return false;
        }
        final CertificateSigningRequestListItemsStatus __otherCasted = (CertificateSigningRequestListItemsStatus) __other;
        return Objects.equals(certificate, __otherCasted.certificate) &&
            Objects.equals(conditions, __otherCasted.conditions);
    }
}
