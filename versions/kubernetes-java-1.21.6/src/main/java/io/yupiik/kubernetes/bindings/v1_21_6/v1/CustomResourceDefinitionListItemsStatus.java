package io.yupiik.kubernetes.bindings.v1_21_6.v1;

import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionListItemsStatus {
    private CustomResourceDefinitionListItemsStatusAcceptedNames acceptedNames;
    private List<CustomResourceDefinitionListItemsStatusConditions> conditions;
    private List<String> storedVersions;

    public CustomResourceDefinitionListItemsStatus() {
        // no-op
    }

    public CustomResourceDefinitionListItemsStatus(final CustomResourceDefinitionListItemsStatusAcceptedNames acceptedNames,
                                                   final List<CustomResourceDefinitionListItemsStatusConditions> conditions,
                                                   final List<String> storedVersions) {
        // no-op
    }

    public CustomResourceDefinitionListItemsStatusAcceptedNames getAcceptedNames() {
        return acceptedNames;
    }

    public void setAcceptedNames(final CustomResourceDefinitionListItemsStatusAcceptedNames acceptedNames) {
        this.acceptedNames = acceptedNames;
    }

    public List<CustomResourceDefinitionListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<CustomResourceDefinitionListItemsStatusConditions> conditions) {
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
        if (!(__other instanceof CustomResourceDefinitionListItemsStatus)) {
            return false;
        }
        final CustomResourceDefinitionListItemsStatus __otherCasted = (CustomResourceDefinitionListItemsStatus) __other;
        return Objects.equals(acceptedNames, __otherCasted.acceptedNames) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(storedVersions, __otherCasted.storedVersions);
    }
}
