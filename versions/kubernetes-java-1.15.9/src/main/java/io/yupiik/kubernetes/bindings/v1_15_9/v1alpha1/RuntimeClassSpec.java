package io.yupiik.kubernetes.bindings.v1_15_9.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_15_9.Validable;
import io.yupiik.kubernetes.bindings.v1_15_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RuntimeClassSpec implements Validable<RuntimeClassSpec> {
    private String runtimeHandler;

    public RuntimeClassSpec() {
        // no-op
    }

    public RuntimeClassSpec(final String runtimeHandler) {
        // no-op
    }

    public String getRuntimeHandler() {
        return runtimeHandler;
    }

    public void setRuntimeHandler(final String runtimeHandler) {
        this.runtimeHandler = runtimeHandler;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                runtimeHandler);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RuntimeClassSpec)) {
            return false;
        }
        final RuntimeClassSpec __otherCasted = (RuntimeClassSpec) __other;
        return Objects.equals(runtimeHandler, __otherCasted.runtimeHandler);
    }

    public RuntimeClassSpec runtimeHandler(final String runtimeHandler) {
        this.runtimeHandler = runtimeHandler;
        return this;
    }

    @Override
    public RuntimeClassSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (runtimeHandler == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "runtimeHandler", "runtimeHandler",
                "Missing 'runtimeHandler' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
