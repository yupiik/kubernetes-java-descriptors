package io.yupiik.kubernetes.bindings.v1_16_8.v1beta1;

import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionListItemsSpec {
    private List<CustomResourceDefinitionListItemsSpecAdditionalPrinterColumns> additionalPrinterColumns;
    private CustomResourceDefinitionListItemsSpecConversion conversion;
    private String group;
    private CustomResourceDefinitionListItemsSpecNames names;
    private Boolean preserveUnknownFields;
    private String scope;
    private CustomResourceDefinitionListItemsSpecSubresources subresources;
    private CustomResourceDefinitionListItemsSpecValidation validation;
    private String version;
    private List<CustomResourceDefinitionListItemsSpecVersions> versions;

    public CustomResourceDefinitionListItemsSpec() {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpec(final List<CustomResourceDefinitionListItemsSpecAdditionalPrinterColumns> additionalPrinterColumns,
                                                 final CustomResourceDefinitionListItemsSpecConversion conversion,
                                                 final String group,
                                                 final CustomResourceDefinitionListItemsSpecNames names,
                                                 final Boolean preserveUnknownFields,
                                                 final String scope,
                                                 final CustomResourceDefinitionListItemsSpecSubresources subresources,
                                                 final CustomResourceDefinitionListItemsSpecValidation validation,
                                                 final String version,
                                                 final List<CustomResourceDefinitionListItemsSpecVersions> versions) {
        // no-op
    }

    public List<CustomResourceDefinitionListItemsSpecAdditionalPrinterColumns> getAdditionalPrinterColumns() {
        return additionalPrinterColumns;
    }

    public void setAdditionalPrinterColumns(final List<CustomResourceDefinitionListItemsSpecAdditionalPrinterColumns> additionalPrinterColumns) {
        this.additionalPrinterColumns = additionalPrinterColumns;
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

    public CustomResourceDefinitionListItemsSpecSubresources getSubresources() {
        return subresources;
    }

    public void setSubresources(final CustomResourceDefinitionListItemsSpecSubresources subresources) {
        this.subresources = subresources;
    }

    public CustomResourceDefinitionListItemsSpecValidation getValidation() {
        return validation;
    }

    public void setValidation(final CustomResourceDefinitionListItemsSpecValidation validation) {
        this.validation = validation;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
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
        if (!(__other instanceof CustomResourceDefinitionListItemsSpec)) {
            return false;
        }
        final CustomResourceDefinitionListItemsSpec __otherCasted = (CustomResourceDefinitionListItemsSpec) __other;
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
