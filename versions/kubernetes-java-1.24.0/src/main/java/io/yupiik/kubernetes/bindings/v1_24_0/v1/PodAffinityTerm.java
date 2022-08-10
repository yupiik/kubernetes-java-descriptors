package io.yupiik.kubernetes.bindings.v1_24_0.v1;

import io.yupiik.kubernetes.bindings.v1_24_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_0.Validable;
import io.yupiik.kubernetes.bindings.v1_24_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodAffinityTerm implements Validable<PodAffinityTerm>, Exportable {
    private LabelSelector labelSelector;
    private LabelSelector namespaceSelector;
    private List<String> namespaces;
    private String topologyKey;

    public PodAffinityTerm() {
        // no-op
    }

    public PodAffinityTerm(final LabelSelector labelSelector,
                           final LabelSelector namespaceSelector,
                           final List<String> namespaces,
                           final String topologyKey) {
        // no-op
    }

    public LabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public LabelSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    public List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(final List<String> namespaces) {
        this.namespaces = namespaces;
    }

    public String getTopologyKey() {
        return topologyKey;
    }

    public void setTopologyKey(final String topologyKey) {
        this.topologyKey = topologyKey;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                labelSelector,
                namespaceSelector,
                namespaces,
                topologyKey);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodAffinityTerm)) {
            return false;
        }
        final PodAffinityTerm __otherCasted = (PodAffinityTerm) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey);
    }

    public PodAffinityTerm labelSelector(final LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    public PodAffinityTerm namespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
        return this;
    }

    public PodAffinityTerm namespaces(final List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    public PodAffinityTerm topologyKey(final String topologyKey) {
        this.topologyKey = topologyKey;
        return this;
    }

    @Override
    public PodAffinityTerm validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (topologyKey == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "topologyKey", "topologyKey",
                "Missing 'topologyKey' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (labelSelector != null ? "\"labelSelector\":" + labelSelector.asJson() : ""),
                    (namespaceSelector != null ? "\"namespaceSelector\":" + namespaceSelector.asJson() : ""),
                    (namespaces != null ? "\"namespaces\":" + namespaces.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (topologyKey != null ? "\"topologyKey\":\"" +  JsonStrings.escapeJson(topologyKey) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}