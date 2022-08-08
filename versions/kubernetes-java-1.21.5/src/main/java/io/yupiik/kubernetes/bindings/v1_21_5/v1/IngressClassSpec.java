package io.yupiik.kubernetes.bindings.v1_21_5.v1;

import io.yupiik.kubernetes.bindings.v1_21_5.Validable;
import io.yupiik.kubernetes.bindings.v1_21_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IngressClassSpec implements Validable<IngressClassSpec> {
    private String controller;
    private IngressClassParametersReference parameters;

    public IngressClassSpec() {
        // no-op
    }

    public IngressClassSpec(final String controller,
                            final IngressClassParametersReference parameters) {
        // no-op
    }

    public String getController() {
        return controller;
    }

    public void setController(final String controller) {
        this.controller = controller;
    }

    public IngressClassParametersReference getParameters() {
        return parameters;
    }

    public void setParameters(final IngressClassParametersReference parameters) {
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

    public IngressClassSpec parameters(final IngressClassParametersReference parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public IngressClassSpec validate() {
        return this;
    }
}
