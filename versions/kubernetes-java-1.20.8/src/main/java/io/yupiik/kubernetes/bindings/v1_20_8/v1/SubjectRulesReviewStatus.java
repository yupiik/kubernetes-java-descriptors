package io.yupiik.kubernetes.bindings.v1_20_8.v1;

import io.yupiik.kubernetes.bindings.v1_20_8.Validable;
import io.yupiik.kubernetes.bindings.v1_20_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SubjectRulesReviewStatus implements Validable<SubjectRulesReviewStatus> {
    private String evaluationError;
    private boolean incomplete;
    private List<NonResourceRule> nonResourceRules;
    private List<ResourceRule> resourceRules;

    public SubjectRulesReviewStatus() {
        // no-op
    }

    public SubjectRulesReviewStatus(final String evaluationError,
                                    final boolean incomplete,
                                    final List<NonResourceRule> nonResourceRules,
                                    final List<ResourceRule> resourceRules) {
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

    public List<NonResourceRule> getNonResourceRules() {
        return nonResourceRules;
    }

    public void setNonResourceRules(final List<NonResourceRule> nonResourceRules) {
        this.nonResourceRules = nonResourceRules;
    }

    public List<ResourceRule> getResourceRules() {
        return resourceRules;
    }

    public void setResourceRules(final List<ResourceRule> resourceRules) {
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
        if (!(__other instanceof SubjectRulesReviewStatus)) {
            return false;
        }
        final SubjectRulesReviewStatus __otherCasted = (SubjectRulesReviewStatus) __other;
        return Objects.equals(evaluationError, __otherCasted.evaluationError) &&
            Objects.equals(incomplete, __otherCasted.incomplete) &&
            Objects.equals(nonResourceRules, __otherCasted.nonResourceRules) &&
            Objects.equals(resourceRules, __otherCasted.resourceRules);
    }

    public SubjectRulesReviewStatus evaluationError(final String evaluationError) {
        this.evaluationError = evaluationError;
        return this;
    }

    public SubjectRulesReviewStatus incomplete(final boolean incomplete) {
        this.incomplete = incomplete;
        return this;
    }

    public SubjectRulesReviewStatus nonResourceRules(final List<NonResourceRule> nonResourceRules) {
        this.nonResourceRules = nonResourceRules;
        return this;
    }

    public SubjectRulesReviewStatus resourceRules(final List<ResourceRule> resourceRules) {
        this.resourceRules = resourceRules;
        return this;
    }

    @Override
    public SubjectRulesReviewStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (nonResourceRules == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "nonResourceRules", "nonResourceRules",
                "Missing 'nonResourceRules' attribute.", true));
        }
        if (resourceRules == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "resourceRules", "resourceRules",
                "Missing 'resourceRules' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
