package io.yupiik.kubernetes.bindings.v1_22_7;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector;
    private ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector;
    private List<String> namespaces;
    private String topologyKey;

    public ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution(final ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector,
                                                                                                                      final ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector,
                                                                                                                      final List<String> namespaces,
                                                                                                                      final String topologyKey) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey);
    }
}
