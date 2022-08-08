package io.yupiik.kubernetes.bindings.v1_18_14;

import java.util.List;
import java.util.Objects;

public class FlowSchemaListItemsSpecRules {
    private List<FlowSchemaListItemsSpecRulesNonResourceRules> nonResourceRules;
    private List<FlowSchemaListItemsSpecRulesResourceRules> resourceRules;
    private List<FlowSchemaListItemsSpecRulesSubjects> subjects;

    public FlowSchemaListItemsSpecRules() {
        // no-op
    }

    public FlowSchemaListItemsSpecRules(final List<FlowSchemaListItemsSpecRulesNonResourceRules> nonResourceRules,
                                        final List<FlowSchemaListItemsSpecRulesResourceRules> resourceRules,
                                        final List<FlowSchemaListItemsSpecRulesSubjects> subjects) {
        // no-op
    }

    public List<FlowSchemaListItemsSpecRulesNonResourceRules> getNonResourceRules() {
        return nonResourceRules;
    }

    public void setNonResourceRules(final List<FlowSchemaListItemsSpecRulesNonResourceRules> nonResourceRules) {
        this.nonResourceRules = nonResourceRules;
    }

    public List<FlowSchemaListItemsSpecRulesResourceRules> getResourceRules() {
        return resourceRules;
    }

    public void setResourceRules(final List<FlowSchemaListItemsSpecRulesResourceRules> resourceRules) {
        this.resourceRules = resourceRules;
    }

    public List<FlowSchemaListItemsSpecRulesSubjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<FlowSchemaListItemsSpecRulesSubjects> subjects) {
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
        if (!(__other instanceof FlowSchemaListItemsSpecRules)) {
            return false;
        }
        final FlowSchemaListItemsSpecRules __otherCasted = (FlowSchemaListItemsSpecRules) __other;
        return Objects.equals(nonResourceRules, __otherCasted.nonResourceRules) &&
            Objects.equals(resourceRules, __otherCasted.resourceRules) &&
            Objects.equals(subjects, __otherCasted.subjects);
    }
}
