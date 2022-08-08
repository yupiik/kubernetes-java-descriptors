package io.yupiik.kubernetes.bindings.v1_15_2.v1;

import java.util.Objects;

public class SubjectAccessReviewStatus {
    private boolean allowed;
    private Boolean denied;
    private String evaluationError;
    private String reason;

    public SubjectAccessReviewStatus() {
        // no-op
    }

    public SubjectAccessReviewStatus(final boolean allowed,
                                     final Boolean denied,
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

    public Boolean getDenied() {
        return denied;
    }

    public void setDenied(final Boolean denied) {
        this.denied = denied;
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
                denied,
                evaluationError,
                reason);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SubjectAccessReviewStatus)) {
            return false;
        }
        final SubjectAccessReviewStatus __otherCasted = (SubjectAccessReviewStatus) __other;
        return Objects.equals(allowed, __otherCasted.allowed) &&
            Objects.equals(denied, __otherCasted.denied) &&
            Objects.equals(evaluationError, __otherCasted.evaluationError) &&
            Objects.equals(reason, __otherCasted.reason);
    }
}
