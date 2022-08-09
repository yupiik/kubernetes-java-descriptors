package io.yupiik.kubernetes.bindings.v1_23_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_0.Exportable;

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
