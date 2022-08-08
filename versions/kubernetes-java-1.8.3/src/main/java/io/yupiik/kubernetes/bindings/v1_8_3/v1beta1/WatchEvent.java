package io.yupiik.kubernetes.bindings.v1_8_3.v1beta1;

import java.util.Objects;

public class WatchEvent {
    private WatchEventObject object;
    private String type;

    public WatchEvent() {
        // no-op
    }

    public WatchEvent(final WatchEventObject object,
                      final String type) {
        // no-op
    }

    public WatchEventObject getObject() {
        return object;
    }

    public void setObject(final WatchEventObject object) {
        this.object = object;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                object,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof WatchEvent)) {
            return false;
        }
        final WatchEvent __otherCasted = (WatchEvent) __other;
        return Objects.equals(object, __otherCasted.object) &&
            Objects.equals(type, __otherCasted.type);
    }
}
