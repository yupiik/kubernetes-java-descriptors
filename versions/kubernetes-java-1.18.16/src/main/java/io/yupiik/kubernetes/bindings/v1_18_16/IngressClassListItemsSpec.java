package io.yupiik.kubernetes.bindings.v1_18_16;

import java.util.Objects;

public class IngressClassListItemsSpec {
    private String controller;
    private IngressClassListItemsSpecParameters parameters;

    public IngressClassListItemsSpec() {
        // no-op
    }

    public IngressClassListItemsSpec(final String controller,
                                     final IngressClassListItemsSpecParameters parameters) {
        // no-op
    }

    public String getController() {
        return controller;
    }

    public void setController(final String controller) {
        this.controller = controller;
    }

    public IngressClassListItemsSpecParameters getParameters() {
        return parameters;
    }

    public void setParameters(final IngressClassListItemsSpecParameters parameters) {
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
        if (!(__other instanceof IngressClassListItemsSpec)) {
            return false;
        }
        final IngressClassListItemsSpec __otherCasted = (IngressClassListItemsSpec) __other;
        return Objects.equals(controller, __otherCasted.controller) &&
            Objects.equals(parameters, __otherCasted.parameters);
    }
}
