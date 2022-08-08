package io.yupiik.kubernetes.bindings.v1_20_1.v1alpha1;

import java.util.List;
import java.util.Objects;

public class FlowSchemaSpecRules {
    private List<FlowSchemaSpecRulesNonResourceRules> nonResourceRules;
    private List<FlowSchemaSpecRulesResourceRules> resourceRules;
    private List<FlowSchemaSpecRulesSubjects> subjects;

    public FlowSchemaSpecRules() {
        // no-op
    }

    public FlowSchemaSpecRules(final List<FlowSchemaSpecRulesNonResourceRules> nonResourceRules,
                               final List<FlowSchemaSpecRulesResourceRules> resourceRules,
                               final List<FlowSchemaSpecRulesSubjects> subjects) {
        // no-op
    }

    public List<FlowSchemaSpecRulesNonResourceRules> getNonResourceRules() {
        return nonResourceRules;
    }

    public void setNonResourceRules(final List<FlowSchemaSpecRulesNonResourceRules> nonResourceRules) {
        this.nonResourceRules = nonResourceRules;
    }

    public List<FlowSchemaSpecRulesResourceRules> getResourceRules() {
        return resourceRules;
    }

    public void setResourceRules(final List<FlowSchemaSpecRulesResourceRules> resourceRules) {
        this.resourceRules = resourceRules;
    }

    public List<FlowSchemaSpecRulesSubjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<FlowSchemaSpecRulesSubjects> subjects) {
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
        if (!(__other instanceof FlowSchemaSpecRules)) {
            return false;
        }
        final FlowSchemaSpecRules __otherCasted = (FlowSchemaSpecRules) __other;
        return Objects.equals(nonResourceRules, __otherCasted.nonResourceRules) &&
            Objects.equals(resourceRules, __otherCasted.resourceRules) &&
            Objects.equals(subjects, __otherCasted.subjects);
    }
}
