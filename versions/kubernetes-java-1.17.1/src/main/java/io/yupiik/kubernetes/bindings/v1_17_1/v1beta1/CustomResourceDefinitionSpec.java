package io.yupiik.kubernetes.bindings.v1_17_1.v1beta1;

import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionSpec {
    private List<CustomResourceDefinitionSpecAdditionalPrinterColumns> additionalPrinterColumns;
    private CustomResourceDefinitionSpecConversion conversion;
    private String group;
    private CustomResourceDefinitionSpecNames names;
    private Boolean preserveUnknownFields;
    private String scope;
    private CustomResourceDefinitionSpecSubresources subresources;
    private CustomResourceDefinitionSpecValidation validation;
    private String version;
    private List<CustomResourceDefinitionSpecVersions> versions;

    public CustomResourceDefinitionSpec() {
        // no-op
    }

    public CustomResourceDefinitionSpec(final List<CustomResourceDefinitionSpecAdditionalPrinterColumns> additionalPrinterColumns,
                                        final CustomResourceDefinitionSpecConversion conversion,
                                        final String group,
                                        final CustomResourceDefinitionSpecNames names,
                                        final Boolean preserveUnknownFields,
                                        final String scope,
                                        final CustomResourceDefinitionSpecSubresources subresources,
                                        final CustomResourceDefinitionSpecValidation validation,
                                        final String version,
                                        final List<CustomResourceDefinitionSpecVersions> versions) {
        // no-op
    }

    public List<CustomResourceDefinitionSpecAdditionalPrinterColumns> getAdditionalPrinterColumns() {
        return additionalPrinterColumns;
    }

    public void setAdditionalPrinterColumns(final List<CustomResourceDefinitionSpecAdditionalPrinterColumns> additionalPrinterColumns) {
        this.additionalPrinterColumns = additionalPrinterColumns;
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

    public List<CustomResourceDefinitionSpecVersions> getVersions() {
        return versions;
    }

    public void setVersions(final List<CustomResourceDefinitionSpecVersions> versions) {
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
}
