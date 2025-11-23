package io.yupiik.kubernetes.bindings.v1_28_4.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_28_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_4.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ParamRef implements Validable<ParamRef>, Exportable {
    private String name;
    private String namespace;
    private String parameterNotFoundAction;
    private LabelSelector selector;

    public ParamRef() {
        // no-op
    }

    public ParamRef(final String name,
                    final String namespace,
                    final String parameterNotFoundAction,
                    final LabelSelector selector) {
        this.name = name;
        this.namespace = namespace;
        this.parameterNotFoundAction = parameterNotFoundAction;
        this.selector = selector;
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

    public String getParameterNotFoundAction() {
        return parameterNotFoundAction;
    }

    public void setParameterNotFoundAction(final String parameterNotFoundAction) {
        this.parameterNotFoundAction = parameterNotFoundAction;
    }

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
        this.selector = selector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                namespace,
                parameterNotFoundAction,
                selector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ParamRef)) {
            return false;
        }
        final ParamRef __otherCasted = (ParamRef) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(parameterNotFoundAction, __otherCasted.parameterNotFoundAction) &&
            Objects.equals(selector, __otherCasted.selector);
    }

    public ParamRef name(final String name) {
        this.name = name;
        return this;
    }

    public ParamRef namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ParamRef parameterNotFoundAction(final String parameterNotFoundAction) {
        this.parameterNotFoundAction = parameterNotFoundAction;
        return this;
    }

    public ParamRef selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    @Override
    public ParamRef validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (namespace != null ? "\"namespace\":\"" +  JsonStrings.escapeJson(namespace) + "\"" : ""),
                    (parameterNotFoundAction != null ? "\"parameterNotFoundAction\":\"" +  JsonStrings.escapeJson(parameterNotFoundAction) + "\"" : ""),
                    (selector != null ? "\"selector\":" + selector.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
