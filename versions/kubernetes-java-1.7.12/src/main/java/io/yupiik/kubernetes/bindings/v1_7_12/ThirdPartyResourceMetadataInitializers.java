package io.yupiik.kubernetes.bindings.v1_7_12;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ThirdPartyResourceMetadataInitializers {
    private List<JsonValue> pending;
    private ThirdPartyResourceMetadataInitializersResult result;

    public ThirdPartyResourceMetadataInitializers() {
        // no-op
    }

    public ThirdPartyResourceMetadataInitializers(final List<JsonValue> pending,
                                                  final ThirdPartyResourceMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public ThirdPartyResourceMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ThirdPartyResourceMetadataInitializersResult result) {
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
        if (!(__other instanceof ThirdPartyResourceMetadataInitializers)) {
            return false;
        }
        final ThirdPartyResourceMetadataInitializers __otherCasted = (ThirdPartyResourceMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
