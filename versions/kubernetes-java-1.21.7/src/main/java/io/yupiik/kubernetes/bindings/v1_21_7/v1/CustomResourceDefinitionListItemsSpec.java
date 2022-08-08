package io.yupiik.kubernetes.bindings.v1_21_7.v1;

import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionListItemsSpec {
    private CustomResourceDefinitionListItemsSpecConversion conversion;
    private String group;
    private CustomResourceDefinitionListItemsSpecNames names;
    private Boolean preserveUnknownFields;
    private String scope;
    private List<CustomResourceDefinitionListItemsSpecVersions> versions;

    public CustomResourceDefinitionListItemsSpec() {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpec(final CustomResourceDefinitionListItemsSpecConversion conversion,
                                                 final String group,
                                                 final CustomResourceDefinitionListItemsSpecNames names,
                                                 final Boolean preserveUnknownFields,
                                                 final String scope,
                                                 final List<CustomResourceDefinitionListItemsSpecVersions> versions) {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpecConversion getConversion() {
        return conversion;
    }

    public void setConversion(final CustomResourceDefinitionListItemsSpecConversion conversion) {
        this.conversion = conversion;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public CustomResourceDefinitionListItemsSpecNames getNames() {
        return names;
    }

    public void setNames(final CustomResourceDefinitionListItemsSpecNames names) {
        this.names = names;
    }

    public Boolean getPreserveUnknownFields() {
        return preserveUnknownFields;
    }

    public void setPreserveUnknownFields(final Boolean preserveUnknownFields) {
        this.preserveUnknownFields = preserveUnknownFields;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(final String scope) {
        this.scope = scope;
    }

    public List<CustomResourceDefinitionListItemsSpecVersions> getVersions() {
        return versions;
    }

    public void setVersions(final List<CustomResourceDefinitionListItemsSpecVersions> versions) {
        this.versions = versions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conversion,
                group,
                names,
                preserveUnknownFields,
                scope,
                versions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionListItemsSpec)) {
            return false;
        }
        final CustomResourceDefinitionListItemsSpec __otherCasted = (CustomResourceDefinitionListItemsSpec) __other;
        return Objects.equals(conversion, __otherCasted.conversion) &&
            Objects.equals(group, __otherCasted.group) &&
            Objects.equals(names, __otherCasted.names) &&
            Objects.equals(preserveUnknownFields, __otherCasted.preserveUnknownFields) &&
            Objects.equals(scope, __otherCasted.scope) &&
            Objects.equals(versions, __otherCasted.versions);
    }
}
