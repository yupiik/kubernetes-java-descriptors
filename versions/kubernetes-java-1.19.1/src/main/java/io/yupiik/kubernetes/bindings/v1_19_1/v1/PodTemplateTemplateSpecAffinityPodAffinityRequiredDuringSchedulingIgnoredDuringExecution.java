package io.yupiik.kubernetes.bindings.v1_19_1.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private PodTemplateTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector;
    private List<String> namespaces;
    private String topologyKey;

    public PodTemplateTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public PodTemplateTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution(final PodTemplateTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector,
                                                                                                    final List<String> namespaces,
                                                                                                    final String topologyKey) {
        // no-op
    }

    public PodTemplateTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final PodTemplateTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector) {
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
        if (!(__other instanceof PodTemplateTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final PodTemplateTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (PodTemplateTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey);
    }
}
