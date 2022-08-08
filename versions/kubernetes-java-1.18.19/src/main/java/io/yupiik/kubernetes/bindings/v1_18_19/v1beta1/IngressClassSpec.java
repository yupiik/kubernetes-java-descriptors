package io.yupiik.kubernetes.bindings.v1_18_19.v1beta1;

import java.util.Objects;

public class IngressClassSpec {
    private String controller;
    private IngressClassSpecParameters parameters;

    public IngressClassSpec() {
        // no-op
    }

    public IngressClassSpec(final String controller,
                            final IngressClassSpecParameters parameters) {
        // no-op
    }

    public String getController() {
        return controller;
    }

    public void setController(final String controller) {
        this.controller = controller;
    }

    public IngressClassSpecParameters getParameters() {
        return parameters;
    }

    public void setParameters(final IngressClassSpecParameters parameters) {
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
}
