package io.yupiik.kubernetes.bindings.v1_20_7.v1beta1;

import io.yupiik.kubernetes.bindings.v1_20_7.Validable;
import io.yupiik.kubernetes.bindings.v1_20_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IngressClassSpec implements Validable<IngressClassSpec> {
    private String controller;
    private TypedLocalObjectReference parameters;

    public IngressClassSpec() {
        // no-op
    }

    public IngressClassSpec(final String controller,
                            final TypedLocalObjectReference parameters) {
        // no-op
    }

    public String getController() {
        return controller;
    }

    public void setController(final String controller) {
        this.controller = controller;
    }

    public TypedLocalObjectReference getParameters() {
        return parameters;
    }

    public void setParameters(final TypedLocalObjectReference parameters) {
        this.parameters = parameters;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                controller,
                parameters);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressClassSpec)) {
            return false;
        }
        final IngressClassSpec __otherCasted = (IngressClassSpec) __other;
        return Objects.equals(controller, __otherCasted.controller) &&
            Objects.equals(parameters, __otherCasted.parameters);
    }

    public IngressClassSpec controller(final String controller) {
        this.controller = controller;
        return this;
    }

    public IngressClassSpec parameters(final TypedLocalObjectReference parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public IngressClassSpec validate() {
        return this;
    }
}
