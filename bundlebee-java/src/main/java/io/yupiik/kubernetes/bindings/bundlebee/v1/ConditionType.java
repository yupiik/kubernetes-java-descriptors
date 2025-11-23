package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;

import jakarta.json.bind.annotation.JsonbProperty;

public enum ConditionType implements Exportable {
    @JsonbProperty("ENV")
    ENV("ENV"),
    @JsonbProperty("SYSTEM_PROPERTY")
    SYSTEMPROPERTY("SYSTEM_PROPERTY");

    private String value;

    ConditionType(final String value) {
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
