package io.yupiik.kubernetes.bindings.v1_20_14;

import java.util.Objects;

public class CustomResourceDefinitionSpecAdditionalPrinterColumns {
    private String JSONPath;
    private String description;
    private String format;
    private String name;
    private Integer priority;
    private String type;

    public CustomResourceDefinitionSpecAdditionalPrinterColumns() {
        // no-op
    }

    public CustomResourceDefinitionSpecAdditionalPrinterColumns(final String JSONPath,
                                                                final String description,
                                                                final String format,
                                                                final String name,
                                                                final Integer priority,
                                                                final String type) {
        // no-op
    }

    public String getJSONPath() {
        return JSONPath;
    }

    public void setJSONPath(final String JSONPath) {
        this.JSONPath = JSONPath;
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
                JSONPath,
                description,
                format,
                name,
                priority,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionSpecAdditionalPrinterColumns)) {
            return false;
        }
        final CustomResourceDefinitionSpecAdditionalPrinterColumns __otherCasted = (CustomResourceDefinitionSpecAdditionalPrinterColumns) __other;
        return Objects.equals(JSONPath, __otherCasted.JSONPath) &&
            Objects.equals(description, __otherCasted.description) &&
            Objects.equals(format, __otherCasted.format) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(priority, __otherCasted.priority) &&
            Objects.equals(type, __otherCasted.type);
    }
}
