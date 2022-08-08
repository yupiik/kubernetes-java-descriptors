package io.yupiik.kubernetes.bindings.v1_21_1.v1;

import java.util.Objects;

public class CustomResourceDefinitionListItemsSpecVersionsAdditionalPrinterColumns {
    private String description;
    private String format;
    private String jsonPath;
    private String name;
    private Integer priority;
    private String type;

    public CustomResourceDefinitionListItemsSpecVersionsAdditionalPrinterColumns() {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpecVersionsAdditionalPrinterColumns(final String description,
                                                                                 final String format,
                                                                                 final String jsonPath,
                                                                                 final String name,
                                                                                 final Integer priority,
                                                                                 final String type) {
        // no-op
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(final String format) {
        this.format = format;
    }

    public String getJsonPath() {
        return jsonPath;
    }

    public void setJsonPath(final String jsonPath) {
        this.jsonPath = jsonPath;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(final Integer priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                description,
                format,
                jsonPath,
                name,
                priority,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionListItemsSpecVersionsAdditionalPrinterColumns)) {
            return false;
        }
        final CustomResourceDefinitionListItemsSpecVersionsAdditionalPrinterColumns __otherCasted = (CustomResourceDefinitionListItemsSpecVersionsAdditionalPrinterColumns) __other;
        return Objects.equals(description, __otherCasted.description) &&
            Objects.equals(format, __otherCasted.format) &&
            Objects.equals(jsonPath, __otherCasted.jsonPath) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(priority, __otherCasted.priority) &&
            Objects.equals(type, __otherCasted.type);
    }
}
