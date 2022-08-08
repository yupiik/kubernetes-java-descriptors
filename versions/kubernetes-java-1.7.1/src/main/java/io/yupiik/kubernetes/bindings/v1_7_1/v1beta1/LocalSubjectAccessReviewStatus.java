package io.yupiik.kubernetes.bindings.v1_7_1.v1beta1;

import java.util.Objects;

public class LocalSubjectAccessReviewStatus {
    private boolean allowed;
    private String evaluationError;
    private String reason;

    public LocalSubjectAccessReviewStatus() {
        // no-op
    }

    public LocalSubjectAccessReviewStatus(final boolean allowed,
                                          final String evaluationError,
                                          final String reason) {
        // no-op
    }

    public boolean getAllowed() {
        return allowed;
    }

    public void setAllowed(final boolean allowed) {
        this.allowed = allowed;
    }

    public String getEvaluationError() {
        return evaluationError;
    }

    public void setEvaluationError(final String evaluationError) {
        this.evaluationError = evaluationError;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allowed,
                evaluationError,
                reason);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LocalSubjectAccessReviewStatus)) {
            return false;
        }
        final LocalSubjectAccessReviewStatus __otherCasted = (LocalSubjectAccessReviewStatus) __other;
        return Objects.equals(allowed, __otherCasted.allowed) &&
            Objects.equals(evaluationError, __otherCasted.evaluationError) &&
            Objects.equals(reason, __otherCasted.reason);
    }
}
