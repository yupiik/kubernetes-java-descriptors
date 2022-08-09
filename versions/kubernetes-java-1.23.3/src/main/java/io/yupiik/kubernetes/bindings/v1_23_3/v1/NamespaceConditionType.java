package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import io.yupiik.kubernetes.bindings.v1_23_3.Exportable;

public enum NamespaceConditionType implements Exportable {
    NamespaceContentRemaining,
    NamespaceDeletionContentFailure,
    NamespaceDeletionGroupVersionParsingFailure,
    NamespaceFinalizersRemaining,
    NamespaceDeletionDiscoveryFailure
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
