package io.yupiik.kubernetes.bindings.v1_9_9.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateMetadataInitializers {
    private List<JsonValue> pending;
    private StatefulSetSpecTemplateMetadataInitializersResult result;

    public StatefulSetSpecTemplateMetadataInitializers() {
        // no-op
    }

    public StatefulSetSpecTemplateMetadataInitializers(final List<JsonValue> pending,
                                                       final StatefulSetSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public StatefulSetSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final StatefulSetSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof StatefulSetSpecTemplateMetadataInitializers)) {
            return false;
        }
        final StatefulSetSpecTemplateMetadataInitializers __otherCasted = (StatefulSetSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
