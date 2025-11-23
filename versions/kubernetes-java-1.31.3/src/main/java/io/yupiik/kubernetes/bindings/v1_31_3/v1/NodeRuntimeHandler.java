package io.yupiik.kubernetes.bindings.v1_31_3.v1;

import io.yupiik.kubernetes.bindings.v1_31_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_3.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeRuntimeHandler implements Validable<NodeRuntimeHandler>, Exportable {
    private NodeRuntimeHandlerFeatures features;
    private String name;

    public NodeRuntimeHandler() {
        // no-op
    }

    public NodeRuntimeHandler(final NodeRuntimeHandlerFeatures features,
                              final String name) {
        this.features = features;
        this.name = name;
    }

    public NodeRuntimeHandlerFeatures getFeatures() {
        return features;
    }

    public void setFeatures(final NodeRuntimeHandlerFeatures features) {
        this.features = features;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                features,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeRuntimeHandler)) {
            return false;
        }
        final NodeRuntimeHandler __otherCasted = (NodeRuntimeHandler) __other;
        return Objects.equals(features, __otherCasted.features) &&
            Objects.equals(name, __otherCasted.name);
    }

    public NodeRuntimeHandler features(final NodeRuntimeHandlerFeatures features) {
        this.features = features;
        return this;
    }

    public NodeRuntimeHandler name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public NodeRuntimeHandler validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (features != null ? "\"features\":" + features.asJson() : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
