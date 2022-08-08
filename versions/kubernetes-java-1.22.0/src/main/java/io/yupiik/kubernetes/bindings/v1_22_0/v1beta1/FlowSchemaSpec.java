package io.yupiik.kubernetes.bindings.v1_22_0.v1beta1;

import java.util.List;
import java.util.Objects;

public class FlowSchemaSpec {
    private FlowSchemaSpecDistinguisherMethod distinguisherMethod;
    private Integer matchingPrecedence;
    private FlowSchemaSpecPriorityLevelConfiguration priorityLevelConfiguration;
    private List<FlowSchemaSpecRules> rules;

    public FlowSchemaSpec() {
        // no-op
    }

    public FlowSchemaSpec(final FlowSchemaSpecDistinguisherMethod distinguisherMethod,
                          final Integer matchingPrecedence,
                          final FlowSchemaSpecPriorityLevelConfiguration priorityLevelConfiguration,
                          final List<FlowSchemaSpecRules> rules) {
        // no-op
    }

    public FlowSchemaSpecDistinguisherMethod getDistinguisherMethod() {
        return distinguisherMethod;
    }

    public void setDistinguisherMethod(final FlowSchemaSpecDistinguisherMethod distinguisherMethod) {
        this.distinguisherMethod = distinguisherMethod;
    }

    public Integer getMatchingPrecedence() {
        return matchingPrecedence;
    }

    public void setMatchingPrecedence(final Integer matchingPrecedence) {
        this.matchingPrecedence = matchingPrecedence;
    }

    public FlowSchemaSpecPriorityLevelConfiguration getPriorityLevelConfiguration() {
        return priorityLevelConfiguration;
    }

    public void setPriorityLevelConfiguration(final FlowSchemaSpecPriorityLevelConfiguration priorityLevelConfiguration) {
        this.priorityLevelConfiguration = priorityLevelConfiguration;
    }

    public List<FlowSchemaSpecRules> getRules() {
        return rules;
    }

    public void setRules(final List<FlowSchemaSpecRules> rules) {
        this.rules = rules;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                distinguisherMethod,
                matchingPrecedence,
                priorityLevelConfiguration,
                rules);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof FlowSchemaSpec)) {
            return false;
        }
        final FlowSchemaSpec __otherCasted = (FlowSchemaSpec) __other;
        return Objects.equals(distinguisherMethod, __otherCasted.distinguisherMethod) &&
            Objects.equals(matchingPrecedence, __otherCasted.matchingPrecedence) &&
            Objects.equals(priorityLevelConfiguration, __otherCasted.priorityLevelConfiguration) &&
            Objects.equals(rules, __otherCasted.rules);
    }
}
