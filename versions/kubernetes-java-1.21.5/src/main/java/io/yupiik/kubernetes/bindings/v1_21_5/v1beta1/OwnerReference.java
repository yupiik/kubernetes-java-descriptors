package io.yupiik.kubernetes.bindings.v1_21_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_5.Validable;
import io.yupiik.kubernetes.bindings.v1_21_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class OwnerReference implements Validable<OwnerReference>, Exportable {
    private String apiVersion;
    private Boolean blockOwnerDeletion;
    private Boolean controller;
    private String kind;
    private String name;
    private String uid;

    public OwnerReference() {
        // no-op
    }

    public OwnerReference(final String apiVersion,
                          final Boolean blockOwnerDeletion,
                          final Boolean controller,
                          final String kind,
                          final String name,
                          final String uid) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Boolean getBlockOwnerDeletion() {
        return blockOwnerDeletion;
    }

    public void setBlockOwnerDeletion(final Boolean blockOwnerDeletion) {
        this.blockOwnerDeletion = blockOwnerDeletion;
    }

    public Boolean getController() {
        return controller;
    }

    public void setController(final Boolean controller) {
        this.controller = controller;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                blockOwnerDeletion,
                controller,
                kind,
                name,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof OwnerReference)) {
            return false;
        }
        final OwnerReference __otherCasted = (OwnerReference) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(blockOwnerDeletion, __otherCasted.blockOwnerDeletion) &&
            Objects.equals(controller, __otherCasted.controller) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(uid, __otherCasted.uid);
    }

    public OwnerReference apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public OwnerReference blockOwnerDeletion(final Boolean blockOwnerDeletion) {
        this.blockOwnerDeletion = blockOwnerDeletion;
        return this;
    }

    public OwnerReference controller(final Boolean controller) {
        this.controller = controller;
        return this;
    }

    public OwnerReference kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public OwnerReference name(final String name) {
        this.name = name;
        return this;
    }

    public OwnerReference uid(final String uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public OwnerReference validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (apiVersion == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "apiVersion", "apiVersion",
                "Missing 'apiVersion' attribute.", true));
        }
        if (kind == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "kind", "kind",
                "Missing 'kind' attribute.", true));
        }
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (uid == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "uid", "uid",
                "Missing 'uid' attribute.", true));
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
                    (blockOwnerDeletion != null ? "\"blockOwnerDeletion\":" + blockOwnerDeletion : ""),
                    (controller != null ? "\"controller\":" + controller : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (uid != null ? "\"uid\":\"" +  JsonStrings.escapeJson(uid) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
