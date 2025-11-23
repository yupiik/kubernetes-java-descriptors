package io.yupiik.kubernetes.bindings.v1_30_7.v1;

import io.yupiik.kubernetes.bindings.v1_30_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_7.Validable;
import io.yupiik.kubernetes.bindings.v1_30_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CustomResourceDefinitionVersion implements Validable<CustomResourceDefinitionVersion>, Exportable {
    private List<CustomResourceColumnDefinition> additionalPrinterColumns;
    private Boolean deprecated;
    private String deprecationWarning;
    private String name;
    private CustomResourceValidation schema;
    private List<SelectableField> selectableFields;
    private boolean served;
    private boolean storage;
    private CustomResourceSubresources subresources;

    public CustomResourceDefinitionVersion() {
        // no-op
    }

    public CustomResourceDefinitionVersion(final List<CustomResourceColumnDefinition> additionalPrinterColumns,
                                           final Boolean deprecated,
                                           final String deprecationWarning,
                                           final String name,
                                           final CustomResourceValidation schema,
                                           final List<SelectableField> selectableFields,
                                           final boolean served,
                                           final boolean storage,
                                           final CustomResourceSubresources subresources) {
        this.additionalPrinterColumns = additionalPrinterColumns;
        this.deprecated = deprecated;
        this.deprecationWarning = deprecationWarning;
        this.name = name;
        this.schema = schema;
        this.selectableFields = selectableFields;
        this.served = served;
        this.storage = storage;
        this.subresources = subresources;
    }

    public List<CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
        return additionalPrinterColumns;
    }

    public void setAdditionalPrinterColumns(final List<CustomResourceColumnDefinition> additionalPrinterColumns) {
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

    public CustomResourceValidation getSchema() {
        return schema;
    }

    public void setSchema(final CustomResourceValidation schema) {
        this.schema = schema;
    }

    public List<SelectableField> getSelectableFields() {
        return selectableFields;
    }

    public void setSelectableFields(final List<SelectableField> selectableFields) {
        this.selectableFields = selectableFields;
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

    public CustomResourceSubresources getSubresources() {
        return subresources;
    }

    public void setSubresources(final CustomResourceSubresources subresources) {
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
                selectableFields,
                served,
                storage,
                subresources);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionVersion)) {
            return false;
        }
        final CustomResourceDefinitionVersion __otherCasted = (CustomResourceDefinitionVersion) __other;
        return Objects.equals(additionalPrinterColumns, __otherCasted.additionalPrinterColumns) &&
            Objects.equals(deprecated, __otherCasted.deprecated) &&
            Objects.equals(deprecationWarning, __otherCasted.deprecationWarning) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(schema, __otherCasted.schema) &&
            Objects.equals(selectableFields, __otherCasted.selectableFields) &&
            Objects.equals(served, __otherCasted.served) &&
            Objects.equals(storage, __otherCasted.storage) &&
            Objects.equals(subresources, __otherCasted.subresources);
    }

    public CustomResourceDefinitionVersion additionalPrinterColumns(final List<CustomResourceColumnDefinition> additionalPrinterColumns) {
        this.additionalPrinterColumns = additionalPrinterColumns;
        return this;
    }

    public CustomResourceDefinitionVersion deprecated(final Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }

    public CustomResourceDefinitionVersion deprecationWarning(final String deprecationWarning) {
        this.deprecationWarning = deprecationWarning;
        return this;
    }

    public CustomResourceDefinitionVersion name(final String name) {
        this.name = name;
        return this;
    }

    public CustomResourceDefinitionVersion schema(final CustomResourceValidation schema) {
        this.schema = schema;
        return this;
    }

    public CustomResourceDefinitionVersion selectableFields(final List<SelectableField> selectableFields) {
        this.selectableFields = selectableFields;
        return this;
    }

    public CustomResourceDefinitionVersion served(final boolean served) {
        this.served = served;
        return this;
    }

    public CustomResourceDefinitionVersion storage(final boolean storage) {
        this.storage = storage;
        return this;
    }

    public CustomResourceDefinitionVersion subresources(final CustomResourceSubresources subresources) {
        this.subresources = subresources;
        return this;
    }

    @Override
    public CustomResourceDefinitionVersion validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
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
                    (deprecated != null ? "\"deprecated\":" + deprecated : ""),
                    (deprecationWarning != null ? "\"deprecationWarning\":\"" +  JsonStrings.escapeJson(deprecationWarning) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (schema != null ? "\"schema\":" + schema.asJson() : ""),
                    (selectableFields != null ? "\"selectableFields\":" + selectableFields.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    "\"served\":" + served,
                    "\"storage\":" + storage,
                    (subresources != null ? "\"subresources\":" + subresources.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
