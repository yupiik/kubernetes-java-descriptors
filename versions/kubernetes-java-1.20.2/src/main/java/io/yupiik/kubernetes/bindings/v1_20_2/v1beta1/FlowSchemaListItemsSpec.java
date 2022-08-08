package io.yupiik.kubernetes.bindings.v1_20_2.v1beta1;

import java.util.List;
import java.util.Objects;

public class FlowSchemaListItemsSpec {
    private FlowSchemaListItemsSpecDistinguisherMethod distinguisherMethod;
    private Integer matchingPrecedence;
    private FlowSchemaListItemsSpecPriorityLevelConfiguration priorityLevelConfiguration;
    private List<FlowSchemaListItemsSpecRules> rules;

    public FlowSchemaListItemsSpec() {
        // no-op
    }

    public FlowSchemaListItemsSpec(final FlowSchemaListItemsSpecDistinguisherMethod distinguisherMethod,
                                   final Integer matchingPrecedence,
                                   final FlowSchemaListItemsSpecPriorityLevelConfiguration priorityLevelConfiguration,
                                   final List<FlowSchemaListItemsSpecRules> rules) {
        // no-op
    }

    public FlowSchemaListItemsSpecDistinguisherMethod getDistinguisherMethod() {
        return distinguisherMethod;
    }

    public void setDistinguisherMethod(final FlowSchemaListItemsSpecDistinguisherMethod distinguisherMethod) {
        this.distinguisherMethod = distinguisherMethod;
    }

    public Integer getMatchingPrecedence() {
        return matchingPrecedence;
    }

    public void setMatchingPrecedence(final Integer matchingPrecedence) {
        this.matchingPrecedence = matchingPrecedence;
    }

    public FlowSchemaListItemsSpecPriorityLevelConfiguration getPriorityLevelConfiguration() {
        return priorityLevelConfiguration;
    }

    public void setPriorityLevelConfiguration(final FlowSchemaListItemsSpecPriorityLevelConfiguration priorityLevelConfiguration) {
        this.priorityLevelConfiguration = priorityLevelConfiguration;
    }

    public List<FlowSchemaListItemsSpecRules> getRules() {
        return rules;
    }

    public void setRules(final List<FlowSchemaListItemsSpecRules> rules) {
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
        if (!(__other instanceof FlowSchemaListItemsSpec)) {
            return false;
        }
        final FlowSchemaListItemsSpec __otherCasted = (FlowSchemaListItemsSpec) __other;
        return Objects.equals(distinguisherMethod, __otherCasted.distinguisherMethod) &&
            Objects.equals(matchingPrecedence, __otherCasted.matchingPrecedence) &&
            Objects.equals(priorityLevelConfiguration, __otherCasted.priorityLevelConfiguration) &&
            Objects.equals(rules, __otherCasted.rules);
    }
}
