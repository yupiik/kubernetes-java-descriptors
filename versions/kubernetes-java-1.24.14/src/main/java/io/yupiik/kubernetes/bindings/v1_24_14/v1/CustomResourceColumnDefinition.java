package io.yupiik.kubernetes.bindings.v1_24_14.v1;

import io.yupiik.kubernetes.bindings.v1_24_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_14.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_14.Validable;
import io.yupiik.kubernetes.bindings.v1_24_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CustomResourceColumnDefinition implements Validable<CustomResourceColumnDefinition>, Exportable {
    private String description;
    private String format;
    private String jsonPath;
    private String name;
    private Integer priority;
    private String type;

    public CustomResourceColumnDefinition() {
        // no-op
    }

    public CustomResourceColumnDefinition(final String description,
                                          final String format,
                                          final String jsonPath,
                                          final String name,
                                          final Integer priority,
                                          final String type) {
        this.description = description;
        this.format = format;
        this.jsonPath = jsonPath;
        this.name = name;
        this.priority = priority;
        this.type = type;
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
        if (!(__other instanceof CustomResourceColumnDefinition)) {
            return false;
        }
        final CustomResourceColumnDefinition __otherCasted = (CustomResourceColumnDefinition) __other;
        return Objects.equals(description, __otherCasted.description) &&
            Objects.equals(format, __otherCasted.format) &&
            Objects.equals(jsonPath, __otherCasted.jsonPath) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(priority, __otherCasted.priority) &&
            Objects.equals(type, __otherCasted.type);
    }

    public CustomResourceColumnDefinition description(final String description) {
        this.description = description;
        return this;
    }

    public CustomResourceColumnDefinition format(final String format) {
        this.format = format;
        return this;
    }

    public CustomResourceColumnDefinition jsonPath(final String jsonPath) {
        this.jsonPath = jsonPath;
        return this;
    }

    public CustomResourceColumnDefinition name(final String name) {
        this.name = name;
        return this;
    }

    public CustomResourceColumnDefinition priority(final Integer priority) {
        this.priority = priority;
        return this;
    }

    public CustomResourceColumnDefinition type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public CustomResourceColumnDefinition validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (jsonPath == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "jsonPath", "jsonPath",
                "Missing 'jsonPath' attribute.", true));
        }
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (description != null ? "\"description\":\"" +  JsonStrings.escapeJson(description) + "\"" : ""),
                    (format != null ? "\"format\":\"" +  JsonStrings.escapeJson(format) + "\"" : ""),
                    (jsonPath != null ? "\"jsonPath\":\"" +  JsonStrings.escapeJson(jsonPath) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (priority != null ? "\"priority\":" + priority : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
