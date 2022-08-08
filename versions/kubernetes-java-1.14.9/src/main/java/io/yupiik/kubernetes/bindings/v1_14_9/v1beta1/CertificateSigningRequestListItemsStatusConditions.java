package io.yupiik.kubernetes.bindings.v1_14_9.v1beta1;

import java.util.Objects;

public class CertificateSigningRequestListItemsStatusConditions {
    private String lastUpdateTime;
    private String message;
    private String reason;
    private String type;

    public CertificateSigningRequestListItemsStatusConditions() {
        // no-op
    }

    public CertificateSigningRequestListItemsStatusConditions(final String lastUpdateTime,
                                                              final String message,
                                                              final String reason,
                                                              final String type) {
        // no-op
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

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                lastUpdateTime,
                message,
                reason,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CertificateSigningRequestListItemsStatusConditions)) {
            return false;
        }
        final CertificateSigningRequestListItemsStatusConditions __otherCasted = (CertificateSigningRequestListItemsStatusConditions) __other;
        return Objects.equals(lastUpdateTime, __otherCasted.lastUpdateTime) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(type, __otherCasted.type);
    }
}
