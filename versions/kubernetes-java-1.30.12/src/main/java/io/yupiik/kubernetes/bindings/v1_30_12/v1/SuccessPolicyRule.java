package io.yupiik.kubernetes.bindings.v1_30_12.v1;

import io.yupiik.kubernetes.bindings.v1_30_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_12.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_12.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SuccessPolicyRule implements Validable<SuccessPolicyRule>, Exportable {
    private Integer succeededCount;
    private String succeededIndexes;

    public SuccessPolicyRule() {
        // no-op
    }

    public SuccessPolicyRule(final Integer succeededCount,
                             final String succeededIndexes) {
        this.succeededCount = succeededCount;
        this.succeededIndexes = succeededIndexes;
    }

    public Integer getSucceededCount() {
        return succeededCount;
    }

    public void setSucceededCount(final Integer succeededCount) {
        this.succeededCount = succeededCount;
    }

    public String getSucceededIndexes() {
        return succeededIndexes;
    }

    public void setSucceededIndexes(final String succeededIndexes) {
        this.succeededIndexes = succeededIndexes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                succeededCount,
                succeededIndexes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SuccessPolicyRule)) {
            return false;
        }
        final SuccessPolicyRule __otherCasted = (SuccessPolicyRule) __other;
        return Objects.equals(succeededCount, __otherCasted.succeededCount) &&
            Objects.equals(succeededIndexes, __otherCasted.succeededIndexes);
    }

    public SuccessPolicyRule succeededCount(final Integer succeededCount) {
        this.succeededCount = succeededCount;
        return this;
    }

    public SuccessPolicyRule succeededIndexes(final String succeededIndexes) {
        this.succeededIndexes = succeededIndexes;
        return this;
    }

    @Override
    public SuccessPolicyRule validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (succeededCount != null ? "\"succeededCount\":" + succeededCount : ""),
                    (succeededIndexes != null ? "\"succeededIndexes\":\"" +  JsonStrings.escapeJson(succeededIndexes) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
