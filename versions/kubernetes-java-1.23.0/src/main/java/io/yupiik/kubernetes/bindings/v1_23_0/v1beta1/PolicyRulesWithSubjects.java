package io.yupiik.kubernetes.bindings.v1_23_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_0.Validable;
import io.yupiik.kubernetes.bindings.v1_23_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PolicyRulesWithSubjects implements Validable<PolicyRulesWithSubjects> {
    private List<NonResourcePolicyRule> nonResourceRules;
    private List<ResourcePolicyRule> resourceRules;
    private List<Subject> subjects;

    public PolicyRulesWithSubjects() {
        // no-op
    }

    public PolicyRulesWithSubjects(final List<NonResourcePolicyRule> nonResourceRules,
                                   final List<ResourcePolicyRule> resourceRules,
                                   final List<Subject> subjects) {
        // no-op
    }

    public List<NonResourcePolicyRule> getNonResourceRules() {
        return nonResourceRules;
    }

    public void setNonResourceRules(final List<NonResourcePolicyRule> nonResourceRules) {
        this.nonResourceRules = nonResourceRules;
    }

    public List<ResourcePolicyRule> getResourceRules() {
        return resourceRules;
    }

    public void setResourceRules(final List<ResourcePolicyRule> resourceRules) {
        this.resourceRules = resourceRules;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nonResourceRules,
                resourceRules,
                subjects);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PolicyRulesWithSubjects)) {
            return false;
        }
        final PolicyRulesWithSubjects __otherCasted = (PolicyRulesWithSubjects) __other;
        return Objects.equals(nonResourceRules, __otherCasted.nonResourceRules) &&
            Objects.equals(resourceRules, __otherCasted.resourceRules) &&
            Objects.equals(subjects, __otherCasted.subjects);
    }

    public PolicyRulesWithSubjects nonResourceRules(final List<NonResourcePolicyRule> nonResourceRules) {
        this.nonResourceRules = nonResourceRules;
        return this;
    }

    public PolicyRulesWithSubjects resourceRules(final List<ResourcePolicyRule> resourceRules) {
        this.resourceRules = resourceRules;
        return this;
    }

    public PolicyRulesWithSubjects subjects(final List<Subject> subjects) {
        this.subjects = subjects;
        return this;
    }

    @Override
    public PolicyRulesWithSubjects validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (subjects == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "subjects", "subjects",
                "Missing 'subjects' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
