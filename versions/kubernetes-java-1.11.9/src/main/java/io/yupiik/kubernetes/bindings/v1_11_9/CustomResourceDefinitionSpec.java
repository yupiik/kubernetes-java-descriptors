package io.yupiik.kubernetes.bindings.v1_11_9;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionSpec {
    private List<JsonValue> additionalPrinterColumns;
    private String group;
    private CustomResourceDefinitionSpecNames names;
    private String scope;
    private CustomResourceDefinitionSpecSubresources subresources;
    private CustomResourceDefinitionSpecValidation validation;
    private String version;
    private List<JsonValue> versions;

    public CustomResourceDefinitionSpec() {
        // no-op
    }

    public CustomResourceDefinitionSpec(final List<JsonValue> additionalPrinterColumns,
                                        final String group,
                                        final CustomResourceDefinitionSpecNames names,
                                        final String scope,
                                        final CustomResourceDefinitionSpecSubresources subresources,
                                        final CustomResourceDefinitionSpecValidation validation,
                                        final String version,
                                        final List<JsonValue> versions) {
        // no-op
    }

    public List<JsonValue> getAdditionalPrinterColumns() {
        return additionalPrinterColumns;
    }

    public void setAdditionalPrinterColumns(final List<JsonValue> additionalPrinterColumns) {
        this.additionalPrinterColumns = additionalPrinterColumns;
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

    public String getScope() {
        return scope;
    }

    public void setScope(final String scope) {
        this.scope = scope;
    }

    public CustomResourceDefinitionSpecSubresources getSubresources() {
        return subresources;
    }

    public void setSubresources(final CustomResourceDefinitionSpecSubresources subresources) {
        this.subresources = subresources;
    }

    public CustomResourceDefinitionSpecValidation getValidation() {
        return validation;
    }

    public void setValidation(final CustomResourceDefinitionSpecValidation validation) {
        this.validation = validation;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public List<JsonValue> getVersions() {
        return versions;
    }

    public void setVersions(final List<JsonValue> versions) {
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
}
