package io.yupiik.kubernetes.bindings.v1_22_6;

import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionSpec {
    private CustomResourceDefinitionSpecConversion conversion;
    private String group;
    private CustomResourceDefinitionSpecNames names;
    private Boolean preserveUnknownFields;
    private String scope;
    private List<CustomResourceDefinitionSpecVersions> versions;

    public CustomResourceDefinitionSpec() {
        // no-op
    }

    public CustomResourceDefinitionSpec(final CustomResourceDefinitionSpecConversion conversion,
                                        final String group,
                                        final CustomResourceDefinitionSpecNames names,
                                        final Boolean preserveUnknownFields,
                                        final String scope,
                                        final List<CustomResourceDefinitionSpecVersions> versions) {
        // no-op
    }

    public CustomResourceDefinitionSpecConversion getConversion() {
        return conversion;
    }

    public void setConversion(final CustomResourceDefinitionSpecConversion conversion) {
        this.conversion = conversion;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public CustomResourceDefinitionSpecNames getNames() {
        return names;
    }

    public void setNames(final CustomResourceDefinitionSpecNames names) {
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

    public List<CustomResourceDefinitionSpecVersions> getVersions() {
        return versions;
    }

    public void setVersions(final List<CustomResourceDefinitionSpecVersions> versions) {
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
        if (!(__other instanceof CustomResourceDefinitionSpec)) {
            return false;
        }
        final CustomResourceDefinitionSpec __otherCasted = (CustomResourceDefinitionSpec) __other;
        return Objects.equals(conversion, __otherCasted.conversion) &&
            Objects.equals(group, __otherCasted.group) &&
            Objects.equals(names, __otherCasted.names) &&
            Objects.equals(preserveUnknownFields, __otherCasted.preserveUnknownFields) &&
            Objects.equals(scope, __otherCasted.scope) &&
            Objects.equals(versions, __otherCasted.versions);
    }
}
