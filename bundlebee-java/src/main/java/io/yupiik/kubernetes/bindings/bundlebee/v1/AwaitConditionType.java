package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;

import jakarta.json.bind.annotation.JsonbProperty;

public enum AwaitConditionType implements Exportable {
    @JsonbProperty("STATUS_CONDITION")
    STATUSCONDITION("STATUS_CONDITION"),
    @JsonbProperty("JSON_POINTER")
    JSONPOINTER("JSON_POINTER");

    private String value;

    AwaitConditionType(final String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    @Override
    public String asJson() {
        return "\"" + toString() + "\"";
    }
}
