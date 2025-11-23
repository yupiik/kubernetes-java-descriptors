package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;

import jakarta.json.bind.annotation.JsonbProperty;

public enum JsonPointerOperator implements Exportable {
    @JsonbProperty("EXISTS")
    EXISTS("EXISTS"),
    @JsonbProperty("EQUALS")
    EQUALS("EQUALS"),
    @JsonbProperty("EQUALS_IGNORE_CASE")
    EQUALSIGNORECASE("EQUALS_IGNORE_CASE"),
    @JsonbProperty("NOT_EQUALS_IGNORE_CASE")
    NOTEQUALSIGNORECASE("NOT_EQUALS_IGNORE_CASE"),
    @JsonbProperty("NOT_EQUALS")
    NOTEQUALS("NOT_EQUALS"),
    @JsonbProperty("MISSING")
    MISSING("MISSING"),
    @JsonbProperty("CONTAINS")
    CONTAINS("CONTAINS");

    private String value;

    JsonPointerOperator(final String value) {
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
