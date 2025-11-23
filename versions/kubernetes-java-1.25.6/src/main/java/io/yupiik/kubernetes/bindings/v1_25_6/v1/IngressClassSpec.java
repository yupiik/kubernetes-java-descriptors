package io.yupiik.kubernetes.bindings.v1_25_6.v1;

import io.yupiik.kubernetes.bindings.v1_25_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_25_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_25_6.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IngressClassSpec implements Validable<IngressClassSpec>, Exportable {
    private String controller;
    private IngressClassParametersReference parameters;

    public IngressClassSpec() {
        // no-op
    }

    public IngressClassSpec(final String controller,
                            final IngressClassParametersReference parameters) {
        this.controller = controller;
        this.parameters = parameters;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (controller != null ? "\"controller\":\"" +  JsonStrings.escapeJson(controller) + "\"" : ""),
                    (parameters != null ? "\"parameters\":" + parameters.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
