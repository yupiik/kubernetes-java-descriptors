package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import io.yupiik.kubernetes.bindings.v1_23_4.Exportable;

public enum ScopedResourceSelectorRequirementScopeName implements Exportable {
    Terminating,
    PriorityClass,
    BestEffort,
    NotBestEffort,
    NotTerminating,
    CrossNamespacePodAffinity
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
