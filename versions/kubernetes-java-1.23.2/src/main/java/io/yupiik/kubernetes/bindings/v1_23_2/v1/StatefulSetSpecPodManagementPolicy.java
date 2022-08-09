package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import io.yupiik.kubernetes.bindings.v1_23_2.Exportable;

public enum StatefulSetSpecPodManagementPolicy implements Exportable {
    OrderedReady,
    Parallel
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
