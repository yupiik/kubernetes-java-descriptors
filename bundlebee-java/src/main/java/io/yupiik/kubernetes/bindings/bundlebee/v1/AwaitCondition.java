package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;
import io.yupiik.kubernetes.bindings.bundlebee.JsonStrings;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import jakarta.json.bind.annotation.JsonbProperty;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AwaitCondition implements Validable<AwaitCondition>, Exportable {
    private String conditionType;
    private JsonPointerOperator operatorType;
    private String pointer;
    private AwaitConditionType type;
    private String value;

    public AwaitCondition() {
        // no-op
    }

    public AwaitCondition(final String conditionType,
                          final JsonPointerOperator operatorType,
                          final String pointer,
                          final AwaitConditionType type,
                          final String value) {
        this.conditionType = conditionType;
        this.operatorType = operatorType;
        this.pointer = pointer;
        this.type = type;
        this.value = value;
    }

    public String getConditionType() {
        return conditionType;
    }

    public void setConditionType(final String conditionType) {
        this.conditionType = conditionType;
    }

    public JsonPointerOperator getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(final JsonPointerOperator operatorType) {
        this.operatorType = operatorType;
    }

    public String getPointer() {
        return pointer;
    }

    public void setPointer(final String pointer) {
        this.pointer = pointer;
    }

    public AwaitConditionType getType() {
        return type;
    }

    public void setType(final AwaitConditionType type) {
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
                conditionType,
                operatorType,
                pointer,
                type,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AwaitCondition)) {
            return false;
        }
        final AwaitCondition __otherCasted = (AwaitCondition) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType) &&
            Objects.equals(operatorType, __otherCasted.operatorType) &&
            Objects.equals(pointer, __otherCasted.pointer) &&
            Objects.equals(type, __otherCasted.type) &&
            Objects.equals(value, __otherCasted.value);
    }

    public AwaitCondition conditionType(final String conditionType) {
        this.conditionType = conditionType;
        return this;
    }

    public AwaitCondition operatorType(final JsonPointerOperator operatorType) {
        this.operatorType = operatorType;
        return this;
    }

    public AwaitCondition pointer(final String pointer) {
        this.pointer = pointer;
        return this;
    }

    public AwaitCondition type(final AwaitConditionType type) {
        this.type = type;
        return this;
    }

    public AwaitCondition value(final String value) {
        this.value = value;
        return this;
    }

    @Override
    public AwaitCondition validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (conditionType != null ? "\"conditionType\":\"" +  JsonStrings.escapeJson(conditionType) + "\"" : ""),
                    (operatorType != null ? "\"operatorType\":" + operatorType.asJson() : ""),
                    (pointer != null ? "\"pointer\":\"" +  JsonStrings.escapeJson(pointer) + "\"" : ""),
                    (type != null ? "\"type\":" + type.asJson() : ""),
                    (value != null ? "\"value\":\"" +  JsonStrings.escapeJson(value) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
