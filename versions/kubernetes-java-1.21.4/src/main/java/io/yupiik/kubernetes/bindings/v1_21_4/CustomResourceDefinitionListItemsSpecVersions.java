package io.yupiik.kubernetes.bindings.v1_21_4;

import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionListItemsSpecVersions {
    private List<CustomResourceDefinitionListItemsSpecVersionsAdditionalPrinterColumns> additionalPrinterColumns;
    private Boolean deprecated;
    private String deprecationWarning;
    private String name;
    private CustomResourceDefinitionListItemsSpecVersionsSchema schema;
    private boolean served;
    private boolean storage;
    private CustomResourceDefinitionListItemsSpecVersionsSubresources subresources;

    public CustomResourceDefinitionListItemsSpecVersions() {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpecVersions(final List<CustomResourceDefinitionListItemsSpecVersionsAdditionalPrinterColumns> additionalPrinterColumns,
                                                         final Boolean deprecated,
                                                         final String deprecationWarning,
                                                         final String name,
                                                         final CustomResourceDefinitionListItemsSpecVersionsSchema schema,
                                                         final boolean served,
                                                         final boolean storage,
                                                         final CustomResourceDefinitionListItemsSpecVersionsSubresources subresources) {
        // no-op
    }

    public List<CustomResourceDefinitionListItemsSpecVersionsAdditionalPrinterColumns> getAdditionalPrinterColumns() {
        return additionalPrinterColumns;
    }

    public void setAdditionalPrinterColumns(final List<CustomResourceDefinitionListItemsSpecVersionsAdditionalPrinterColumns> additionalPrinterColumns) {
        this.additionalPrinterColumns = additionalPrinterColumns;
    }

    public Boolean getDeprecated() {
        return deprecated;
    }

    public void setDeprecated(final Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public String getDeprecationWarning() {
        return deprecationWarning;
    }

    public void setDeprecationWarning(final String deprecationWarning) {
        this.deprecationWarning = deprecationWarning;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public CustomResourceDefinitionListItemsSpecVersionsSchema getSchema() {
        return schema;
    }

    public void setSchema(final CustomResourceDefinitionListItemsSpecVersionsSchema schema) {
        this.schema = schema;
    }

    public boolean getServed() {
        return served;
    }

    public void setServed(final boolean served) {
        this.served = served;
    }

    public boolean getStorage() {
        return storage;
    }

    public void setStorage(final boolean storage) {
        this.storage = storage;
    }

    public CustomResourceDefinitionListItemsSpecVersionsSubresources getSubresources() {
        return subresources;
    }

    public void setSubresources(final CustomResourceDefinitionListItemsSpecVersionsSubresources subresources) {
        this.subresources = subresources;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                additionalPrinterColumns,
                deprecated,
                deprecationWarning,
                name,
                schema,
                served,
                storage,
                subresources);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionListItemsSpecVersions)) {
            return false;
        }
        final CustomResourceDefinitionListItemsSpecVersions __otherCasted = (CustomResourceDefinitionListItemsSpecVersions) __other;
        return Objects.equals(additionalPrinterColumns, __otherCasted.additionalPrinterColumns) &&
            Objects.equals(deprecated, __otherCasted.deprecated) &&
            Objects.equals(deprecationWarning, __otherCasted.deprecationWarning) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(schema, __otherCasted.schema) &&
            Objects.equals(served, __otherCasted.served) &&
            Objects.equals(storage, __otherCasted.storage) &&
            Objects.equals(subresources, __otherCasted.subresources);
    }
}
