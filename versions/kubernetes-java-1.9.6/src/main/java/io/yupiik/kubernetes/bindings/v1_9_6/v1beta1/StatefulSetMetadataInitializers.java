package io.yupiik.kubernetes.bindings.v1_9_6.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class StatefulSetMetadataInitializers {
    private List<JsonValue> pending;
    private StatefulSetMetadataInitializersResult result;

    public StatefulSetMetadataInitializers() {
        // no-op
    }

    public StatefulSetMetadataInitializers(final List<JsonValue> pending,
                                           final StatefulSetMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public StatefulSetMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final StatefulSetMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetMetadataInitializers)) {
            return false;
        }
        final StatefulSetMetadataInitializers __otherCasted = (StatefulSetMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
