package io.yupiik.kubernetes.bindings.v1_18_10.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_18_10.Validable;
import io.yupiik.kubernetes.bindings.v1_18_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlowSchemaSpec implements Validable<FlowSchemaSpec> {
    private FlowDistinguisherMethod distinguisherMethod;
    private Integer matchingPrecedence;
    private PriorityLevelConfigurationReference priorityLevelConfiguration;
    private List<PolicyRulesWithSubjects> rules;

    public FlowSchemaSpec() {
        // no-op
    }

    public FlowSchemaSpec(final FlowDistinguisherMethod distinguisherMethod,
                          final Integer matchingPrecedence,
                          final PriorityLevelConfigurationReference priorityLevelConfiguration,
                          final List<PolicyRulesWithSubjects> rules) {
        // no-op
    }

    public FlowDistinguisherMethod getDistinguisherMethod() {
        return distinguisherMethod;
    }

    public void setDistinguisherMethod(final FlowDistinguisherMethod distinguisherMethod) {
        this.distinguisherMethod = distinguisherMethod;
    }

    public Integer getMatchingPrecedence() {
        return matchingPrecedence;
    }

    public void setMatchingPrecedence(final Integer matchingPrecedence) {
        this.matchingPrecedence = matchingPrecedence;
    }

    public PriorityLevelConfigurationReference getPriorityLevelConfiguration() {
        return priorityLevelConfiguration;
    }

    public void setPriorityLevelConfiguration(final PriorityLevelConfigurationReference priorityLevelConfiguration) {
        this.priorityLevelConfiguration = priorityLevelConfiguration;
    }

    public List<PolicyRulesWithSubjects> getRules() {
        return rules;
    }

    public void setRules(final List<PolicyRulesWithSubjects> rules) {
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

    public FlowSchemaSpec distinguisherMethod(final FlowDistinguisherMethod distinguisherMethod) {
        this.distinguisherMethod = distinguisherMethod;
        return this;
    }

    public FlowSchemaSpec matchingPrecedence(final Integer matchingPrecedence) {
        this.matchingPrecedence = matchingPrecedence;
        return this;
    }

    public FlowSchemaSpec priorityLevelConfiguration(final PriorityLevelConfigurationReference priorityLevelConfiguration) {
        this.priorityLevelConfiguration = priorityLevelConfiguration;
        return this;
    }

    public FlowSchemaSpec rules(final List<PolicyRulesWithSubjects> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public FlowSchemaSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (priorityLevelConfiguration == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "priorityLevelConfiguration", "priorityLevelConfiguration",
                "Missing 'priorityLevelConfiguration' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
