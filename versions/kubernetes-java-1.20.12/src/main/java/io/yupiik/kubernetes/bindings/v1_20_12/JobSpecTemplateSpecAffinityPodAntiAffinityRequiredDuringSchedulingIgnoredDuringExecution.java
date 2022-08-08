package io.yupiik.kubernetes.bindings.v1_20_12;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private JobSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector;
    private List<String> namespaces;
    private String topologyKey;

    public JobSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public JobSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution(final JobSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector,
                                                                                                    final List<String> namespaces,
                                                                                                    final String topologyKey) {
        // no-op
    }

    public JobSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final JobSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector) {
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
        if (!(__other instanceof JobSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final JobSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (JobSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey);
    }
}
