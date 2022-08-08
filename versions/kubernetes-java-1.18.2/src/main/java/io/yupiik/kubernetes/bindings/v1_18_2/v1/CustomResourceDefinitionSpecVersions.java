package io.yupiik.kubernetes.bindings.v1_18_2.v1;

import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionSpecVersions {
    private List<CustomResourceDefinitionSpecVersionsAdditionalPrinterColumns> additionalPrinterColumns;
    private String name;
    private CustomResourceDefinitionSpecVersionsSchema schema;
    private boolean served;
    private boolean storage;
    private CustomResourceDefinitionSpecVersionsSubresources subresources;

    public CustomResourceDefinitionSpecVersions() {
        // no-op
    }

    public CustomResourceDefinitionSpecVersions(final List<CustomResourceDefinitionSpecVersionsAdditionalPrinterColumns> additionalPrinterColumns,
                                                final String name,
                                                final CustomResourceDefinitionSpecVersionsSchema schema,
                                                final boolean served,
                                                final boolean storage,
                                                final CustomResourceDefinitionSpecVersionsSubresources subresources) {
        // no-op
    }

    public List<CustomResourceDefinitionSpecVersionsAdditionalPrinterColumns> getAdditionalPrinterColumns() {
        return additionalPrinterColumns;
    }

    public void setAdditionalPrinterColumns(final List<CustomResourceDefinitionSpecVersionsAdditionalPrinterColumns> additionalPrinterColumns) {
        this.additionalPrinterColumns = additionalPrinterColumns;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public CustomResourceDefinitionSpecVersionsSchema getSchema() {
        return schema;
    }

    public void setSchema(final CustomResourceDefinitionSpecVersionsSchema schema) {
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

    public CustomResourceDefinitionSpecVersionsSubresources getSubresources() {
        return subresources;
    }

    public void setSubresources(final CustomResourceDefinitionSpecVersionsSubresources subresources) {
        this.subresources = subresources;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                additionalPrinterColumns,
                name,
                schema,
                served,
                storage,
                subresources);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionSpecVersions)) {
            return false;
        }
        final CustomResourceDefinitionSpecVersions __otherCasted = (CustomResourceDefinitionSpecVersions) __other;
        return Objects.equals(additionalPrinterColumns, __otherCasted.additionalPrinterColumns) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(schema, __otherCasted.schema) &&
            Objects.equals(served, __otherCasted.served) &&
            Objects.equals(storage, __otherCasted.storage) &&
            Objects.equals(subresources, __otherCasted.subresources);
    }
}
