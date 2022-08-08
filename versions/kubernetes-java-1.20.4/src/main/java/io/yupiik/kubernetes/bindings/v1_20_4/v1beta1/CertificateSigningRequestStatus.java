package io.yupiik.kubernetes.bindings.v1_20_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_20_4.Validable;
import io.yupiik.kubernetes.bindings.v1_20_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CertificateSigningRequestStatus implements Validable<CertificateSigningRequestStatus> {
    private String certificate;
    private List<CertificateSigningRequestCondition> conditions;

    public CertificateSigningRequestStatus() {
        // no-op
    }

    public CertificateSigningRequestStatus(final String certificate,
                                           final List<CertificateSigningRequestCondition> conditions) {
        // no-op
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(final String certificate) {
        this.certificate = certificate;
    }

    public List<CertificateSigningRequestCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<CertificateSigningRequestCondition> conditions) {
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
        if (!(__other instanceof CertificateSigningRequestStatus)) {
            return false;
        }
        final CertificateSigningRequestStatus __otherCasted = (CertificateSigningRequestStatus) __other;
        return Objects.equals(certificate, __otherCasted.certificate) &&
            Objects.equals(conditions, __otherCasted.conditions);
    }

    public CertificateSigningRequestStatus certificate(final String certificate) {
        this.certificate = certificate;
        return this;
    }

    public CertificateSigningRequestStatus conditions(final List<CertificateSigningRequestCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public CertificateSigningRequestStatus validate() {
        return this;
    }
}