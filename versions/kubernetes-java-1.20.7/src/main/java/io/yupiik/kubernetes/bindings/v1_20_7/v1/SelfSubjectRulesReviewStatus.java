package io.yupiik.kubernetes.bindings.v1_20_7.v1;

import java.util.List;
import java.util.Objects;

public class SelfSubjectRulesReviewStatus {
    private String evaluationError;
    private boolean incomplete;
    private List<SelfSubjectRulesReviewStatusNonResourceRules> nonResourceRules;
    private List<SelfSubjectRulesReviewStatusResourceRules> resourceRules;

    public SelfSubjectRulesReviewStatus() {
        // no-op
    }

    public SelfSubjectRulesReviewStatus(final String evaluationError,
                                        final boolean incomplete,
                                        final List<SelfSubjectRulesReviewStatusNonResourceRules> nonResourceRules,
                                        final List<SelfSubjectRulesReviewStatusResourceRules> resourceRules) {
        // no-op
    }

    public String getEvaluationError() {
        return evaluationError;
    }

    public void setEvaluationError(final String evaluationError) {
        this.evaluationError = evaluationError;
    }

    public boolean getIncomplete() {
        return incomplete;
    }

    public void setIncomplete(final boolean incomplete) {
        this.incomplete = incomplete;
    }

    public List<SelfSubjectRulesReviewStatusNonResourceRules> getNonResourceRules() {
        return nonResourceRules;
    }

    public void setNonResourceRules(final List<SelfSubjectRulesReviewStatusNonResourceRules> nonResourceRules) {
        this.nonResourceRules = nonResourceRules;
    }

    public List<SelfSubjectRulesReviewStatusResourceRules> getResourceRules() {
        return resourceRules;
    }

    public void setResourceRules(final List<SelfSubjectRulesReviewStatusResourceRules> resourceRules) {
        this.resourceRules = resourceRules;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                evaluationError,
                incomplete,
                nonResourceRules,
                resourceRules);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SelfSubjectRulesReviewStatus)) {
            return false;
        }
        final SelfSubjectRulesReviewStatus __otherCasted = (SelfSubjectRulesReviewStatus) __other;
        return Objects.equals(evaluationError, __otherCasted.evaluationError) &&
            Objects.equals(incomplete, __otherCasted.incomplete) &&
            Objects.equals(nonResourceRules, __otherCasted.nonResourceRules) &&
            Objects.equals(resourceRules, __otherCasted.resourceRules);
    }
}
