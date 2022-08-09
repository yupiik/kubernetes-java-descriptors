package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import io.yupiik.kubernetes.bindings.v1_23_2.Exportable;

public enum PodReadinessGateConditionType implements Exportable {
    Ready,
    Initialized,
    PodScheduled,
    ContainersReady
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
