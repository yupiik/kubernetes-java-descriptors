package io.yupiik.kubernetes.bindings.v1_23_9.v1;

import io.yupiik.kubernetes.bindings.v1_23_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_9.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SubjectAccessReviewStatus implements Validable<SubjectAccessReviewStatus>, Exportable {
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
        this.allowed = allowed;
        this.denied = denied;
        this.evaluationError = evaluationError;
        this.reason = reason;
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

    public SubjectAccessReviewStatus allowed(final boolean allowed) {
        this.allowed = allowed;
        return this;
    }

    public SubjectAccessReviewStatus denied(final Boolean denied) {
        this.denied = denied;
        return this;
    }

    public SubjectAccessReviewStatus evaluationError(final String evaluationError) {
        this.evaluationError = evaluationError;
        return this;
    }

    public SubjectAccessReviewStatus reason(final String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public SubjectAccessReviewStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"allowed\":" + allowed,
                    (denied != null ? "\"denied\":" + denied : ""),
                    (evaluationError != null ? "\"evaluationError\":\"" +  JsonStrings.escapeJson(evaluationError) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
