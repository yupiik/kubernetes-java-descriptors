package io.yupiik.kubernetes.bindings.v1_26_15.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_26_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_15.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_26_15.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodSchedulingSpec implements Validable<PodSchedulingSpec>, Exportable {
    private List<String> potentialNodes;
    private String selectedNode;

    public PodSchedulingSpec() {
        // no-op
    }

    public PodSchedulingSpec(final List<String> potentialNodes,
                             final String selectedNode) {
        this.potentialNodes = potentialNodes;
        this.selectedNode = selectedNode;
    }

    public List<String> getPotentialNodes() {
        return potentialNodes;
    }

    public void setPotentialNodes(final List<String> potentialNodes) {
        this.potentialNodes = potentialNodes;
    }

    public String getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(final String selectedNode) {
        this.selectedNode = selectedNode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                potentialNodes,
                selectedNode);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSchedulingSpec)) {
            return false;
        }
        final PodSchedulingSpec __otherCasted = (PodSchedulingSpec) __other;
        return Objects.equals(potentialNodes, __otherCasted.potentialNodes) &&
            Objects.equals(selectedNode, __otherCasted.selectedNode);
    }

    public PodSchedulingSpec potentialNodes(final List<String> potentialNodes) {
        this.potentialNodes = potentialNodes;
        return this;
    }

    public PodSchedulingSpec selectedNode(final String selectedNode) {
        this.selectedNode = selectedNode;
        return this;
    }

    @Override
    public PodSchedulingSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (potentialNodes != null ? "\"potentialNodes\":" + potentialNodes.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (selectedNode != null ? "\"selectedNode\":\"" +  JsonStrings.escapeJson(selectedNode) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
