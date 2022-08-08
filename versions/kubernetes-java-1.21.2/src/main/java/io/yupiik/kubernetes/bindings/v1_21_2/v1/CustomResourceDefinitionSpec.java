package io.yupiik.kubernetes.bindings.v1_21_2.v1;

import io.yupiik.kubernetes.bindings.v1_21_2.Validable;
import io.yupiik.kubernetes.bindings.v1_21_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionSpec implements Validable<CustomResourceDefinitionSpec> {
    private CustomResourceConversion conversion;
    private String group;
    private CustomResourceDefinitionNames names;
    private Boolean preserveUnknownFields;
    private String scope;
    private List<CustomResourceDefinitionVersion> versions;

    public CustomResourceDefinitionSpec() {
        // no-op
    }

    public CustomResourceDefinitionSpec(final CustomResourceConversion conversion,
                                        final String group,
                                        final CustomResourceDefinitionNames names,
                                        final Boolean preserveUnknownFields,
                                        final String scope,
                                        final List<CustomResourceDefinitionVersion> versions) {
        // no-op
    }

    public CustomResourceConversion getConversion() {
        return conversion;
    }

    public void setConversion(final CustomResourceConversion conversion) {
        this.conversion = conversion;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public CustomResourceDefinitionNames getNames() {
        return names;
    }

    public void setNames(final CustomResourceDefinitionNames names) {
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

    public List<CustomResourceDefinitionVersion> getVersions() {
        return versions;
    }

    public void setVersions(final List<CustomResourceDefinitionVersion> versions) {
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

    public CustomResourceDefinitionSpec conversion(final CustomResourceConversion conversion) {
        this.conversion = conversion;
        return this;
    }

    public CustomResourceDefinitionSpec group(final String group) {
        this.group = group;
        return this;
    }

    public CustomResourceDefinitionSpec names(final CustomResourceDefinitionNames names) {
        this.names = names;
        return this;
    }

    public CustomResourceDefinitionSpec preserveUnknownFields(final Boolean preserveUnknownFields) {
        this.preserveUnknownFields = preserveUnknownFields;
        return this;
    }

    public CustomResourceDefinitionSpec scope(final String scope) {
        this.scope = scope;
        return this;
    }

    public CustomResourceDefinitionSpec versions(final List<CustomResourceDefinitionVersion> versions) {
        this.versions = versions;
        return this;
    }

    @Override
    public CustomResourceDefinitionSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (group == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "group", "group",
                "Missing 'group' attribute.", true));
        }
        if (names == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "names", "names",
                "Missing 'names' attribute.", true));
        }
        if (scope == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "scope", "scope",
                "Missing 'scope' attribute.", true));
        }
        if (versions == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "versions", "versions",
                "Missing 'versions' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}