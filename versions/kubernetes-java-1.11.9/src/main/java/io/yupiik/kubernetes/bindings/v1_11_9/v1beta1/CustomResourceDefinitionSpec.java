package io.yupiik.kubernetes.bindings.v1_11_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_11_9.Validable;
import io.yupiik.kubernetes.bindings.v1_11_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionSpec implements Validable<CustomResourceDefinitionSpec> {
    private List<CustomResourceColumnDefinition> additionalPrinterColumns;
    private String group;
    private CustomResourceDefinitionNames names;
    private String scope;
    private CustomResourceSubresources subresources;
    private CustomResourceValidation validation;
    private String version;
    private List<CustomResourceDefinitionVersion> versions;

    public CustomResourceDefinitionSpec() {
        // no-op
    }

    public CustomResourceDefinitionSpec(final List<CustomResourceColumnDefinition> additionalPrinterColumns,
                                        final String group,
                                        final CustomResourceDefinitionNames names,
                                        final String scope,
                                        final CustomResourceSubresources subresources,
                                        final CustomResourceValidation validation,
                                        final String version,
                                        final List<CustomResourceDefinitionVersion> versions) {
        // no-op
    }

    public List<CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
        return additionalPrinterColumns;
    }

    public void setAdditionalPrinterColumns(final List<CustomResourceColumnDefinition> additionalPrinterColumns) {
        this.additionalPrinterColumns = additionalPrinterColumns;
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

    public String getScope() {
        return scope;
    }

    public void setScope(final String scope) {
        this.scope = scope;
    }

    public CustomResourceSubresources getSubresources() {
        return subresources;
    }

    public void setSubresources(final CustomResourceSubresources subresources) {
        this.subresources = subresources;
    }

    public CustomResourceValidation getValidation() {
        return validation;
    }

    public void setValidation(final CustomResourceValidation validation) {
        this.validation = validation;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
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
                additionalPrinterColumns,
                group,
                names,
                scope,
                subresources,
                validation,
                version,
                versions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionSpec)) {
            return false;
        }
        final CustomResourceDefinitionSpec __otherCasted = (CustomResourceDefinitionSpec) __other;
        return Objects.equals(additionalPrinterColumns, __otherCasted.additionalPrinterColumns) &&
            Objects.equals(group, __otherCasted.group) &&
            Objects.equals(names, __otherCasted.names) &&
            Objects.equals(scope, __otherCasted.scope) &&
            Objects.equals(subresources, __otherCasted.subresources) &&
            Objects.equals(validation, __otherCasted.validation) &&
            Objects.equals(version, __otherCasted.version) &&
            Objects.equals(versions, __otherCasted.versions);
    }

    public CustomResourceDefinitionSpec additionalPrinterColumns(final List<CustomResourceColumnDefinition> additionalPrinterColumns) {
        this.additionalPrinterColumns = additionalPrinterColumns;
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

    public CustomResourceDefinitionSpec scope(final String scope) {
        this.scope = scope;
        return this;
    }

    public CustomResourceDefinitionSpec subresources(final CustomResourceSubresources subresources) {
        this.subresources = subresources;
        return this;
    }

    public CustomResourceDefinitionSpec validation(final CustomResourceValidation validation) {
        this.validation = validation;
        return this;
    }

    public CustomResourceDefinitionSpec version(final String version) {
        this.version = version;
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
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
