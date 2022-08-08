package io.yupiik.kubernetes.bindings.v1_22_12;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector;
    private PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector;
    private List<String> namespaces;
    private String topologyKey;

    public PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution(final PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector,
                                                                                                        final PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector,
                                                                                                        final List<String> namespaces,
                                                                                                        final String topologyKey) {
        // no-op
    }

    public PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector) {
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
        if (!(__other instanceof PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey);
    }
}
