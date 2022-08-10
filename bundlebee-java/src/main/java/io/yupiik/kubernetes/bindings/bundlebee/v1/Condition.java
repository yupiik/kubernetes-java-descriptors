package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;
import io.yupiik.kubernetes.bindings.bundlebee.JsonStrings;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import io.yupiik.kubernetes.bindings.bundlebee.ValidationException;
import jakarta.json.bind.annotation.JsonbProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Condition implements Validable<Condition>, Exportable {
    private String key;
    private Boolean negate;
    private ConditionType type;
    private String value;

    public Condition() {
        // no-op
    }

    public Condition(final String key,
                     final Boolean negate,
                     final ConditionType type,
                     final String value) {
        // no-op
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public Boolean getNegate() {
        return negate;
    }

    public void setNegate(final Boolean negate) {
        this.negate = negate;
    }

    public ConditionType getType() {
        return type;
    }

    public void setType(final ConditionType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                key,
                negate,
                type,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Condition)) {
            return false;
        }
        final Condition __otherCasted = (Condition) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(negate, __otherCasted.negate) &&
            Objects.equals(type, __otherCasted.type) &&
            Objects.equals(value, __otherCasted.value);
    }

    public Condition key(final String key) {
        this.key = key;
        return this;
    }

    public Condition negate(final Boolean negate) {
        this.negate = negate;
        return this;
    }

    public Condition type(final ConditionType type) {
        this.type = type;
        return this;
    }

    public Condition value(final String value) {
        this.value = value;
        return this;
    }

    @Override
    public Condition validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (key != null ? "\"key\":\"" +  JsonStrings.escapeJson(key) + "\"" : ""),
                    (negate != null ? "\"negate\":" + negate : ""),
                    (type != null ? "\"type\":" + type.asJson() : ""),
                    (value != null ? "\"value\":\"" +  JsonStrings.escapeJson(value) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
