package io.yupiik.kubernetes.bindings.v1_9_1.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ControllerRevisionMetadataInitializers {
    private List<JsonValue> pending;
    private ControllerRevisionMetadataInitializersResult result;

    public ControllerRevisionMetadataInitializers() {
        // no-op
    }

    public ControllerRevisionMetadataInitializers(final List<JsonValue> pending,
                                                  final ControllerRevisionMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public ControllerRevisionMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ControllerRevisionMetadataInitializersResult result) {
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
        if (!(__other instanceof ControllerRevisionMetadataInitializers)) {
            return false;
        }
        final ControllerRevisionMetadataInitializers __otherCasted = (ControllerRevisionMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
