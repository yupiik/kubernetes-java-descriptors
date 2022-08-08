package io.yupiik.kubernetes.bindings.v1_21_3.v1beta1;

import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionStatus {
    private CustomResourceDefinitionStatusAcceptedNames acceptedNames;
    private List<CustomResourceDefinitionStatusConditions> conditions;
    private List<String> storedVersions;

    public CustomResourceDefinitionStatus() {
        // no-op
    }

    public CustomResourceDefinitionStatus(final CustomResourceDefinitionStatusAcceptedNames acceptedNames,
                                          final List<CustomResourceDefinitionStatusConditions> conditions,
                                          final List<String> storedVersions) {
        // no-op
    }

    public CustomResourceDefinitionStatusAcceptedNames getAcceptedNames() {
        return acceptedNames;
    }

    public void setAcceptedNames(final CustomResourceDefinitionStatusAcceptedNames acceptedNames) {
        this.acceptedNames = acceptedNames;
    }

    public List<CustomResourceDefinitionStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<CustomResourceDefinitionStatusConditions> conditions) {
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
}
