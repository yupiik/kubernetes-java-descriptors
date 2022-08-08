package io.yupiik.kubernetes.bindings.v1_17_16;

import jakarta.json.bind.annotation.JsonbProperty;
import java.util.Map;
import java.util.Objects;

public class LimitRangeListItemsSpecLimits {
    private Map<String, String> defaultRequest;
    @JsonbProperty("default")
    private Map<String, String> defaultValue;
    private Map<String, String> max;
    private Map<String, String> maxLimitRequestRatio;
    private Map<String, String> min;
    private String type;

    public LimitRangeListItemsSpecLimits() {
        // no-op
    }

    public LimitRangeListItemsSpecLimits(final Map<String, String> defaultRequest,
                                         final Map<String, String> defaultValue,
                                         final Map<String, String> max,
                                         final Map<String, String> maxLimitRequestRatio,
                                         final Map<String, String> min,
                                         final String type) {
        // no-op
    }

    public Map<String, String> getDefaultRequest() {
        return defaultRequest;
    }

    public void setDefaultRequest(final Map<String, String> defaultRequest) {
        this.defaultRequest = defaultRequest;
    }

    public Map<String, String> getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(final Map<String, String> defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Map<String, String> getMax() {
        return max;
    }

    public void setMax(final Map<String, String> max) {
        this.max = max;
    }

    public Map<String, String> getMaxLimitRequestRatio() {
        return maxLimitRequestRatio;
    }

    public void setMaxLimitRequestRatio(final Map<String, String> maxLimitRequestRatio) {
        this.maxLimitRequestRatio = maxLimitRequestRatio;
    }

    public Map<String, String> getMin() {
        return min;
    }

    public void setMin(final Map<String, String> min) {
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
        if (!(__other instanceof LimitRangeListItemsSpecLimits)) {
            return false;
        }
        final LimitRangeListItemsSpecLimits __otherCasted = (LimitRangeListItemsSpecLimits) __other;
        return Objects.equals(defaultRequest, __otherCasted.defaultRequest) &&
            Objects.equals(defaultValue, __otherCasted.defaultValue) &&
            Objects.equals(max, __otherCasted.max) &&
            Objects.equals(maxLimitRequestRatio, __otherCasted.maxLimitRequestRatio) &&
            Objects.equals(min, __otherCasted.min) &&
            Objects.equals(type, __otherCasted.type);
    }
}
