package io.yupiik.kubernetes.bindings.v1_20_4.v1;

import io.yupiik.kubernetes.bindings.v1_20_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_4.Validable;
import io.yupiik.kubernetes.bindings.v1_20_4.ValidationException;
import jakarta.json.JsonObject;
import jakarta.json.bind.annotation.JsonbProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LimitRangeItem implements Validable<LimitRangeItem>, Exportable {
    private JsonObject defaultRequest;
    @JsonbProperty("default")
    private JsonObject defaultValue;
    private JsonObject max;
    private JsonObject maxLimitRequestRatio;
    private JsonObject min;
    private String type;

    public LimitRangeItem() {
        // no-op
    }

    public LimitRangeItem(final JsonObject defaultRequest,
                          final JsonObject defaultValue,
                          final JsonObject max,
                          final JsonObject maxLimitRequestRatio,
                          final JsonObject min,
                          final String type) {
        // no-op
    }

    public JsonObject getDefaultRequest() {
        return defaultRequest;
    }

    public void setDefaultRequest(final JsonObject defaultRequest) {
        this.defaultRequest = defaultRequest;
    }

    public JsonObject getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(final JsonObject defaultValue) {
        this.defaultValue = defaultValue;
    }

    public JsonObject getMax() {
        return max;
    }

    public void setMax(final JsonObject max) {
        this.max = max;
    }

    public JsonObject getMaxLimitRequestRatio() {
        return maxLimitRequestRatio;
    }

    public void setMaxLimitRequestRatio(final JsonObject maxLimitRequestRatio) {
        this.maxLimitRequestRatio = maxLimitRequestRatio;
    }

    public JsonObject getMin() {
        return min;
    }

    public void setMin(final JsonObject min) {
        this.min = min;
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
                defaultRequest,
                defaultValue,
                max,
                maxLimitRequestRatio,
                min,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LimitRangeItem)) {
            return false;
        }
        final LimitRangeItem __otherCasted = (LimitRangeItem) __other;
        return Objects.equals(defaultRequest, __otherCasted.defaultRequest) &&
            Objects.equals(defaultValue, __otherCasted.defaultValue) &&
            Objects.equals(max, __otherCasted.max) &&
            Objects.equals(maxLimitRequestRatio, __otherCasted.maxLimitRequestRatio) &&
            Objects.equals(min, __otherCasted.min) &&
            Objects.equals(type, __otherCasted.type);
    }

    public LimitRangeItem defaultRequest(final JsonObject defaultRequest) {
        this.defaultRequest = defaultRequest;
        return this;
    }

    public LimitRangeItem defaultValue(final JsonObject defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public LimitRangeItem max(final JsonObject max) {
        this.max = max;
        return this;
    }

    public LimitRangeItem maxLimitRequestRatio(final JsonObject maxLimitRequestRatio) {
        this.maxLimitRequestRatio = maxLimitRequestRatio;
        return this;
    }

    public LimitRangeItem min(final JsonObject min) {
        this.min = min;
        return this;
    }

    public LimitRangeItem type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public LimitRangeItem validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
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
                    (defaultRequest != null ? "\"defaultRequest\":" + defaultRequest : ""),
                    (defaultValue != null ? "\"default\":" + defaultValue : ""),
                    (max != null ? "\"max\":" + max : ""),
                    (maxLimitRequestRatio != null ? "\"maxLimitRequestRatio\":" + maxLimitRequestRatio : ""),
                    (min != null ? "\"min\":" + min : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
