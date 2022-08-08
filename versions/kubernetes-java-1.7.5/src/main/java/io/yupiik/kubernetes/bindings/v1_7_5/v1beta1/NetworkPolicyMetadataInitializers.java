package io.yupiik.kubernetes.bindings.v1_7_5.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class NetworkPolicyMetadataInitializers {
    private List<JsonValue> pending;
    private NetworkPolicyMetadataInitializersResult result;

    public NetworkPolicyMetadataInitializers() {
        // no-op
    }

    public NetworkPolicyMetadataInitializers(final List<JsonValue> pending,
                                             final NetworkPolicyMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public NetworkPolicyMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final NetworkPolicyMetadataInitializersResult result) {
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
        if (!(__other instanceof NetworkPolicyMetadataInitializers)) {
            return false;
        }
        final NetworkPolicyMetadataInitializers __otherCasted = (NetworkPolicyMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
