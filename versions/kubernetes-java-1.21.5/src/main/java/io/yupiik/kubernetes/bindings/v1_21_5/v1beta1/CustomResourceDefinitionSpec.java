package io.yupiik.kubernetes.bindings.v1_21_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_5.Validable;
import io.yupiik.kubernetes.bindings.v1_21_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CustomResourceDefinitionSpec implements Validable<CustomResourceDefinitionSpec>, Exportable {
    private List<CustomResourceColumnDefinition> additionalPrinterColumns;
    private CustomResourceConversion conversion;
    private String group;
    private CustomResourceDefinitionNames names;
    private Boolean preserveUnknownFields;
    private String scope;
    private CustomResourceSubresources subresources;
    private CustomResourceValidation validation;
    private String version;
    private List<CustomResourceDefinitionVersion> versions;

    public CustomResourceDefinitionSpec() {
        // no-op
    }

    public CustomResourceDefinitionSpec(final List<CustomResourceColumnDefinition> additionalPrinterColumns,
                                        final CustomResourceConversion conversion,
                                        final String group,
                                        final CustomResourceDefinitionNames names,
                                        final Boolean preserveUnknownFields,
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
                conversion,
                group,
                names,
                preserveUnknownFields,
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
            Objects.equals(conversion, __otherCasted.conversion) &&
            Objects.equals(group, __otherCasted.group) &&
            Objects.equals(names, __otherCasted.names) &&
            Objects.equals(preserveUnknownFields, __otherCasted.preserveUnknownFields) &&
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

    @Override
    public String asJson() {
        return Stream.of(
                    (additionalPrinterColumns != null ? "\"additionalPrinterColumns\":" + additionalPrinterColumns.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (conversion != null ? "\"conversion\":" + conversion.asJson() : ""),
                    (group != null ? "\"group\":\"" +  JsonStrings.escapeJson(group) + "\"" : ""),
                    (names != null ? "\"names\":" + names.asJson() : ""),
                    (preserveUnknownFields != null ? "\"preserveUnknownFields\":" + preserveUnknownFields : ""),
                    (scope != null ? "\"scope\":\"" +  JsonStrings.escapeJson(scope) + "\"" : ""),
                    (subresources != null ? "\"subresources\":" + subresources.asJson() : ""),
                    (validation != null ? "\"validation\":" + validation.asJson() : ""),
                    (version != null ? "\"version\":\"" +  JsonStrings.escapeJson(version) + "\"" : ""),
                    (versions != null ? "\"versions\":" + versions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
