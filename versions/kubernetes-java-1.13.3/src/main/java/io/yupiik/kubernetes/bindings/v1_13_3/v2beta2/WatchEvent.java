package io.yupiik.kubernetes.bindings.v1_13_3.v2beta2;

import io.yupiik.kubernetes.bindings.v1_13_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_13_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_13_3.Validable;
import io.yupiik.kubernetes.bindings.v1_13_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class WatchEvent implements Validable<WatchEvent>, Exportable {
    private RawExtension object;
    private String type;

    public WatchEvent() {
        // no-op
    }

    public WatchEvent(final RawExtension object,
                      final String type) {
        // no-op
    }

    public RawExtension getObject() {
        return object;
    }

    public void setObject(final RawExtension object) {
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

    public WatchEvent object(final RawExtension object) {
        this.object = object;
        return this;
    }

    public WatchEvent type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public WatchEvent validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (object == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "object", "object",
                "Missing 'object' attribute.", true));
        }
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (object != null ? "\"object\":" + object.asJson() : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
