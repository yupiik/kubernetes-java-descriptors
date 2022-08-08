package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private DaemonSetSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector;
    private DaemonSetSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector;
    private List<String> namespaces;
    private String topologyKey;

    public DaemonSetSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution(final DaemonSetSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector,
                                                                                                      final DaemonSetSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector,
                                                                                                      final List<String> namespaces,
                                                                                                      final String topologyKey) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final DaemonSetSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public DaemonSetSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final DaemonSetSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (DaemonSetSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey);
    }
}
