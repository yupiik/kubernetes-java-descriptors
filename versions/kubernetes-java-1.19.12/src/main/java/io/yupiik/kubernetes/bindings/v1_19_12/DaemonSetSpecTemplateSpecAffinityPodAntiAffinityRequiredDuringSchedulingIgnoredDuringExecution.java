package io.yupiik.kubernetes.bindings.v1_19_12;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private DaemonSetSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector;
    private List<String> namespaces;
    private String topologyKey;

    public DaemonSetSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution(final DaemonSetSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector,
                                                                                                          final List<String> namespaces,
                                                                                                          final String topologyKey) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final DaemonSetSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (DaemonSetSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey);
    }
}
