package io.yupiik.kubernetes.bindings.v1_29_6.v1;

import io.yupiik.kubernetes.bindings.v1_29_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_6.Validable;
import io.yupiik.kubernetes.bindings.v1_29_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Binding implements Validable<Binding>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private ObjectReference target;

    public Binding() {
        // no-op
    }

    public Binding(final String apiVersion,
                   final String kind,
                   final ObjectMeta metadata,
                   final ObjectReference target) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.target = target;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public ObjectReference getTarget() {
        return target;
    }

    public void setTarget(final ObjectReference target) {
        this.target = target;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                target);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Binding)) {
            return false;
        }
        final Binding __otherCasted = (Binding) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(target, __otherCasted.target);
    }

    public Binding apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Binding kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Binding metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Binding target(final ObjectReference target) {
        this.target = target;
        return this;
    }

    @Override
    public Binding validate() {
        if (kind == null) {
            kind = "Binding";
        }
        if (apiVersion == null) {
            apiVersion = "v1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (target == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "target", "target",
                "Missing 'target' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (target != null ? "\"target\":" + target.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
