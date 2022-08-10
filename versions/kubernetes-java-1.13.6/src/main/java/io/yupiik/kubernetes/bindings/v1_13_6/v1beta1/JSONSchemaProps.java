package io.yupiik.kubernetes.bindings.v1_13_6.v1beta1;

import io.yupiik.kubernetes.bindings.v1_13_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_13_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_13_6.Validable;
import io.yupiik.kubernetes.bindings.v1_13_6.ValidationException;
import jakarta.json.JsonObject;
import jakarta.json.JsonValue;
import jakarta.json.bind.annotation.JsonbProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class JSONSchemaProps implements Validable<JSONSchemaProps>, Exportable {
    private JsonValue additionalItems;
    private JsonValue additionalProperties;
    private List<JSONSchemaProps> allOf;
    private List<JSONSchemaProps> anyOf;
    @JsonbProperty("default")
    private JsonValue defaultValue;
    private JsonObject definitions;
    private JsonObject dependencies;
    private String description;
    @JsonbProperty("enum")
    private List<JsonValue> enumValue;
    private JsonValue example;
    private Boolean exclusiveMaximum;
    private Boolean exclusiveMinimum;
    private ExternalDocumentation externalDocs;
    private String format;
    private String id;
    private JsonValue items;
    private Integer maxItems;
    private Integer maxLength;
    private Integer maxProperties;
    private Double maximum;
    private Integer minItems;
    private Integer minLength;
    private Integer minProperties;
    private Double minimum;
    private Double multipleOf;
    private JSONSchemaProps not;
    private List<JSONSchemaProps> oneOf;
    private String pattern;
    private JsonObject patternProperties;
    private JsonObject properties;
    @JsonbProperty("$ref")
    private String ref;
    private List<String> required;
    @JsonbProperty("$schema")
    private String schema;
    private String title;
    private String type;
    private Boolean uniqueItems;

    public JSONSchemaProps() {
        // no-op
    }

    public JSONSchemaProps(final JsonValue additionalItems,
                           final JsonValue additionalProperties,
                           final List<JSONSchemaProps> allOf,
                           final List<JSONSchemaProps> anyOf,
                           final JsonValue defaultValue,
                           final JsonObject definitions,
                           final JsonObject dependencies,
                           final String description,
                           final List<JsonValue> enumValue,
                           final JsonValue example,
                           final Boolean exclusiveMaximum,
                           final Boolean exclusiveMinimum,
                           final ExternalDocumentation externalDocs,
                           final String format,
                           final String id,
                           final JsonValue items,
                           final Integer maxItems,
                           final Integer maxLength,
                           final Integer maxProperties,
                           final Double maximum,
                           final Integer minItems,
                           final Integer minLength,
                           final Integer minProperties,
                           final Double minimum,
                           final Double multipleOf,
                           final JSONSchemaProps not,
                           final List<JSONSchemaProps> oneOf,
                           final String pattern,
                           final JsonObject patternProperties,
                           final JsonObject properties,
                           final String ref,
                           final List<String> required,
                           final String schema,
                           final String title,
                           final String type,
                           final Boolean uniqueItems) {
        // no-op
    }

    public JsonValue getAdditionalItems() {
        return additionalItems;
    }

    public void setAdditionalItems(final JsonValue additionalItems) {
        this.additionalItems = additionalItems;
    }

    public JsonValue getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(final JsonValue additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public List<JSONSchemaProps> getAllOf() {
        return allOf;
    }

    public void setAllOf(final List<JSONSchemaProps> allOf) {
        this.allOf = allOf;
    }

    public List<JSONSchemaProps> getAnyOf() {
        return anyOf;
    }

    public void setAnyOf(final List<JSONSchemaProps> anyOf) {
        this.anyOf = anyOf;
    }

    public JsonValue getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(final JsonValue defaultValue) {
        this.defaultValue = defaultValue;
    }

    public JsonObject getDefinitions() {
        return definitions;
    }

    public void setDefinitions(final JsonObject definitions) {
        this.definitions = definitions;
    }

    public JsonObject getDependencies() {
        return dependencies;
    }

    public void setDependencies(final JsonObject dependencies) {
        this.dependencies = dependencies;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public List<JsonValue> getEnumValue() {
        return enumValue;
    }

    public void setEnumValue(final List<JsonValue> enumValue) {
        this.enumValue = enumValue;
    }

    public JsonValue getExample() {
        return example;
    }

    public void setExample(final JsonValue example) {
        this.example = example;
    }

    public Boolean getExclusiveMaximum() {
        return exclusiveMaximum;
    }

    public void setExclusiveMaximum(final Boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
    }

    public Boolean getExclusiveMinimum() {
        return exclusiveMinimum;
    }

    public void setExclusiveMinimum(final Boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
    }

    public ExternalDocumentation getExternalDocs() {
        return externalDocs;
    }

    public void setExternalDocs(final ExternalDocumentation externalDocs) {
        this.externalDocs = externalDocs;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(final String format) {
        this.format = format;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public JsonValue getItems() {
        return items;
    }

    public void setItems(final JsonValue items) {
        this.items = items;
    }

    public Integer getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(final Integer maxItems) {
        this.maxItems = maxItems;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(final Integer maxLength) {
        this.maxLength = maxLength;
    }

    public Integer getMaxProperties() {
        return maxProperties;
    }

    public void setMaxProperties(final Integer maxProperties) {
        this.maxProperties = maxProperties;
    }

    public Double getMaximum() {
        return maximum;
    }

    public void setMaximum(final Double maximum) {
        this.maximum = maximum;
    }

    public Integer getMinItems() {
        return minItems;
    }

    public void setMinItems(final Integer minItems) {
        this.minItems = minItems;
    }

    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(final Integer minLength) {
        this.minLength = minLength;
    }

    public Integer getMinProperties() {
        return minProperties;
    }

    public void setMinProperties(final Integer minProperties) {
        this.minProperties = minProperties;
    }

    public Double getMinimum() {
        return minimum;
    }

    public void setMinimum(final Double minimum) {
        this.minimum = minimum;
    }

    public Double getMultipleOf() {
        return multipleOf;
    }

    public void setMultipleOf(final Double multipleOf) {
        this.multipleOf = multipleOf;
    }

    public JSONSchemaProps getNot() {
        return not;
    }

    public void setNot(final JSONSchemaProps not) {
        this.not = not;
    }

    public List<JSONSchemaProps> getOneOf() {
        return oneOf;
    }

    public void setOneOf(final List<JSONSchemaProps> oneOf) {
        this.oneOf = oneOf;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(final String pattern) {
        this.pattern = pattern;
    }

    public JsonObject getPatternProperties() {
        return patternProperties;
    }

    public void setPatternProperties(final JsonObject patternProperties) {
        this.patternProperties = patternProperties;
    }

    public JsonObject getProperties() {
        return properties;
    }

    public void setProperties(final JsonObject properties) {
        this.properties = properties;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(final String ref) {
        this.ref = ref;
    }

    public List<String> getRequired() {
        return required;
    }

    public void setRequired(final List<String> required) {
        this.required = required;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(final String schema) {
        this.schema = schema;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public Boolean getUniqueItems() {
        return uniqueItems;
    }

    public void setUniqueItems(final Boolean uniqueItems) {
        this.uniqueItems = uniqueItems;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                additionalItems,
                additionalProperties,
                allOf,
                anyOf,
                defaultValue,
                definitions,
                dependencies,
                description,
                enumValue,
                example,
                exclusiveMaximum,
                exclusiveMinimum,
                externalDocs,
                format,
                id,
                items,
                maxItems,
                maxLength,
                maxProperties,
                maximum,
                minItems,
                minLength,
                minProperties,
                minimum,
                multipleOf,
                not,
                oneOf,
                pattern,
                patternProperties,
                properties,
                ref,
                required,
                schema,
                title,
                type,
                uniqueItems);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JSONSchemaProps)) {
            return false;
        }
        final JSONSchemaProps __otherCasted = (JSONSchemaProps) __other;
        return Objects.equals(additionalItems, __otherCasted.additionalItems) &&
            Objects.equals(additionalProperties, __otherCasted.additionalProperties) &&
            Objects.equals(allOf, __otherCasted.allOf) &&
            Objects.equals(anyOf, __otherCasted.anyOf) &&
            Objects.equals(defaultValue, __otherCasted.defaultValue) &&
            Objects.equals(definitions, __otherCasted.definitions) &&
            Objects.equals(dependencies, __otherCasted.dependencies) &&
            Objects.equals(description, __otherCasted.description) &&
            Objects.equals(enumValue, __otherCasted.enumValue) &&
            Objects.equals(example, __otherCasted.example) &&
            Objects.equals(exclusiveMaximum, __otherCasted.exclusiveMaximum) &&
            Objects.equals(exclusiveMinimum, __otherCasted.exclusiveMinimum) &&
            Objects.equals(externalDocs, __otherCasted.externalDocs) &&
            Objects.equals(format, __otherCasted.format) &&
            Objects.equals(id, __otherCasted.id) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(maxItems, __otherCasted.maxItems) &&
            Objects.equals(maxLength, __otherCasted.maxLength) &&
            Objects.equals(maxProperties, __otherCasted.maxProperties) &&
            Objects.equals(maximum, __otherCasted.maximum) &&
            Objects.equals(minItems, __otherCasted.minItems) &&
            Objects.equals(minLength, __otherCasted.minLength) &&
            Objects.equals(minProperties, __otherCasted.minProperties) &&
            Objects.equals(minimum, __otherCasted.minimum) &&
            Objects.equals(multipleOf, __otherCasted.multipleOf) &&
            Objects.equals(not, __otherCasted.not) &&
            Objects.equals(oneOf, __otherCasted.oneOf) &&
            Objects.equals(pattern, __otherCasted.pattern) &&
            Objects.equals(patternProperties, __otherCasted.patternProperties) &&
            Objects.equals(properties, __otherCasted.properties) &&
            Objects.equals(ref, __otherCasted.ref) &&
            Objects.equals(required, __otherCasted.required) &&
            Objects.equals(schema, __otherCasted.schema) &&
            Objects.equals(title, __otherCasted.title) &&
            Objects.equals(type, __otherCasted.type) &&
            Objects.equals(uniqueItems, __otherCasted.uniqueItems);
    }

    public JSONSchemaProps additionalItems(final JsonValue additionalItems) {
        this.additionalItems = additionalItems;
        return this;
    }

    public JSONSchemaProps additionalProperties(final JsonValue additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    public JSONSchemaProps allOf(final List<JSONSchemaProps> allOf) {
        this.allOf = allOf;
        return this;
    }

    public JSONSchemaProps anyOf(final List<JSONSchemaProps> anyOf) {
        this.anyOf = anyOf;
        return this;
    }

    public JSONSchemaProps defaultValue(final JsonValue defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public JSONSchemaProps definitions(final JsonObject definitions) {
        this.definitions = definitions;
        return this;
    }

    public JSONSchemaProps dependencies(final JsonObject dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    public JSONSchemaProps description(final String description) {
        this.description = description;
        return this;
    }

    public JSONSchemaProps enumValue(final List<JsonValue> enumValue) {
        this.enumValue = enumValue;
        return this;
    }

    public JSONSchemaProps example(final JsonValue example) {
        this.example = example;
        return this;
    }

    public JSONSchemaProps exclusiveMaximum(final Boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
        return this;
    }

    public JSONSchemaProps exclusiveMinimum(final Boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
        return this;
    }

    public JSONSchemaProps externalDocs(final ExternalDocumentation externalDocs) {
        this.externalDocs = externalDocs;
        return this;
    }

    public JSONSchemaProps format(final String format) {
        this.format = format;
        return this;
    }

    public JSONSchemaProps id(final String id) {
        this.id = id;
        return this;
    }

    public JSONSchemaProps items(final JsonValue items) {
        this.items = items;
        return this;
    }

    public JSONSchemaProps maxItems(final Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    public JSONSchemaProps maxLength(final Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    public JSONSchemaProps maxProperties(final Integer maxProperties) {
        this.maxProperties = maxProperties;
        return this;
    }

    public JSONSchemaProps maximum(final Double maximum) {
        this.maximum = maximum;
        return this;
    }

    public JSONSchemaProps minItems(final Integer minItems) {
        this.minItems = minItems;
        return this;
    }

    public JSONSchemaProps minLength(final Integer minLength) {
        this.minLength = minLength;
        return this;
    }

    public JSONSchemaProps minProperties(final Integer minProperties) {
        this.minProperties = minProperties;
        return this;
    }

    public JSONSchemaProps minimum(final Double minimum) {
        this.minimum = minimum;
        return this;
    }

    public JSONSchemaProps multipleOf(final Double multipleOf) {
        this.multipleOf = multipleOf;
        return this;
    }

    public JSONSchemaProps not(final JSONSchemaProps not) {
        this.not = not;
        return this;
    }

    public JSONSchemaProps oneOf(final List<JSONSchemaProps> oneOf) {
        this.oneOf = oneOf;
        return this;
    }

    public JSONSchemaProps pattern(final String pattern) {
        this.pattern = pattern;
        return this;
    }

    public JSONSchemaProps patternProperties(final JsonObject patternProperties) {
        this.patternProperties = patternProperties;
        return this;
    }

    public JSONSchemaProps properties(final JsonObject properties) {
        this.properties = properties;
        return this;
    }

    public JSONSchemaProps ref(final String ref) {
        this.ref = ref;
        return this;
    }

    public JSONSchemaProps required(final List<String> required) {
        this.required = required;
        return this;
    }

    public JSONSchemaProps schema(final String schema) {
        this.schema = schema;
        return this;
    }

    public JSONSchemaProps title(final String title) {
        this.title = title;
        return this;
    }

    public JSONSchemaProps type(final String type) {
        this.type = type;
        return this;
    }

    public JSONSchemaProps uniqueItems(final Boolean uniqueItems) {
        this.uniqueItems = uniqueItems;
        return this;
    }

    @Override
    public JSONSchemaProps validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (additionalItems != null ? "\"additionalItems\":" + additionalItems : ""),
                    (additionalProperties != null ? "\"additionalProperties\":" + additionalProperties : ""),
                    (allOf != null ? "\"allOf\":" + allOf.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (anyOf != null ? "\"anyOf\":" + anyOf.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (defaultValue != null ? "\"default\":" + defaultValue : ""),
                    (definitions != null ? "\"definitions\":" + definitions : ""),
                    (dependencies != null ? "\"dependencies\":" + dependencies : ""),
                    (description != null ? "\"description\":\"" +  JsonStrings.escapeJson(description) + "\"" : ""),
                    (enumValue != null ? "\"enum\":" + enumValue.stream().map(__it -> __it == null ? "null" : String.valueOf(__it)).collect(joining(",", "[", "]")) : ""),
                    (example != null ? "\"example\":" + example : ""),
                    (exclusiveMaximum != null ? "\"exclusiveMaximum\":" + exclusiveMaximum : ""),
                    (exclusiveMinimum != null ? "\"exclusiveMinimum\":" + exclusiveMinimum : ""),
                    (externalDocs != null ? "\"externalDocs\":" + externalDocs.asJson() : ""),
                    (format != null ? "\"format\":\"" +  JsonStrings.escapeJson(format) + "\"" : ""),
                    (id != null ? "\"id\":\"" +  JsonStrings.escapeJson(id) + "\"" : ""),
                    (items != null ? "\"items\":" + items : ""),
                    (maxItems != null ? "\"maxItems\":" + maxItems : ""),
                    (maxLength != null ? "\"maxLength\":" + maxLength : ""),
                    (maxProperties != null ? "\"maxProperties\":" + maxProperties : ""),
                    (maximum != null ? "\"maximum\":" + maximum : ""),
                    (minItems != null ? "\"minItems\":" + minItems : ""),
                    (minLength != null ? "\"minLength\":" + minLength : ""),
                    (minProperties != null ? "\"minProperties\":" + minProperties : ""),
                    (minimum != null ? "\"minimum\":" + minimum : ""),
                    (multipleOf != null ? "\"multipleOf\":" + multipleOf : ""),
                    (not != null ? "\"not\":" + not.asJson() : ""),
                    (oneOf != null ? "\"oneOf\":" + oneOf.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (pattern != null ? "\"pattern\":\"" +  JsonStrings.escapeJson(pattern) + "\"" : ""),
                    (patternProperties != null ? "\"patternProperties\":" + patternProperties : ""),
                    (properties != null ? "\"properties\":" + properties : ""),
                    (ref != null ? "\"$ref\":\"" +  JsonStrings.escapeJson(ref) + "\"" : ""),
                    (required != null ? "\"required\":" + required.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (schema != null ? "\"$schema\":\"" +  JsonStrings.escapeJson(schema) + "\"" : ""),
                    (title != null ? "\"title\":\"" +  JsonStrings.escapeJson(title) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""),
                    (uniqueItems != null ? "\"uniqueItems\":" + uniqueItems : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}