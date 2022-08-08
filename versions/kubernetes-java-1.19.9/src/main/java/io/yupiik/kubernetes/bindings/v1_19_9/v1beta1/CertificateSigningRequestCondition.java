package io.yupiik.kubernetes.bindings.v1_19_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_19_9.Validable;
import io.yupiik.kubernetes.bindings.v1_19_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CertificateSigningRequestCondition implements Validable<CertificateSigningRequestCondition> {
    private String lastTransitionTime;
    private String lastUpdateTime;
    private String message;
    private String reason;
    private String status;
    private String type;

    public CertificateSigningRequestCondition() {
        // no-op
    }

    public CertificateSigningRequestCondition(final String lastTransitionTime,
                                              final String lastUpdateTime,
                                              final String message,
                                              final String reason,
                                              final String status,
                                              final String type) {
        // no-op
    }

    public String getLastTransitionTime() {
        return lastTransitionTime;
    }

    public void setLastTransitionTime(final String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(final String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                lastTransitionTime,
                lastUpdateTime,
                message,
                reason,
                status,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CertificateSigningRequestCondition)) {
            return false;
        }
        final CertificateSigningRequestCondition __otherCasted = (CertificateSigningRequestCondition) __other;
        return Objects.equals(lastTransitionTime, __otherCasted.lastTransitionTime) &&
            Objects.equals(lastUpdateTime, __otherCasted.lastUpdateTime) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }

    public CertificateSigningRequestCondition lastTransitionTime(final String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public CertificateSigningRequestCondition lastUpdateTime(final String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    public CertificateSigningRequestCondition message(final String message) {
        this.message = message;
        return this;
    }

    public CertificateSigningRequestCondition reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public CertificateSigningRequestCondition status(final String status) {
        this.status = status;
        return this;
    }

    public CertificateSigningRequestCondition type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public CertificateSigningRequestCondition validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
