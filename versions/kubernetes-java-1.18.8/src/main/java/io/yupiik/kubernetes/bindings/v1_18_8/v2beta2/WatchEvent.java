package io.yupiik.kubernetes.bindings.v1_18_8.v2beta2;

import jakarta.json.JsonObject;
import java.util.Objects;

public class WatchEvent {
    private JsonObject object;
    private String type;

    public WatchEvent() {
        // no-op
    }

    public WatchEvent(final JsonObject object,
                      final String type) {
        // no-op
    }

    public JsonObject getObject() {
        return object;
    }

    public void setObject(final JsonObject object) {
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
