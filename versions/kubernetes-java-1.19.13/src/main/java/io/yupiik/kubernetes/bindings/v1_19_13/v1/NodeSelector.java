package io.yupiik.kubernetes.bindings.v1_19_13.v1;

import io.yupiik.kubernetes.bindings.v1_19_13.Validable;
import io.yupiik.kubernetes.bindings.v1_19_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NodeSelector implements Validable<NodeSelector> {
    private List<NodeSelectorTerm> nodeSelectorTerms;

    public NodeSelector() {
        // no-op
    }

    public NodeSelector(final List<NodeSelectorTerm> nodeSelectorTerms) {
        // no-op
    }

    public List<NodeSelectorTerm> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(final List<NodeSelectorTerm> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nodeSelectorTerms);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeSelector)) {
            return false;
        }
        final NodeSelector __otherCasted = (NodeSelector) __other;
        return Objects.equals(nodeSelectorTerms, __otherCasted.nodeSelectorTerms);
    }

    public NodeSelector nodeSelectorTerms(final List<NodeSelectorTerm> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
        return this;
    }

    @Override
    public NodeSelector validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (nodeSelectorTerms == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "nodeSelectorTerms", "nodeSelectorTerms",
                "Missing 'nodeSelectorTerms' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
