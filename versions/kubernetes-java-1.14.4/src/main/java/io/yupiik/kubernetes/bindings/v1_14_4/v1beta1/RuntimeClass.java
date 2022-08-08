package io.yupiik.kubernetes.bindings.v1_14_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_14_4.Validable;
import io.yupiik.kubernetes.bindings.v1_14_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RuntimeClass implements Validable<RuntimeClass> {
    private String apiVersion;
    private String handler;
    private String kind;
    private ObjectMeta metadata;

    public RuntimeClass() {
        // no-op
    }

    public RuntimeClass(final String apiVersion,
                        final String handler,
                        final String kind,
                        final ObjectMeta metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(final String handler) {
        this.handler = handler;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                handler,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RuntimeClass)) {
            return false;
        }
        final RuntimeClass __otherCasted = (RuntimeClass) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(handler, __otherCasted.handler) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public RuntimeClass apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public RuntimeClass handler(final String handler) {
        this.handler = handler;
        return this;
    }

    public RuntimeClass kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public RuntimeClass metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public RuntimeClass validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (handler == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "handler", "handler",
                "Missing 'handler' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
