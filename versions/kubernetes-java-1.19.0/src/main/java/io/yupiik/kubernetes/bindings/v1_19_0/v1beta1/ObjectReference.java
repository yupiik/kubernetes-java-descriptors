package io.yupiik.kubernetes.bindings.v1_19_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_19_0.Validable;
import io.yupiik.kubernetes.bindings.v1_19_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObjectReference implements Validable<ObjectReference> {
    private String apiVersion;
    private String fieldPath;
    private String kind;
    private String name;
    private String namespace;
    private String resourceVersion;
    private String uid;

    public ObjectReference() {
        // no-op
    }

    public ObjectReference(final String apiVersion,
                           final String fieldPath,
                           final String kind,
                           final String name,
                           final String namespace,
                           final String resourceVersion,
                           final String uid) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getFieldPath() {
        return fieldPath;
    }

    public void setFieldPath(final String fieldPath) {
        this.fieldPath = fieldPath;
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

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
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
                fieldPath,
                kind,
                name,
                namespace,
                resourceVersion,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ObjectReference)) {
            return false;
        }
        final ObjectReference __otherCasted = (ObjectReference) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(fieldPath, __otherCasted.fieldPath) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(uid, __otherCasted.uid);
    }

    public ObjectReference apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ObjectReference fieldPath(final String fieldPath) {
        this.fieldPath = fieldPath;
        return this;
    }

    public ObjectReference kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ObjectReference name(final String name) {
        this.name = name;
        return this;
    }

    public ObjectReference namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ObjectReference resourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ObjectReference uid(final String uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public ObjectReference validate() {
        return this;
    }
}
