package io.yupiik.kubernetes.bindings.v1_19_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_19_1.Validable;
import io.yupiik.kubernetes.bindings.v1_19_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionStatus implements Validable<CustomResourceDefinitionStatus> {
    private CustomResourceDefinitionNames acceptedNames;
    private List<CustomResourceDefinitionCondition> conditions;
    private List<String> storedVersions;

    public CustomResourceDefinitionStatus() {
        // no-op
    }

    public CustomResourceDefinitionStatus(final CustomResourceDefinitionNames acceptedNames,
                                          final List<CustomResourceDefinitionCondition> conditions,
                                          final List<String> storedVersions) {
        // no-op
    }

    public CustomResourceDefinitionNames getAcceptedNames() {
        return acceptedNames;
    }

    public void setAcceptedNames(final CustomResourceDefinitionNames acceptedNames) {
        this.acceptedNames = acceptedNames;
    }

    public List<CustomResourceDefinitionCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<CustomResourceDefinitionCondition> conditions) {
        this.conditions = conditions;
    }

    public List<String> getStoredVersions() {
        return storedVersions;
    }

    public void setStoredVersions(final List<String> storedVersions) {
        this.storedVersions = storedVersions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                acceptedNames,
                conditions,
                storedVersions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionStatus)) {
            return false;
        }
        final CustomResourceDefinitionStatus __otherCasted = (CustomResourceDefinitionStatus) __other;
        return Objects.equals(acceptedNames, __otherCasted.acceptedNames) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(storedVersions, __otherCasted.storedVersions);
    }

    public CustomResourceDefinitionStatus acceptedNames(final CustomResourceDefinitionNames acceptedNames) {
        this.acceptedNames = acceptedNames;
        return this;
    }

    public CustomResourceDefinitionStatus conditions(final List<CustomResourceDefinitionCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public CustomResourceDefinitionStatus storedVersions(final List<String> storedVersions) {
        this.storedVersions = storedVersions;
        return this;
    }

    @Override
    public CustomResourceDefinitionStatus validate() {
        return this;
    }
}
