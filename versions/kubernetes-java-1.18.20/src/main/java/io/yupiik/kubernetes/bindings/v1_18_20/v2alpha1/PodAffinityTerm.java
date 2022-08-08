package io.yupiik.kubernetes.bindings.v1_18_20.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_18_20.Validable;
import io.yupiik.kubernetes.bindings.v1_18_20.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PodAffinityTerm implements Validable<PodAffinityTerm> {
    private LabelSelector labelSelector;
    private List<String> namespaces;
    private String topologyKey;

    public PodAffinityTerm() {
        // no-op
    }

    public PodAffinityTerm(final LabelSelector labelSelector,
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
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey);
    }

    public PodAffinityTerm labelSelector(final LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
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
}
