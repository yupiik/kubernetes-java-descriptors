package io.yupiik.kubernetes.bindings.v1_10_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_10_1.Validable;
import io.yupiik.kubernetes.bindings.v1_10_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObjectFieldSelector implements Validable<ObjectFieldSelector> {
    private String apiVersion;
    private String fieldPath;

    public ObjectFieldSelector() {
        // no-op
    }

    public ObjectFieldSelector(final String apiVersion,
                               final String fieldPath) {
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

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                fieldPath);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ObjectFieldSelector)) {
            return false;
        }
        final ObjectFieldSelector __otherCasted = (ObjectFieldSelector) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(fieldPath, __otherCasted.fieldPath);
    }

    public ObjectFieldSelector apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ObjectFieldSelector fieldPath(final String fieldPath) {
        this.fieldPath = fieldPath;
        return this;
    }

    @Override
    public ObjectFieldSelector validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (fieldPath == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "fieldPath", "fieldPath",
                "Missing 'fieldPath' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
