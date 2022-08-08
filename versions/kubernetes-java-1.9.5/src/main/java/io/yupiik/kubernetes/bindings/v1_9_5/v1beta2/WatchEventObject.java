package io.yupiik.kubernetes.bindings.v1_9_5.v1beta2;

import java.util.Objects;

public class WatchEventObject {
    private String Raw;

    public WatchEventObject() {
        // no-op
    }

    public WatchEventObject(final String Raw) {
        // no-op
    }

    public String getRaw() {
        return Raw;
    }

    public void setRaw(final String Raw) {
        this.Raw = Raw;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                Raw);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof WatchEventObject)) {
            return false;
        }
        final WatchEventObject __otherCasted = (WatchEventObject) __other;
        return Objects.equals(Raw, __otherCasted.Raw);
    }
}
